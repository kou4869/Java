public class jyouken2 {

  public static void main(String[] aegs) {
    //変数宣言
    int scoreA=80;
    int scoreB=80;
    int scoreC=80;
    int scoreD=80;
    int scoreE=80;

    if(scoreA>=80 && scoreB>=80) {
      System.out.println("両方とも80点以上");
    }
    if(scoreA>=80 || scoreB>=80) {
      System.out.println("いずれか一歩でも80点以上");
    }

    //scoreA～Cまでの値が全て80点以上、かつscoreD、Eのいずれかが80点以上の時
    if((scoreA>=80 && scoreB>=80 && scoreC>=80) && (scoreD>=80 || scoreE>=80)) {
      System.out.println("合格");
    } else {
      System.out.println("不合格");
    }
  }
  
}
