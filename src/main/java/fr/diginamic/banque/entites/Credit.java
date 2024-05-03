package fr.diginamic.banque.entites;

import java.util.Date;

public class Credit extends Operation {

    public Credit(Date dateOperation, double montant) {
        super(dateOperation, montant);
    }

    @Override
    public String getType() {
        return "Crédit";
    }
}