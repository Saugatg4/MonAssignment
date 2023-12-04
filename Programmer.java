package com.skillstorm.reallifeprogrammer;

import java.util.Arrays;

public class Programmer {

	private String name;
	private String company;
	private String[] programmingLanguages;
	
	public Programmer() {
		
	}

	public Programmer(String name, String company, String[] programmingLanguages) {

		this.name = name;
		this.company = company;
		setProgrammingLanguages(programmingLanguages);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String[] getProgrammingLanguages() {
		return programmingLanguages.clone();
	}

	public void setProgrammingLanguages(String[] programmingLanguages) {
		if (programmingLanguages != null) {
			this.programmingLanguages = Arrays.stream(programmingLanguages)
					.filter(lang -> !lang.trim().isEmpty())
					.toArray(String[]::new);

		} else {
			this.programmingLanguages = new String[0];
		}

	}

	public void learnProgrammingLanguage(String language) {
		if (!language.trim().isEmpty()) {
			programmingLanguages = Arrays.copyOf(programmingLanguages, 
					programmingLanguages.length +1);
			programmingLanguages[programmingLanguages.length -1] =language;
		}

	}

	public void forgetProgrammingLanguage(String language) {
		programmingLanguages = Arrays.stream(programmingLanguages)
				.filter(lang -> !lang.equals(language))
				.toArray(String[]::new);

	}

	@Override
	public String toString() {
		return "Programmer [name=" + name + ", company=" + company + ", programmingLanguages="
				+ Arrays.toString(programmingLanguages) + "]";
	}

}
