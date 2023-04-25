import java.util.Random;
import java.util.Scanner;


public class Magic8Ball {


    public static void main(String[] args) {

        System.out.println("*****Ask a Yes or No question*****");
        Scanner question = new Scanner(System.in);
        String questionAsked = question.nextLine();

        int randomNumberGen = new Random().nextInt(20);

        if (randomNumberGen == 0) {
            System.out.println("Yes");

        } else if (randomNumberGen == 1) {
            System.out.println("No");

        } else if (randomNumberGen == 2) {
            System.out.println("It is certain");

        } else if (randomNumberGen == 3) {
            System.out.println("It is decidedly so");

        } else if (randomNumberGen == 4) {
            System.out.println("Without a doubt");

        } else if (randomNumberGen == 5) {
            System.out.println("Yes definitely");

        } else if (randomNumberGen == 6) {
            System.out.println("You may rely on it");

        } else if (randomNumberGen == 7) {
            System.out.println("As I see it, yes");

        } else if (randomNumberGen == 8) {
            System.out.println("Most likely");

        } else if (randomNumberGen == 9) {
            System.out.println("Outlook good");

        } else if (randomNumberGen == 10) {
            System.out.println("Signs point to yes");

        } else if (randomNumberGen == 11) {
            System.out.println("Reply hazy, ask again");

        } else if (randomNumberGen == 12) {
            System.out.println("Ask again later");

        } else if (randomNumberGen == 13) {
            System.out.println("Better not tell you yet");

        } else if (randomNumberGen == 14) {
            System.out.println("Cannot predict now");

        } else if (randomNumberGen == 15) {
            System.out.println("Concentrate and ask again");

        } else if (randomNumberGen == 16) {
            System.out.println("Don't count on it");

        } else if (randomNumberGen == 17) {
            System.out.println("My sources say no");

        } else if (randomNumberGen == 18) {
            System.out.println("Outlook not so good");

        } else {
            System.out.println("Very doubtful");
        }

    }

}


