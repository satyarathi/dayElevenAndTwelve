package com.two;

public class StockPortfolio {

	private String name;
	private int numberOfShares;
	private int price;
	
	public StockPortfolio(String name, int numberOfShares,int price) {
		this.name = name;
		this.numberOfShares = numberOfShares;
		this.price = price;
	}

	void Value() {
		
		System.out.println("Total Value of Stock :" +numberOfShares * price);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	
	public int getPrice() {
		return price;
	} 

	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return "Stock name :" +name+ ", No. of Shares :" +numberOfShares+ ", price :" +price+ " \n";
		
	}
	public static void main(String[] args) {
		StockPortfolio tata = new StockPortfolio("TATA",5,80);
		System.out.print(tata);
		tata.Value();
		
		StockPortfolio tesla = new StockPortfolio("Tesla",15,200);
		System.out.println(tesla);
		tesla.Value();
		
		StockPortfolio relaince = new StockPortfolio("Relaince",10,120);
		System.out.println(relaince);
		relaince.Value();
	}
}
