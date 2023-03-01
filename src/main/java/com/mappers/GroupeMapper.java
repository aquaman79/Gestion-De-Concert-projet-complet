package com.mappers;


import com.dtos.Groupedto;
import com.dtos.Salledto;
import com.entities.Groupe;
import com.entities.Salle;
import org.springframework.stereotype.Component;

@Component

public class GroupeMapper {
    public Groupedto groupeEntityToDto(Groupe groupe) {
        Groupedto groupedto = new Groupedto();
        groupedto.setNomGroupe(groupe.getNomGroupe());
        groupedto.setDescription(groupe.getDescription());
        groupedto.setIdGroupe(groupe.getIdGroupe());
        return groupedto;
    }


    public Groupe groupeDtoToEntity( Groupedto groupedto) {
        Groupe groupe = new Groupe();
       groupe.setNomGroupe(groupedto.getNomGroupe());
       groupe.setDescription(groupedto.getDescription());
       groupe.setIdGroupe(groupedto.getIdGroupe());
        return groupe;
    }
}
