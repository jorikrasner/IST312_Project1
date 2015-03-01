package mw_jk_project_01;

import java.util.Arrays;
import java.util.Calendar;

public class Resume {
	private String name;
	private ResumeItems[] listOfResumeItems = new ResumeItems[0];
	/**
	 * @param name
	 * @param listOfResumeItems
	 */
	public Resume(String name) {

		this.name = name;

	}


	public Resume ()
	{

	}



	public Resume (Resume Object2) {

		this.name = Object2.name;
		for(int i = 0; i < Object2.listOfResumeItems.length;i++)
		{
			addResumeItem(Object2.listOfResumeItems[i]);
		}
	}

	public void addResumeItem(ResumeItems resumeItems)
	{
		ResumeItems[] temp = new ResumeItems[listOfResumeItems.length+1];
		for (int i=0; i < listOfResumeItems.length; i++){
			temp[i] = listOfResumeItems[i];
			temp[temp.length-1] = resumeItems;
		}
		listOfResumeItems = temp;

	}

	public int totalYearsofExperience(){
		double totalYearsOfExperience = 0;
		for (int i = 0; i < listOfResumeItems.length; i++){
			
			ResumeItems current = listOfResumeItems[i];
			
			if (current instanceof Experience){


				String startDate = ((Experience)current).getStartdate();
				String[] aStartDate = startDate.split("/"); 
				String year = aStartDate[2];
				int yearInt = Integer.parseInt(year);
				String month = aStartDate[0];
				int monthInt = Integer.parseInt(month);
				String date = aStartDate[1];
				int dateInt = Integer.parseInt(date);
				G
				Calendar start = Calendar.getInstance();
				start.set(yearInt, monthInt, dateInt);

				String endDate = ((Experience)current).getStartdate();
				String[] aEndDate = endDate.split("/"); 
				year = aEndDate[2];
				yearInt = Integer.parseInt(year);
				month = aEndDate[0];
				monthInt = Integer.parseInt(month);
				date = aEndDate[1];
				dateInt = Integer.parseInt(date);
				Calendar end = Calendar.getInstance();
				end.set(yearInt, monthInt, dateInt);
				
				long differenceInMilliSec = end.getTimeInMillis() - start.getTimeInMillis();
				double yearOfExperience =  (differenceInMilliSec/1000/3600/24/365.25);
				


				totalYearsOfExperience = totalYearsOfExperience + yearOfExperience;

				
			}
		}
		return (int)totalYearsofExperience();
	}

	public String numOfSkillsbycat(){
		return "test";
	}
	
	public String listOfCerts (){
		return "Test";
	}

	public String highestDegree (){
		int tempDegree = 0;
		for (int i = 0; i < listOfResumeItems.length; i++){
			ResumeItems current = listOfResumeItems[i];
			
			if (current instanceof Education){
				if (((Education) current).getTypeOfDegree() >= tempDegree)
				{
					tempDegree = ((Education) current).getTypeOfDegree();
				}
			}
		}
		return Education.getTypeOfDegreeString(tempDegree);
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the listOfResumeItems
	 */
	public ResumeItems[] getListOfResumeItems() {
		return listOfResumeItems;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Resume \n\tname: " + name
				+ "\n\tlistOfResumeItems: "
				+ listOfResumeItems;
	}



}
