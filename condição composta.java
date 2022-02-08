import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner scan = new Scanner (System.in);
    int golsEquipeA = 0;
    int golsEquipeB = 0;

      System.out.println ("Informe a quantidade de gols da equipe A : ");
      golsEquipeA = scan.nextInt ();

      System.out.println ("Informe a quantidade de gols da equipe B : ");
      golsEquipeB = scan.nextInt();
      
      if(golsEquipeA == golsEquipeB){
        System.out.println("empate ");  
      }else if(golsEquipeA > golsEquipeB){
         System.out.println("A Equipe A ganhou da equipe B"); 
      }else{
          System.out.println("A Equipe B ganhou da equipe A"); 
      }
}
}
