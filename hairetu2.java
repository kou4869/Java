public class hairetu2 {
  public static void main(String[] args) {

    //点数を入力する人数を画面から入力する
    System.out.println("入力する人数を教えて下さい");

    int num = new java.util.Scanner(System.in).nextInt();

    // ↑ で入力した人数分の要素を生成して配列のint型の変数scoresに代入する
    int[] scores = new int[num];

    //画面から点数を入力する
    //要素の数(i<scores.lengthを指定してるので、↑で指定した数分)だけ要素(scores)に代入する
    for(int i=0; i<scores.length; i++) {
      System.out.println(i + "番目の点数を入力してください");
      scores[i] = new java.util.Scanner(System.in).nextInt();
    }

    int total=0;
    double avg=0;

    //変数(total)にscoresの要素の中身を加算していき
    //変数(num)で指定した人数の数を上回ったら繰り返しから抜ける
    for(int i=0; i<scores.length; i++) {
      total += scores[i];
    }

    avg = total/scores.length;

    System.out.println("合計点:" + total);
    System.out.println("平均点:" + avg);
  }
  
}
