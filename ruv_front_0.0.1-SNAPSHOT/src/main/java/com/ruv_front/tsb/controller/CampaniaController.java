package com.ruv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruv.entity.CampaniaEntity;
import com.ruv.model.CampaniaModel;
import com.ruv.service.CampaniaService;

@RestController
@RequestMapping({"/campania"})

public class CampaniaController {

@Autowired
CampaniaService service;

@GetMapping
public List<CampaniaModel> getCampania(){
    
    return service.getCampania();
}
@PostMapping
public CampaniaEntity agregarC(@RequestBody CampaniaModel p){
    return service.add(p);
}
@GetMapping(path = {"/{id}"})
public CampaniaEntity lsitarId(@PathVariable("id")int id){
    return service.listarId(id);
}
@PutMapping(path = {"/{id}"})
public CampaniaEntity editar(@RequestBody CampaniaModel p,@PathVariable("id") int id){
    p.setId(id);
    return service.edit(p);
}
@DeleteMapping(path = {"/{id}"})
public CampaniaEntity delete(@PathVariable("id") int  id){
    return service.delete(id);
}

}