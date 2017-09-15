package org.omc.seguro;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;


public class ApoliceEntityPK implements Serializable {	
	
	
	private static final long serialVersionUID = -3174200950091279419L;
	
	@Id
	@Column(name = "TP_HISTO_APOLI")
	public String tpHistoApoli;

	@Id
	@Column(name = "CD_APOLI")
	public Long cdApoli;
	
	
	



	public ApoliceEntityPK(String tpHistoApoli, Long cdApoli) {
		super();
		this.tpHistoApoli = tpHistoApoli;
		this.cdApoli = cdApoli;
	}

	public ApoliceEntityPK() {
		// TODO Auto-generated constructor stub
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

	
	
	

}
