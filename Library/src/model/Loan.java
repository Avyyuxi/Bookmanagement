package model;

import java.time.LocalDateTime;

public class Loan {

	private String Id;
	private LocalDateTime LoanDate;
	private LocalDateTime DateForReturn;
	private LocalDateTime ReturnDate;
	private Book Book;
	private Member Member;
	
	public boolean HasNotBeenReturned()
	{
		return ReturnDate == null;
	}
	
	public void MarkAsReturned()
	{
		ReturnDate = LocalDateTime.now();
	}
	
	public final String getId() {
		return Id;
	}
	public final void setId(String id) {
		Id = id;
	}
	public final LocalDateTime getLoanDate() {
		return LoanDate;
	}
	public final void setLoanDate(LocalDateTime loanDate) {
		LoanDate = loanDate;
	}
	public final LocalDateTime getDateForReturn() {
		return DateForReturn;
	}
	public final void setDateForReturn(LocalDateTime dateForReturn) {
		DateForReturn = dateForReturn;
	}
	public final LocalDateTime getReturnDate() {
		return ReturnDate;
	}
	public final void setReturnDate(LocalDateTime returnDate) {
		ReturnDate = returnDate;
	}
	public final Book getBook() {
		return Book;
	}
	public final void setBook(Book book) {
		Book = book;
	}
	public final Member getMember() {
		return Member;
	}
	public final void setMember(Member member) {
		Member = member;
	}
	
}
