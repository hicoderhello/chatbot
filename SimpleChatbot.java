import java.util.Scanner;

public class SimpleChatbot {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String greeting = "Hello! How can I help you today?";
    String userInput;

    System.out.println(greeting);

    while (true) {
      userInput = scanner.nextLine().toLowerCase();

      if (userInput.equalsIgnoreCase("hello") || userInput.equalsIgnoreCase("hi")) {
        System.out.println("Hi there! What would you like to chat about?");
      } else if (userInput.equalsIgnoreCase("how are you?")) {
        System.out.println("I'm doing well, thanks for asking! How are you?");
      } else if (userInput.equalsIgnoreCase("bye") || userInput.equalsIgnoreCase("goodbye")) {
        System.out.println("Goodbye! Have a nice day!");
        break;
      } else {
        System.out.println("Sorry, I didn't understand that. Try saying 'hello', 'how are you?', or 'bye'.");
      }
    }

    scanner.close();
  }
}
