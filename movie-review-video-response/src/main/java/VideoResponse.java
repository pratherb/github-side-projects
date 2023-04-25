import java.util.Random;
import java.util.Scanner;



public class VideoResponse {


    public static void main(String[] args) {

        System.out.println("Type in a movie title and I'll give you my opinion in a video response: ");
        Scanner userInput = new Scanner(System.in);
        String movieResponse = userInput.nextLine();

        int randomNumberGenerator = new Random().nextInt(3);

        System.out.println("Click the link for my response:");
        if (userInput.equals(true)) {
            if (randomNumberGenerator == 0) {
                System.out.println("https://www.youtube.com/watch?v=1VgpuLpk778&t=33.5s");
            } else if (randomNumberGenerator == 1) {
                System.out.println("https://www.youtube.com/watch?v=69rnJushG44&t=16s");
            } else if (randomNumberGenerator == 2) {
                System.out.println("https://www.youtube.com/watch?v=nIewTXCAqzA&t=3s");
            } else {
                System.out.println("https://www.youtube.com/watch?v=FkrXrd9SLRI&t=4s");
            }
        } else {
            System.out.println("Uh oh Spaghetti-Os! Try again!");
        }
    }
}
