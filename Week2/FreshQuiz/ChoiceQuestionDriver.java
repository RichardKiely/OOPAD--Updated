package Week2.FreshQuiz;

import java.util.Scanner;

public class ChoiceQuestionDriver {

    private static int score;

    public static void main(String[] args) {


        ChoiceQuestion cq1 = new ChoiceQuestion();
        cq1.setQuestion("What is the capital of Ireland");
        cq1.addChoice("Rome",false);
        cq1.addChoice("Paris",false);
        cq1.addChoice("London",false);
        cq1.addChoice("Dublin",true);

        ChoiceQuestion cq2 = new ChoiceQuestion();
        cq2.setQuestion("What is the capital of England");
        cq2.addChoice("Rome",false);
        cq2.addChoice("Paris",false);
        cq2.addChoice("London",true);
        cq2.addChoice("Dublin",false);

        Question q3 = new Question("What is the capital of France", "Paris");


        presentQuestion(cq1);
        presentQuestion(cq2);
        presentQuestion(q3);

    }
    public static void presentQuestion(ChoiceQuestion q){
        q.display();
        System.out.println("Your answer: ");
        Scanner input = new Scanner(System.in);
        String response = input.next();
        if(q.isCorrect(response)){
            score++;
        }
        System.out.println(q.isCorrect(response));
    }
    public static void presentQuestion(Question q){
        q.displayQuestion();
        System.out.println("Your answer: ");
        Scanner input = new Scanner(System.in);
        String response = input.next();
        if(q.isCorrect(response)){
            score++;
        }
        System.out.println(q.isCorrect(response) + " Your score was " + score);
    }
}