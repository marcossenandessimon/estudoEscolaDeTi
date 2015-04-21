
package com.mycompany.mavenproject1.beer;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class BeerService {
    @Autowired
    private BeerRepository beerRepository;
    
    public void addBeer(Beer b){
        beerRepository.save(b);
    }
    
    public void deletarBeer(Long id){
        beerRepository.delete(id);        
    }
    
    public void editarBeer(Beer b){
        beerRepository.save(b);
    }
    
    public Beer getById(Long id){
        return beerRepository.findOne(id);
    }
    
    public List<Beer> getBeers(){
        return beerRepository.findAll();
    }
}
