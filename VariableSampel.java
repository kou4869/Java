public class VariableSampel {

  public static void main(String[] arge) {
    //変数宣言
    String name;  //名前
    int age;      //年齢
    String hobby; //趣味

    //変数にて代入
    name = "山田";
    age = 20;
    hobby = "サッカー";

    //自己紹介文を画面に出力
    System.out.println("初めまして" + name + "と言います");
    System.err.println("年齢は" + age + "歳です");
    System.out.println("趣味は" + hobby + "です");
  }
}