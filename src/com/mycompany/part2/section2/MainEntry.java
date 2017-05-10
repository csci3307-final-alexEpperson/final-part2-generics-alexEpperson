/**
 * 
 */
package com.mycompany.part2.section2;

/**
 * @author green
 *
 */
public class MainEntry 
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		MyGenInterface mgi1 = new MyGenClass(1, "yourName");
		MyGenInterface mgi2 = new MyGenClass(1, 2017);
		Integer i1 = MyRegularClass.getSum(10, 20);
		Float f1 = MyRegularClass.getSum(100f, 200f);
		System.out.printf("mgi1 Key: %d mgi1 Value: %s%n", mgi1.getKey(), mgi1.getValue());
		System.out.printf("mgi2 Key: %d mgi2 Value: %d%n", mgi2.getKey(), mgi2.getValue());
		System.out.printf("i1: %d f1: %f", i1, f1);

	}

}
