public class Main {
  public static void main(Stirng[] args) {
  　int number = (int)(Math.random() * 10 + 1);
  　　System.out.println("あなたの順位は" + number + "位です");
  　//numberが3以下の時にflagが成立する
　　boolean flag = number <= 3;
    if (flag) {
       System.out.println("入賞おめでとう");
}
}
 
}