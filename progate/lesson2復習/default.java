class Main {
  public static void main(String[] args) {
    int number = 13;

    switch(number % 5) {
      case 0:
        System.out.println("大吉です");
        break;
      case 1:
        System.out.println("中吉です");
        break;
      case 2:
        System.out.println("凶です");
        break;
      default:
        System.out.println("吉です");
        break;
    }
  }
}
