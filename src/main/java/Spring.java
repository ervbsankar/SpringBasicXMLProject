
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by A513915 on 7/21/2015.
 */
public class Spring {

    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Display obj = (Display)context.getBean("display");
        obj.setName("Sankar");
        obj.getClass().getConstructors();
        System.out.println(obj);
        obj.show();
        Display obj2 = (Display)context.getBean("display");
        System.out.println(obj2);
        obj2.show();

    }
}
