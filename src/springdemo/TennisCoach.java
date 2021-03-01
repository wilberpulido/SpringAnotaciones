package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach  Constructor: inside default constructor");
	}
	
	@Autowired
	public TennisCoach(@Qualifier("RESTFortuneService") FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
