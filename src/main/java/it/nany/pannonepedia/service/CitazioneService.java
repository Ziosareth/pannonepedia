package it.nany.pannonepedia.service;

import it.nany.pannonepedia.entity.Citazione;
import it.nany.pannonepedia.repository.CitazioneRepos;
import org.springframework.stereotype.Service;


@Service
public class CitazioneService {
    private CitazioneRepos citazioneRepos;

    public CitazioneService(CitazioneRepos citazioneRepos) {
        this.citazioneRepos = citazioneRepos;
    }

    public Iterable<Citazione> getList(){
        return citazioneRepos.findAll();
    }

    public void insertCitazione(String frase){
        Citazione citazione = new Citazione();
        citazione.setFrase(frase);
        citazioneRepos.save(citazione);
    }
}
