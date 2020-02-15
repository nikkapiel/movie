package com.movie;

public class Movie {

	private String title;
	private int duration;
	private int year;
	private String country;
	private double rate;
	
	public Movie (String title, int duration, int year, String country, double rate){
		this.title = title;
		this.duration = duration;
		this.year = year;
		this.country = country;
		this.rate = rate;
		System.out.println("Movie Review has been made...");
	}
	
	void direct (String director) {
		System.out.println("This movie is directed by " + director + ".");
		
	}
	
	void portray (String portrayal) {
		System.out.println("This movie portrays " + portrayal + ".");
	}
	
	
	public String getTitle () {
		return this.title;
		
	} 
	
	public int getDuration () {
		return this.duration;
		
	} 
	
	public int getYear () {
		return this.year;
		
	} 
	
	public String getCountry () {
		return this.country;
		
	} 
	
	public double getRate () {
		return this.rate;
		
	} 

}
