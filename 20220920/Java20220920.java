import java.util.*;

public class Java20220920 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("請輸入一串數字：");
      String string1 = in.nextLine();
      String number[] = string1.split("");
      // System.out.println(number);

      in.close();
      int i;
      for(i =0 ;i < number.length;i++){
        System.out.print(number[i]+" ");
      }
    }
  }