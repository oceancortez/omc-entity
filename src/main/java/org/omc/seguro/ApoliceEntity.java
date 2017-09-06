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
@Table(name = "APOLICE")
public class ApoliceEntity implements Serializable {

	private static final long serialVersionUID = -4611971083833273815L;

	@Id
	@Column(name = "CD_APOLI")
	@GeneratedValue
	private Integer cdApoli;

	@Column(name = "TP_HISTO_APOLI")
	private String tpHistoApoli;

	@Column(name = "CD_APOLI_SUSEP")
	private Integer cdApoliSusep;

	@Column(name = "CD_APOLI_SUSEP_RENOV")
	private Integer cdApoliSusepRenov;

	@Column(name = "CD_CIA_SGDRA")
	private Integer cdCiaSgdra;

	@Column(name = "CD_CIA_SGDRA_RENOV")
	private Integer cdCiaSgdraRenov;

	@Column(name = "CD_ENDOS")
	private Integer cdEndos;

	@Column(name = "CD_MDUPR")
	private Integer cdMdupr;

	@Column(name = "CD_NGOCO")
	private Integer cdNgoco;

	@Column(name = "CD_RAMO_RENOV")
	private Integer cdRamoRenov;

	@Column(name = "CD_RAMO_SEG")
	private Integer cdRamoSeg;

	@Column(name = "CD_SUCSL_FISCL")
	private Integer cdSucslFiscl;

	@Column(name = "DT_EMISS_APOLI")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtEmissApoli;

	@Column(name = "DT_FIM_SELEC")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtFimSelec;

	@Column(name = "DT_INICO_SELEC")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtInicoSelec;

	@Column(name = "DT_PARTM")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtPartm;

	@Column(name = "DT_ULTMA_ALTER")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltmaAlter;

	@Column(name = "SQ_MDUPR")
	private Integer sqMdupr;

	@Column(name = "TP_HISTO_NGOCO")
	private String tpHistoNgoco;

	public Integer getCdApoli() {
		return cdApoli;
	}

	public void setCdApoli(Integer cdApoli) {
		this.cdApoli = cdApoli;
	}

	public String getTpHistoApoli() {
		return tpHistoApoli;
	}

	public void setTpHistoApoli(String tpHistoApoli) {
		this.tpHistoApoli = tpHistoApoli;
	}

	public Integer getCdApoliSusep() {
		return cdApoliSusep;
	}

	public void setCdApoliSusep(Integer cdApoliSusep) {
		this.cdApoliSusep = cdApoliSusep;
	}

	public Integer getCdApoliSusepRenov() {
		return cdApoliSusepRenov;
	}

	public void setCdApoliSusepRenov(Integer cdApoliSusepRenov) {
		this.cdApoliSusepRenov = cdApoliSusepRenov;
	}

	public Integer getCdCiaSgdra() {
		return cdCiaSgdra;
	}

	public void setCdCiaSgdra(Integer cdCiaSgdra) {
		this.cdCiaSgdra = cdCiaSgdra;
	}

	public Integer getCdCiaSgdraRenov() {
		return cdCiaSgdraRenov;
	}

	public void setCdCiaSgdraRenov(Integer cdCiaSgdraRenov) {
		this.cdCiaSgdraRenov = cdCiaSgdraRenov;
	}

	public Integer getCdEndos() {
		return cdEndos;
	}

	public void setCdEndos(Integer cdEndos) {
		this.cdEndos = cdEndos;
	}

	public Integer getCdMdupr() {
		return cdMdupr;
	}

	public void setCdMdupr(Integer cdMdupr) {
		this.cdMdupr = cdMdupr;
	}

	public Integer getCdNgoco() {
		return cdNgoco;
	}

	public void setCdNgoco(Integer cdNgoco) {
		this.cdNgoco = cdNgoco;
	}

	public Integer getCdRamoRenov() {
		return cdRamoRenov;
	}

	public void setCdRamoRenov(Integer cdRamoRenov) {
		this.cdRamoRenov = cdRamoRenov;
	}

	public Integer getCdRamoSeg() {
		return cdRamoSeg;
	}

	public void setCdRamoSeg(Integer cdRamoSeg) {
		this.cdRamoSeg = cdRamoSeg;
	}

	public Integer getCdSucslFiscl() {
		return cdSucslFiscl;
	}

	public void setCdSucslFiscl(Integer cdSucslFiscl) {
		this.cdSucslFiscl = cdSucslFiscl;
	}

	public Date getDtEmissApoli() {
		return dtEmissApoli;
	}

	public void setDtEmissApoli(Date dtEmissApoli) {
		this.dtEmissApoli = dtEmissApoli;
	}

	public Date getDtFimSelec() {
		return dtFimSelec;
	}

	public void setDtFimSelec(Date dtFimSelec) {
		this.dtFimSelec = dtFimSelec;
	}

	public Date getDtInicoSelec() {
		return dtInicoSelec;
	}

	public void setDtInicoSelec(Date dtInicoSelec) {
		this.dtInicoSelec = dtInicoSelec;
	}

	public Date getDtPartm() {
		return dtPartm;
	}

	public void setDtPartm(Date dtPartm) {
		this.dtPartm = dtPartm;
	}

	public Date getDtUltmaAlter() {
		return dtUltmaAlter;
	}

	public void setDtUltmaAlter(Date dtUltmaAlter) {
		this.dtUltmaAlter = dtUltmaAlter;
	}

	public Integer getSqMdupr() {
		return sqMdupr;
	}

	public void setSqMdupr(Integer sqMdupr) {
		this.sqMdupr = sqMdupr;
	}

	public String getTpHistoNgoco() {
		return tpHistoNgoco;
	}

	public void setTpHistoNgoco(String tpHistoNgoco) {
		this.tpHistoNgoco = tpHistoNgoco;
	}
	
	

}
