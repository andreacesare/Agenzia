package Controller;

import Entity.Proprietario;
import Service.ProprietarioService;

import java.util.ArrayList;
import java.util.Scanner;

public class ProprietarioController {
    ProprietarioService proprietarioService = new ProprietarioService();
    Scanner scanner = new Scanner(System.in);

    public void createProprietario() {
        System.out.println("Inserisici 'id del nuovo proprietario");
        String id=scanner.nextLine();
        System.out.println("Inserisici 'nome del nuovo proprietario'");
        String nome=scanner.nextLine();
        System.out.println("Inserisici cognome del nuovo proprietario'");
        String cognome=scanner.nextLine();
        proprietarioService.createProprietario(id,nome,cognome);
    }

    public void readProprietario() {
        System.out.println("Ecco la lista dei proprietari");
        ArrayList<Proprietario> lista=proprietarioService.readProprietario();
        for(Proprietario proprietario:lista) {
            System.out.println(proprietario);
        }
    }

    public void deleteProprietario() {
        readProprietario();
        System.out.println("inserisci id del proprietario da elimare");
        String id=scanner.nextLine();
        proprietarioService.deleteProprietario(id);
    }

    public void updateProprietario() {
        readProprietario();
        System.out.println("inserisci id del proprietario da modificare");
        String id=scanner.nextLine();
        System.out.println("Inserisci nuovo nome del proprietario");
        String cognome=scanner.nextLine();
        System.out.println("Inserisci nuovo nome del proprietario");
        String nome=scanner.nextLine();
        proprietarioService.updateProprietario(id,cognome,nome);
    }
}
