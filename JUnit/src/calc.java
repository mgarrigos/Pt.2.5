public class calc {
   public static int add(int number1, int number2) {
      return number1 + number2;
   }
   public static int sub(int number1, int number2) {
      return number1 - number2;
   }
   public static int mul(int number1, int number2) {
      return number1 * number2;
   }
   public static int div(int number1, int number2) {
      return number1 / number2;
   }
   public static void main(String[] args) {
      System.out.println("1/2 is " + div(1, 2) + ", and is not 0.5");
   }
}