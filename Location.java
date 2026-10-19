package com.example.tp;

public class Location {
    private Client client;
    private Vehicule vehicule;
    private int nbJours;

    public Location(Client client, Vehicule vehicule, int nbJours) {
        this.client = client;
        this.vehicule = vehicule;
        this.nbJours = nbJours;
    }

    public double calculerMontant() {
        return vehicule.calculerCout(nbJours);
    }

    public void afficherRecapitulatif() {
        System.out.println("----- Récapitulatif de location -----");
        System.out.println(client);
        vehicule.afficherDetails();
        System.out.println("Durée : " + nbJours + " jours");
        System.out.printf("Montant : %.2f DH%n", calculerMontant());
        System.out.println();
    }
}