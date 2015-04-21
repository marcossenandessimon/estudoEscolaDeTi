appModule = angular.module('App', ['ngRoute']);

appModule.config(function($locationProvider, $routeProvider) {
    $routeProvider
            .when('/beers', {templateUrl: 'views/beers.html', controller: 'beerController'})
            .when('/manter-beers/:id', {templateUrl: 'views/manterBeer.html', controller: 'beerController'})
            .when('/manter-beers', {templateUrl: 'views/manterBeer.html', controller: 'beerController'})
            .otherwise({redirectTo: '/'});
    $locationProvider.html5Mode(false);
});

appModule.service('beerService', function($http) {
    var rota = '/Beers';
    this.getAll = function() {
        return $http.get(rota);
    };
    this.save = function(beer) {
        return $http.post(rota, beer);
    };
    this.delete = function(id) {
        return $http.delete(rota + '/' + id);
    };
    this.edit = function(beer) {
        return $http.put(rota, beer);
    };
    this.getBeer = function(id) {
        return $http.get(rota + '/' + id);
    };
});

appModule.controller('beerController', function(beerService, $scope, $routeParams, $location) {

    $scope.beer = {};

    $scope.init = function() {
        beerService.getAll().success(function(data) {
            $scope.beers = data;
        }).error(function() {
            console.log("Deu merda");
        });
    };

    $scope.save = function() {
        if ($scope.beer.id) {
            beerService.edit($scope.beer).success(function() {
                $scope.init();
                $location.path('/beers');
            }).error(function() {
                console.log("não deu certo");
            });
        } else {
            beerService.save($scope.beer).success(function() {
                $scope.init();
                 $location.path('/beers');
            }).error(function() {
                console.log("não salvou");
            });
        }
    };

    $scope.delete = function(id) {
        beerService.delete(id).success(function() {
            $scope.init();
        }).error(function() {
            console.log("nao deletou");
        });
    };

    if ($routeParams.id) {
        var id = $routeParams.id;
        beerService.getBeer(id).success(function(data) {
            $scope.beer = data;
        }).error(function() {
            console.log("Não foi possivel recuperar a beer");
        });
    }

});

