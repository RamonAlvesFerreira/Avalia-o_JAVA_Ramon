package br.com.rd.rdevs.model;

import java.util.List;

public class PrestacaoDeServicos extends Abs_Contratos{

	public PrestacaoDeServicos(int numRegistroToSet, String nomesToSet,String testemunhasToSet, String dataEmissaoToSet, String dataRegistroToSet,String nomeTabeliaoToSet) {
		super(numRegistroToSet, nomesToSet, testemunhasToSet, dataEmissaoToSet, dataRegistroToSet,nomeTabeliaoToSet);
		this.setTipoCertidao("Prestação de serviço");
	}

}
