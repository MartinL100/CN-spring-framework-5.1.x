package applicactioncontext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassPatbXmlApplicatioinContext extends ClassPathXmlApplicationContext{

	public MyClassPatbXmlApplicatioinContext(String configLocation) throws BeansException {
		super(configLocation);
	}

	/**
	 * 环境初始化时扩展，用于Spring环境准备
	 * 在refresh()方法的第一步prepareRefresh()中调用
	 */
	@Override
	protected void initPropertySources() {
		System.out.println("initPropertySources is loading-->环境准备");
	}

	/**
	 *用于定制Bean工厂的扩展
	 * 在refresh()方法的第二步ConfigurableListableBeanFactory beanFactory = obtainFreshBeanFactory()中调用
	 * @param beanFactory the newly created bean factory for this context
	 */
	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
//		super.setAllowBeanDefinitionOverriding(false);
//		super.setAllowCircularReferences(false);
//		super.customizeBeanFactory(beanFactory);
		System.out.println("customizeBeanFactory is loading -->定制工厂扩展");
	}
}
