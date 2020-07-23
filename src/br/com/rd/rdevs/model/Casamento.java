package br.com.rd.rdevs.model;

import java.util.List;

import br.com.rd.rdevs.inter.EmitirDocumento;

public class Casamento extends Abs_Certidoes{

	public Casamento(int numRegistroToSet, String nomesToSet, String declarantesToSet, String dataEmissaoToSet, String nomeTabeliaoToSet) {
		super(numRegistroToSet, nomesToSet, declarantesToSet, dataEmissaoToSet, nomeTabeliaoToSet);
		this.setTipoCertidao("Casamento");
	}


	
}
