//Vishan Neupane

import java.util.*;
import java.io.*;

public class MavBox
{

	//Creating ArrayList

	private ArrayList<Customer> customerList = new ArrayList<Customer>();
	private ArrayList<Movie> movieList = new ArrayList<Movie>();
	private ArrayList<Game> gameList = new ArrayList<Game>();

	public MavBox()
	{}

	public ArrayList<Customer> getCustomerList()
	{
		return customerList;
	}
	public ArrayList<Movie> getMovieList()
	{
		return movieList;
	}
	public ArrayList<Game> getGameList()
	{
		return gameList;
	}
	public void addCustomer(Customer customer)
	{
		customerList.add(customer);
	}
	public void addMovie(Movie movie)
	{
		movieList.add(movie);
	}
	public void addGame(Game game)
	{
		gameList.add(game);
	}
	public String toString()
	{ 
		return(" Customer List "   +   customerList  + "\n" + "\n" + " Movie List "  +  movieList + "\n" + "\n" +" Game List "  +  gameList);
	}
}