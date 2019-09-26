package com.AnimalFinder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.PlantPlaces.service.AnimalsServiceStub;



@Controller
public class AnimalFinderController {

	
	@Autowired
	private AnimalsServiceStub animalServiceStub;
	
	
	@RequestMapping("/start")
	public String start() {
	return "start";
	}
	@RequestMapping(value= "/start", method=RequestMethod.GET)
	public String read() {
		AnimalDTO animalDTO = animalServiceStub.fetchById(43);
		return "start";
	}

}
	
