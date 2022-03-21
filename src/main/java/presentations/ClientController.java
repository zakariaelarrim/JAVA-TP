package presentations;

import models.Client;
import services.ClientServiceImpl;

public class ClientController {
    ClientServiceImpl service;
    public Client save(Client client){
        service.save(client);
        return null;
    }
    public ClientController(){
        System.out.println("Client Controller");
    }
}
