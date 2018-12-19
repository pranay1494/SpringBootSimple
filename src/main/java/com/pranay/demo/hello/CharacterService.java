package com.pranay.demo.hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * we can add @scope as well 
 * here we found that jackson requires default constructor 
 * add properties file to change port number or store JPA username passwords
 * read about @component and @repository 
 * 
 * @author pranaybansal
 */

@Service
public class CharacterService {
	private List<Characters> characters = new ArrayList<>(Arrays.asList(new Characters("Goku","KameHaMeHa"),new Characters("Vegeta","Final Flash"),new Characters("Gohan","KameHameHa"),new Characters("Krillin","Destructo Disc")));
	
	public List<Characters> getAllCharacters(){
		return characters;
	}
	
	public Characters getSingleCharacter(String name){
		return characters.stream().filter(n -> n.getName().equalsIgnoreCase(name)).findFirst().get();
	}

	public void addCharacter(Characters character) {
		characters.add(character);
	}

	public String updateCharacter(Characters character) {
		for (int i = 0; i < characters.size(); i++) {
			if(character.getName().equalsIgnoreCase(characters.get(i).getName())) {
				characters.set(i, character);
				return "success";
			}
		}
		return "Not found";
	}

	public void deleteCharacter(String name) {
		characters.removeIf(it -> it.getName().equalsIgnoreCase(name));
	}
}