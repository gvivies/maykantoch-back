package com.orange.maykantoch.controller;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.orange.maykantoch.model.Location;

@CrossOrigin
@RestController
public class AreaController {

	private HashMap<String, Location> locations = new HashMap<String, Location >();
			
	@RequestMapping(value = "/api/locations", method = RequestMethod.GET)
	@ResponseBody
	public List<Location> list() {
		//locations = getMocks();
		return (List<Location>) locations.values().stream().collect(Collectors.toList());
	}
	
	@RequestMapping(value = "/api/locations", method = RequestMethod.POST)
	@ResponseBody
	public void store(@RequestBody Location location) {
		//String id = location.getId() + location.getUsername();
		locations.put(location.getUsername(), location);
	}
	
	private HashMap<String, Location> getMocks() {
		HashMap<String, Location> mocks = new HashMap<String, Location >();
		mocks.put("Neila2", new Location("2", "Neila", "296", "126"));
		mocks.put("Bruno3", new Location("3", "Bruno", "196", "246"));
		return mocks;
	}
}
