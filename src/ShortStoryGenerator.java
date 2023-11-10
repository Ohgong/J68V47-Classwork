import java.util.Scanner;

public class ShortStoryGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("What is your hobby?: ");
        String hobby = scanner.nextLine();

        String shortStory = generateShortStory(name, hobby);
        System.out.println("\nHere's the short story:\n");
        System.out.println(shortStory);

        scanner.close();
    }

    public static String generateShortStory(String name, String hobby) {
        String storyTemplate = "Once upon a time, there was a person named  %s " + "who loved %s. " +
                "Every day after work, %s would spend hours indulging in his favorite hobby.";

        String formattedStory;
        formattedStory = String.format(storyTemplate, name, hobby, name);

        return formattedStory;
    }
}
