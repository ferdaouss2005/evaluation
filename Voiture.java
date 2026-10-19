package com.example.tp;

public class Voiture extends Vehicule {
    private int nbPlaces;

    public Voiture(String immatriculation, String marque,
                   double tarifJournalier, int nbPlaces) {
        super(immatriculation, marque, tarifJournalier);
        this.nbPlaces = nbPlaces;
    }

    @Override
    public double calculerCout(int nbJours) {
        if (nbPlaces > 5) {
            return (tarifJournalier + 50) * nbJours;
        }

        return tarifJournalier * nbJours;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Nombre de places : " + nbPlaces);
    }
}