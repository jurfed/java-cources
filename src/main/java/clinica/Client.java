package clinica;

import animals.Pet;

public class Client {

    private String id;

    private Pet pet;

    public Client(String id, Pet pet) {
        this.id = id;
        this.pet = pet;
    }

    public String getId() {
        return id;
    }

    public Pet getPet() {
        return pet;
    }

    public void rename(String id) {
        this.id = id;
    }
}
