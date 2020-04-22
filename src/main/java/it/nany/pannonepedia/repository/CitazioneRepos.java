package it.nany.pannonepedia.repository;

import it.nany.pannonepedia.entity.Citazione;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitazioneRepos extends CrudRepository<Citazione, Long> {
}
