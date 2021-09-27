package Week2.QuizGame;

import java.util.Scanner;

public class ChoiceQuestionDriver {
    public static void main(String[] args) {


        ChoiceQuestion cq1 = new ChoiceQuestion("What is the capital of Ireland", "Dublin");
        cq1.addChoice("Rome",false);
        cq1.addChoice("Paris",false);
        cq1.addChoice("London",false);
        cq1.addChoice("Dublin",true);


        presentQuestion(cq1);
    }
    public static void presentQuestion(ChoiceQuestion q){
        q.display();
        System.out.println("Your answer: ");
        Scanner input = new Scanner(System.in);
        String response = input.next();
        System.out.println(q.isCorrect(response));
    }
}