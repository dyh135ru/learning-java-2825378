import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "In which state is located Mazatlan";
        String choiceOne = "Durango";
        String choiceTwo = "Sinaloa";
        String choiceThree = "Jalisco";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);
        // Have the user input an answer
        Scanner scanner = new Scanner(System.in);
        // Retrieve the user's input
        String input = scanner.next();
        input = input.toLowerCase();
        correctAnswer = correctAnswer.toLowerCase();
        // If the user's input matches the correctAnswer...
        if(correctAnswer.equals(input)){
            // then the user is correct and we want to print out a congrats message to the user.
            System.out.println("Congratulations, that is the correct answer!");
        }else{
            // If the user's input does not match the correctAnswer...
            // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
            System.out.println("Sorry, the correct answer is: " + correctAnswer);
        }

    }

}
