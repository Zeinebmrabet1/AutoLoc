package tn.esprit.tp.web.dto;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tn.esprit.tp.domain.Employe;
import tn.esprit.tp.web.dto.EmployeDTO;

@Mapper(componentModel = "spring")
public interface EmployeMapper {
    @Mapping(target="prenom",source="sujet1")
    @Mapping(target="nom",source="sujet2")
    EmployeDTO toDto(Employe employe);



}
