package com.beans;


public class BookBean {
private String selfno,name,author,publisher;
private int quantity,issued;
public BookBean() {
	super();
	
}
public BookBean(String selfno, String name, String author, String publisher, int quantity) {
	super();
	this.selfno = selfno;
	this.name = name;
	this.author = author;
	this.publisher = publisher;
	this.quantity = quantity;
}
public String getSelfno() {
	return selfno;
}
public void setSelfno(String selfno) {
	this.selfno = selfno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getIssued() {
	return issued;
}
public void setIssued(int issued) {
	this.issued = issued;
}

}
