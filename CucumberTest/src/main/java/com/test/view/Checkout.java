package com.test.view;

public class Checkout {

	private int totalPrice;

	public void add(int item, int itemPrice)
	{
		totalPrice += item * itemPrice;
	}
	
	public int total()
	{
		return totalPrice;
	}
}
