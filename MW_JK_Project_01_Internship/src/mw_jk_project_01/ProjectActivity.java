package mw_jk_project_01;

public class ProjectActivity extends Resume{
	//ATTRIBUTES
	
	private String title;
	private String category;
	private String dateCompleted;
	
	
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
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
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
