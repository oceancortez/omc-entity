package org.omc.seguro;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@IdClass(NegocioEntityPK.class)
@Table(name="NEGOCIO")
public class NegocioEntity implements Serializable {	
	
	
	private static final long serialVersionUID = -3174200950091279419L;

	@Id
	@Column(name="CD_NGOCO", nullable=false)	
	private Long cdNgoco;
	
	@Id
	@Column(name = "TP_HISTO_NGOCO")
	private String tpHistoNgoco;
	
	@Column(name="NM_CIA")
	private String nmCia;
	
	@Column(name="CD_RAMO")
	private Long cdRamo;
	
	@Column(name="CD_MDUPR")
	private Long cdMdupr;
	
	@Column(name="DS_MDUPR")
	private String dsMdupr;
	
	@Column(name="DT_EMISSAO")	
	private Date dtEmissao;
	
	@Column(name="DT_INICIO_VIGEN")	
	private Date dtInicoVigen;
	
	@Column(name="DT_FIM_VIGEN")	
	private Date dtFimVigen;
	
	@Column(name="CD_SITUC_NGOCO")
	private String cdSitucNgoco;
	
	@Column(name="CD_ESTPL")
	private Long cdEstpl;
	
	@Column(name="DT_VIGEN_PROPOR")	
	private Date dtVigenPropor;
	
	@Column(name="CD_GRP_PRDUT")
	private Long cdGrpPrdut;	
	
	@Column(name="DS_GRP_PRDUT")
	private String dsGrpPrdut;
	
	@Column(name="CD_PLACA")
	private String cdPlaca;
	
	@Column(name="CD_CHASSI")
	private String cdChassi;
	
	@Column(name="NR_ITSEG")
	private Long nrItseg;
	
	@Column(name="CD_CORRETOR")
	private Long cdCorretor;
	
	@Column(name="NM_CORRETOR")
	private String nmCorretor;
	
	@Column(name="CD_SUCURSAL")
	private Long cdSucursal;
	
	@Column(name="NM_SUCURSAL")
	private String nmSucursal;
	
	@Column(name="ST_NEGOCIO")
	private String stNegocio;
	
	@Column(name="CD_ENDOSSO")
	private Long cdEndosso;
	
	@Column(name="CD_CLIEN")
	private Long cdClien;
	
	@JsonIgnore
	@Transient
	NegocioEntityPK pk = new NegocioEntityPK();
	
	public Serializable getPk() {
		this.pk.cdNgoco = this.cdNgoco;
		this.pk.tpHistoNgoco = this.getTpHistoNgoco();
		return this.pk;
	}	
	

	public Long getCdNgoco() {
		return cdNgoco;
	}

	public void setCdNgoco(Long cdNgoco) {
		this.cdNgoco = cdNgoco;
	}

	public String getNmCia() {
		return nmCia;
	}

	public void setNmCia(String nmCia) {
		this.nmCia = nmCia;
	}

	public Long getCdRamo() {
		return cdRamo;
	}

	public void setCdRamo(Long cdRamo) {
		this.cdRamo = cdRamo;
	}
	
	public Long getCdMdupr() {
		return cdMdupr;
	}

	public void setCdMdupr(Long cdMdupr) {
		this.cdMdupr = cdMdupr;
	}

	public String getDsMdupr() {
		return dsMdupr;
	}

	public void setDsMdupr(String dsMdupr) {
		this.dsMdupr = dsMdupr;
	}

	public Date getDtEmissao() {
		return dtEmissao;
	}

	public void setDtEmissao(Date dtEmissao) {
		this.dtEmissao = dtEmissao;
	}

	public Date getDtInicoVigen() {
		return dtInicoVigen;
	}

	public void setDtInicoVigen(Date dtInicoVigen) {
		this.dtInicoVigen = dtInicoVigen;
	}

	public Date getDtFimVigen() {
		return dtFimVigen;
	}

	public void setDtFimVigen(Date dtFimVigen) {
		this.dtFimVigen = dtFimVigen;
	}

	public String getCdSitucNgoco() {
		return cdSitucNgoco;
	}

	public void setCdSitucNgoco(String cdSitucNgoco) {
		this.cdSitucNgoco = cdSitucNgoco;
	}

	public Long getCdEstpl() {
		return cdEstpl;
	}

	public void setCdEstpl(Long cdEstpl) {
		this.cdEstpl = cdEstpl;
	}

	public Date getDtVigenPropor() {
		return dtVigenPropor;
	}

	public void setDtVigenPropor(Date dtVigenPropor) {
		this.dtVigenPropor = dtVigenPropor;
	}

	public Long getCdGrpPrdut() {
		return cdGrpPrdut;
	}

	public void setCdGrpPrdut(Long cdGrpPrdut) {
		this.cdGrpPrdut = cdGrpPrdut;
	}

	public String getDsGrpPrdut() {
		return dsGrpPrdut;
	}

	public void setDsGrpPrdut(String dsGrpPrdut) {
		this.dsGrpPrdut = dsGrpPrdut;
	}

	public String getCdPlaca() {
		return cdPlaca;
	}

	public void setCdPlaca(String cdPlaca) {
		this.cdPlaca = cdPlaca;
	}

	public String getCdChassi() {
		return cdChassi;
	}

	public void setCdChassi(String cdChassi) {
		this.cdChassi = cdChassi;
	}

	public Long getNrItseg() {
		return nrItseg;
	}

	public void setNrItseg(Long nrItseg) {
		this.nrItseg = nrItseg;
	}

	public Long getCdCorretor() {
		return cdCorretor;
	}

	public void setCdCorretor(Long cdCorretor) {
		this.cdCorretor = cdCorretor;
	}

	public String getNmCorretor() {
		return nmCorretor;
	}

	public void setNmCorretor(String nmCorretor) {
		this.nmCorretor = nmCorretor;
	}

	public Long getCdSucursal() {
		return cdSucursal;
	}

	public void setCdSucursal(Long cdSucursal) {
		this.cdSucursal = cdSucursal;
	}

	public String getNmSucursal() {
		return nmSucursal;
	}

	public void setNmSucursal(String nmSucursal) {
		this.nmSucursal = nmSucursal;
	}

	public String getStNegocio() {
		return stNegocio;
	}

	public void setStNegocio(String stNegocio) {
		this.stNegocio = stNegocio;
	}

	public Long getCdEndosso() {
		return cdEndosso;
	}

	public void setCdEndosso(Long cdEndosso) {
		this.cdEndosso = cdEndosso;
	}

	public Long getCdClien() {
		return cdClien;
	}

	public void setCdClien(Long cdClien) {
		this.cdClien = cdClien;
	}



	public String getTpHistoNgoco() {
		return tpHistoNgoco;
	}



	public void setTpHistoNgoco(String tpHistoNgoco) {
		this.tpHistoNgoco = tpHistoNgoco;
	}
	
	

}
