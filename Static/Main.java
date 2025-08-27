package Static;

public class Main {
    public static void main(String[] args) {
        Human thaju=new Human("Thaju", 22, 9999, false);
        Human Rahul=new Human("Rahul", 23, 999, false);
        System.out.println(thaju.name);
        System.out.println(Rahul.name);
        Main obj=new Main();
        obj.greeting();
    }

    void greeting(){

        System.out.println("hello");
    }
}
