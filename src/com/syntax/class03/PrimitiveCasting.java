package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		double d=15/7;//widening (2.0)
		System.out.println(d);

		double e=9;//widening (9.0)
		System.out.println(e);
		
		//int num=9.89;error
		
		int i=(int)9.99;//narrowing (9)
		System.out.println(i);
		
		byte b=(byte)130;//narrowing (whatever value....)
		System.out.println(b);
	}
}
