//Vishan Neupane

public class Game extends Rental
{
	public enum GameType{XBOX, PLAYSTATION, NINTENDO};
	private GameType gType = GameType.XBOX;

	//Creating Constructor

	public Game()
	{
		super();
	}
	public Game(String title, String rentalCode, double price, GameType gType)
	{
		super(title, rentalCode, price);
		this.gType = gType;
	}
	public void setGType(GameType gType)
	{
		this.gType= gType;
	}
	public GameType getGType()
	{
		return gType;
	}
	public String toString()
	{
		return(super.toString() + " Game Type "  +   gType);
	}
}