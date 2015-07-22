import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class BeanLifeCycle implements InitializingBean, DisposableBean, ApplicationContextAware,BeanNameAware,
        ApplicationEventPublisherAware {

    public void afterPropertiesSet() throws Exception {
 //Initialization code
    }


    public void destroy() throws Exception {
        //Destruction code
    }


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //Set Application Context
    }

    public void setBeanName(String name) {

    }

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {

    }
}
