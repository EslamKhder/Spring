package com.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ioc.Sport;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		User user = new User();
		user.setEmail("eslam@yahoo.com");
		user.setTeam("ICBC");
		System.out.println(user.getEmail() + "  " + user.getTeam());
		Person person = new Person();
		User user = new User();
		user.setPerson(person);
		user.getPerson();
		*/
		/*
		 *   --------
		 *   "Eslam"
		 *   --------
		 * */
		// load the spring configuration file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		UserInterface user = context.getBean("user",UserInterface.class);
		
		// retrieve bean from spring container
		//UserInterface user2 = context.getBean("user",UserInterface.class);
			
		//System.out.println(user1);
		//System.out.println(user2);

		//System.out.println(user1 == user2);
		// call methods on the bean
		System.out.println(user.getEmail() + "  " + user.getTeam());
		/*
		// retrieve bean from spring container
		PersonInterface person = context.getBean("person",PersonInterface.class);
		// call methods on the bean
		person.begain();
		*/
		
		// close the context
		context.close();
	}
}
