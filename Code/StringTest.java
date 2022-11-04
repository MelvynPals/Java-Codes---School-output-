public class StringTest {
    public static void main(String[] args) {
        String str = "25";
        String str1 = "25.22";
        System.out.println(isNumeric(str));
        System.out.println(isNumeric(str1));
    }

    public static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }
}