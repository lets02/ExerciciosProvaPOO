package AtividadesProva;

import java.util.Scanner;
public class Atividade1 {
    Scanner sc = new Scanner(System.in);

    public void Atividade1(){
        System.out.println("Digite algum número");
        double numero1 = sc.nextDouble();
        System.out.println("Digite outro número");
        double numero2 = sc.nextDouble();
        System.out.println("Por favor escolha qual operação será realizada / 1.Adição / 2.Subtração / 3.Multiplicação / 4.Divisão");
        int operacao = sc.nextInt();

        if (operacao == 1){
            double resultado = (numero1 + numero2);
            System.out.println("O resultado é:" +resultado);
        }
        else if (operacao == 2){
            double resultado = (numero1 - numero2);
            System.out.println("O resultado é:" +resultado);
        }

        else if (operacao == 3){
            double resultado = (numero1 * numero2);
            System.out.println("O resultado é:" +resultado);
        }
        else if (operacao == 4){
            double resultado = (numero1 / numero2);
            System.out.println("O resultado é:" +resultado);
        }

        
        

    }
}
