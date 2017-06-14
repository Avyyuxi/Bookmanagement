package model;

public interface Specification<T> {

	public boolean isSatisfiedBy(T entity);
	
}
