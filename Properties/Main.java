package Properties;

public class Main {
    public static void main(String[] args) {
        // Box box=new Box();
        // System.out.println("lrngth="+box.l+""+"height="+box.h+"width="+box.w);
        // Box box=new Box(2);
        // System.out.println("lrngth="+box.l+""+"height="+box.h+"width="+box.w);
        Box box=new Box(2,3,5);
        System.out.println("lrngth="+box.l+""+"height="+box.h+"width="+box.w);

Box box1 = new Box(box);  
System.out.println("length=" + box1.l + " height=" + box1.h + " width=" + box1.w);

}
}
