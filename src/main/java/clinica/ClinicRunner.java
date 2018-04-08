package clinica;

import animals.Animal;
import animals.Cat;
import animals.CatDog;
import animals.Dog;

import java.util.Scanner;

public class ClinicRunner {

    private final static int CLIENTS_SIZE = 10;

    private String exit = "no";
    int position = 0;
    Clinic clinic = new Clinic(CLIENTS_SIZE);
    Scanner reader;
    String petName;
    String pet2Name;
    String clientName;

    public static void main(String[] args) {

        ClinicRunner clinicRunner = new ClinicRunner();
        clinicRunner.initSomeClients();
        clinicRunner.enterToClinic();

    }

    private void initSomeClients() {
        clinic.addClient(position++, new Client("Brown", new Cat("Digy")));
        clinic.addClient(position++, new Client("Nick", new Dog(new Animal("Sparky"))));
        clinic.addClient(position++, new Client("Ann", new CatDog(new Cat("Tom"), new Animal("Piccy"))));
    }

    void enterToClinic() {
        reader = new Scanner(System.in);

        while (!exit.equals("yes")) {
            showDealogMenu();
            String action = reader.nextLine();
            switch (action) {
                case "1":
                    addClient();
                    break;
                case "2":
                    showClientsPet();
                    break;
                case "3":
                    findByPetName();
                    break;
                case "4":
                    findByClientName();
                    break;
                case "5":
                    renameClientName();
                    break;
                case "6":
                    renamePetName();
                    break;
                case "7":
                    deleteClient();
                    break;
                case "8":
                    deletePet();
                    break;
            }
            System.out.println("exit? yes/no");
            exit = reader.nextLine();
        }
    }

    private void showClientsPet() {
        System.out.println("enter client Name for show his pet:");
        String clientPet = reader.nextLine();
        if(clientPet.length()==0){
            System.out.println("client name must be not null");
        }else if(!clientPet.matches("^\\D*$")){
            System.out.println("client name must not contain numbers");
        }else{
            System.out.println(clinic.getClientsPet(clientPet));
        }

    }


    private void findByPetName() {
        System.out.println("enter pet Name:");
        String clientPet = reader.nextLine();

        Client[] clients = clinic.findClientsByPetName(clientPet);

        for (int i=0;i<clients.length; i++){
            System.out.println(clients[i].getId()+"-----"+clients[i].getPet().getName());
        }
    }

    private void findByClientName() {
        System.out.println("enter client Name:");
        String clientName = reader.nextLine();

        Client[] clients = clinic.findClientsByClientName(clientName);

        for (int i=0;i<clients.length; i++){
            System.out.println(clients[i].getId()+"-----"+clients[i].getPet().getName());
        }
    }

    private void renameClientName() {
        System.out.println("enter old client Name:");
        String oldClientName = reader.nextLine();

        System.out.println("enter new client Name:");
        String newClientName = reader.nextLine();

        clinic.renameClient(oldClientName, newClientName);

    }


    private void renamePetName() {
        System.out.println("enter old pet name:");
        String oldPetName = reader.nextLine();

        System.out.println("enter new pet Name:");
        String newCPetName = reader.nextLine();

        clinic.renamePet(oldPetName, newCPetName);
    }


    private void deleteClient() {
        System.out.println("enter client name:");
        String clientName = reader.nextLine();
        clinic.deleteClient(clientName);
    }

    private void deletePet() {
        System.out.println("enter pet name:");
        String petName = reader.nextLine();
        clinic.deletePet(petName);
    }

    void showDealogMenu() {
        System.out.println("choose action:");
        System.out.println("1: add new client");
        System.out.println("2: show client pet");
        System.out.println("3: find by pet name");
        System.out.println("4: find by client name");
        System.out.println("5: rename client name");
        System.out.println("6: rename pet name");
        System.out.println("7: delete client");
        System.out.println("8: delete pet");
    }

    public void addClient() {

        if (position + 1 == CLIENTS_SIZE) {
            System.out.println("clinic is full");
        } else {
            System.out.println("write client name:");
            clientName = reader.nextLine();

            System.out.println("write pet type:");
            System.out.println("1: cat");
            System.out.println("2: dog");
            System.out.println("3: CatDog");

            String petType = reader.nextLine();

            switch (petType) {
                case "1":
                    System.out.println("write cat name:");
                    petName = reader.nextLine();
                    clinic.addClient(position++, new Client(clientName, new Cat(petName)));
                    break;
                case "2":
                    System.out.println("write dog name:");
                    petName = reader.nextLine();
                    clinic.addClient(position++, new Client(clientName, new Dog(new Animal(petName))));
                    break;

                case "3":
                    System.out.println("write catDog first name:");
                    petName = reader.nextLine();

                    System.out.println("write catDog second name:");
                    pet2Name = reader.nextLine();

                    clinic.addClient(position++, new Client(clientName, new CatDog(new Cat(petName), new Animal(pet2Name))));
                    break;
            }
        }
    }

}
