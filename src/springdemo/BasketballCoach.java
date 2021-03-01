package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BasketballCoach() {
		System.out.println(">> BasketCoach: inside default constructor");
	}

	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> BasketCoach: inside setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice 30 minutes of three-point shooting";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
