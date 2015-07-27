
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Spring {

    public static void main(String args[]){
        ConfigurableApplicationContext context = new FileSystemXmlApplicationContext( new String[] {"SpringConfig.xml"});
        Display obj = (Display)context.getBean("display");
        obj.setName("Sankar");
        obj.getClass().getConstructors();
        System.out.println(obj);
        obj.show();

        Display obj2 = (Display)context.getBean("display");
        System.out.println(obj2);
        obj2.show();
        context.close();

    }
}
