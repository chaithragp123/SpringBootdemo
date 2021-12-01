package com.example.demo.pojo;

public class Author {
    private int id;
    private String name;
    private String genre;
     public Author() {
    	 
     }
	public Author(int id, String name, String genre) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
     
}
