package com.example.tp;

public class Main {
    public static void main(String[] args) {

        // Création des clients
        Client c1 = new Client(1, "Alami", "Ali");
        Client c2 = new Client(2, "Bennani", "Sara");

        // Création des véhicules
        Voiture v1 = new Voiture("12345-A-1", "Dacia", 300, 5);
        Voiture v2 = new Voiture("67890-B-2", "Renault", 400, 7);
        Moto m1 = new Moto("11111-C-3", "Yamaha", 150, 125);

        // Tableau de véhicules
        Vehicule[] vehicules = {v1, v2, m1};

        System.out.println("===== LISTE DES VEHICULES =====");

        for (int i = 0; i < vehicules.length; i++) {
            vehicules[i].afficherDetails();
            System.out.println();
        }

        // Création des locations
        Location l1 = new Location(c1, v1, 3);
        Location l2 = new Location(c2, v2, 2);
        Location l3 = new Location(c1, m1, 6);

        // Tableau de locations
        Location[] locations = {l1, l2, l3};

        System.out.println("===== LISTE DES LOCATIONS =====");

        double total = 0;

        for (int i = 0; i < locations.length; i++) {
            locations[i].afficherRecapitulatif();
            total += locations[i].calculerMontant();
        }

        System.out.printf("Montant total des locations : %.2f DH%n",
                total);
    }
}