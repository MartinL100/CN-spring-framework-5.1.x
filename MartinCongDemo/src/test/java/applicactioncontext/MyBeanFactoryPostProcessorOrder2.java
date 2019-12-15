package applicactioncontext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

public class MyBeanFactoryPostProcessorOrder2 implements BeanFactoryPostProcessor,Ordered{
	/**
	 * BeanDefinitions已经加载完成，Bean还未加载
	 * 只执行一次
	 * @param beanFactory the bean factory used by the application context
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("postProcessBeanFactory---->is loading -->order 3");

	}


	@Override
	public int getOrder() {
		return 3;
	}
}
