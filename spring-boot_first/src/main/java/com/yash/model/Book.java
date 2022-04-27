package com.yash.model;

public class Book 
{
	int btid, auid1, auid, auid3, pubid, price;
	String title;
	
	public Book() {}
	public Book(int btid, int auid1, int auid, int auid3, int pubid, int price, String title) {
		super();
		this.btid = btid;
		this.auid1 = auid1;
		this.auid = auid;
		this.auid3 = auid3;
		this.pubid = pubid;
		this.price = price;
		this.title = title;
	}
	public int getBtid() {
		return btid;
	}
	public void setBtid(int btid) {
		this.btid = btid;
	}
	public int getAuid1() {
		return auid1;
	}
	public void setAuid1(int auid1) {
		this.auid1 = auid1;
	}
	public int getAuid() {
		return auid;
	}
	public void setAuid(int auid) {
		this.auid = auid;
	}
	public int getAuid3() {
		return auid3;
	}
	public void setAuid3(int auid3) {
		this.auid3 = auid3;
	}
	public int getPubid() {
		return pubid;
	}
	public void setPubid(int pubid) {
		this.pubid = pubid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
