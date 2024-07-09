package org.example.dao.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "ticket")
@Data
public class Ticket {

    @Id
    private String id;

    @Column(name = "name", length = 200)
    private String name;

    @Column(name = "created_at", length = 200)
    private String createAt;

    @Column(name = "client_id", length = 200)
    private String clientId;

    @Column(name = "from_planet_id", length = 200)
    private String fromPlanetId;

    @Column(name = "to_planet_id", length = 200)
    private String toPlanetId;


    //id - ідентифікатор квитка, первинний сурогатний ключ, автоінкрементне число.
    //created_at - TIMESTAMP в UTC, коли був створений цей квиток
    //client_id - ідентифікатор клієнта, якому належить цей квиток.
    //from_planet_id - ідентифікатор планети, звідки відправляється пасажир
    //to_planet_id - ідентифікатор планети, куди летить пасажир
}
