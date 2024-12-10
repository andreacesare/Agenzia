package Controller;

import Entity.Annesso;
import Service.AnnessoService;

import java.util.ArrayList;
import java.util.Scanner;

public class AnnessoController {
    AnnessoService annessoService = new AnnessoService();
    Scanner scanner = new Scanner(System.in);

    public void createAnnesso(){
        System.out.println("Scrivi id: ");
        String id = scanner.nextLine();
        System.out.println("Scrivi tipo: ");
        String tipo = scanner.nextLine();
        System.out.println("Scrivi superficie: ");
        String superficie = scanner.nextLine();
        ImmobileController immobileController = new ImmobileController();
        immobileController.readImmobile();
        System.out.println("Inserisic id dell'immobile: ");
        String idi = scanner.nextLine();
        annessoService.createAnnesso(id, tipo, superficie, idi);

    }

    public void readAnnesso(){
        System.out.println("Ecco la lista degli annessi");
        ArrayList<Annesso> annessi = annessoService.readAnnesso();
        for(Annesso annesso : annessi){
            System.out.println(annesso);
        }
    }

    public void deleteAnnesso(){
        readAnnesso();
        System.out.println("Inserisci id annesso a eliminare");
        String id = scanner.nextLine();
        annessoService.deleteAnnesso(id);

    }

    public void updateAnnesso(){
        readAnnesso();
        System.out.println("Inserisic id annesso da modificare");
        String id = scanner.nextLine();
        System.out.println("Inserisci tipo");
        String tipo = scanner.nextLine();
        System.out.println("Inserisci superficie");
        String superficie = scanner.nextLine();
        annessoService.updateAnnesso(id, tipo, superficie, id);
    }
}
