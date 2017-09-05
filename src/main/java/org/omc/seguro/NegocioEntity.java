package org.omc.seguro;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NEGOCIO")
public class NegocioEntity implements Serializable {	
	
	
	private static final long serialVersionUID = -3174200950091279419L;

	@Id
	@Column(name="CD_NGOCO", nullable=false)
	@GeneratedValue
	private Integer cdNgoco;
	
	@Column(name="NM_CIA")
	private String nmCia;
	
	@Column(name="CD_RAMO")
	private Integer cdRamo;
	
	@Column(name="CD_APOLICE")
	private Integer cdApolice;
	
	@Column(name="CD_APOLICE_SUSEP")
	private Integer cdApoliceSusep;
	
	@Column(name="CD_MDUPR")
	private Integer cdMdupr;
	
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
	private Integer cdEstpl;
	
	@Column(name="DT_VIGEN_PROPOR")	
	private Date dtVigenPropor;
	
	@Column(name="CD_GRP_PRDUT")
	private Integer cdGrpPrdut;	
	
	@Column(name="DS_GRP_PRDUT")
	private String dsGrpPrdut;
	
	@Column(name="CD_PLACA")
	private String cdPlaca;
	
	@Column(name="CD_CHASSI")
	private String cdChassi;
	
	@Column(name="NR_ITSEG")
	private Integer nrItseg;
	
	@Column(name="CD_CORRETOR")
	private Integer cdCorretor;
	
	@Column(name="NM_CORRETOR")
	private String nmCorretor;
	
	@Column(name="CD_SUCURSAL")
	private Integer cdSucursal;
	
	@Column(name="NM_SUCURSAL")
	private String nmSucursal;
	
	@Column(name="ST_NEGOCIO")
	private String stNegocio;
	
	@Column(name="CD_ENDOSSO")
	private Integer cdEndosso;
	
	@Column(name="CD_CLIEN")
	private Integer cdClien;

	public Integer getCdNgoco() {
		return cdNgoco;
	}

	public void setCdNgoco(Integer cdNgoco) {
		this.cdNgoco = cdNgoco;
	}

	public String getNmCia() {
		return nmCia;
	}

	public void setNmCia(String nmCia) {
		this.nmCia = nmCia;
	}

	public Integer getCdRamo() {
		return cdRamo;
	}

	public void setCdRamo(Integer cdRamo) {
		this.cdRamo = cdRamo;
	}

	public Integer getCdApolice() {
		return cdApolice;
	}

	public void setCdApolice(Integer cdApolice) {
		this.cdApolice = cdApolice;
	}

	public Integer getCdApoliceSusep() {
		return cdApoliceSusep;
	}

	public void setCdApoliceSusep(Integer cdApoliceSusep) {
		this.cdApoliceSusep = cdApoliceSusep;
	}

	public Integer getCdMdupr() {
		return cdMdupr;
	}

	public void setCdMdupr(Integer cdMdupr) {
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

	public Integer getCdEstpl() {
		return cdEstpl;
	}

	public void setCdEstpl(Integer cdEstpl) {
		this.cdEstpl = cdEstpl;
	}

	public Date getDtVigenPropor() {
		return dtVigenPropor;
	}

	public void setDtVigenPropor(Date dtVigenPropor) {
		this.dtVigenPropor = dtVigenPropor;
	}

	public Integer getCdGrpPrdut() {
		return cdGrpPrdut;
	}

	public void setCdGrpPrdut(Integer cdGrpPrdut) {
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

	public Integer getNrItseg() {
		return nrItseg;
	}

	public void setNrItseg(Integer nrItseg) {
		this.nrItseg = nrItseg;
	}

	public Integer getCdCorretor() {
		return cdCorretor;
	}

	public void setCdCorretor(Integer cdCorretor) {
		this.cdCorretor = cdCorretor;
	}

	public String getNmCorretor() {
		return nmCorretor;
	}

	public void setNmCorretor(String nmCorretor) {
		this.nmCorretor = nmCorretor;
	}

	public Integer getCdSucursal() {
		return cdSucursal;
	}

	public void setCdSucursal(Integer cdSucursal) {
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

	public Integer getCdEndosso() {
		return cdEndosso;
	}

	public void setCdEndosso(Integer cdEndosso) {
		this.cdEndosso = cdEndosso;
	}

	public Integer getCdClien() {
		return cdClien;
	}

	public void setCdClien(Integer cdClien) {
		this.cdClien = cdClien;
	}
	
	

}
