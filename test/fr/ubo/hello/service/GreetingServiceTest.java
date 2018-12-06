package fr.ubo.hello.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.faces.component.behavior.ClientBehaviorBase;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import fr.ubo.hello.bean.Greeting;


@SuppressWarnings("deprecation")
public class GreetingServiceTest {

	
	@Test
	public void badGreeting() throws ClientProtocolException,IOException{
		HttpClient client = new DefaultHttpClient();
		HttpGet mockRequest = new HttpGet("http://localhost:8070/ArchiJEEWSRestTP/greeting");
		// mockRequest.setHeader("http-user", userId);
		HttpResponse mockResponse =   client.execute(mockRequest);
		BufferedReader rd = new BufferedReader(new InputStreamReader(mockResponse.getEntity().getContent()));
		ObjectMapper mapper = new ObjectMapper();
		Greeting g = mapper.readValue(rd, Greeting.class);
		Assert.assertNotNull(g);
		Assert.assertNotNull(g.getAuteur());
		Assert.assertEquals("name est obligatoire. Merci de le renseigner.",g.getMessage());
		
	}
}
