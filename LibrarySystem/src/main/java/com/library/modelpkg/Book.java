package com.library.modelpkg;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name= "lib_tbl")
public class Book {
	@Id
	private long id;
	private String book_name;
	private String author;
	@Temporal(TemporalType.DATE)
	private Date purchase_date;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBookname() {
		return book_name;
	}
	public void setBookname(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getPurchaseDate() {
		return purchase_date;
	}
	public void setPurchaseDate(Date purchase_date) {
		this.purchase_date = purchase_date;
	}
}
