package Home_work_7;

public class Animal {

    public final String name;
    public static int animalsCount;
    public final int MAX_RUN_LENGTH;
    public final int MAX_SWIM_LENGTH;

    Animal(String name, int MAX_RUN_LENGTH, int MAX_SWIM_LENGTH) {

        this.name = name;
        animalsCount++;
        this.MAX_RUN_LENGTH = MAX_RUN_LENGTH;
        this.MAX_SWIM_LENGTH = MAX_SWIM_LENGTH;
    }

    public String getName() {

        return name;
    }

    public void run(int obstacleLength) {
        if (obstacleLength > this.MAX_RUN_LENGTH) {
            System.out.println(this.name + " - cannot ran so long :(");
        } else {
            System.out.println(this.name + " - ran " + obstacleLength + "m. :>");
        }
    }

    public void swim(int obstacleLength) {
        if (this.MAX_SWIM_LENGTH == 0) {
            System.out.println(this.name + " - cannot swim :(");
        } else if (obstacleLength > this.MAX_SWIM_LENGTH) {
            System.out.println(this.name + " - cannot swam so long :(");
        } else {
            System.out.println(this.name + " - swam " + obstacleLength + "m. :>");
        }
    }

}
