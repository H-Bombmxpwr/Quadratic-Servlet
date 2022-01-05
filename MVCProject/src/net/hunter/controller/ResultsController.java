package net.hunter.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import net.hunter.util.FormatUtility;
import net.hunter.util.HuntersCalculatorUtility;
 
public class ResultsController extends AbstractController{
 
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
 
	String number =	request.getParameter("integers");
//	String hunter =	request.getParameter("hunter");
		ModelAndView modelandview = new ModelAndView("ResultsPage");
		modelandview.addObject("welcomeMessage", "Hunter is the best!");
		modelandview.addObject("numberString", FormatUtility.formatInputString(number));
		if (request.getParameter("operation").equals("sum")) {
			modelandview.addObject("grammar","The sum of ");
			modelandview.addObject("sum",FormatUtility.formatNumber(HuntersCalculatorUtility.sumIntegers(number)));
		}
		else {
			modelandview.addObject("grammar","The product of ");
			modelandview.addObject("sum",FormatUtility.formatNumber(HuntersCalculatorUtility.multiplyIntegers(number)));
		}
		
		
		return modelandview;
	}
}