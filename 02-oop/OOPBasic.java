public class OOPBasic {

    public static void main(String[] args) {

        Person ming = new Person();
        ming.name = "小明";
        ming.age = 12;

        Person hong = new Person();
        hong.name = "小红";
        hong.age = 15;

        System.out.println(ming.name);
        System.out.println(ming.age);

        System.out.println(hong.name);
        System.out.println(hong.age);
    }
}
