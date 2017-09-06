package org.omc.seguro;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ITEM")
public class ItemEntity implements Serializable{


	private static final long serialVersionUID = -9201535269782125285L;

	@Id
	@Column(name = "CD_ITEM")
	@GeneratedValue
	private Integer cdItem;

	@Column(name = "CD_APOLI")
	private Integer cdApoli;

	@Column(name = "CD_APOLI_SUSEP_RENOV")
	private Integer cdApoliSusepRenov;

	@Column(name = "CD_CLIEN")
	private Integer cdClien;

	@Column(name = "CD_ENDOS")
	private Integer cdEndos;

	@Column(name = "CD_NGOCO")
	private Integer cdNgoco;

	@Column(name = "CD_MDUPR")
	private Integer cdMdupr;
	
	@Column(name = "DT_ULTMA_ALTER")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltmaAlter;
	
	@Column(name = "DT_EMISS_ITEM")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtEmissItem;
	
	@Column(name = "TP_HISTO_ITEM")
	private String tpHistoItem;
	
	

	public Integer getCdItem() {
		return cdItem;
	}

	public void setCdItem(Integer cdItem) {
		this.cdItem = cdItem;
	}

	public Integer getCdApoli() {
		return cdApoli;
	}

	public void setCdApoli(Integer cdApoli) {
		this.cdApoli = cdApoli;
	}

	public Integer getCdApoliSusepRenov() {
		return cdApoliSusepRenov;
	}

	public void setCdApoliSusepRenov(Integer cdApoliSusepRenov) {
		this.cdApoliSusepRenov = cdApoliSusepRenov;
	}

	public Integer getCdClien() {
		return cdClien;
	}

	public void setCdClien(Integer cdClien) {
		this.cdClien = cdClien;
	}

	public Integer getCdEndos() {
		return cdEndos;
	}

	public void setCdEndos(Integer cdEndos) {
		this.cdEndos = cdEndos;
	}

	public Integer getCdNgoco() {
		return cdNgoco;
	}

	public void setCdNgoco(Integer cdNgoco) {
		this.cdNgoco = cdNgoco;
	}

	public Integer getCdMdupr() {
		return cdMdupr;
	}

	public void setCdMdupr(Integer cdMdupr) {
		this.cdMdupr = cdMdupr;
	}

	public Date getDtUltmaAlter() {
		return dtUltmaAlter;
	}

	public void setDtUltmaAlter(Date dtUltmaAlter) {
		this.dtUltmaAlter = dtUltmaAlter;
	}

	public Date getDtEmissItem() {
		return dtEmissItem;
	}

	public void setDtEmissItem(Date dtEmissItem) {
		this.dtEmissItem = dtEmissItem;
	}

	public String getTpHistoItem() {
		return tpHistoItem;
	}

	public void setTpHistoItem(String tpHistoItem) {
		this.tpHistoItem = tpHistoItem;
	}
	
	

}
