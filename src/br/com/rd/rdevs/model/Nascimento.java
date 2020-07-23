package br.com.rd.rdevs.model;

import java.util.List;

public class Nascimento extends Abs_Certidoes{

	public Nascimento(int numRegistroToSet, String nomesToSet,String declarantesToSet, String dataEmissaoToSet, String nomeTabeliaoToSet) {
		super(numRegistroToSet, nomesToSet, declarantesToSet, dataEmissaoToSet, nomeTabeliaoToSet);
		this.setTipoCertidao("Nascimento");
	}

}
