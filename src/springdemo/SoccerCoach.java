package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {

	@Autowired
	@Qualifier("databaseFortuneService")
	private FortuneService fortuneService;

	public SoccerCoach() {
		System.out.println(">> SoccerCoach: inside default constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "30-minute walk";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
