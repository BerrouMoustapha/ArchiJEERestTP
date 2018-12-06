package fr.ubo.hello.business;

import fr.ubo.hello.bean.Greeting;

public interface GreetingBusiness {

	public Greeting greeting(String param);

	public Greeting badGreeting();

}
