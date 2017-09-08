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
	private Long cdItem;

	@Column(name = "CD_APOLI")
	private Long cdApoli;

	@Column(name = "CD_APOLI_SUSEP_RENOV")
	private Long cdApoliSusepRenov;

	@Column(name = "CD_CLIEN")
	private Long cdClien;

	@Column(name = "CD_ENDOS")
	private Long cdEndos;

	@Column(name = "CD_NGOCO")
	private Long cdNgoco;

	@Column(name = "CD_MDUPR")
	private Long cdMdupr;
	
	@Column(name = "DT_ULTMA_ALTER")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltmaAlter;
	
	@Column(name = "DT_EMISS_ITEM")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtEmissItem;
	
	@Column(name = "TP_HISTO_ITEM")
	private String tpHistoItem;
	
	

	public Long getCdItem() {
		return cdItem;
	}

	public void setCdItem(Long cdItem) {
		this.cdItem = cdItem;
	}

	public Long getCdApoli() {
		return cdApoli;
	}

	public void setCdApoli(Long cdApoli) {
		this.cdApoli = cdApoli;
	}

	public Long getCdApoliSusepRenov() {
		return cdApoliSusepRenov;
	}

	public void setCdApoliSusepRenov(Long cdApoliSusepRenov) {
		this.cdApoliSusepRenov = cdApoliSusepRenov;
	}

	public Long getCdClien() {
		return cdClien;
	}

	public void setCdClien(Long cdClien) {
		this.cdClien = cdClien;
	}

	public Long getCdEndos() {
		return cdEndos;
	}

	public void setCdEndos(Long cdEndos) {
		this.cdEndos = cdEndos;
	}

	public Long getCdNgoco() {
		return cdNgoco;
	}

	public void setCdNgoco(Long cdNgoco) {
		this.cdNgoco = cdNgoco;
	}

	public Long getCdMdupr() {
		return cdMdupr;
	}

	public void setCdMdupr(Long cdMdupr) {
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
