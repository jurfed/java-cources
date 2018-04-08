package animals;

import com.sun.javafx.binding.StringFormatter;

public class Cat extends Animal {

    public Cat(final String name) {
        super(name);
    }

    public void catchMouse() {

    }

    @Override
    public void makeSound() {
        System.out.println(String.format("may %s", this.getName()));

    }

    @Override
    public void rename(String newName) {
        super.rename(newName);
    }

}
