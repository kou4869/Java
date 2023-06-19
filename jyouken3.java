public class jyouken3 {
  public static void main(String[] args) {

    //サイコロを振る
    System.out.println("サイコロを振ります");
    //0～5までの乱数を生成
    int x=new java.util.Random().nextInt(6);
    //1～6にするためにxに+1をする
    x++;

    //xの値に応じてifを使用して分岐処理
    if(x==1) {
      System.out.println("1が出ました");
    } else if(x==2) {
      System.out.println("2が出ました");
    } else if(x==3) {
      System.out.println("3が出ました");
    } else if(x==4) {
      System.out.println("4が出ました");
    } else if(x==5) {
      System.out.println("5が出ました");
    } else {
      System.out.println("6が出ました");
    } 

    System.out.println("--------");

    switch(x) {
      case 1:
        System.out.println("1が出ました");
        break;
      case 2:
        System.out.println("2が出ました");
        break;
      case 3:
        System.out.println("3が出ました");
        break;
      case 4:
        System.out.println("4が出ました");
        break;
      case 5:
        System.out.println("5が出ました");
        break;
      default:
        System.out.println("6が出ました");
        break;
    }


    System.out.println("--------");

    
  }
}
