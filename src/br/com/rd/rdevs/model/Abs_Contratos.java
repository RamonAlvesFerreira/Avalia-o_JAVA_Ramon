package br.com.rd.rdevs.model;

import java.util.List;

import br.com.rd.rdevs.inter.EmitirDocumento;

public abstract class Abs_Contratos extends Abs_Documentos implements EmitirDocumento{
	
	private String testemunhas;
	private String dataRegistro;
	
	
	
	//SETs
	public String setTestemunhas(String testemunhasToSet) {
		return this.testemunhas = testemunhasToSet;
	}
	public String setDataRegistro(String dataRegistroToSet) {
		return this.dataRegistro = dataRegistroToSet;
	}
	
	//GETs
	public String getTestemunhas() {
		return this.testemunhas;
	}
	public String getDataRegistro() {
		return this.dataRegistro;
	}
	
	//METHODs
	public Abs_Contratos(int numRegistroToSet, String nomesToSet, String testemunhasToSet,String dataEmissaoToSet, String dataRegistroToSet, String nomeTabeliaoToSet) {
		this.setNumRegistroCertidao(numRegistroToSet);
		this.setNomes(nomesToSet);
		this.setTestemunhas(testemunhasToSet);
		this.setDataDeEmissao(dataEmissaoToSet);
		this.setDataRegistro(dataRegistroToSet);
		this.setNomeTabeliao(nomeTabeliaoToSet);
	}
	
	@Override
	public void fazEmicaoDocumento() {
		if(this.getNumRegistroCertidao() != 0) {
			System.out.println("Cartorio: " + this.getCatorioDoCocumento() + "\n" + "Tipo do documento: " + this.getTipoCertidao() + "\n" + "Numero: " + this.getNumRegistroCertidao() + "\n" + "Integrantes: " + this.getNomes() + "\n" + "Testemunha: " + this.getTestemunhas() + "\n" + "Data Emissao: " + this.getDataDeEmissao() + "\n" + "Data Registro: " + this.getDataRegistro() + "\n" + "Tabeliao: " + this.getNomeTabeliao() + "\n");
		}else {
			throw new IllegalArgumentException("Fumulario Invalido");
		}
	}
	
	
	


}
