package jp.ac.uryukyu.ie.e225406;

public class Report5 {
    public static void main(String[] args) {

        String str = "壱百満";

        try{
            int value = Integer.parseInt(str);
        } catch(Exception e){
            System.out.println("代入できませんでした");
        }
    }    
}