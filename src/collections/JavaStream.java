package collections;


import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> number = Arrays.asList(2,3,4,5,6);
		
		
		List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(square);
		
		List<String> names = Arrays.asList("Reflection", "Collections", "Stream");
		List<String> name = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
		System.out.println(name);
		
		
		List<String> sortedName = names.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedName);

		
		
		Set<Integer> square2 = number.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println(square2);
		
		
		number.stream().map(x->x*x).forEach(y->System.out.println(y));
		
		System.out.println("================EVEN=====================");
		int even = number.stream().filter(x -> x%2 == 0).reduce(0,(ans,i) -> ans+i);
		System.out.println(even);
		
		
		

	}

}
