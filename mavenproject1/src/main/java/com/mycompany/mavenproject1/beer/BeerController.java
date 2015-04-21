
package com.mycompany.mavenproject1.beer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Beers")
public class BeerController {
    @Autowired
    private BeerService beerService;
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Beer> getAll(){
        return beerService.getBeers();
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Beer getBeer(@PathVariable Long id){
        return beerService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public void saveBeer(@RequestBody Beer b){
        beerService.addBeer(b);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public void editBeer(@RequestBody Beer b){
        beerService.editarBeer(b);
    }
     @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
     public void excluirBeer (@PathVariable Long id){
         beerService.deletarBeer(id);
     }
    
}
