import java.util.Scanner;
public class zadanie4 {
    public static void main(String[] args){
        Scanner dane = new Scanner(System.in);

        int jeden, dwa, trzy,srednia;

        System.out.println("Wynik pierwszego testu w procentach");
        jeden=dane.nextInt();
        System.out.println("Wynik drugiego testu w procentach");
        dwa=dane.nextInt();
        System.out.println("Wynik trzeciego testu w procentach");
        trzy=dane.nextInt();
        srednia = (jeden+dwa+trzy)/3;
        if (srednia>=90){
            System.out.println("Twoja ocena to 5");
        }
        else if (srednia>=80){
            System.out.println("Twoja ocena to 4");
        }
        else if (srednia>=70){
            System.out.println("Twoja ocena to 3");
        }
        else if (srednia>=60){
            System.out.println("Twoja ocena to 2");
        }
        else{
            System.out.println("Twoja ocena wynosi 1");
        }
    }
}
