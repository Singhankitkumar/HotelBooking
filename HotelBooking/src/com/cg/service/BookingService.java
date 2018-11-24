package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cg.dao.IBookingDao;
import com.cg.dto.HotelClient;


@Service
@Transactional
public class BookingService implements IBookingService {
	
	@Autowired
	IBookingDao bookdao;

	@Override
	public int addbook(HotelClient clt) {
		
		return bookdao.addbook(clt);
	}

	@Override
	public List<HotelClient> getAllbook() {
		
		return bookdao.getAllbook() ;
	}

	@Override
	public HotelClient getBookDetails(int mobId) {
		
		return bookdao.getBookDetails(mobId);
	}

	@Override
	public void delete(int bookId) {
	bookdao.delete(bookId);
		
	}

	@Override
	public int updatebooking(HotelClient clt) {
		
		return bookdao.updatebooking(clt);
	}

}
