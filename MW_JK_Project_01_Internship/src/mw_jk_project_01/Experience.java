package mw_jk_project_01;

public class Experience extends ResumeItems {
	private String currentPosition;
	private String company;
	private String startdate;
	private String enddate;
	private String jobDescription;
	/**
	 * @param currentPosition
	 * @param company
	 * @param startdate
	 * @param enddate
	 * @param jobDescription
	 */
	public Experience(String currentPosition, String company,
			String startdate, String enddate, String jobDescription) {
		super();
		this.currentPosition = currentPosition;
		this.company = company;
		this.startdate = startdate;
		this.enddate = enddate;
		this.jobDescription = jobDescription;
	}
	
	
	public Experience( Experience object2)
	{
		super();
		this.currentPosition = object2.currentPosition;
		this.company = object2.company;
		this.startdate = object2.startdate;
		this.enddate = object2.enddate;
		this.jobDescription = object2.jobDescription;
	}


	/**
	 * @return the currentPosition
	 */
	public String getCurrentPosition() {
		return currentPosition;
	}


	/**
	 * @param currentPosition the currentPosition to set
	 */
	public void setCurrentPosition(String currentPosition) {
		this.currentPosition = currentPosition;
	}


	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}


	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}


	/**
	 * @return the startdate
	 */
	public String getStartdate() {
		return startdate;
	}


	/**
	 * @param startdate the startdate to set
	 */
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}


	/**
	 * @return the enddate
	 */
	public String getEnddate() {
		return enddate;
	}


	/**
	 * @param enddate the enddate to set
	 */
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}


	/**
	 * @return the jobDescription
	 */
	public String getJobDescription() {
		return jobDescription;
	}


	/**
	 * @param jobDescription the jobDescription to set
	 */
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "currentPosition: " + currentPosition
				+ "\n\tcompany: " + company + "\n\tstartdate: "
				+ startdate
				+ "\n";
	}
	
	
	
}
