package testeEstagio;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class teste3 {

	public static void main(String[] args) {
	Path path = Paths.get("C:\\ws-eclipse\\testeEstagio\\src\\testeEstagio\\faturamento.json");

	while(path != null) {
		try {
			String lerPath = Files.readString(path);
			double faturamentototal = 0.0, maiorFaturamento = 0.0, menorFaturamento = 0.0;
			
			String[] faturamentoStrings = lerPath.split(", ");
			
			for(String fatumentosS : faturamentoStrings) {
				try {
				double faturamento = Double.parseDouble(fatumentosS);
				if(faturamento > 0) {
				faturamentototal += faturamento;
				}
				if(faturamento >maiorFaturamento ) {
					maiorFaturamento = faturamento;
				}
				if(faturamento == 0.0) {
					continue;
				}else if(faturamento < menorFaturamento) {
					menorFaturamento = faturamento;
				}
				
				System.out.println("O faturmaneto total: " + faturamentototal);
				System.out.println("Maior faturamento: " + maiorFaturamento);
				System.out.println("Menor faturamento: " + menorFaturamento);
			}catch (NumberFormatException e) {
				e.printStackTrace();
			}
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}

