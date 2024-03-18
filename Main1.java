abstract class Food {
    abstract void prepare();
    
    void prepare(String ingredients) {
        System.out.println("Preparing food with " + ingredients);
    }
}

class Burger extends Food {
    @Override
    void prepare() {
        System.out.println("Preparing burger");
    }
}

class Salad extends Food {
    @Override
    void prepare() {
        System.out.println("Preparing salad");
    }
}

class Soup extends Food {
    @Override
    void prepare() {
        System.out.println("Preparing soup");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Food burger = new Burger();
        Food salad = new Salad();
        Food soup = new Soup();

        burger.prepare();
        salad.prepare();
        soup.prepare();

        salad.prepare("lettuce, tomatoes, cucumbers");
    }
}
