//Vishan Neupane

import java.util.ArrayList;
public class MavBoxTest
{

	public static void main(String args[])
	{

                // Cs1 and Cs2 is Customer first and second respectively 

		MavBox mav = new MavBox();
		Customer cs1 = new Customer("Jones", "1234-1234-1234-1234");
		Customer cs2 = new Customer("Smith", "6543-6543-6543-6543");

		// mv1 and mv2 is Movie first and second respectively 
		
		Movie mv1 = new Movie("Titanic", "1A", 4.99, Movie.MovieType.BLURAY);
		Movie mv2 = new Movie("Star Wars", "2C", 5.99, Movie.MovieType.DVD);
			
		// gm1 and gm2 is Game first and second respectively 

		Game gm1 = new Game("Warcraft", "5D", 3.99, Game.GameType.PLAYSTATION);
		Game gm2 = new Game("Tomb Raider", "12F", 3.59, Game.GameType.NINTENDO);


		mav.addCustomer(cs1);
		mav.addCustomer(cs2);

		mav.addMovie(mv1);
		mav.addMovie(mv2);
		
		mav.addGame(gm1);
		mav.addGame(gm2);

		System.out.print(mav);
	}
}




		