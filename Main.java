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
