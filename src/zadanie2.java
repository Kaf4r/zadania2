import java.util.Scanner;
public class zadanie2 {
    public static void main(String[] args){
        Scanner dane = new Scanner(System.in);

        int dzien, miesiac, rok;

        System.out.println("Podaj dzien");
        dzien=dane.nextInt();
        System.out.println("Podaj miesiac");
        miesiac=dane.nextInt();
        System.out.println("Podaj dwie ostatnie cyfry roku");
        rok=dane.nextInt();
        if(dzien*miesiac==rok){
            System.out.println("Data jest magiczna");
        }
        else{
            System.out.println("Data nie jest magiczna");
        }
    }
}
