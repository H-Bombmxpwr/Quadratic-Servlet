package net.hunter.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import net.hunter.util.FormatUtility;
import net.hunter.util.HuntersCalculatorUtility;
 
public class HelloController extends AbstractController{
 
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
 
	String number =	request.getParameter("number");
	String hunter =	request.getParameter("hunter");
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "Hunter is the best!");
//		modelandview.addObject("testMsg", HuntersCalculatorUtility.sumIntegers(number));
//		modelandview.addObject("testMsg1",FormatUtility.formatNumber(HuntersCalculatorUtility.sumIntegers(number)));
		
		return modelandview;
	}
}