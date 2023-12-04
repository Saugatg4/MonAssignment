package com.skillstorm.reallifeprogrammer;

public class TestProgrammer extends Programmer{
	
	public static void main(String[] args) {
		
		Programmer programmer1 = new Programmer("Saugat", "SkillStorm", new String[]
				{"Java", "JavaScript"});
		System.out.println(programmer1);
		
		Programmer programmer2 = new Programmer("Tim", "Amazon", new String[]
				{"Python", "C++"});
		System.out.println(programmer2);
		
		programmer1.learnProgrammingLanguage("Python");
		programmer1.forgetProgrammingLanguage("JavaScript");
		
		System.out.println(programmer1);
		
		programmer2.learnProgrammingLanguage("Java");
		programmer2.forgetProgrammingLanguage("Python");
		
		System.out.println(programmer2);
		
		Programmer programmer3 = new Programmer("John", "Microsoft", new String[] 
				{"C#", "JavaScript", "Java"});
		System.out.println(programmer3);
		programmer3.learnProgrammingLanguage("SQL");
		programmer3.forgetProgrammingLanguage("JavaScript");
		System.out.println(programmer3);
		
	}
	
}