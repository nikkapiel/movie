package com.movie;

public class MovieTest {

	public static void main(String[] args) {
		Movie m1 = new Movie ("Titanic", 194, 1997, "United States", 4.8);
		System.out.println("Movie Review:");
		m1.direct("James Cameron");
		m1.portray("Romance and Drama");
		System.out.println("Title: " + m1.getTitle());
		System.out.println("Duration in Minutes: " + m1.getDuration());
		System.out.println("Year: " + m1.getYear ());
		System.out.println("Country: " + m1.getCountry ());
		System.out.println("Rate: " + m1.getRate ());
		
		
		System.out.println();
		Movie m2 = new Movie ("A Second Chance", 130, 2015, "Philippines", 4.3);
		System.out.println("Movie Review:");
		m2.direct("Cathy Garcia-Molina");
		m2.portray("Romance and Drama");
		System.out.println("Title: " + m2.getTitle());
		System.out.println("Duration in Minutes: " + m2.getDuration());
		System.out.println("Year: " + m2.getYear ());
		System.out.println("Country: " + m2.getCountry ());
		System.out.println("Rate: " + m2.getRate ());
		


	}

}
