package fr.ubo.hello.business;

import fr.ubo.hello.bean.Greeting;

public class GreetingBusinessImp implements GreetingBusiness {

	public Greeting greeting(String param) {
		Greeting greeting = new Greeting("Hello", param);
		return greeting;
	}

	public Greeting badGreeting() {
		Greeting greeting = new Greeting("name est obligatoire. Merci de le renseigner.", "");
		return greeting;
	}

}
