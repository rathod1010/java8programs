package java8project;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
public class ConsumerDemo {

	public static void main(String[] args) {
		
		
		//string to upper case
		
		Consumer<String> con = s->System.out.println(s.toUpperCase());
                 con.accept("Hello java");
                 
                 BiConsumer<String,String> con2 =(s1,s2)-> System.out.println(s1+s2);
                 con2.accept("Hello", "rATHOD");
                 
                 List<String> courses = new ArrayList<>();
                 
                 courses.add("java");
                 courses.add("html");
                 courses.add("python");
                 courses.add("sql");
                 String couseNamr ="sql";
                 
                 courses.forEach(c->
                 {
                	 System.out.println(c);
                 });
                 
	}

}
