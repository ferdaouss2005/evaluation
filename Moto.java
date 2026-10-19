package com.example.tp;

public class Moto extends Vehicule {
    private int cylindree;

    public Moto(String immatriculation, String marque,
                double tarifJournalier, int cylindree) {
        super(immatriculation, marque, tarifJournalier);
        this.cylindree = cylindree;
    }

    @Override
    public double calculerCout(int nbJours) {
        double montant = tarifJournalier * nbJours;

        if (nbJours >= 5) {
            montant = montant * 0.90;
        }

        return montant;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Cylindrée : " + cylindree + " cm³");
    }
}