import com.hjc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TsetString {

    @Test
    public void TestSpring() {
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"classpath:\\com\\hjc\\config\\spring\\spring-config.xml"});
        UserService userService = (UserService) ac.getBean("userService");
        userService.test();
    }
}
