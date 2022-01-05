package net.hunter.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import net.hunter.util.FormatUtility;
import net.hunter.util.HuntersCalculatorUtility;

public class QuadController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String coefficentA = request.getParameter("ValueA");
		String coefficentB = request.getParameter("ValueB");
		String coefficentC = request.getParameter("ValueC");
		ModelAndView modelandview = new ModelAndView("QuadResultsPage");
		modelandview.addObject("ValueA", coefficentA);
		modelandview.addObject("ValueB", coefficentB);
		modelandview.addObject("ValueC", coefficentC);
		double[] sexy = HuntersCalculatorUtility.solveQuadratic(Double.parseDouble(coefficentA),
				Double.parseDouble(coefficentB), Double.parseDouble(coefficentC));
		modelandview.addObject("Zero1", sexy[0]);
		modelandview.addObject("Zero2", sexy[1]);

		return modelandview;
	}
}