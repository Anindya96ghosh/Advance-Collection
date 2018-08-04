package com.collection.moviedetails;

import java.util.LinkedHashSet;
import java.util.Set;

public class Movie_DetailsList {
	
	//creating a Set 
	public Set<Movie_Details> movies=new LinkedHashSet<>();
	
	//function to add a movie to the set
	public void add_movie(Movie_Details movie)
	{
		movies.add(movie);
		System.out.println(movie);
	}
	
	//function to remove a movie from the set
	public void remove_movie(String movieName)
	{
		for(Movie_Details mov:movies) {
			if(mov.getMov_Name().equals(movieName))
			{
				movies.remove(mov);
				System.out.println("Movie "+movieName+" has been removed");
				break;
			}
		}
		movies.stream().forEach(System.out::println);
	}
	
	//function to remove all movies from the set
	public void remove_AllMovies()
	{
		movies.removeAll(movies);

	}
	
	//function to find a movie from the set by its name
	public void find_movie_By_mov_Name(String movieName) 
	{

		for(Movie_Details mov:movies) {
			if(mov.getMov_Name().equals(movieName))
				System.out.println(mov);
		}
		
	}
	
	
	//function to find a movie from the set by its genre
	public void find_movie_By_Genre(String genre) 
	{
		for(Movie_Details mov:movies) {
			if(mov.getGenre().equals(genre))
				System.out.println(mov);
		}
	}
	
}
