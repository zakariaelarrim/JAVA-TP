package services;

import dao.ClientDaoImpl;
import models.Client;

public class ClientServiceImpl implements IClientService{
  ClientDaoImpl dao;

  @Override
  public Client save(Client client) {
    dao.save(client);
    return null;
  }
  public ClientServiceImpl(){
    System.out.println("Client Service");
  }
}
