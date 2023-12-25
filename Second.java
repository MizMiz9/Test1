import java.util.Random;

public class Second {
  
  public static void main(String[] args){

    Random r = new Random();

    //int x = r.nextInt(10);
    boolean y = r.nextBoolean();
    y = !y;
    System.out.println(y);
  }
}
