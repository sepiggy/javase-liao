public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this(name, 18);
    }

    public Person() {
        this("Unnamed");
    }

    public Person() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new NullPointerException();
        }

        this.name = name.trim();
    }

    public String toString() {
        return "name: " + name + ", age: " + age;
    }

    public void run() {
        System.out.println(name + " is running!");
    }

    public static void main(String[]  args) {
        Person xiaoming = new Person("xiaoming", 99);
        Person xiaohong = new Person("xiaohong");
        Person xiaojun = new Person();

        System.out.println(xiaoming);
        System.out.println(xiaohong);
        System.out.println(xiaojun);
    }
}
