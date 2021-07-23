public class Main {
  public static void main(String[] args) {
  int hit = (int)(Math.random() * 10 + 1);
  if (hit < 6) {
    System.out.pritnln("スライムに" + hit +"ダメージを与えた);
 } else {
   System.out.println("追加攻撃！スライムに、10のダメージを与えた");
}
  
  int add = (int)(Math.random() * 1 + 1);
    System.out.println("追加のサイコロは" + add);
  if (add == 1) {
    System.out.println("追加攻撃");
 } else {
    System.out.println("追加攻撃に失敗");
}
}