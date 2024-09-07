package testeEstagio;

public class teste5 {
	public static void main(String[] args) {
	      String palavra = "Hello World";
	      
	      System.out.println(palavra);
	      String reverterString = "";
	      for (int i = palavra.length() - 1; i >= 0; i--){
	          reverterString = reverterString + palavra.charAt(i);
	      }
	      System.out.println(reverterString);
	    }
}
