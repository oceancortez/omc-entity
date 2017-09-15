package org.omc.seguro;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;


public class ItemEntityPK implements Serializable {	
	
	
	private static final long serialVersionUID = -3174200950091279419L;

	@Id
	@Column(name = "CD_ITEM")
	public Long cdItem;
	
	@Id
	@Column(name = "TP_HISTO_ITEM")
	private String tpHistoItem;



	public ItemEntityPK(Long cdItem, String tpHistoItem) {
		super();
		this.cdItem = cdItem;
		this.setTpHistoItem(tpHistoItem);
	}

	public ItemEntityPK() {
		// TODO Auto-generated constructor stub
	}


	public Long getCdItem() {
		return cdItem;
	}

	public void setCdItem(Long cdItem) {
		this.cdItem = cdItem;
	}

	public String getTpHistoItem() {
		return tpHistoItem;
	}

	public void setTpHistoItem(String tpHistoItem) {
		this.tpHistoItem = tpHistoItem;
	}

	
	
	

}
