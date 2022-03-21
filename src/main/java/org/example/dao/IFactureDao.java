package org.example.dao;

import org.example.models.Facture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFactureDao extends CrudRepository<Facture, Long> {
    List<Facture> findByAmount(double amount);
}
