package java8project;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<Integer> predicate = x -> {

			if (x == 0 || x == 1) {

			} else {
				int count = 0;
				for (int i = 1; i <= x / 2; i++) {
					if (x % i == 0) {
						count++;
					}
				}
				if (count == 2) {
					return true;
				} else {
					return false;
				}
			}
			return false;
		};
		boolean result = predicate.test(8);
		System.out.println(result);

	}

}
