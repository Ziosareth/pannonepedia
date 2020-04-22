package it.nany.pannonepedia.restcontroller;

import it.nany.pannonepedia.entity.Citazione;
import it.nany.pannonepedia.service.CitazioneService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class PannoneRestController {
    private CitazioneService citazioneService;

    public PannoneRestController(CitazioneService citazioneService) {
        this.citazioneService = citazioneService;
    }

    @GetMapping("/getAll")
    public Iterable<Citazione>getAll(){
        return citazioneService.getList();
    }

    @PostMapping("/insert")
    public void insertCitazione(String frase){
        citazioneService.insertCitazione(frase);
    }


}
