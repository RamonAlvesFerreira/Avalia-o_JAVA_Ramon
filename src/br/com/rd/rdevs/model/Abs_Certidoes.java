package br.com.rd.rdevs.model;

import java.util.List;

import br.com.rd.rdevs.inter.EmitirDocumento;

public abstract class Abs_Certidoes extends Abs_Documentos implements EmitirDocumento{
	
	private String declarantes;
	
	//SETs
	public String setDeclarantes(String declarantesToSet) {
		return this.declarantes = declarantesToSet;
	}
	
	//GET
	public String getDeclarantes() {
		return this.declarantes;
	}
	
	
	//METHODs
	public Abs_Certidoes(int numRegistroToSet, String nomesToSet, String declarantesToSet, String dataEmissaoToSet, String nomeTabeliaoToSet) {
		this.setNumRegistroCertidao(numRegistroToSet);
		this.setNomes(nomesToSet);
		this.setDeclarantes(declarantesToSet);
		this.setDataDeEmissao(dataEmissaoToSet);
		this.setNomeTabeliao(nomeTabeliaoToSet);
	}
	@Override
	public void fazEmicaoDocumento() {
		if(this.getNumRegistroCertidao() != 0) {
			System.out.println("Cartorio: " + this.getCatorioDoCocumento() + "\n" + "Tipo do documento: " + this.getTipoCertidao() + "\n" + "Numero: " + this.getNumRegistroCertidao() + "\n" + "Integrantes: " + this.getNomes() + "\n" + "Declarantes: " + this.getDeclarantes() + "\n" + "Data: " + this.getDataDeEmissao() + "\n" + "Tabeliao: " + this.getNomeTabeliao() + "\n");
		}else {
			throw new IllegalArgumentException("Fumulario Invalido");
		}
	}


}
