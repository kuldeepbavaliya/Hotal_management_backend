package com.Hotal.Error;

public class Notfound extends RuntimeException{

	public Notfound(int id) {
		super("Customer is not found "+id);
		
	}

}
