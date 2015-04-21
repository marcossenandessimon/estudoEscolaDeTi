package com.mycompany.mavenproject1.pais;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.print.resources.serviceui;

@RestController
@RequestMapping(value = "/paises")
public class PaisController {
    
    @Autowired
    private PaisService paisService;
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Pais> getAll(){
        return paisService.getAll();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Pais getOne(@PathVariable Long id){
        return paisService.getOne(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public void salvarPais(@RequestBody Pais p){
        paisService.addPais(p);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public void editarPais(@RequestBody Pais p){
        paisService.editarPais(p);
    }
    @RequestMapping(value = "/{id}" ,method = RequestMethod.DELETE)
    public void deletarPais(@PathVariable Long id){
        paisService.deletarPais(id);
    }
    
    
    
    
    
    
}
