package Home_work_7;

public class Dog extends Animal {

    public static int dogsCount;

    public Dog(String name, int MAX_RUN_LENGTH, int MAX_SWIM_LENGTH) {

        super(name, MAX_RUN_LENGTH, MAX_SWIM_LENGTH);
        dogsCount++;
    }
}