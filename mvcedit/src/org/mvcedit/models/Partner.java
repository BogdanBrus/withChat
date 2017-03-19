package org.mvcedit.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="partners")
public class Partner extends Visitor implements Serializable {// extends Model
	
	private static final long serialVersionUID = 1L;

	public Partner() {
		super();
	}
	
	@Column
	private String bankUser;
	@Column
	private String vk;
	@Column
	private String facebook;
	@Column
	private String site;
	@Column
	private String techniks;
	@Column
	private String oSebe;
	
	
	
	public String getBankUser() {
		return bankUser;
	}
	public void setBankUser(String bankUser) {
		this.bankUser = bankUser;
	}
	public String getVk() {
		return vk;
	}
	public void setVk(String vk) {
		this.vk = vk;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getTechniks() {
		return techniks;
	}
	public void setTechniks(String techniks) {
		this.techniks = techniks;
	}
	public String getoSebe() {
		return oSebe;
	}
	public void setoSebe(String oSebe) {
		this.oSebe = oSebe;
	}

	
	
}
