import com.cbat.xmlload.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class IocDiTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext app =
				new AnnotationConfigApplicationContext(App.class);
		String [] strings = app.getBeanDefinitionNames();
		for (String s: strings
			 ) {
			System.out.println(s);
		}
	}


	@Test
	public void xmlStart(){
		ApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		String [] strings = app.getBeanDefinitionNames();
		for (String s: strings
				) {
			System.out.println(s);
		}

	}
	@Test
	public void beanFactoryTest(){
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("ApplicationContext.xml"));
		User user = (User) beanFactory.getBean("carf");
		System.out.println(user);

		String [] strings = beanFactory.getBeanDefinitionNames();
		for (String s: strings
				) {
			System.out.println(s);
		}
	}


}
