package org.example.presentations;

import org.example.models.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.example.services.IFactureService;

import java.util.List;

@Controller("facture")
public class FactureController {
    @Autowired
    IFactureService service;

    public Facture save(Facture facture){
        return service.save(facture);
    }
    public Facture modify(Facture facture){
        return service.modify(facture);
    }
    public void remove(long idFact){
        service.remve(idFact);
    }
    public Facture getOne(long idFact){
        return service.getOne(idFact);
    }
    public List<Facture> getAll(){
        return service.getAll();
    }
    public List<Facture> findByAmount(double amount){
        return service.findByAmount(amount);
    }
}
