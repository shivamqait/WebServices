package com.qainfotech.service;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CommentAdd {
	private String author;
	private String Message;
	private int Msgid;
	
	public CommentAdd() {
		
	}
	
	public CommentAdd(String author, String Message, int Msgid) {
	   this.author = author;
	   this.Message = Message;
	   this.Msgid = Msgid;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String Message) {
		this.Message = Message;
	}
	public int getMsgid() {
		return Msgid;
	}
	public void setMsgid(int Msgid) {
		this.Msgid = Msgid;
	}
}
