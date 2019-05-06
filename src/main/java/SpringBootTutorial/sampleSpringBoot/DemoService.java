package SpringBootTutorial.sampleSpringBoot;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DemoService implements BeanNameAware, InitializingBean {

	@Override
	public void setBeanName(String arg0) {
		System.out.println(arg0);

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("demo service is doing after property set activities");

	}
}

@Component
class DemoPostProcessor implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		if (beanName.equalsIgnoreCase("demoService")) {
			
			System.out.println("returning the bean name : " + beanName);
		}

		return bean;
	}
}
