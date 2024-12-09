package Service;

import Entity.Proprietario;
import Repository.ProprietarioRepository;

import java.util.ArrayList;

public class ProprietarioService {
    ProprietarioRepository proprietarioRepository = new ProprietarioRepository();

    public void createProprietario(String id,String nome,String cognome) {
        Proprietario pro=new Proprietario();
        pro.setNome(nome);
        pro.setCognome(cognome);
        pro.setId(id);
        proprietarioRepository.createProprietario(pro);
    }

    public ArrayList<Proprietario> readProprietario() {
        return proprietarioRepository.readProprietario();
    }

    public void deleteProprietario(String id) {
        Proprietario pro=new Proprietario();
        pro.setId(id);
        proprietarioRepository.deletePropretario(id);
    }

    public void updateProprietario(String id,String nome,String cognome) {
        Proprietario pro=new Proprietario();
        pro.setId(id);
        pro.setNome(nome);
        pro.setCognome(cognome);
        proprietarioRepository.updateProprietario(pro);
    }
}
