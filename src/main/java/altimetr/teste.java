package altimetr;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream; 
public class teste {
	
	public static Optional<String> getGrade(int marks){
		Optional<String> grade = Optional.empty();
		if(marks > 50) {
			grade= Optional.of("PASS");
		}else {
			
			grade.of("FAIL");
		}
		
		return grade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

	System.out.println("new chnages done");
	
	Object v1= IntStream.rangeClosed(10,15)
			.boxed()
			.filter(s->s>12)
			.parallel()
			.findAny();
	
	Object v2= IntStream.rangeClosed(10,15)
			.boxed()
			.filter(s->s>12)
			.sequential()
			.findAny();
	

	
	List<String> list = new ArrayList<String>();
	list.add("some");
	list.add("steven");
	list.add("otro");

	
	
	Optional<String> value = list.stream().filter(s-> s.equals("steven")).findFirst();
	
	System.out.println(value);
}
}
