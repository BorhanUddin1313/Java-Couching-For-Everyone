import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.print("What is the string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (check(s)){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }
    }
    public static boolean check(String s) {
        boolean hasB = false;
        for (int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c=='a' && hasB){
                return false;
            }
            if (c=='b'){
                hasB=true;
            }

        }
        return true;

    }

}


