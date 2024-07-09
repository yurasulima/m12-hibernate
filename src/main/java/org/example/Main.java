package org.example;

import org.example.dao.model.Client;
import org.example.dao.model.Planet;
import org.flywaydb.core.Flyway;

public class Main {
    public static void main(String[] args) {
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:h2:tcp://localhost/~/test", "sa", "")
                .load();
        flyway.migrate();


        ClientService clientCrudService = new ClientService();


        Client newClient = new Client();
        newClient.setName("Oleg");
        clientCrudService.saveClient(newClient);
        System.out.println("Created Client = " + newClient);


        Client currentClient = clientCrudService.findClientById(1L);
        System.out.println("Current Client = " + currentClient);


        currentClient.setName("Olga");
        clientCrudService.updateClient(currentClient);
        System.out.println("Current updated Client = " + currentClient);


        clientCrudService.deleteClient(newClient);
        System.out.println("Deleted Client = " + currentClient);


        System.out.println("-------------------------------");
        PlanetService planetService = new PlanetService();

        Planet newPlanet = new Planet();
        newPlanet.setId("E327");
        newPlanet.setName("E-326");
        planetService.savePlanet(newPlanet);
        System.out.println("Created Planet = " + newPlanet);


        Planet currentPlanet = planetService.findPlanetById("E327");
        System.out.println("Current Planet = " + currentPlanet);


        currentPlanet.setName("E-327");
        planetService.updatePlanet(currentPlanet);
        System.out.println("Current updated Planet = " + currentPlanet);


        planetService.deletePlanet(currentPlanet);
        System.out.println("Deleted Planet = " + currentPlanet);


        HibernateUtil.getInstance().close();
    }
}