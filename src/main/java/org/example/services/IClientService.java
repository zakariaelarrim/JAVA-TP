package org.example.services;
import org.example.models.Client;

import java.util.List;

public interface IClientService {
    Client save(Client client);
    Client modify(Client client);
    void remove(long idClt);
    Client getOne(long idClt);
    List<Client> getAll();
    List<Client> findByName(String name);

}
