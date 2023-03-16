import java.util.Scanner;
public class zadanie1 {
    public static void main(String[] args){
        Scanner dane = new Scanner(System.in);
        int liczba;
        System.out.println("Jak liczbe od 1 do 10 zamienic na rzymska?");

        liczba=dane.nextInt();
        dane.nextLine();
        switch(liczba){
            case 1:
                System.out.println("Liczba to I");
                break;
            case 2:
                System.out.println("Liczba to II");
                break;
            case 3:
                System.out.println("Liczba to III");
                break;
            case 4:
                System.out.println("Liczba to IV");
                break;
            case 5:
                System.out.println("Liczba to V");
                break;
            case 6:
                System.out.println("Liczba to VI");
                break;
            case 7:
                System.out.println("Liczba to VII");
                break;
            case 8:
                System.out.println("Liczba to VIII");
                break;
            case 9:
                System.out.println("Liczba to IX");
                break;
            case 10:
                System.out.println("Liczba to X");
                break;
            default:
                System.out.println("Liczba musi być od 1 do 10");
        }
    }
}
