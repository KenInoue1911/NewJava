public class Main {
  public static void main(String[] args) {
  int age = (int)(Math.random() * 5 + 18);
  System.out.println(age + "才は");
  if (age < 20) {
     System.out.println("飲酒不可");
  } else {
     System.out.println("飲酒可能");
}
}
}