package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.dto.HotelClient;

import com.cg.service.IBookingService;

@Controller
public class MyController {
	
	@Autowired
	IBookingService bookservice;
	
	
	@RequestMapping(value="addbooking")
	public String insertmobile(@ModelAttribute("my") HotelClient clt){

		return "addmobiledata";



}
	@RequestMapping(value="insertbook",method=RequestMethod.POST)
	public ModelAndView addmobile(@ModelAttribute("my") HotelClient clt){
		int id=0;
		id=bookservice.addbook(clt);
	return new ModelAndView("success","deg",id);
	
}

	@RequestMapping(value="show")
	public ModelAndView showMobileList(){
		List<HotelClient> myAllData=bookservice.getAllbook();
		return new ModelAndView("showall","temp",myAllData);
	}
	
	
	
	@RequestMapping(value ="find")
	public String retrieve_Detail(Model model) {
		HotelClient trainee = new HotelClient();
		model.addAttribute("trainee", trainee);
		return "findbook";
	}
	
	@RequestMapping(value = "bookfind")
	public String retrievebook( HotelClient clt , Model model) {
		HotelClient traineeRes = bookservice.getBookDetails(clt.getBookId());
	
		model.addAttribute("traineeList", traineeRes);	
	
	
	return "display";
}
	@RequestMapping(value="delete",method=RequestMethod.GET)
	public String deletebooking(){
		
		return "deletebooking";
	}
	
	@RequestMapping(value="del_Trainee",method=RequestMethod.GET)
	public String employeeDelete(@RequestParam("bookId") int bookId){
	bookservice.delete(bookId);
		return "deleted";
		
	}
	
	@RequestMapping(value="updatebook")
	public String updatemobile( Model model) {
		HotelClient trainee = new HotelClient();
		model.addAttribute("mobile",trainee);
		return "updated";
}

	@RequestMapping(value="updateaction")
	public ModelAndView updateMobile(@ModelAttribute("mobile") HotelClient clt,Model model){
		bookservice.updatebooking(clt);
		List<HotelClient> myAllData=bookservice.getAllbook();
		
		return new ModelAndView("showall","temp",myAllData);
		
		
	}
	
}