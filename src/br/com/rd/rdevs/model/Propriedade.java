package br.com.rd.rdevs.model;

import java.util.List;

public class Propriedade extends Abs_Certidoes{

	public Propriedade(int numRegistroToSet, String nomesToSet,String declarantesToSet, String dataEmissaoToSet, String nomeTabeliaoToSet) {
		super(numRegistroToSet, nomesToSet, declarantesToSet, dataEmissaoToSet, nomeTabeliaoToSet);
		this.setTipoCertidao("Propriedade");
	}

}
