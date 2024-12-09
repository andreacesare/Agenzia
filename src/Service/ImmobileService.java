package Service;

import Entity.Immobile;
import Entity.Proprietario;
import Repository.ImmobileRepository;

import java.util.ArrayList;

public class ImmobileService {
    ImmobileRepository immobileRepository = new ImmobileRepository();

    public void createImmobile(String id,String tipo,int vani,int costo,int superficie,int anno,String idp){
        Immobile immobile=new Immobile();
        Proprietario proprietario=new Proprietario();
        immobile.setId(id);
        immobile.setTipo(tipo);
        immobile.setVani(vani);
        immobile.setCosto(costo);
        immobile.setSuperficie(superficie);
        immobile.setAnno(anno);
        proprietario.setId(idp);
        immobile.setProprietario(proprietario);
        immobileRepository.createImmobile(immobile);




    }

    public ArrayList<Immobile> readImmobile(){
        return immobileRepository.readImmobile();
    }

    public void deleteImmobile(String id){
        immobileRepository.deleteImmobile(id);
    }

    public void updateImmobile(String id,String tipo,int vani,int costo,int superficie,int anno,String idp){
        Immobile immobile=new Immobile();
        Proprietario proprietario=new Proprietario();
        immobile.setId(id);
        immobile.setTipo(tipo);
        immobile.setVani(vani);
        immobile.setCosto(costo);
        immobile.setSuperficie(superficie);
        immobile.setAnno(anno);
        proprietario.setId(idp);
        immobile.setProprietario(proprietario);
        immobileRepository.updateImmobile(immobile);

    }
}
