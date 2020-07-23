package br.com.rd.rdevs.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.rd.rdevs.model.Abs_Certidoes;
import br.com.rd.rdevs.model.Abs_Contratos;
import br.com.rd.rdevs.model.Casamento;
import br.com.rd.rdevs.model.Trabalho;

public class TestaInstanciaDeCLasse {
	
	public static void main (String[] args) {
		
		List<Abs_Certidoes> certidoesCriadas = new ArrayList<>();
		Set<Abs_Contratos> contratosCriadas = new HashSet<>();

		Casamento certidaoCasamento = new Casamento(12, "Claudio", "Maria", "27/10/1999", "Ramon");
		
		try {
			certidaoCasamento.fazEmicaoDocumento();
		}catch(IllegalArgumentException e){
			
			System.out.println("Informação de registro invalida");
			
		}finally {
			certidoesCriadas.add(certidaoCasamento);
		}
		
		Trabalho certidaoTrabalho = new Trabalho(422327, "Jose", "Mario e Jonathan", "14/12/1999", "15/12/1999", "CUT");
		
		Abs_Contratos contrato = certidaoTrabalho;
		
		contrato.fazEmicaoDocumento();
		
		contratosCriadas.add(certidaoTrabalho);
		
		System.out.println("Foram criadas: " + certidoesCriadas.size() + " certidões;");
		System.out.println("Foram criadas: " + contratosCriadas.size() + " certidões;");
		
		
	}

}
