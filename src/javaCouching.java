import java.util.Scanner;

public class javaCouching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /// to scan String it is " String var = scanner.nextLine();
        ///to scan integer its is " int var = scanner.nextInt(); "
        ///to scan float it is " float var = scanner.nextFloat(); "
        ///to scann double it is " double var = scanner.nextDouble(); "
        /*
        System.out.print("what is your height?:");
        double x=sc.nextFloat();
        System.out.println("your height is :"+ x);

         */
        /// boolean is : "boolean var = scanner.nextBoolean():
        /*
        boolean validEntry= false;

        while (!validEntry){
            System.out.print("Are you a student?: ");
            try {
                boolean student =sc.nextBoolean();
                validEntry=true;
                if (student){
                    System.out.println("you are a student");
                }else {
                    System.out.println("you are not a student");
                }

            }catch (InputMismatchException e){

                System.out.println("invalid entry try again");
                sc.nextLine();

            }

        }

         */

        /// Common Problem when accpeting a user input such as a integer and then try to take a user input String , it might output a foulty code
        /// the code below is faulty because in line 46 when we are using the nextLine method it is reading the number like this value\n and then the \n is considered as the input for the next line
        /*
        System.out.print("what is you age?: ");
        int age=sc.nextInt();
        sc.nextLine(); ///fix is to add a nextLine method after taking the integer
        System.out.print("what is your fav food?: ");
        String food= sc.nextLine();
        System.out.println("age is "+age);
        System.out.println("fav food "+ food);

         */

        /// simple rectagnle project
        /*
        System.out.print("enter height of the Rectangle?: ");
        double height=sc.nextDouble();
        System.out.print("enter the weight of the rectangle?: ");
        double weight = sc.nextDouble();

        double area = height*weight;
        System.out.println("The area of the rectagnle is:  "+ area);


         */
        /// MADLIBS game


        /// Augmented assignment operators
        /*
        int x =10
        int y =3

        x +=y
        x -=y
        x *=y
        x /=y
        x %=y

         */

        /*
        Increment and decremnet operators
        x++;
        x--;
        */

        //Order of Operation [P-E-M-D-A-S]
        /*
        double pemdas= 23+23-452.84/20-(50-6)/25.99;
        System.out.println(pemdas);

         */

        /// shopping cart

        String item;
        double price;
        int quantity;
        double total;
        char currency = '$';
        boolean validentry = false;

        while (!validentry) {
            System.out.print("what item do you need?: ");
            item = sc.nextLine();
            if (item.matches("[A-Z]")) {
                validentry = true;

            } else {
                System.out.println("invalid entry");
            }
        }
        System.out.print("How many do you need?: ");
        quantity = sc.nextInt();

        System.out.print("enter the price of the Item: ");
        price = sc.nextDouble();
        System.out.println("Your cart has : " + quantity);
        total = quantity * price;

        System.out.println("your total is : " + total + currency);


    }
}

