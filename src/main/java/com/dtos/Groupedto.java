package com.dtos;

import com.entities.Concert;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Data
public class Groupedto {
    private Long idGroupe;
    private String nomGroupe;

    private String description;
    private List<Concertdto> concerts;
}
