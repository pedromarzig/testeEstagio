package testeEstagio;

public class teste4 {
	public static void main(String[] args) {
	      double [] faturamentos = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};
	      double faturementoTotal = 0.0;
	      
	      for(double faturamento : faturamentos) {
	    	  faturementoTotal += faturamento;
	      }
	      
	      String [] estados = {"Sp", "Rj", "Mg", "Es", "outros"};
	      for (int i = 0; i < faturamentos.length; i++){
	          
	          double totalValue = (faturamentos[i] / faturementoTotal) * 100;
	          System.out.printf("Participação de %s: %.2f%%\n", estados[i], totalValue);
	      }
	      
	    }
}
