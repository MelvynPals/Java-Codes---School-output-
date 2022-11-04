import java.util.Scanner;
class DoWhileDemo {
    public static void main(String[] args){
        Scanner key = new Scanner (System.in);
        int count = 1, num;
        
   //      do {
//             System.out.println("Count is: " + count);
//             count++;
//         } while (count < 11);
        
        do {
            System.out.print("Enter any number exept zero [0]: ");
            num = key.nextInt();
            count++;
        } while (num != 0);
    
    }
}