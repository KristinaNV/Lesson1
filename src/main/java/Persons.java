public class Persons {

    private String name;
    private int age;
    private float maxRun;

    public Persons(String name, int age, float maxRun) {
        this.name = name;
        this.age = age;
        this.maxRun = maxRun;

    }

    int getAge() {
        return age;
    }
    String getName() {
        return name;
    }

    String getFullInfo() {
        return this.name + " " +
                this.getAge() + " лет, " ;
    }

    float getMaxRun() {
        return this.maxRun;
    }
    protected boolean run(float distance) {
        return (distance <= maxRun);
    }

    public String getTeam() {
        return getFullInfo();
    }
}
