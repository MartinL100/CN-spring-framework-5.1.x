import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FirstTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext app =
				new AnnotationConfigApplicationContext(App.class);
		String [] strings = app.getBeanDefinitionNames();
		for (String s: strings
			 ) {
			System.out.println(s);
		}
	}




}
