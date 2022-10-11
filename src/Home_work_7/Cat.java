package Home_work_7;

public class Cat extends Animal {

    public static int catsCount;

    public Cat(String name, int MAX_RUN_LENGTH, int MAX_SWIM_LENGTH) {
        super(name, MAX_RUN_LENGTH, MAX_SWIM_LENGTH);
        catsCount++;
    }

}