package applicactioncontext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

public class MyBeanFactoryPostProcessor  implements BeanFactoryPostProcessor,Ordered{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("postProcessBeanFactory---->is loading -->order 0");
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
