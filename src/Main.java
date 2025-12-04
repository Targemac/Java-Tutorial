import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        JAVA QUIZ GAME

//        QUESTIONS array[]
        String[] questions = {
                "what is the main function of a router?",
                "which part of the computer is considered the brain?",
                "what year was facebook launched?",
                "who is the father of computer?",
                "what was the first programming language?",
        };


//        OPTIONS array[]
        String[][] options = {
                {"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                {"1. CPU", "2. Hard drive", "3. RAM", "4. GPU"},
                {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                {"1. steve jobs", "2. bill gates", "3. alan turing", "4. charles barbage"},
                {"1. cobol", "2. C", "3. fortran", "4. assembly"},
        };

//        DECLARE VARIABLES
        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

//        WELCOME MESSAGE
        System.out.println("*****************************");
        System.out.println("Welcome to the java quiz game");
        System.out.println("*****************************");

//        QUESTIONS (loop)
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

//        OPTIONS
            for (String option : options[i]) {
                System.out.println(option);
            }

//        GET GUESS FROM USERS
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

//        CHECK OUR GUESS
            if (guess == answers[i]) {
                System.out.println("***********");
                System.out.println("CORRECT");
                System.out.println("***********");
                score++;
            } else {
                System.out.println("***********");
                System.out.println("WRONG");
                System.out.println("***********");
            }
        }

//        DISPLAY FINAL SCORE
        System.out.println("Your final score is: " + score + " out of " + questions.length);

        scanner.close();
    }
}
