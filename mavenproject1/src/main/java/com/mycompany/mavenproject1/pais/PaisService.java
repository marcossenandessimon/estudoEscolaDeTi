
package com.mycompany.mavenproject1.pais;

import com.mycompany.mavenproject1.beer.Beer;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class PaisService {
    
    @Autowired
    private PaisRepository paisRepo;
    
    public void addPais(Pais p){
        paisRepo.save(p);
    }
    
    public List<Pais> getAll(){
        return paisRepo.findAll();
    }
    
    public Pais getOne(Long id){
        return paisRepo.findOne(id);
    }
    
    public void editarPais(Pais p){
        paisRepo.save(p);
    }
    
    public void deletarPais(Long id){
        paisRepo.delete(id);
    }
    
}
