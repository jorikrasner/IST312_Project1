package mw_jk_project_01;

public class ProjectActivity extends ResumeItems{
	//ATTRIBUTES
	
	private String title;
	private String location;
	private String dateCompleted;
	
	
	
	/**
	 * @param title
	 * @param location
	 * @param dateCompleted
	 */
	public ProjectActivity(String title, String location, String dateCompleted) {
		super();
		this.title = title;
		this.location = location;
		this.dateCompleted = dateCompleted;
	}
	
	public ProjectActivity(ProjectActivity object2) {
		super();
		this.title = object2.title;
		this.location = object2.location;
		this.dateCompleted = object2.dateCompleted;
	}
	//
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the location
	 */
	public String getlocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setlocation(String location) {
		this.location = location;
	}
	/**
	 * @return the dateCompleted
	 */
	public String getDateCompleted() {
		return dateCompleted;
	}
	/**
	 * @param dateCompleted the dateCompleted to set
	 */
	public void setDateCompleted(String dateCompleted) {
		this.dateCompleted = dateCompleted;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\n\ttitle: " + title
				+ "\n\tdateCompleted: " + dateCompleted
				+ "\n";
	}
	
	
}
