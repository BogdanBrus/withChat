package org.mvcedit.models;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="message")
public class Message extends Model implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Column
	private long time;
	@Column
	private String phoneWho;
	@Column
	private String phoneTo;
	@Column
	private String textMessage;
	
	public Message(){
		super();
	}
	
	public Message(String phoneWho, String phoneTo,String textMessage ){
		this.phoneWho = phoneWho;
		this.phoneTo = phoneTo;
		this.textMessage = textMessage;
		this.time = System.currentTimeMillis();
	}

	
	
	public String getPhoneWho() {
		return phoneWho;
	}

	public void setPhoneWho(String phoneWho) {
		this.phoneWho = phoneWho;
	}

	public String getPhoneTo() {
		return phoneTo;
	}

	public void setPhoneTo(String phoneTo) {
		this.phoneTo = phoneTo;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getTextMessage() {
		return textMessage;
	}

	public void setTextMessage(String textMessage) {
		this.textMessage = textMessage;
	}
	


	
	
	
	//create window dialog
	//writeToDB

}
