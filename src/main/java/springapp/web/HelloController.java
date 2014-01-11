package springapp.web;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	protected final Log logger = LogFactory.getLog( getClass() );
	
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		logger.info( "Returning hello view");
		
		ModelAndView theModel = new ModelAndView( "hello");
		String nowDate = (new Date()).toString();
		
		theModel.addObject( "now", nowDate ); 
		return theModel;
		
	}

}
