package org.example.dao;

import org.example.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IClientDao extends CrudRepository<Client,Long> {
    List<Client> findByName(String name);
}
