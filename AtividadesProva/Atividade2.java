package AtividadesProva;

import java.util.Scanner;
public class Atividade2 {
    Scanner sc = new Scanner(System.in);
   
    public void Atividade2(){
        System.out.println("Digite o nº de sua matricula");
        int nmat = sc.nextInt();
        int resultado = (nmat % 4);

         if (resultado == 0){
         System.out.println(" Você está no Time do Cris");   
         }
         else if (resultado == 1){
         System.out.println(" Você está no Time do Greg");   
         }
         else if (resultado == 2){
         System.out.println(" Você está no Time do Caruso");   
         }   
         else if (resultado == 3){
         System.out.println(" Você está no Time do Jerome");   
         }
    }


    
}
