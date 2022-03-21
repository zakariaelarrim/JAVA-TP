package org.example.services;

import org.example.dao.IFactureDao;
import org.example.models.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class FactureClientServiceImpl implements IFactureService {
    @Autowired
    public IFactureDao daoFact;
    @Transactional
    @Override
    public Facture save(Facture factrue) {
        return daoFact.save(factrue);
    }
    @Transactional
    @Override
    public Facture modify(Facture facture) {
        Facture fact = daoFact.findById(facture.getId()).get();
        fact.setAmount(facture.getAmount());
        return daoFact.save(facture);
    }
    @Transactional
    @Override
    public void remve(long idFact) {
        Facture fact = daoFact.findById(idFact).get();
        if(fact != null){
            daoFact.deleteById(idFact);
        }
    }

    @Override
    public Facture getOne(long idFact) {
        return daoFact.findById(idFact).get();
    }

    @Override
    public List<Facture> getAll() {
        return (List<Facture>) daoFact.findAll();
    }

    @Override
    public List<Facture> findByAmount(double amount) {
        return (List<Facture>) daoFact.findByAmount(amount);
    }
}
