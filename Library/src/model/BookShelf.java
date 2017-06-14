package model;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
	private String Author;
	private String Type;
	private List<Book> books;
	
	public BookShelf(String Author,String Type){
		this.Author = Author;
		this.Type = Type;
		books = new ArrayList<>();
	}
	
	public void addBook(Book book){
		if(validate(book)){
			books.add(book);
		}
	}

	private boolean validate(Book book) {
		
		AuthorSpecification authors = new AuthorSpecification(Author);
		TypeSpecification types = new TypeSpecification(Type);
		return (authors.isSatisfiedBy(book) && types.isSatisfiedBy(book));
	}
	
	public List<Book> getBooks(){
		return books;
	}

}
