package net.hunter.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import net.hunter.util.FormatUtility;
import net.hunter.util.HuntersCalculatorUtility;
 
public class QuadInputController extends AbstractController{
 
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		ModelAndView modelandview = new ModelAndView("QuadInput");
		return modelandview;
	}
}