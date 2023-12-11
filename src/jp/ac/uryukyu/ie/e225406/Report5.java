package jp.ac.uryukyu.ie.e225406;

public class Report5 {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");

        String str = null;

        // System.out.println(str.length());

        try {
            System.out.println("String length: " + str.length());
        } catch (NullPointerException e) {
            // 実行時エラー（NullPointerException）が発生した場合の処理
            System.err.println("NullPointerException caught: " + e.getMessage());
        }
    }    
}