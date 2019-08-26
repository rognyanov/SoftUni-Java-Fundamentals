package com.rado.contracts;

public interface Article {
	//Fields
	String getTitle();
	String getContent();
	String getAuthor();
	
	//Methods
	void edit(String newContent);
	void changeAuthor(String newAuthor);
	void rename(String newTitle);
}
