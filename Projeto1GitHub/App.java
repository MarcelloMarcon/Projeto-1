
/**
 *Faça um programa em Java que calcula a soma os n primeiros termos da
soma S apresentada a abaixo. Para calcular a soma crie duas versões de métodos
estáticos: uma versão iterativa e outra recursiva. Esses métodos devem ser codificados
em uma classe chamada Series. A seguir, crie uma outra classe com o método main e
faça um exemplo de chamada desses métodos usando entradas fornecidas pelo usuário.
S = 1 + x2/3 + x4/5 + x6/7 + ...
 * 
 * @author (Marcello Marcon) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class App
{
    private static Series operacoes;
    public static void main (String args[]){
        operacoes = new Series();
        Scanner teclado = new Scanner(System.in);
        int n;
        
        do{System.out.println("Informe o valor (inteiro e positivo!): ");
           n = teclado.nextInt();
         }while(n<=0);
        
        
        System.out.println("Resultado da soma dos "+ n +" primeiros termos da soma pelo método iterativo: " + operacoes.somaI(n));
        System.out.println("Resultado da soma dos "+ n +" primeiros termos da soma pelo método recursivo: " + operacoes.somaRec(n,0));

       

    }
}
