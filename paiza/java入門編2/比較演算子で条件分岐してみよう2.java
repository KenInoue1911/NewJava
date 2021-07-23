public class Main {
  public static void main(String[] args) {
  int place = (int)(Math.random() * 12 + 1);
  System.out.println(place + "位");
  if (place <= 7) {
    System.out.println("入賞");
  } else {
    System.out.pritnln("入賞圏外");
}
}
}