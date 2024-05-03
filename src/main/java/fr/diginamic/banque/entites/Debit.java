package fr.diginamic.banque.entites;

import java.util.Date;

public class Debit extends Operation {

    public Debit(Date dateOperation, double montant) {
        super(dateOperation, montant);
    }

    @Override
    public String getType() {
        return "Débit";
    }
}
