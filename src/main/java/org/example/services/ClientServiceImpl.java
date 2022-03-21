package org.example.services;

import org.example.dao.IClientDao;
import org.example.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService{
  @Autowired
  private IClientDao dao;
  @Override
  @Transactional
  public Client save(Client clt) {
    return dao.save(clt);
  }
  @Override
  @Transactional
  public Client modify(Client newClt) {
    Client oldClt = dao.findById(newClt.getId()).get();
    oldClt.setName(newClt.getName());
    return dao.save(oldClt);
  }
  @Override
  @Transactional
  public void remove(long idClt) {
    dao.deleteById(idClt);
  }
  @Override
  public Client getOne(long idClt) {
    return dao.findById(idClt).get();
  }
  @Override
  public List<Client> getAll() {
    return (List<Client>) dao.findAll();
  }
  @Override
  public  List<Client> findByName(String name){
    return (List<Client>) dao.findByName(name);
  }

}
