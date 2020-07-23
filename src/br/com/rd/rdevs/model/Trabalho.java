package br.com.rd.rdevs.model;

import java.util.List;

public class Trabalho extends Abs_Contratos{

	public Trabalho(int numRegistroToSet, String nomesToSet,String testemunhasToSet, String dataEmissaoToSet, String dataRegistroToSet,String nomeTabeliaoToSet) {
		super(numRegistroToSet, nomesToSet, testemunhasToSet, dataEmissaoToSet, dataRegistroToSet,nomeTabeliaoToSet);
		this.setTipoCertidao("Trabalho");
	}

}
