import java.util.Scanner;
public class ejercicio1P65 {
    public static void main(String[] args) {
        //realice un ejercicio que reciba un número entero por consola y cuente cuántas
        //cifras tiene el número e imprima la cantidad de cifras en consola.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero entero");
        int numero = sc.nextInt();
        int digitos = contarcifras2(numero);
        System.out.println("El número tiene "+digitos+" cifras");
    }
    public static int contarcifras (int num){
        int cifras = 0;   //num = 450   cifras=0
        while(num != 0){
            num /=10;  //num = 45, num = 4, num = 0
            cifras++;   // cifras 1, 2, 3
        }
        return cifras;
    }
    public static int contarcifras2(int num2){
        String cadena = String.valueOf(num2);
        int cifras2 = cadena.length();
        return cifras2;
    }
}
