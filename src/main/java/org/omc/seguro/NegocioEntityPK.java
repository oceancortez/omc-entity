package org.omc.seguro;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;


public class NegocioEntityPK implements Serializable {	
	
	
	private static final long serialVersionUID = -3174200950091279419L;

	@Id
	@Column(name="CD_NGOCO", nullable=false)	
	public Long cdNgoco;
	
	@Id
	@Column(name = "TP_HISTO_NGOCO")
	public String tpHistoNgoco;
	

	public NegocioEntityPK(Long cdNgoco, String tpHistoNgoco) {
		super();
		this.cdNgoco = cdNgoco;
		this.tpHistoNgoco = tpHistoNgoco;
	}

	public NegocioEntityPK() {
		// TODO Auto-generated constructor stub
	}

	public Long getCdNgoco() {
		return cdNgoco;
	}

	public void setCdNgoco(Long cdNgoco) {
		this.cdNgoco = cdNgoco;
	}

	public String getTpHistoNgoco() {
		return tpHistoNgoco;
	}

	public void setTpHistoNgoco(String tpHistoNgoco) {
		this.tpHistoNgoco = tpHistoNgoco;
	}

	
	
	

}
