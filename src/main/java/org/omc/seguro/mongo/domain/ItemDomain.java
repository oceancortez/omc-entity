package org.omc.seguro.mongo.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document(collection = "item")
public class ItemDomain implements Serializable {

	private static final long serialVersionUID = -9201535269782125285L;

	@Id
	@JsonIgnore
	private String id;
	
	private Long cdItem;

	private String tpHistoItem;

	private Long cdApoli;

	private Long cdApoliSusepRenov;

	private Long cdClien;

	private Long cdEndos;

	private Long cdNgoco;

	private String tpHistoNgoco;

	private Long cdMdupr;

	private Date dtUltmaAlter;

	private Date dtEmissItem;	

	/**
	 * 
	 */
	public ItemDomain() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cdItem
	 * @param tpHistoItem
	 * @param cdApoli
	 * @param cdApoliSusepRenov
	 * @param cdClien
	 * @param cdEndos
	 * @param cdNgoco
	 * @param tpHistoNgoco
	 * @param cdMdupr
	 * @param dtUltmaAlter
	 * @param dtEmissItem
	 */
	public ItemDomain(Long cdItem, String tpHistoItem, Long cdApoli, Long cdApoliSusepRenov, Long cdClien, Long cdEndos,
			Long cdNgoco, String tpHistoNgoco, Long cdMdupr, Date dtUltmaAlter, Date dtEmissItem) {
		super();
		this.cdItem = cdItem;
		this.tpHistoItem = tpHistoItem;
		this.cdApoli = cdApoli;
		this.cdApoliSusepRenov = cdApoliSusepRenov;
		this.cdClien = cdClien;
		this.cdEndos = cdEndos;
		this.cdNgoco = cdNgoco;
		this.tpHistoNgoco = tpHistoNgoco;
		this.cdMdupr = cdMdupr;
		this.dtUltmaAlter = dtUltmaAlter;
		this.dtEmissItem = dtEmissItem;
	}

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

	public String getTpHistoNgoco() {
		return tpHistoNgoco;
	}

	public void setTpHistoNgoco(String tpHistoNgoco) {
		this.tpHistoNgoco = tpHistoNgoco;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

}
