package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTester {
	
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		Integer sum1 = integers.stream()
		  .reduce(0, (a, b) -> a + b);
		System.out.println(sum1);
		
		Item item1 = new Item(1, 10 , 1);
		Item item2 = new Item(2, 15 , 2);
		Item item3 = new Item(3, 25, 1);
		Item item4 = new Item(4, 40 , 2);
		        
		List<Item> items = Arrays.asList(item1, item2, item3, item4);
		
		
		Integer sum2 = items.stream()
			.map(x -> x.getPrice())
			.reduce(0, ArithmeticUtils::add);
		System.out.println(sum2);
		
		Integer sum3 = items.stream()
		  .map(x -> x.getPrice())
		  .reduce(0, Integer::sum);
		System.out.println(sum3);
		
		Integer sum4 = items.stream()
		  .map(item -> item.getPrice())
		  .reduce(0, (a, b) -> a + b);
		
		System.out.println(sum4);
		
		Integer sum5 = items.stream()
		  .map(x -> x.getPrice())
		  .collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sum5);
		
		Integer sum6 =items.stream()
		  .mapToInt(x -> x.getPrice())
		  .sum();
		System.out.println(sum6);
		
		Integer sum7 =items.stream()
				  .filter(x -> x.getCategory() == 1)
				  .mapToInt(x -> x.getPrice())
				  .sum();
		System.out.println(sum7);
		
		List<Item> topTwo = items
				.stream()
				.sorted()
				.skip(items.size() - 2)
				.collect(Collectors.toList());
		
		topTwo.stream().forEach(System.out::println);
		
		List<Item> topTwoReverse = items
				.stream()
				.sorted(Comparator.reverseOrder())
				.limit(2)
				.collect(Collectors.toList());
		
		topTwoReverse.stream().forEach(System.out::println);
		
		
	}

}
