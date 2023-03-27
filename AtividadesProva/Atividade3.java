package AtividadesProva;

import java.util.Scanner;
public class Atividade3 {
    Scanner sc = new Scanner(System.in);
   
    public void Atividade3(){
        System.out.println("Escreva quantos quilos foram comprados de bananas:");
        double banana = sc.nextInt();
        System.out.println("Escreva quantos kg foram comprados de morango:");
        double morango = sc.nextInt();
        System.out.println("Escreva quantos kg foram comprados de maçã:");
        double maca = sc.nextInt();

        double resultadokg = (banana + morango + maca );

        double resulbanana =(banana * 1.80);
        double resulmorango =(morango * 3.50);
        double resulmaca =(maca * 2.30);

        double resultadop = (resulbanana + resulmorango + resulmaca );

        if (resultadokg >= 15 || resultadop >=30) {
            double dfinal = (resultadop-(resultadop*0.1));
            System.out.println("O valor de KG de sua compra é de:" + resultadokg);
            System.out.println("O valor final é de:" + dfinal);

        }
        else {
            System.out.println("O valor de KG de sua compra é de:" + resultadokg);
            System.out.println("O valor final é de:" + resultadop);
        }
    }
}  
