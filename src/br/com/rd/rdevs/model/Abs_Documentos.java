package br.com.rd.rdevs.model;

import java.util.List;

public abstract class Abs_Documentos {
	
	private int numRegistroCertidao;
	private String nomes;
	private String tipoCertidao;
	private String dataEmissao;
	private String nomeTabeliao;
	private String cartorioDoDocumento = "22° Cartorio CUT";
	
	
	//SETs
	public int setNumRegistroCertidao(int numRegistroCertidaoToSet) {
		return this.numRegistroCertidao = numRegistroCertidaoToSet;
	}
	public String setNomes(String nomesToSet) {
		return this.nomes = nomesToSet;
	}
	public String setTipoCertidao(String tipoCertidaoToSet) {
		return this.tipoCertidao = tipoCertidaoToSet;
	}
	public String setDataDeEmissao(String dataEmissaoToSet) {
		return this.dataEmissao = dataEmissaoToSet;
	}
	public String setNomeTabeliao(String nomeTabialoToSet) {
		return this.nomeTabeliao = nomeTabialoToSet;
	}

	
	//GETs
	public String getCatorioDoCocumento()
	{
		return this.cartorioDoDocumento;
	}
	
	public int getNumRegistroCertidao() {
		return this.numRegistroCertidao;
	}
	public String getNomes() {
		return this.nomes;
	}
	public String getTipoCertidao() {
		return this.tipoCertidao;
	}
	public String getDataDeEmissao() {
		return this.dataEmissao;
	}
	public String getNomeTabeliao() {
		return this.nomeTabeliao;
	}
	

}
