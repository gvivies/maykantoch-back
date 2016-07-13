package com.orange.maykantoch.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.orange.maykantoch.model.Location;

@RestController
public class AreaController {

	@RequestMapping(value = "/api/locations", method = RequestMethod.GET)
	@ResponseBody
	public List<Location> list() {
		List<Location> mock = new ArrayList<Location>();
		mock.add(new Location("1", "Gilles", "96", "146"));
		mock.add(new Location("2", "Neila", "296", "126"));
		mock.add(new Location("3", "Bruno", "196", "246"));
		return mock;
	}
}
