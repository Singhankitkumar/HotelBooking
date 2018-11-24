package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.dto.HotelClient;





@Repository("bookdao")
public class BookingDaoImpl implements IBookingDao {
	

	@PersistenceContext
	EntityManager entitymanager;

	@Override
	public int addbook(HotelClient clt) {
		
		entitymanager.persist(clt);
		entitymanager.flush();
		return clt.getBookId();
	}

	@Override
	public List<HotelClient> getAllbook() {
		Query queryOne=entitymanager.createQuery("FROM HotelClient");
		List<HotelClient> myList=queryOne.getResultList();
		return myList;
	}

	@Override
	public HotelClient getBookDetails(int mobId) {
		HotelClient mobile=entitymanager.find(HotelClient.class,mobId);
		return mobile;
	}

	@Override
	public void delete(int bookId) {
	 {
			Query q=entitymanager.createQuery("DELETE FROM HotelClient WHERE bookId=:bookId");
			q.setParameter("bookId",bookId);
			q.executeUpdate();
		}
		
		
	}

	@Override
	public int updatebooking(HotelClient clt) {

		entitymanager.merge(clt);
		return clt.getBookId();
	}
	}
	

