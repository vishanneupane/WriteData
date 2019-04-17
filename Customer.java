//Vishan Neupane

import java.util.*;
import java.io.*;

public class Customer
{
	private String name;
	private String creditCardNumber;
	private ArrayList<Rental> rentalList = new ArrayList<Rental>();


	// Creating the constructor 

	public Customer()
	{
		setName("");
		setCreditCardNumber("");
	}
	public Customer(String name, String creditCardNumber)
	{
		setName(name);
		setCreditCardNumber(creditCardNumber);
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getCreditCardNumber()
	{
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber)
	{
		this.creditCardNumber = creditCardNumber;
	}
	public ArrayList<Rental> getRentalList()
	{
		return rentalList;
	}
	public void addRental(Rental rental)
	{
		rentalList.add(rental);
	}

	public String toString()
	{
		return( " Name " +  name  +  " CreditCardNumber "  +  creditCardNumber   +  " RentalList "  + getRentalList() );
	}
}