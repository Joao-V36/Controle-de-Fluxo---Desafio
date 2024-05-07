
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o primeito paramentro: ");
        int paramentro1 = ler.nextInt();
        System.out.println("Informe o segundo parametro: ");
        int paramentro2 = ler.nextInt();

        try {
            contar(paramentro1, paramentro2);

            } catch (ParametroException e) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
    static void contar(int paramentro1, int paramentro2) throws ParametroException{
        if (paramentro1 > paramentro2){
            throw new ParametroException();
        }
        else {
            int contagem = paramentro2 - paramentro1;
            for (int cont = 1; cont <= contagem; cont++)
            System.out.println("Imprimindo o Numero: " + cont);
        }


    }

    }
















