package Home_work_7;

public class Main {
    public static int dogsCount;
    public static int catsCount;
    public static int animalsCount;

    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex");
        dog1.run(501);
        dog1.swim(9);
        dogsCount++;

        System.out.println("\n");

        Dog dog2 = new Dog("Belka");
        dog2.run(415);
        dog2.swim(15);
        dogsCount++;

        System.out.println("\n");

        Cat cat1 = new Cat("Felix");
        cat1.run(201);
        cat1.swim(1);
        catsCount++;

        System.out.println("\n");

        Cat cat2 = new Cat("Barsik");
        cat2.run(150);
        catsCount++;

        System.out.println("\n");
        animalsCount = dogsCount + catsCount;

        System.out.println("Dogs amount: " + dogsCount);
        System.out.println("Cats amount: " + catsCount);
        System.out.println("Animals amount: " + animalsCount);


    }
}

