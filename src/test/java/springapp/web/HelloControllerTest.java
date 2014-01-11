package springapp.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Map;

import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

public class HelloControllerTest extends TestCase {


	@Test
	public void testHandleRequestView() throws Exception{
		HelloController controller = new HelloController();
		ModelAndView modelAndView = controller.handleRequest(null, null);
		assertEquals( "hello", modelAndView.getViewName() );
		Map theModel = modelAndView.getModel(); 
		
		assertNotNull( theModel );
		String nowValue = (String)theModel.get("now");
		assertNotNull( "NowValue is null", nowValue);
		
				
	}

}
