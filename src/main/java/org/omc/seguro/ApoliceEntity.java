package org.omc.seguro;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@IdClass(ApoliceEntityPK.class)
@Table(name = "APOLICE")
public class ApoliceEntity implements Serializable {

	private static final long serialVersionUID = -4611971083833273815L;

	@Id
	@Column(name = "CD_APOLI")	
	private Long cdApoli;

	@Id
	@Column(name = "TP_HISTO_APOLI")
	private String tpHistoApoli;

	@Column(name = "CD_APOLI_SUSEP")
	private Long cdApoliSusep;

	@Column(name = "CD_APOLI_SUSEP_RENOV")
	private Long cdApoliSusepRenov;

	@Column(name = "CD_CIA_SGDRA")
	private Long cdCiaSgdra;

	@Column(name = "CD_CIA_SGDRA_RENOV")
	private Long cdCiaSgdraRenov;

	@Column(name = "CD_ENDOS")
	private Long cdEndos;

	@Column(name = "CD_MDUPR")
	private Long cdMdupr;

	@Column(name = "CD_NGOCO")
	private Long cdNgoco;

	@Column(name = "CD_RAMO_RENOV")
	private Long cdRamoRenov;

	@Column(name = "CD_RAMO_SEG")
	private Long cdRamoSeg;

	@Column(name = "CD_SUCSL_FISCL")
	private Long cdSucslFiscl;

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
	private Long sqMdupr;

	@Column(name = "TP_HISTO_NGOCO")
	private String tpHistoNgoco;
	
	
	@Transient
	ApoliceEntityPK pk = new ApoliceEntityPK();
	
	public Serializable getPk() {
		this.pk.cdApoli = this.cdApoli;
		this.pk.tpHistoApoli = this.tpHistoApoli;
		return this.pk;
	}
	

	public Long getCdApoli() {
		return cdApoli;
	}

	public void setCdApoli(Long cdApoli) {
		this.cdApoli = cdApoli;
	}

	public String getTpHistoApoli() {
		return tpHistoApoli;
	}

	public void setTpHistoApoli(String tpHistoApoli) {
		this.tpHistoApoli = tpHistoApoli;
	}

	public Long getCdApoliSusep() {
		return cdApoliSusep;
	}

	public void setCdApoliSusep(Long cdApoliSusep) {
		this.cdApoliSusep = cdApoliSusep;
	}

	public Long getCdApoliSusepRenov() {
		return cdApoliSusepRenov;
	}

	public void setCdApoliSusepRenov(Long cdApoliSusepRenov) {
		this.cdApoliSusepRenov = cdApoliSusepRenov;
	}

	public Long getCdCiaSgdra() {
		return cdCiaSgdra;
	}

	public void setCdCiaSgdra(Long cdCiaSgdra) {
		this.cdCiaSgdra = cdCiaSgdra;
	}

	public Long getCdCiaSgdraRenov() {
		return cdCiaSgdraRenov;
	}

	public void setCdCiaSgdraRenov(Long cdCiaSgdraRenov) {
		this.cdCiaSgdraRenov = cdCiaSgdraRenov;
	}

	public Long getCdEndos() {
		return cdEndos;
	}

	public void setCdEndos(Long cdEndos) {
		this.cdEndos = cdEndos;
	}

	public Long getCdMdupr() {
		return cdMdupr;
	}

	public void setCdMdupr(Long cdMdupr) {
		this.cdMdupr = cdMdupr;
	}

	public Long getCdNgoco() {
		return cdNgoco;
	}

	public void setCdNgoco(Long cdNgoco) {
		this.cdNgoco = cdNgoco;
	}

	public Long getCdRamoRenov() {
		return cdRamoRenov;
	}

	public void setCdRamoRenov(Long cdRamoRenov) {
		this.cdRamoRenov = cdRamoRenov;
	}

	public Long getCdRamoSeg() {
		return cdRamoSeg;
	}

	public void setCdRamoSeg(Long cdRamoSeg) {
		this.cdRamoSeg = cdRamoSeg;
	}

	public Long getCdSucslFiscl() {
		return cdSucslFiscl;
	}

	public void setCdSucslFiscl(Long cdSucslFiscl) {
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

	public Long getSqMdupr() {
		return sqMdupr;
	}

	public void setSqMdupr(Long sqMdupr) {
		this.sqMdupr = sqMdupr;
	}

	public String getTpHistoNgoco() {
		return tpHistoNgoco;
	}

	public void setTpHistoNgoco(String tpHistoNgoco) {
		this.tpHistoNgoco = tpHistoNgoco;
	}
	
	

}
