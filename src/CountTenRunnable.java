public class CountTenRunnable implements Runnable {
    String myAlfabetStr = "noalfabet";

    // main メソッドはプログラムのエントリーポイントです。
    public static void main(String[] args) {
        // 2つの文字を初期化します。

        // CountTenRunnable クラスのインスタンスを作成します。
        CountTenRunnable ct2[] = new CountTenRunnable[26];
        // スレッドを開始します。これにより、CountTenRun の run メソッドが呼び出されます。

        Thread t[] = new Thread[26];

        for (int i = 0; i < t.length; i++) {
            ct2[i] = new CountTenRunnable();

            t[i] = new Thread(ct2[i]);
            ct2[i].setAlfabet((char) (97 + i));
            t[i].start();
        }
        /*
         * for(int item : myArr) {
         * System.out.println(item);
         * }
         */
        // この try-catch ブロックは、0 から 9 までの値を 500 ミリ秒間隔で出力するループを実行します。
        System.out.println("☚");
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("main:i=" + i);

                // メインスレッドを 500 ミリ秒間一時停止します。
                Thread.sleep(500); // ミリ秒単位のスリープ時間
            }
        } catch (InterruptedException e) {
            // スレッドが中断された場合は、例外を出力します。
            System.err.println(e);
        }
    }

    public void setAlfabet(char alfabetstr) {
        // alfabetstr = (char) (alfabetstr + i);
        alfabetstr = (char) (alfabetstr);
        String str1 = String.valueOf(alfabetstr);
        myAlfabetStr = str1;
        // System.out.println(str1 + ",i:" + i);

    }

    // run メソッドは、新しいスレッドが実行するコードを含みます。
    public void run() {
        // この try-catch ブロックは、0 から 9 までの値を 1000 ミリ秒間隔で出力するループを実行します。
        try {
            for (int i = 0; i < 10; i++) {
                // System.out.println(this + myAlfabetStr);
                System.out.println(myAlfabetStr + i);

                // スレッドを 1000 ミリ秒間一時停止します。
                Thread.sleep(1000); // ミリ秒単位のスリープ時間
            }
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }
}