package com.collection.moviedetailstest;

import java.util.Scanner;

import com.collection.moviedetails.Movie_Details;
import com.collection.moviedetails.Movie_DetailsList;

public class Movie_DetailsTest {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		
		Movie_DetailsList movieList=new Movie_DetailsList();
		
		//creating objects for different movies
		Movie_Details movie=new Movie_Details("Dabang","Salman","Sonakshi","Drama");
		Movie_Details movie1=new Movie_Details("DDLJ","SRK","Kajol","Romance");
		Movie_Details movie2=new Movie_Details("Dangal","Amir","Pooja","Sports");
		Movie_Details movie3=new Movie_Details("Badlapur","Varun","Uma","Thriller");
		
		
		movieList.add_movie(movie);
		movieList.add_movie(movie1);
		movieList.add_movie(movie2);
		movieList.add_movie(movie3);
		
		System.out.println("=======================================================================");
		
		System.out.println("Enter the genre");
		movieList.find_movie_By_Genre(scanner.next());

		System.out.println("=======================================================================");
		
		System.out.println("Enter the name of the movie");
		movieList.find_movie_By_mov_Name(scanner.next()); 
		
		
		System.out.println("=======================================================================");
		
		System.out.println("Enter the name of the movie to be removed");
		movieList.remove_movie(scanner.next());
	}

}
