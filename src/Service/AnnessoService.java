package Service;

import Entity.Annesso;
import Repository.AnnessoRepository;

import java.util.ArrayList;

public class AnnessoService {
    AnnessoRepository annessoRepository = new AnnessoRepository();

    public void createAnnesso(String id,String tipo,String superficie,String idi){
        Annesso annesso=new Annesso();
        annesso.setId(id);
        annesso.setTipo(tipo);
        annesso.setSuperficie(superficie);
        annesso.setIdi(idi);
        annessoRepository.createAnnesso(annesso);

    }

    public ArrayList<Annesso> readAnnesso(){
        return annessoRepository.readAnnesso();
    }

    public void deleteAnnesso(String id){
        annessoRepository.deleteAnnesso(id);
    }

    public void updateAnnesso(String id,String tipo,String superficie,String idi){
        Annesso annesso=new Annesso();
        annesso.setId(id);
        annesso.setTipo(tipo);
        annesso.setSuperficie(superficie);
        annesso.setIdi(idi);
        annessoRepository.updateAnnesso(annesso);
    }
}
