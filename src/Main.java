import Controller.AnnessoController;
import Controller.ImmobileController;
import Controller.ProprietarioController;
import Entity.Proprietario;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int choice1;
        int choice2;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1)Immobile \n 2)Proprietario \n 3)Annesso \n 4) Exit");
            System.out.println("Inserisci la tua scelta");
            choice1 = scanner.nextInt();
            scanner.nextLine();
            if (choice1 == 1) {
                System.out.println("Classe Immobile");
                System.out.println("****MENU****");
                System.out.println("1. Crea un nuovo Immobile");
                System.out.println("2. Aggiorna un Immobile");
                System.out.println("3. Visualizza la lista degli Immobili");
                System.out.println("4. Elimina un Immobile");
                System.out.println("9. Exit");
                System.out.print("inserisci la tua scelta: ");
                choice2 = scanner.nextInt();
                scanner.nextLine();
                ImmobileController immobileController = new ImmobileController();
                switch (choice2) {
                    case 1:
                        immobileController.createImmobile();
                        break;
                    case 2:
                        immobileController.updateImmobile();
                        break;
                    case 3:
                        immobileController.readImmobile();
                        break;
                    case 4:
                        immobileController.deleteImmobile();
                        break;
                    case 5:
                        break;
                    case 6:

                        break;
                    case 7:
                        break;
                    case 9:
                        System.out.println("Exiting");
                        break;
                    default:
                        System.out.println("Insersci un numero valido");
                }
            }
            else if (choice1 == 2) {
                System.out.println("Classe Proprietario");
                System.out.println("****MENU****");
                System.out.println("1. Crea un nuovo roprietario");
                System.out.println("2. Aggiorna un proprietario");
                System.out.println("3. Visualizza la lista dei proprietari ");
                System.out.println("4. Elimina un proprietari");
                System.out.println("9. Exit");
                System.out.print("inserisci la tua scelta: ");
                choice2 = scanner.nextInt();
                scanner.nextLine();
                ProprietarioController proprietarioController = new ProprietarioController();
                switch (choice2) {
                    case 1:
                        proprietarioController.createProprietario();
                        break;
                    case 2:
                       proprietarioController.updateProprietario();
                        break;
                    case 3:
                        proprietarioController.readProprietario();
                        break;
                    case 4:
                        proprietarioController.deleteProprietario();
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 10:
                        break;
                    case 11:
                        break;
                    case 12:
                        break;
                    case 13:
                    case 9:
                        System.out.println("Exiting");
                        break;
                    default:
                        System.out.println("Insersci un numero valido");
                }
            }
            else if (choice1 == 3) {
                System.out.println("Classe Annesso");
                System.out.println("****MENU****");
                System.out.println("1. Crea un nuovo annesso");
                System.out.println("2. Aggiorna un annesso");
                System.out.println("3. Visualizza la lista degli annessi");
                System.out.println("4. Elimina un annesso");
                System.out.println("9. Exit");
                System.out.print("inserisci la tua scelta: ");
                choice2 = scanner.nextInt();
                scanner.nextLine();
                AnnessoController annessoController = new AnnessoController();
                switch (choice2) {
                    case 1:
                        annessoController.createAnnesso();
                        break;
                    case 2:
                        annessoController.updateAnnesso();
                        break;
                    case 3:
                        annessoController.readAnnesso();
                        break;
                    case 4:
                        annessoController.deleteAnnesso();
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 10:
                        break;
                    case 11:
                        break;
                    case 12:
                        break;
                    case 13:
                    case 9:
                        System.out.println("Exiting");
                        break;
                    default:
                        System.out.println("Insersci un numero valido");
                }
            }
        } while (choice1 != 4);

    }
    }
