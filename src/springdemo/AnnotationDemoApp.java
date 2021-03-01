package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml"); 
		//get the beam from spring container
		Coach theTennisCoach = context.getBean("tennisCoach", Coach.class);
		Coach theBasquetCoach = context.getBean("basketballCoach", Coach.class);
		Coach theSoccerCoach = context.getBean("soccerCoach", Coach.class);
		//call method on the beam
		System.out.println(theTennisCoach.getDailyWorkout());
		//call method on beam, getFortuneDay
		System.out.println(theTennisCoach.getDailyFortune());
		//call ,method on beam basquet
		System.out.println(theBasquetCoach.getDailyWorkout());
		System.out.println(theBasquetCoach.getDailyFortune());
		//call ,method on beam SoccerCoach
		System.out.println(theSoccerCoach.getDailyWorkout());
		System.out.println(theSoccerCoach.getDailyFortune());
		//close the context
		context.close();
	}

}
