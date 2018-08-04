package com.collection.moviedetails;

import java.util.LinkedHashSet;
import java.util.Set;

public class Movie_DetailsList {
	
	public Set<Movie_Details> movies=new LinkedHashSet<>();
	
	public void add_movie(Movie_Details movie)
	{
		movies.add(movie);
		System.out.println(movie);
	}
	
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
	
	public void remove_AllMovies()
	{
		movies.removeAll(movies);

	}
	
	public void find_movie_By_mov_Name(String movieName) 
	{

		for(Movie_Details mov:movies) {
			if(mov.getMov_Name().equals(movieName))
				System.out.println(mov);
		}
		
	}
	
	public void find_movie_By_Genre(String genre) 
	{
		for(Movie_Details mov:movies) {
			if(mov.getGenre().equals(genre))
				System.out.println(mov);
		}
	}
	
}