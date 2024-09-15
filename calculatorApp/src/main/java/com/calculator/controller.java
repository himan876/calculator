package com.calculator;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class controller {
	    @GetMapping("/calculate")
	    public corecalculator.CoreParameters calculate(
	        @RequestParam String coreModel) {
	        return corecalculator.calculateParameters(coreModel);
	    }
	}



