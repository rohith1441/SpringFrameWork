package practice_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class mother_of_all {
	calculations calculations_iCalculations;
	public mother_of_all(@Qualifier("productQualifier")calculations calculations_iCalculations) {
		this.calculations_iCalculations = calculations_iCalculations;
	}
	
	public void calculate() {
		calculations_iCalculations.ans();
	}

}
