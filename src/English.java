import java.util.Scanner;

public class English extends Identity implements CommonActions{
    English(String name){
        super(name);
    }

    @Override
    public void question() {
        System.out.println("Asking a question on English...");
    }

    @Override
    public void conversation() {
        System.out.println("Speaking on english...");
    }

    @Override
    public void farewell() {
        System.out.println("Saying goodbye on English...");
    }
}
