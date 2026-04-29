import java.util.Scanner;
public class Peso {

    public static void main(String []  args) {
        Scanner imc = new Scanner(System.in);

        String r = "Y";

        while(r.equalsIgnoreCase("Y")) {


            System.out.println("=================================================");
            System.out.println("=================CALCULADORA IMC==================");
            System.out.println("==================================================");

            System.out.println("Coloque seu nome aqui :  ");
            String nome = imc.nextLine();

            System.out.println("Digite seu Peso:   ");
            double peso = imc.nextDouble();

            System.out.println("Digite sua altura:    ");
            double altura = imc.nextDouble();


            String clas;

            double saude = peso / (altura * altura);

            if (saude < 18.5) {
                clas = "Abaixo do peso";
            } else if (saude < 24.9) {
                clas = "Peso Normal";
            } else if (saude < 29.9) {
                clas = "Sobrepeso";
            } else if (saude < 34.9) {
                clas = " Obesidade Grau 1";
            } else if (saude < 39.9) {
                clas = "Obesidade Grau 2";
            } else {
                clas = "obesidade Morbida";
            }

            System.out.println("\n======================RESULTADO IMC=====================");
            System.out.println("NOME :  " + nome);
            System.out.printf("IMC : %.2f\n", saude);
            System.out.println("Classificação:  " + clas);
            System.out.println("==========================================================");

            System.out.println("\nDeseja Calcular outro IMC?  (Y/N)");
            r = imc.nextLine();
        }



    }
}