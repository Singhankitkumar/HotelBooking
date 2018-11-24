package com.cg.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class HotelClient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookId;
	private String name;
	private int members;
	private String address;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMembers() {
		return members;
	}
	public void setMembers(int members) {
		this.members = members;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public HotelClient(int bookId, String name, int members, String address) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.members = members;
		this.address = address;
	}
	public HotelClient() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "HotelClient [bookId=" + bookId + ", name=" + name
				+ ", members=" + members + ", address=" + address + "]";
	}
	

}
