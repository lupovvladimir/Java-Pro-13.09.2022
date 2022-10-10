package Home_work_7;

public class Animal {

    public final String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run(int obstacleLength) {
        System.out.println(this.name + " - ran " + obstacleLength + "m. :>");
    }

    public void swim(int obstacleLength) {
        System.out.println(this.name + " - swam " + obstacleLength + "m. :>");
    }

}
