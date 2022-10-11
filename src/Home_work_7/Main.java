package Home_work_7;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", 500, 10);
        dog1.run(501);
        dog1.swim(9);


        System.out.println("\n");

        Dog dog2 = new Dog("Belka", 500, 10);
        dog2.run(415);
        dog2.swim(15);


        System.out.println("\n");

        Cat cat1 = new Cat("Felix", 200, 0);
        cat1.run(201);
        cat1.swim(1);


        System.out.println("\n");

        Cat cat2 = new Cat("Barsik", 200, 0);
        cat2.run(150);

        System.out.println("\n");


        System.out.println("Dogs amount: " + Dog.dogsCount);
        System.out.println("Cats amount: " + Cat.catsCount);
        System.out.println("Animals amount: " + Animal.animalsCount);

    }

}

