package mw_jk_project_01;



public class SkillsTraining extends ResumeItems {
	//ATTRIBUTES
	private String title;
	private String category;
	private String dateCompleted;

	//CONSTRUCTORS
	/**
	 * @param title
	 * @param category
	 * @param dateCompleted
	 */
	public SkillsTraining(String title, String category) {
		super();
		this.title = title;
		this.category = category;
		this.dateCompleted = "";
	}

	public SkillsTraining(String title, String category, String dateCompleted) {
		super();
		this.title = title;
		this.category = category;
		this.dateCompleted = dateCompleted;
	}
	
	public SkillsTraining (SkillsTraining object2)
	{
		super();
		this.title = object2.title;
		this.category = object2.category;
		this.dateCompleted = object2.dateCompleted;
	}




	//METHODS
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
	//@Override
	public String toString() {
		if(dateCompleted.isEmpty())
		{
			return "SkillsTraining \n\ttitle: " + title
				+ "\n\tcategory: " + category;
		}
		else
		{
			return "SkillsTraining \n\ttitle: " + title
					+ "\n\tcategory: " + category
					+ "\n\tdateCompleted: " + dateCompleted
					+ "\n";
		}
			
		//return "test";
				
	}






}
