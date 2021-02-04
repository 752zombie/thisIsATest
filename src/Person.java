public class Person {
    private String name;
    private int age;
    private int test = 0;

    public Person(String name, int age) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
