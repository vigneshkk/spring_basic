package Controllerclasses;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		System.out.println("came herrrrrreeeeeeeeeeeeeeeeee");
		System.out.println("came herrrrrreeeeeeeeeeeeeeeeee");
		System.out.println("came herrrrrreeeeeeeeeeeeeeeeee");
		System.out.println("came herrrrrreeeeeeeeeeeeeeeeee");
		String name=req.getParameter("formName");
		Map<String,String> m=new HashMap();
		m.put("mess","Helloooo...."+name );
		ModelAndView mav=new ModelAndView("success",m);
		return mav;
	}

}
