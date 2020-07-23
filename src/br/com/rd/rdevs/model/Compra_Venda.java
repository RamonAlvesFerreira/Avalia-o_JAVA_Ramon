package br.com.rd.rdevs.model;

import java.util.List;

public class Compra_Venda extends Abs_Contratos{

	public Compra_Venda(int numRegistroToSet, String nomesToSet,String testemunhasToSet, String dataEmissaoToSet, String dataRegistroToSet,String nomeTabeliaoToSet) {
		super(numRegistroToSet, nomesToSet, testemunhasToSet, dataEmissaoToSet, dataRegistroToSet,nomeTabeliaoToSet);
		this.setTipoCertidao("Compra e Venda");
	}

}
