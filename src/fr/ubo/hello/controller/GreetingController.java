package fr.ubo.hello.controller;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.ubo.hello.bean.Greeting;
import fr.ubo.hello.business.GreetingBusiness;

@RestController
public class GreetingController {
	
		@Autowired
		 GreetingBusiness business;
		
		public GreetingController() {
			//business = new GreetingBusiness();
		}
		/*
		 * 
		 * 
		 * */
		@RequestMapping(value = "/greeting")
		public Greeting greeting() {
			return business.badGreeting();
		
		}
		
		@RequestMapping(value = "/greeting/{name}")
		public Greeting greeting(@PathVariable("name") String name) {
			return business.greeting(name);
		
		}
		
		@RequestMapping(value = "/greeting2")
		public Greeting greeting2( @RequestParam(value="name", required=false, defaultValue="world") String name) {
			return business.greeting(name);
		}
		
		@RequestMapping(value = "/greeting3")
		public Greeting greeting3( @RequestParam(value="name", required=true) String name) {
			return business.greeting(name);
		}
}
