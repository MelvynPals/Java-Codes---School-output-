import java.util.Scanner;
public class JavaExpirement1 extends sampClass {
    static int x;
    
    public static int sample(int num) {
    return x = num;
    }
    
    static void samp() {
    Scanner in = new Scanner (System.in);
    JavaExpirement1 je = new JavaExpirement1();
    int er = in.nextInt();
    sample(er);
    System.out.print(je.x);
    }
    
    public static void main(String[] args) {
        samp();
        samp2();
    }
        
}

class sampClass {
    static int x;
    
    static int sample2(int num) {
    return x = num;
    }
    
    static void samp2() {
    Scanner in = new Scanner (System.in);
    int er = in.nextInt();
    sample2(er);
    System.out.print(x);
    }

}