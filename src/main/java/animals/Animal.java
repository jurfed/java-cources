package animals;

public class Animal implements Pet {

    private String name;

    public Animal(final String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(
                String.format("%s say : %s", this.name, "beep")
        );
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void rename(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        new Animal("puh").makeSound();
    }

    private boolean isHungry() {
        return true;
    }
}
