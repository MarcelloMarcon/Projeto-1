
/**
 * Escreva uma descrição da classe Series aqui.
 * S = 1 + x2/3 + x4/5 + x6/7 + ...
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Series
{
    public static double somaI(int n){
       double soma=0 , i=1 ,x=0, num = Math.pow(n,x) , den=1;
       
       
       for(i=1;i<=n;i++){
           soma = soma + num/den;
           x=x+2;
           num = Math.pow(n,x);
           den = den + 2;
       }
       
       return soma;
   }
   
    public static double somaRec(int n, int pot){
        double soma = Math.pow(n, pot)/(pot+1); 
        pot = pot + 2;

        if((pot/2+1) > n){
            return soma;
        }
        else{
            return (soma + somaRec(n,pot));
        }
    }
}
