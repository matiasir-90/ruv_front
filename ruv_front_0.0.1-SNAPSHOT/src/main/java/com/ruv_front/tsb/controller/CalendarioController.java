package com.ruv_front.tsb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ruv_front.tsb.entity.CalendarioEntity;
import com.ruv_front.tsb.model.CalendarioModel;
import com.ruv_front.tsb.service.CalendarioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:8181",maxAge=3600)
@RestController
@RequestMapping({"/calendario"})

public class CalendarioController {

@Autowired
CalendarioService service;

@GetMapping("/")
    public String ViewIndex(){
       public List<CalendarioModel> getcalendario() 
    }
        return "index";
        
{
    
    return service.getCalendario();
}
@PostMapping
public CalendarioEntity agregarC(@RequestBody CalendarioModel p){
    return service.add(p);
}
@GetMapping(path = {"/{id}"})
public CalendarioEntity listarId(@PathVariable("id")int id){
    return service.listarId(id);
}
@PutMapping(path = {"/{id}"})
public CalendarioEntity editar(@RequestBody CalendarioModel p,@PathVariable("id") int id){
    p.setId(id);
    return service.edit(p);
}
@DeleteMapping(path = {"/{id}"})
public CalendarioEntity delete(@PathVariable("id") int  id){
    return service.delete(id);
}

}