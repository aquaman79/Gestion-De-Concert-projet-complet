package com.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Entity
@Data
public class Groupe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGroupe;
    private String nomGroupe;

    private String description;
    @OneToMany(mappedBy = "groupe", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Concert> concerts;
}
