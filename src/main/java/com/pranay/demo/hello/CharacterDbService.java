package com.pranay.demo.hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterDbService {
	
	@Autowired
	private CharacterRepository characterRepo;
	
	public List<Characters> getAllCharacters(){
		List<Characters> list = new ArrayList<>();
		characterRepo.findAll().forEach(list::add);
		return list;
	}
	
	public void putCharacter(Characters character) {
		characterRepo.save(character);
	}
	
	public Characters getACharacter(String name) {
		return characterRepo.findByName(name);
	}
}
