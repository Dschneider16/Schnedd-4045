package com.PlantPlaces.service;

import org.springframework.stereotype.Component;

import com.AnimalFinder.AnimalDTO;


@Component
public class AnimalsServiceStub {
public AnimalDTO fetchById(int id) {
	AnimalDTO animalDTO =new AnimalDTO();
	animalDTO.setAnimalID(43);
	return animalDTO;
}

public void save(AnimalDTO animalDTO) {
	
}



}
