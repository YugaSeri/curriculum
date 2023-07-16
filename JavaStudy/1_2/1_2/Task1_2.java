/**
 * Task1-2 : 課題内容
 *
 * 本課題では、配列の使い方を学んでいきましょう。
 * 問①から問⑥まであります。
 * 指定された値と変数名を守って記述してください。
 *
 * 問⑤,⑥については、コメントを入れてください。
 *
 */
public class Task1_2 {

    public static void main(String[] args) {

        // ①「JAPAN」、「AMERICA」、「KOREA」、「ENGLAND」を要素の値（初期値）とする配列 countryを作成しなさい。
        String[] country = new String[4];

        country[0] = "JAPAN";

        country[1] = "AMERICA";

        country[2] = "KOREA";

        country[3] = "ENGLAND";

        // ② ①で作成した配列の要素数を出力してください。

        System.out.println("配列countryの要素数…" + country.length);

        /* ③下記の値を保持した、要素数3のStringクラスの配列strArrayを作成しなさい。
         *   1番目（先頭）の要素に 「りんご」 を代入
         *   2番目の要素に 「もも」 を代入
         *   3番目の要素に 「ぶどう」 を代入
         */
        String[] strArray = new String[3];

        strArray[0] = "りんご";

        strArray[1] = "もも";

        strArray[2] = "ぶどう";

        // ④ ③で作成した配列の3番目の要素を出力しなさい。
        
        System.out.println( strArray[2]);
        
        /* ⑤下記の処理について、何をしているのかコメントを記入してください。
         *  [10~50までの要素の値を初期値とする intArray という名前の int 配列を宣言している。]
         */
        int[] intArray = { 10, 20, 30, 40, 50 };

        // ⑥下記の処理について、何をしているのかコメントを記入してください。
        // [intArray で宣言した要素10と要素50の足し算をする計算式を表している。]
        System.out.println(intArray[0] + intArray[4]);

    }
}