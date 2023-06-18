public class meirei {
  public static void main(String[] args) {
    //準備
    String name="田中";
    int age=20;

    //画面に出力する命令実行（引数１つ）
    System.out.println("自己紹介をします");

    //命令実行（引数２つ）
    System.out.printf("私の名前は%sです。年齢は%dです。\n", name, age);


    System.out.println("--------");


    //最大値を返す命令
    int i=Math.max(10, 20);
    System.out.println("最大値:"+i);


    System.out.println("--------");


    //名前の入力を案内
    System.out.println("名前を入力してください");
    name= new java.util.Scanner(System.in).nextLine();

    //年齢の入力を案内
    System.out.println("年齢を入力してください");
    age= new java.util.Scanner(System.in).nextInt();

    //画面に出力する命令実行(複数の引数)
    System.out.printf("私の名前は%sです。年齢は%dになります。\n", name, age);

  


    System.out.println("--------");


    //サイコロの目をランダムに表示する
    int x= new java.util.Random().nextInt(6);
    //サイコロの目にあわせて+1をする
    x++;
    System.out.println("サイコロの目は:" + x);


  }

}
