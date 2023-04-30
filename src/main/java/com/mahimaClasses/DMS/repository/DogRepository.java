package com.mahimaClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mahimaClasses.DMS.Models.Dog;


/**
 * @author Mahima Chowdary Gollamudi
 *
 */
public interface DogRepository extends CrudRepository<Dog,Integer>{
	//List<Dog >findByName(String name);

	List<Dog> findByName(String name);
}
