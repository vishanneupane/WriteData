//Vishan Neupane

public class Rental
{
	private String title;
	private String rentalCode;
	private double price;

	//Creating Constructor

	public Rental()
	{
		setTitle("");
		setRentalCode("");
		setPrice(0.0);
	}
	public Rental(String title, String rentalCode, double price)
	{
		setTitle(title);
		setRentalCode(rentalCode);
		setPrice(price);
	}

	//input gets and sets 

	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getTitle()
	{
		return title;
	}
	public void setRentalCode(String rentalCode)
	{
		this.rentalCode=rentalCode;
	}
	public String getRentalCode()
	{
		return rentalCode;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public double getPrice()
	{
		return price;
	}
	public String toString()
	{
		return(" Title "  +  title  + " RentalCode " +  rentalCode  +  " Price "  +  price);
	}
}