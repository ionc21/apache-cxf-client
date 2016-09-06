package com.pgs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("/processOrderPlacement")
public class OrdersController {

	@RequestMapping(method = RequestMethod.GET)
	public String processOrderPlacement(ModelMap model) {

		return "processOrderPlacement";
	}

}
