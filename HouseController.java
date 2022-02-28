package com.qa.starterproject.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.starterproject.domain.House;

@RestController //tells Spring that this is a controller

//Rest compliant
public class HouseController {

	@GetMapping("/helloWorld")
	public String hello() {
		return "Hello World!";
	}
	
	private List<House> houses = new ArrayList<>();
	
	@PostMapping("/create")
	public ResponseEntity<House> createHouse(@RequestBody House h) {
		this.houses.add(h);
		House created = this.houses.get(this.houses.size() - 1);
		ResponseEntity<House> response = new ResponseEntity<House>(created, HttpStatus.CREATED); //201 - created
		return response;
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<House>> getAllHouses() {
		return ResponseEntity.ok(this.houses); //200 -OK
	}
	
	@GetMapping("/get/{houseId}")
	public House getHouse(@PathVariable Integer houseId) {
		return this.houses.get(houseId);
	}
	
	@PutMapping("/replace/{houseId}") // 202 accepted
	public ResponseEntity<House> replaceHouse(@PathVariable Integer houseId, @RequestBody House newHouse) {
		House body = this.houses.set(houseId, newHouse);
		ResponseEntity<House> response = new ResponseEntity<House>(body, HttpStatus.ACCEPTED);
		return response;
		
	}
	
	@DeleteMapping("/remove/{houseId}") // 204 no content 
	public ResponseEntity<?> removeHouse(@PathVariable Integer houseId) {
		this.houses.remove(houseId.intValue());
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
