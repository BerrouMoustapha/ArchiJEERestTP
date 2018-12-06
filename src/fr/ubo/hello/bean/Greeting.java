package fr.ubo.hello.bean;

public class Greeting {
	 String message ;
	 String auteur;
	 
	 
	public Greeting(String message, String auteur) {
		super();
		this.message = message;
		this.auteur = auteur;
	}
	
	public Greeting() {
		super();
		message="Name est obligatoire ";
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	 
}
