# JAVA程式設計與實作 HW 1
###### tags: `學校` `JAVA`
2022.09.20（Tue.）

## ▉ 說明
1. 讓使用者可以輸入一串數字
2. 輸出時用空格把使用者輸入的數字隔開

## ▉ 想法
將輸入的數字先拆分開來，然後再丟到陣列中儲存起來，接著對該陣列做迴圈，一一列印並且在後方用空格字串相加起來輸出。

## ▉ 遇到的問題
1. `import java.util.*;`加上它，不然Scanner無法使用
2. `public class Java20220920`記得`Java20220920`要與檔名相同，而且開頭不能是數字！
3. `Scanner in = new Scanner(System.in);`這段是將使用者的輸入讀入，並用`in`變數存起來
4. `System.out.println("請輸入一串數字：");`這段有點像是JS的`console.log()`
5. `String string1 = in.nextLine();`這段是讓使用者按下Scanner取得輸入會依據空白字元、空白鍵、Tab，傳回下一個輸入。
6. 加上`in.close();`，不然會報錯
7. print與println差異 前者不換行輸出/後者換行輸出

## ▉ 參考資料
* [VSCode 基本安裝與 Java 套件的使用](https://java.onlinedoc.tw/2021/02/vscode-java.html)
* [Java中怎麼在一行中輸入指定個數的數字，數字之間用空格隔開](https://www.zendei.com/article/42154.html)
* [java基礎：輸入一串數字，用空格隔開，輸出存在兩次的數字](https://www.796t.com/content/1550223925.html)
* [[Java] 取得使用者輸入 Scanner](https://www.dotblogs.com.tw/freedom42408/2013/11/20/130586)
