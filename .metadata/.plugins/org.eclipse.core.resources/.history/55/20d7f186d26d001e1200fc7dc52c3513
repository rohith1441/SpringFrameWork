package business;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
class MyMangoDbServive implements DataService{

	@Override
	public int[] reterivedata() {
		return new int[] {11,22,33,44,55};
	}
	
}


@Component
@Qualifier("sql")
class MySQLDataService implements DataService{

	@Override
	public int[] reterivedata() {
		return new int[] {1,2,3,4,5};
	}
	
}

@Configuration
@ComponentScan
public class BusinessCalculationService {
	DataService dataService;
	@Autowired
	public BusinessCalculationService(@Qualifier("sql")DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	public int findMax() {
		return Arrays.stream(dataService.reterivedata()).max().orElse(0);
	}
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(BusinessCalculationService.class);
		var max = context.getBean(BusinessCalculationService.class);
		System.out.println(max.findMax());
	}

}
