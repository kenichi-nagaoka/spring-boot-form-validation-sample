package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.HelloForm;

@Controller
@RequestMapping(value = "/")
public class HelloController {
	
	private static final String SAMPLE_URL = "sample/Hello";

	@GetMapping
	public String index(@ModelAttribute HelloForm helloForm) {
		return SAMPLE_URL;
	}

	@PostMapping
	public String register(@Validated HelloForm helloForm, BindingResult result) {
		return SAMPLE_URL;
	}
}
