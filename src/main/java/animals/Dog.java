package animals;

public class Dog implements Pet {
    private Pet pet;

    public Dog(Pet pet) {
        this.pet = pet;
    }

    @Override
    public void makeSound() {
        this.pet.makeSound();
        System.out.println("Gav,Gav");
    }

    @Override
    public String getName() {
        return this.pet.getName();
    }

    @Override
    public void rename(String newName) {
        this.pet.rename(newName);
    }
}
