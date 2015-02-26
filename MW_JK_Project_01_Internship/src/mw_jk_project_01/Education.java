package mw_jk_project_01;

public class Education extends ResumeItems {
	private String institutionName;
	private String institutionCountry;
	private String yearCompleted;
	private String typeOfDegree;
	private String major;
	private String specialization;
	/**
	 * @param institutionName
	 * @param institutionCountry
	 * @param yearCompleted
	 * @param typeOfDegree
	 * @param major
	 * @param specialization
	 */
	public Education(String institutionName, String institutionCountry,
			String yearCompleted, String typeOfDegree, String major,
			String specialization) {
		super();
		this.institutionName = institutionName;
		this.institutionCountry = institutionCountry;
		this.yearCompleted = yearCompleted;
		this.typeOfDegree = typeOfDegree;
		this.major = major;
		this.specialization = specialization;
	}
	
	
	public Education(Education object2)
	{
		super();
		this.institutionName = object2.institutionName;
		this.institutionCountry = object2.institutionCountry;
		this.yearCompleted = object2.yearCompleted;
		this.typeOfDegree = object2.typeOfDegree;
		this.major = object2.major;
		this.specialization = object2.specialization;
	}


	/**
	 * @return the institutionName
	 */
	public String getInstitutionName() {
		return institutionName;
	}


	/**
	 * @param institutionName the institutionName to set
	 */
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}


	/**
	 * @return the institutionCountry
	 */
	public String getInstitutionCountry() {
		return institutionCountry;
	}


	/**
	 * @param institutionCountry the institutionCountry to set
	 */
	public void setInstitutionCountry(String institutionCountry) {
		this.institutionCountry = institutionCountry;
	}


	/**
	 * @return the yearCompleted
	 */
	public String getYearCompleted() {
		return yearCompleted;
	}


	/**
	 * @param yearCompleted the yearCompleted to set
	 */
	public void setYearCompleted(String yearCompleted) {
		this.yearCompleted = yearCompleted;
	}


	/**
	 * @return the typeOfDegree
	 */
	public String getTypeOfDegree() {
		return typeOfDegree;
	}


	/**
	 * @param typeOfDegree the typeOfDegree to set
	 */
	public void setTypeOfDegree(String typeOfDegree) {
		this.typeOfDegree = typeOfDegree;
	}


	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}


	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		this.major = major;
	}


	/**
	 * @return the specialization
	 */
	public String getSpecialization() {
		return specialization;
	}


	/**
	 * @param specialization the specialization to set
	 */
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\n\ttypeOfDegree: " + typeOfDegree
				+ "\n\tmajor: " + major 
				+ "\n\tinstitutionName: " + institutionName
				+ "\n\tyearCompleted: " + yearCompleted
				+"\n";
				
	}
	
	
	
	
}
