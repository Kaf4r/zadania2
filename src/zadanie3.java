import java.util.Scanner;
public class zadanie3 {
    public static void main(String[] args){
        Scanner dane = new Scanner(System.in);

        float wzrost, waga;

        System.out.println("Podaj wzrost w metrach");
        wzrost=dane.nextFloat();

        System.out.println("Podaj wage");
        waga=dane.nextInt();
        float wz2 = wzrost*wzrost;
        double bmi = waga/wz2;
        if(bmi >=25){
            System.out.println("Masz nadwage");
        }
        else if (bmi <=18.5){
            System.out.println("Masz niedowage");
        }
        else{
            System.out.println("BMI w normie");
        }
    }
}
