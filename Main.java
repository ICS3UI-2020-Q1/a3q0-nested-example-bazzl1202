import java.util.Scanner;
/**
 * The example program for Nested Statements
 * @author Liana Bazzarella 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // Switch case example
    // get the user choice between 1 and 5
    System.out.println("Please make a selection (1-5)");
    int choice = input.nextInt();

    // gets rid of the enter key so we can get Strings doesnt like when goes from numbers to words
    input.nextLine();

    // determine which candy to draw by using a switch case
    switch(choice){
    case 1: 
      System.out.println("Here is your choclate bar");
      break;
    case 2:
      System.out.println("Here are your Skittles");
      break;
    case 3: 
      System.out.println("Here are your M&Ms");
      break;
    default:
      System.out.println("Invalid choice");
    }

    // Nested loop example
    // ask the user if the animal has feathers
    System.out.println("Does the animal have fethers? (yes/no)");
    String featherAnswer = input.nextLine();

    // check to see feather status
    if (featherAnswer.equals("yes")){
     // get the feather colour
     System.out.println("What colour are the feathers?(red/blue)");
     String featherColour = input.nextLine();

     //determine what type of bird
     if(featherColour.equals("blue")){
      System.out.println("That is a blue jay");
    }else if(featherColour.equals("red")){
      System.out.println("That is a cardinal");
    }
    // if user answered no
    }else{

    }
  }
}
