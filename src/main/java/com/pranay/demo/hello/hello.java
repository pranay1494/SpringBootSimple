package com.pranay.demo.hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
	
	@Autowired
	private CharacterService characterService;

	@GetMapping("/hello/{abc}")
	public String sayHello(@PathVariable("abc") String s) {
		if(s.equals("hi"))
			return "bye";
		else
			return "Hello";
	}
	
	@GetMapping("/characters")
	public List<Characters> getAllCharacters(){
		return characterService.getAllCharacters();
	}

	@GetMapping("/character/{name}")
	public Characters getCharacter(@PathVariable("name") String name){
		return characterService.getSingleCharacter(name);
	}
	
	@PostMapping("/character")
	public String addCharacter(@RequestBody Characters character) {
		characterService.addCharacter(character);
		return "success";
	}
	
	@PutMapping("/character/{name}")
	public String addCharacter(@RequestBody Characters character,@PathVariable("name") String name) {
		return characterService.updateCharacter(character);
	}
	
	@DeleteMapping("/character/{name}")
	public String addCharacter(@PathVariable("name") String name) {
		characterService.deleteCharacter(name);
		return "success";
	}
	
}
