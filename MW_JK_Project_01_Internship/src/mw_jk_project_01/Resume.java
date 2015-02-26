package mw_jk_project_01;

import java.util.Arrays;

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
