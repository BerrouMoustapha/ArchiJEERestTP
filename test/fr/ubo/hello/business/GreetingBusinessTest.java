package fr.ubo.hello.business;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GreetingBusinessTest {
	@Test
	public void greeting () {
		fr.ubo.hello.bean.Greeting g= new fr.ubo.hello.bean.Greeting("Hello by test", "Moustapha");
		assertEquals(g.getAuteur(), "Moustapha");
		assertEquals(g.getMessage(), "Hello by test");
	}
	
	@Test
	public void badGreeting () {
		fr.ubo.hello.bean.Greeting g= new fr.ubo.hello.bean.Greeting("name est obligatoire. Merci de le renseigner.", "");
		assertEquals(g.getAuteur(), "");
		assertEquals(g.getMessage(), "name est obligatoire. Merci de le renseigner.");
	}
}
