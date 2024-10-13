package Week1;

public class Person {
    private int age;

    public Person(int age) {
        if(age < 0) {
            throw new IllegalArgumentException("A persons age can not be less than 0.");
        }
        this.age = age;
    }

    public boolean isAdult() { return this.age > 18; }
    public boolean canGoToSchool() { return this.age > 6; }
}
