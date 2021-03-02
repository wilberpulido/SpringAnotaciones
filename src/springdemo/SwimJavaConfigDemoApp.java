package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//load spring config file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class); 
		//retrieve bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		SwimCoach alphaCoach = context.getBean("swimCoach", SwimCoach.class);
		
		boolean result = (theCoach == alphaCoach);
		//print out result
		System.out.println("\n Pointing to the same object java config 2: " + result);
		
		System.out.println("\n Memory location for theCoach: " + theCoach);
		System.out.println("\n Memory location for theCoach: " + alphaCoach);
		
		// call our new method swim ...
		System.out.println(">> Email: " + theCoach.getEmail());
		System.out.println(">> Team:  " + theCoach.getTeam());
		
		
		//closed bean
		context.close();
	
	}

}
