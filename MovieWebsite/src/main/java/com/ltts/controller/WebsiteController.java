package com.ltts.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.dao.BookingDao;
import com.ltts.model.MovieWebsite;
import com.ltts.model.SeatAvailabilityData;


@Controller
public class WebsiteController {
	
	@Autowired
	BookingDao bookingDao;
	
	/*
	 * @Autowired SeatAvailabilityData seatAvailabilityData;
	 */
	
	@RequestMapping("")
	public String home() {
		return "booking";
		
	}
	
	@RequestMapping("booking")
	
	
	
//	public String booking(MovieWebsite movieWebsite) {
//		bookingDao.save(movieWebsite);
//	    Optional<MovieWebsite> s = bookingDao.findById("movieName");
//	    
//		//System.out.println(s);
//		return "confirmbooking";
//		
//	}
	
	public ModelAndView booking(MovieWebsite movieWebsite) {
		ModelAndView mv = new ModelAndView();
		bookingDao.save(movieWebsite);
		mv.addObject("object",movieWebsite);
		//System.out.println(object.movieName);
		mv.setViewName("confirmbooking");
		return mv;
		
	}
	
	@RequestMapping("success")
	public ModelAndView booking(SeatAvailabilityData s) {
		ModelAndView mv = new ModelAndView();
		//bookingDao.save(s);
		mv.addObject("object",s);
		//System.out.println(object.movieName);
		mv.setViewName("website");
		return mv;
		
	}
//	public ModelAndView booking(MovieWebsite mw) {
//		
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("object",mw);
//		System.out.println(mv);
//		mv.setViewName("booking"); //same as booking.jsp
//		
//		return mv;
//	}
	
//	@RequestMapping(value = "/addbook/{movie_name}", method = RequestMethod.GET)
//	public ModelAndView bookingm(HttpServletRequest req, Model model, HttpSession httpSession,
//			@PathVariable String movie_id) {
//		ModelAndView mv = null;
//		mv = new ModelAndView("booking");
//		int mov = Integer.parseInt(movie_name);
//		httpSession.setAttribute("midd", mov);
//
//		SeatAvailabilityData s = (SeatAvailabilityData) seatAvailabilityData.getScreenByMid(mov);
//
//		int remainingSeats = s.getSeatsRemaining();
//
//		model.addAttribute("remseats", remainingSeats);
//		return mv;

//	}
}
