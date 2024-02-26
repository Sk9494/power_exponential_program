import java.util.Scanner;

public class Main {
    static int power(int base,int exponent){ // taban ve üst değişkenleri

        if (exponent == 0){ //üs 0'a eşit olduğunda return 1 dönsün
            return 1;
        } else {
            return  base * power(base, exponent - 1); //üs azalırken tabanın üs ile çarpılması
        }

    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the base number : ");
        int base=input.nextInt();

        System.out.println("Enter the exponent number : ");
        int exponent=input.nextInt();
        int result = power(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);
    }
}