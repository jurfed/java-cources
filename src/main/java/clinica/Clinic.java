package clinica;

import animals.Animal;

import java.util.ArrayList;

public class Clinic {
    private Client[] clients;

    public Clinic(final int size) {
        this.clients = new Client[size];
    }

    public void addClient(final int position, final Client client) {
        this.clients[position] = client;
    }

    public Client[] findClientsByPetName(final String petName) {
        Client[] temp;
        ArrayList<Client> tempList = new ArrayList<>();
        for (Client client : clients) {
            if (client != null && client.getPet().getName().equals(petName)) {
                tempList.add(client);
            }
        }
        temp = tempList.toArray(new Client[tempList.size()]);
        return temp;
    }

    public Client[] findClientsByClientName(final String name) {
        Client[] temp;
        ArrayList<Client> tempList = new ArrayList<>();
        for (Client client : clients) {
            if (client != null && client.getId().equals(name)) {
                tempList.add(client);
            }
        }
        temp = tempList.toArray(new Client[tempList.size()]);
        return temp;
    }

    public String getClientsPet(String clientName) {
        String answer = "This client in not found";
        for (Client client : clients) {

            if (client != null && client.getId().equals(clientName)) {
                answer = client.getPet().getName();
                break;
            }
        }
        return answer;
    }

    public void renameClient(String oldClientName, String newClientName) {
        for (Client client : clients) {

            if (client != null && client.getId().equals(oldClientName)) {
                client.rename(newClientName);
            }
        }
    }

    public void renamePet(String oldPetName, String newCPetName) {
        for (Client client : clients) {

            if (client != null && client.getPet().getName().equals(oldPetName)) {
                client.getPet().rename(newCPetName);
            }
        }
    }

    public void deleteClient(String clientName) {
        ArrayList<Client> tempList = new ArrayList<>();
        for (Client client : clients) {
            if (client != null && !client.getId().equals(clientName)) {
                tempList.add(client);
            }
        }
        clients = tempList.toArray(new Client[tempList.size()]);
    }

    public void deletePet(String petName) {
        ArrayList<Client> tempList = new ArrayList<>();
        for (Client client : clients) {
            if (client != null && !client.getPet().getName().equals(petName)) {
                tempList.add(client);
            }
        }
        clients = tempList.toArray(new Client[tempList.size()]);

    }
}
