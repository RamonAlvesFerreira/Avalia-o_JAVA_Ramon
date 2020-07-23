package br.com.rd.rdevs.model;

import java.util.List;

public class Obito extends Abs_Certidoes{

	public Obito(int numRegistroToSet, String nomesToSet, String declarantesToSet,String dataEmissaoToSet, String nomeTabeliaoToSet) {
		super(numRegistroToSet, nomesToSet, declarantesToSet, dataEmissaoToSet, nomeTabeliaoToSet);
		this.setTipoCertidao("Obito");
	}

}
