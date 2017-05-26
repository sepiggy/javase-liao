public class Student extends Person {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student() {
        super();
        System.out.println("create Student...");
    }

    public static void main(String[] args) {
        Person p = new Person();
        Student s =  new Student();
        p.setName("xiaoming");
        s.setName("xiaohong");
        p.run();
        s.run();
    }
}
