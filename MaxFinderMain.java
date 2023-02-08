package java8project;

public class MaxFinderMain {

	public static void main(String[] args) {
		MaxFinder maxFinder = (a,b)->
		{
			int max = a>b?a:b;
			return max;
		};
		
		int res= maxFinder.findMax(90,40);
		System.out.println("max  :"+res);

	}

}
