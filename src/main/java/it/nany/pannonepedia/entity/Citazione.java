package it.nany.pannonepedia.entity;

import lombok.Data;


import javax.persistence.*;
@Data
@Entity
public class Citazione {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String frase;

}
