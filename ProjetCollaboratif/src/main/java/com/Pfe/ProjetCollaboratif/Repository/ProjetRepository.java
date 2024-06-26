package com.Pfe.ProjetCollaboratif.Repository;

import com.Pfe.ProjetCollaboratif.Entity.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long> {

}
