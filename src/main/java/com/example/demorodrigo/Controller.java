package com.example.demorodrigo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping(value = "/json", method = RequestMethod.GET)
	public String showHolaRodrigo() {
		return "Me cago en mis muertos";
	}
}
