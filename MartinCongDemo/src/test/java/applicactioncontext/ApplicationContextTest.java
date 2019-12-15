package applicactioncontext;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.GregorianCalendar;
import java.util.Locale;

public class ApplicationContextTest {
	@Test
	public void app(){
		ClassPathXmlApplicationContext app =  new ClassPathXmlApplicationContext("ApplicationContext.xml");
	}
	//initPropertySources扩展，用于Spring环境准备
	@Test
	public void initPropertySourcesTest(){
		ClassPathXmlApplicationContext app = new MyClassPatbXmlApplicatioinContext("ApplicationContext.xml");
		String [] params = {"john",new GregorianCalendar().getTime().toString()};
		String str = app.getMessage("test", params, Locale.US);

	}
}
