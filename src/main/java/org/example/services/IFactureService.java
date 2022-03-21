package org.example.services;

import org.example.models.Facture;

import java.util.List;

public interface IFactureService {
Facture save(Facture factrue);
Facture modify(Facture facture);
void remve(long idFact);
Facture getOne(long idFact);
List<Facture> getAll();
List<Facture> findByAmount(double amount);
}
