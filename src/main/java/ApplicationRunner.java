import models.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import presentations.ClientController;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) context.getBean("controller");
        Client clt = new Client("OMAR");
        ctrl.save(clt);

    }
}
