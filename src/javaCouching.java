import java.util.Scanner;

import static java.lang.Math.pow;

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

        /*

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


        /*
        Random random = new Random();
        double num;
       for(int i=0; i<5; i++){
           num= random.nextDouble(100);
           System.out.println("the random numbers are : " + num);
       }

         */


        /*
        Random random = new Random();
        Double num;
        num=random.nextDouble(0,1);
        if(num>=0.75){
            System.out.println("Sowrd");
        } else if (num<=0.25) {
            System.out.println("sheild");
        }

         */

        ///
        /*
        double c;
        double a;
        double b;
        /*
        num=Math.pow();
        num=Math.abs();
        num=Math.sqrt();
        num=Math.round();
        num=Math.floor();
        num=Math.max();
        num=Math.min();

         */
/*
        /// c^2= a^2+b^2
        System.out.print("Enter the cordinantes for a: ");
        a=sc.nextDouble();
        System.out.println(a);

        System.out.print("Enter the cordinatens for b: ");
        b=sc.nextDouble();
        System.out.println(b);

        c= Math.sqrt(Math.pow(a, 2)+ Math.pow(b,2));
        System.out.println("C is = " + c);

 */     /*
        int age = 10;

         double height= 2000.9000;
         double h=-20.9;

        System.out.printf("Borhan age is %d\n", age);
        System.out.printf("%.2f\n",height);
        System.out.printf("%+,.2f\n",height);
        System.out.printf("%,.2f\n",height);
        System.out.printf("%( .2f\n",h);
        System.out.printf("% .3f\n % .3f",height,h);
        */
/*
        int a1=1;
        int a2=22;
        int a3=333;
        int a4=4444;

        System.out.printf("%05d\n",a1);
        System.out.printf("%05d\n",a2);
        System.out.printf("%05d\n",a3);
        System.out.printf("%05d\n\n",a4);

        System.out.printf("%4d%-4d\n",a1,a1);
        System.out.printf("%4d%-4d\n",a2,a2);
        System.out.printf("%4d%-4d\n",a3,a3);
        System.out.printf("%4d%-4d\n",a4,a4);

 */
        /*
        ///Project Compund intrest calculator

        double p;
        double r;
        double years;
        double A;
        int n;

        System.out.print("Enter the principal ammount: ");
        p=sc.nextDouble();
        ///System.out.println(principal);

        System.out.print("Enter the rate: ");
        r=sc.nextDouble()/100;
        ///System.out.println(rate);

        System.out.print("Enter year: ");
        years=sc.nextDouble();
        ///System.out.println(years);

        System.out.print("Enter how many times compunded:  ");
        n=sc.nextInt();

        A=p*pow((1+r/n),n*years);

        System.out.printf("Ammount is %f ",A);

         */

        /*
        System.out.println("are you a student?");
        boolean isStudent =sc.nextBoolean();
        System.out.println("are you a senior?");
        boolean isSenior=sc.nextBoolean();
        double price= 9.99;

        if(isStudent) {
            if (isSenior) {
                System.out.printf("you get double discount of 50%!! %f",price);
                price *= 0.5;
            } else {
                System.out.println("you get a student discount of 10%");
                price *= 0.9;
                System.out.printf("ticket price %f",price);
            }
        }
        else {
            if (isSenior) {
                System.out.println("You get senior discount 30%!!!");
                price *= 0.7;
                System.out.printf("ticket price %f\n", price);
            } else {
                System.out.printf("You pay full price %f\n ", price);
            }
        }

         */

        /// STRING METHODS
        ///.equals();
        ///.indexOf();
        ///.atUppercase();
        ///.atLowercase();
        ///.contains();
        ///.isEqual();
        ///.Trim
        ///.length();
        ///.charAt();
        /// .lastIndexOf();
        /// .replace();


        String email;
        String username;
        String domain;

        /// take the user input

        while(true){
            System.out.print("Enter your email: ");
            email= sc.nextLine();

            if (email.contains(" ")){
                System.out.println("Enter a valid Email without any spaces");
            }else {
                if(email.contains("@")){
                    System.out.println("valid email");
                    break;
                }else {
                    System.out.println("Enter a Email with @");

                }


            }

        }




















    }
}

