
import java.util.Scanner;

public class Aula17 {
	static Scanner teclado = new Scanner(System.in);


    public static double calculadora(double num1, double num2, char operacao){
        if (operacao == '+'){
            return num1 + num2;
        } else if(operacao == '-') {
            return num1 - num2;
        } else if (operacao == '*'){
            return num1 * num2;
        } else if (operacao == '/'){
            return num1 / num2;
        } else{
           System.out.println("Insira um sinal de operação válido");
        	return 0;
        }


    }


    public static void main(String[] args) {
        double  n1,n2;
        System.out.println("Informe o primeiro número:");
        n1 = teclado.nextDouble();

        char op;
        System.out.println("Informe a operação(+,-,*,/): ");
        op = teclado.next().charAt(0); //char

        System.out.println("Informe o segundo número: ");
        n2 = teclado.nextDouble();

        System.out.println(calculadora(n1,n2,op));        
        
       

    }
}
