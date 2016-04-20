import aop.RequestParam;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BusinessService;

/**
 * Created by liaomengge on 16/4/20.
 */

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application_config.xml");
        BusinessService service = context.getBean("businessService", BusinessService.class);
        RequestParam param = new RequestParam();
        param.setName("lmg");
        service.doHandle(param);
    }
}
