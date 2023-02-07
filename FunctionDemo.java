package java8project;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
	
		Function<String,Integer> fun1 = x-> x.length();
		int eLen =fun1.apply("hello java");
		System.out.println("Length: "+eLen);
		
		//argyment is int[] and return sum of numbers 
		
		Function<Integer[],Integer> fun2 = x->
		{
			int sum =0;
			for(int i =0;i<x.length;i++)
			{
				sum=sum+x[i];
			}
			return sum;
		};
		
		int sumOfArray=fun2.apply(new Integer[] {10,20,30,40});
			System.out.println("sum:"+sumOfArray);
	

	}

}
