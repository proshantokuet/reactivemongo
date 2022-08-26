package com.proshanto.reactivemongo.conversion;



@FunctionalInterface
public interface ProductConverter<S,T> {
	public T map(S s);
}
