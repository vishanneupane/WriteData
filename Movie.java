//Vishan Neupane

public class Movie extends Rental
{
	public enum MovieType{BLURAY, DVD};
	private MovieType mType = MovieType.DVD;

	public Movie()
	{
		super();
	}
	public Movie(String title, String rentalCode, double price, MovieType mtype)
	{
		super(title, rentalCode, price);
		this.mType = mType;
	}
	public void setMType(MovieType mType)
	{
		this.mType= mType;
	}
	public MovieType getMType()
	{
		return mType;
	}
	public String toString()
	{
		return(super.toString() +  " Movie Type "  +  mType);
	}
}