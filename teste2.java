package testeEstagio;
import java.util.Scanner;
public class teste2 {
	public static void main(String[] args) {
        Scanner x = new Scanner(System.in); 
        System.out.println("Digite um numero:");
        int n = x.nextInt();  

        int a = 0, b = 1;
        int soma = 0;
        boolean verifyItem = false;
        while( b <= n) {
        	
        	soma = a + b;
        	a = b;
        	b = soma;
        	if(b == n) {
        		verifyItem = true;
        		break;
        	}
        }
        System.out.println(soma + ",");
        if(verifyItem) {
        	System.out.println(soma + ",");
        	
        }else {
        	System.out.println("O numero " + n + " nao pertecem a sequencia!");
        }
        
        x.close(); 
    }
}
