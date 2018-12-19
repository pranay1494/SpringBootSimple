package com.pranay.demo.hello;

import org.springframework.data.repository.CrudRepository;


/**
 * use jparepository instead of crud repository
 * @author pranaybansal
 *
 */
public interface CharacterRepository extends CrudRepository<Characters, Integer>{
	public Characters findByName(String name);
}
