package Home_work_7;

public class Cat extends Animal {

    public static int MAX_RUN_LENGTH = 200;

    public Cat(String name) {
        super(name);
    }

    public void run(int distance) {
        if (distance > MAX_RUN_LENGTH) {
            System.out.println(this.name + " - cannot ran so long :(");
        } else {
            super.run(distance);
        }
    }

    public void swim(int distance) {
        System.out.println("Kittens can't swim !");
    }
}