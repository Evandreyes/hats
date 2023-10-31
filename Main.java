import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);


        System.out.println("Welcome to Hogwarts! Let the sorting hat choose your house. ");
        System.out.println("Enter your name: " );
        String name = scan.nextLine();
        System.out.println("Answer the following questions with 'yes' or 'no' :");
        System.out.println("Do you value bravery and chivalry?");
        String answer1 = scan.nextLine();
        if(answer1.equals ("yes") ) {
            System.out.println("Dear" + name);
            System.out.println("You belong to Gryffindor!");
        }
        else if( answer1.equals ("no")) {
            System.out.println("Do you value hard work, dedication and loyalty?");


        }
        String answer2 = scan.nextLine();
        if (answer2.equals ("yes")){
            System.out.println("Dear" + name);
            System.out.println("You belong to Hufflepuff!");
        }
        else if ( answer2.equals ("no")){
            System.out.println("Do you value intelligence , creativity and learning?");
        }
        String answer3 = scan.nextLine();
        if (answer3.equals ("yes")){
            System.out.println("Dear" + name);
            System.out.println("You belong to Ravenclaw!");
        }
        else if ( answer3.equals ("no")){
            System.out.println("Dear" + name);
            System.out.println("You belong to Sylytherin!");


        }


    }
}
