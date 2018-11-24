package com.cg.dao;

import java.util.List;

import com.cg.dto.HotelClient;

public interface IBookingDao {
	
	public int addbook(HotelClient clt);
	public List<HotelClient> getAllbook();
	public HotelClient getBookDetails(int mobId);
	public void delete(int bookId) ;
	public int updatebooking(HotelClient clt);

}
