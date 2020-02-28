package com.ruv_front.tsb.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.ruv_front.tsb.Model.CalendarioModel;

@RestController
@RequestMapping(value = "/calendario" )

public class CalendarioController {
	

    
    @GetMapping
    public String ViewCalendario(Model model){
    	
    	CalendarioModel calendario = new CalendarioModel();
    	
         model.addAttribute("calendariolist",calendario);
         return "calendariolist";
    }
    public CalendarioModel getcalendario()
	{
	    final String uri = "http://localhost:8181/calendario";
	    RestTemplate restTemplate = new RestTemplate();
	     
	    CalendarioModel result = restTemplate.getForObject(uri, CalendarioModel());	  
	    System.out.println(result);
	    return result; 

	}

	@GetMapping("/")
	public String showUpdateForm(Model model) {
		model.addAttribute("calendario", getcalendario());
		return "index";
	}
	}
	
//    
//@PostMapping
//public CalendarioEntity agregarC(@RequestBody CalendarioModel p){
//    return service.add(p);
//}
//@GetMapping(path = {"/{id}"})
//public CalendarioEntity listarId(@PathVariable("id")int id){
//    return service.listarId(id);
//}
//@PutMapping(path = {"/{id}"})
//public CalendarioEntity editar(@RequestBody CalendarioModel p,@PathVariable("id") int id){
//    p.setId(id);
//    return service.edit(p);
//}
//@DeleteMapping(path = {"/{id}"})
//public CalendarioEntity delete(@PathVariable("id") int  id){
//    return service.delete(id);
//}
//                                                                                            
