package Home_work_7;

public class Dog extends Animal {

    public static int MAX_RUN_LENGTH = 500;
    public static int MAX_SWIM_LENGTH = 10;

    public Dog(String name) {
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
        if (distance > MAX_SWIM_LENGTH) {
            System.out.println(this.name + " - cannot swam so long :(");
        } else {
            super.swim(distance);
        }
    }

}