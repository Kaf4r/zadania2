import java.util.Scanner;

public class arabnarzym{
    public static void main(String arg []){
        System.out.println("Wprowadz liczbe jaka chcesz zamienic na rzymska: ");
        Scanner scan = new Scanner (System.in);
        int number = scan.nextInt();
        String romanDigit = "";
        if (number < 0 || number > 3999) {
            System.out.println( "Liczba nie moze byc zamienona na rzymska");
        }
        else
        {
            System.out.println("Liczba arabska na rzymska wynosi " + romanDigit);
            System.out.println(convert(number));
        }
    }



    public static String romanDigit(int n, String one, String five, String ten){

        if(n >= 1)
        {
            if(n == 1)
            {
                return one;
            }
            else if (n == 2)
            {
                return one + one;
            }
            else if (n == 3)
            {
                return one + one + one;
            }
            else if (n==4)
            {
                return one + five;
            }
            else if (n == 5)
            {
                return five;
            }
            else if (n == 6)
            {
                return five + one;
            }
            else if (n == 7)
            {
                return five + one + one;
            }
            else if (n == 8)
            {
                return five + one + one + one;
            }
            else if (n == 9)
            {
                return one + ten;
            }

        }
        return "";
    }

    public static String convert(int number){

        String romanOnes = romanDigit( number%10, "I", "V", "X");
        number /=10;
        String romanTens = romanDigit( number%10, "X", "L", "C");
        number /=10;
        String romanHundreds = romanDigit(number%10, "C", "D", "M");
        number /=10;
        String romanThousands = romanDigit(number%10, "M", "", "");

        String result = romanThousands + romanHundreds + romanTens + romanOnes;
        return result;

    }
}