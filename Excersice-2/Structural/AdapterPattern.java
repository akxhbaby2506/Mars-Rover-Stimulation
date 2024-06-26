public class AdapterPattern {

    // Bird interface
    interface Bird {
        void fly();
        void makeSound();
    }

    // Sparrow class
    static class Sparrow implements Bird {
        @Override
        public void fly() {
            System.out.println("Sparrow is flying");
        }

        @Override
        public void makeSound() {
            System.out.println("Chirp Chirp");
        }
    }

    // ToyDuck interface
    interface ToyDuck {
        void squeak();
    }

    // PlasticToyDuck class
    static class PlasticToyDuck implements ToyDuck {
        @Override
        public void squeak() {
            System.out.println("Squeak");
        }
    }

    // BirdAdapter class
    static class BirdAdapter implements ToyDuck {
        private final Bird bird;

        public BirdAdapter(Bird bird) {
            this.bird = bird;
        }

        @Override
        public void squeak() {
            bird.makeSound();
        }
    }

    // Main method to demonstrate the pattern
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();
        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck...");
        toyDuck.squeak();

        System.out.println("BirdAdapter...");
        birdAdapter.squeak();
    }
}
