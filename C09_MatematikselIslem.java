package day08_OdevlerTernaryOperators;

public class C09_MatematikselIslem {
    public static void main(String[] args) {
        int y = 8;
        System.out.println((y>5)?(y<10?2*y:3*y):(y<10?2+y:3+y)); //16

        int y2=12;
        System.out.println((y2>5)?(y2<10?2*y2:3*y2):(y2>10?2+y2:3+y2)); //36

        int y3=5;
        System.out.println((y3>5)?(y3<10?2*y3:3*y3):(y3>10?2+y3:3+y3)); //8


    }
}
