package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunner.class, args);
//        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
//        ClientController ctr = (ClientController) context.getBean("controller");
//        FactureController factCtr = (FactureController) context.getBean("facture");
//
//        Client client1 = new Client("Mohamed");
//        Client client2 = new Client("Zakaria");
//        Client client3 = new Client("Khadija");
//
//        client1 = ctr.save(client1);
//        client2 = ctr.save(client2);
//        client3 = ctr.save(client3);
//
//        ctr.getAll().stream().forEach(item  -> System.out.println(item));
//        System.out.println(ctr.getOne(2));
//
//        client1.setName("Mahmoud");
//        ctr.modify(client1);
//        ctr.getAll().stream().forEach(item -> System.out.println(item));
//        ctr.findByName("Zakaria").stream().forEach(item -> System.out.println(item));
//
////        ----------- test facture --------------
//
//        Facture fac1 = new Facture(1200,"Facture Bon Livrasion Client 1");
//        Facture fac2 = new Facture(1200,"Facture Bon Livrasion Client 2");
//
//        fac1 = factCtr.save(fac1);
//        fac2 = factCtr.save(fac2);
//
//        factCtr.getAll().stream().forEach(item  -> System.out.println(item));
//        System.out.println(factCtr.getOne(2));


    }
}
