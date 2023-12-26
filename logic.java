import java.util.Scanner;

public class logic {
  public static void main(String[] args) {
    
  Scanner scanner = new Scanner(System.in);

  System.out.println("you are playing");
  String response = scanner.next();

  if (response.equals("q") || (response.equals("Q"))) {
    System.out.println("you quit");
  }
  }
  }
