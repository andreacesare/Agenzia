package Controller;

import Entity.Immobile;
import Service.ImmobileService;

import java.util.ArrayList;
import java.util.Scanner;

public class ImmobileController {
    ImmobileService immobileService=new ImmobileService();
    Scanner scanner=new Scanner(System.in);

    public void createImmobile(){
        System.out.println("Inserisci id");
        String id=scanner.nextLine();
        System.out.println("Inserisci tipo");
        String tipo=scanner.nextLine();
        System.out.println("Inserisci  numero vani");
        int vani=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Inserisci costo");
        int costo=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Inserisci superficie mq");
        int superficie=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Inserisci anno");
        int anno=scanner.nextInt();
        scanner.nextLine();
        ProprietarioController proprietarioController=new ProprietarioController();
        proprietarioController.readProprietario();
        System.out.println("Inserisci id del proprietario dell'immobile");
        String idp=scanner.nextLine();
        immobileService.createImmobile(id,tipo,vani,costo,superficie,anno,idp);


    }

    public void readImmobile(){
        System.out.println("Ecco la lista degli immobili");
        ArrayList<Immobile> lista=immobileService.readImmobile();
        for(Immobile i:lista){
            System.out.println(i);
        }
    }

    public void deleteImmobile(){
        readImmobile();
        System.out.println("Inserisci l'id dell'immobile da eliminare");
        String id=scanner.nextLine();
        immobileService.deleteImmobile(id);
    }

    public void updateImmobile(){
        readImmobile();
        System.out.println("Inserisci l'id dell'immobile da modificare");
        String id=scanner.nextLine();
        System.out.println("Inserisci tipo");
        String tipo=scanner.nextLine();
        System.out.println("Inserisci  numero vani");
        int vani=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Inserisci costo");
        int costo=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Inserisci superficie mq");
        int superficie=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Inserisci anno");
        int anno=scanner.nextInt();
        scanner.nextLine();
        ProprietarioController proprietarioController=new ProprietarioController();
        proprietarioController.readProprietario();
        System.out.println("Inserisci id del proprietario dell'immobile");
        String idp=scanner.nextLine();
        immobileService.updateImmobile(id,tipo,vani,costo,superficie,anno,idp);

    }
}
