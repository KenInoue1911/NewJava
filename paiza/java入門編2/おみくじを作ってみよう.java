public class Main {
  public static void main(String[] args) {
  int omikuji =(int)(Math.random() * 100 + 1);
  if (omikuji > 30) {
     System.out.println("omikujiの中身は" + omikuji + "なので大吉");
  } else {
     System.out.println("omikujiの中身は" + omikuji + "なので大凶");
}
}
}