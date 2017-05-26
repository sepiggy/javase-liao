public class Polymorphic {
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Person(String name) {
            this(name, 20);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String hello() {
            return "Hello, " + this.name;
        }

        public void run() {
            System.out.println(this.name + " is running!");
        }
    }

    static class Student extends Person {
        private int score;

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
           this.score = score;
        }

        public Student(String name, int age, int score) {
            super(name, age);
            this.score = score;
        }

        public Student(String name) {
            this(name, 20, 100);
        }

        @Override
        public String hello() {
            return super.hello() + "!@#";
        }

        public void run() {
            System.out.println("Student " + getName() + " is running!");
        }
    }

    public static void main(String[] args)  {
        Person p = new Person("XiaoMing");
        Person s = new Student("XiaoHong");
        p.run();
        s.run();
        System.out.println(s.hello());
    }

}
