package com.pranay.demo.hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbController {
	
	@Autowired
	private CharacterDbService dbService;
	
	@PostMapping("/dbzcharacters")
	public void putCharacterinDb(@RequestBody Characters character) {
		dbService.putCharacter(character);
	}
	
	@GetMapping("/dbzcharacters")
	public List<Characters> getAllCharacters(){
		return dbService.getAllCharacters();
	}
	
	@GetMapping("/dbzcharacters/{name}")
	public Characters getAllCharacters(@PathVariable("name") String name){
		return dbService.getACharacter(name);
	}
}
