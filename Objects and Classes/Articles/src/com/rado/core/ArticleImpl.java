package com.rado.core;

import com.rado.contracts.Article;

public final class ArticleImpl implements Article {

	private String _title;
	private String _content;
	private String _author;
	
	public ArticleImpl(String title, String content, String author) {
		_title = title;
		_content = content;
		_author = author;
	}

	@Override
	public String getTitle() {
		return _title;
	}

	@Override
	public String getContent() {
		return _content;
	}

	@Override
	public String getAuthor() {
		return _author;
	}

	@Override
	public void edit(String newContent) {
		_content = newContent==null ? "" : newContent;		
	}

	@Override
	public void changeAuthor(String newAuthor) {
		_author = newAuthor==null ? "" : newAuthor;	
	}

	@Override
	public void rename(String newTitle) {
		_title = newTitle==null ? "" : newTitle;	
	}

	@Override
	public String toString() {
		return String.format("%s - %s:%s", _title, _content, _author);
	}	
}