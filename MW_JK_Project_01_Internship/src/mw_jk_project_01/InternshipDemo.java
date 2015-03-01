/**
 * 
 */
package mw_jk_project_01;

import java.util.Calendar;

/**
 * @author firefly48
 *
 */
public class InternshipDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Applicants marcus = new Applicants("Marcus", "Wood", "mearlwood48@siu.edu", "test123456789", 
				"123-456-7899", "258 Main St", "Carbondale",  "IL" , "62901" );
		Applicants jori = new Applicants("Jori", "Krasner", "kraznerj@siu.edu", "test123456789", 
				"123-456-7890", "625 Wham Drive", "Carbondale",  "IL" , "62901" );

		Resume marcus_security = new Resume("marcus_security");
		Resume marcus_programming = new Resume("marcus_programming");
		
		Resume jori_networking = new Resume("jori_networking");
		Resume jori_programming = new Resume("jori_programming");		
		
		ResumeItems mw_ed1 = new Education("SIUC", "USA", "2015", 2, "IST", "Security");
		ResumeItems jk_ed1 = new Education("SIUC", "USA", "2016", 2, "IST", "Security");
		
		ResumeItems mw_ex = new Experience("UGA", "SIUC", "08/15/2013" , "08/15/2015", "Technician");
		ResumeItems jk_ex = new Experience("Student Worker", "SIUC", "08/15/2013", "08/15/2015", "Technician");
		ResumeItems mw_ex2 = new Experience("President", "America", "08/15/2012" , "08/15/2013", "El Presidente");
		ResumeItems jk_ex2 = new Experience("PIMP", "Streets", "08/15/2012", "08/15/2013", "Security");
		
		SkillsTraining mw_sk = new SkillsTraining("PaloAlto", "technical");
		SkillsTraining jk_sk = new SkillsTraining("Proxmox", "technical");
		SkillsTraining mw_sk2 = new SkillsTraining("Wireless", "technical");
		SkillsTraining jk_sk2 = new SkillsTraining("Finance", "technical");
		
		ProjectActivity mw_pr = new ProjectActivity("Security Dawgs", "SIUC", "02/25/2015");
		ProjectActivity jk_pr = new ProjectActivity("CASA Ambassadors", "SIUC", "02/25/2015");
		
		marcus_security.addResumeItem(mw_ed1);
		marcus_security.addResumeItem(mw_ex);
		marcus_security.addResumeItem(mw_sk);
		marcus_security.addResumeItem(mw_pr);
		
		marcus_programming.addResumeItem(mw_ed1);
		marcus_programming.addResumeItem(mw_ex);
		marcus_programming.addResumeItem(mw_sk);
		marcus_programming.addResumeItem(mw_pr);
		
		marcus.addResume(marcus_programming);
		marcus.addResume(marcus_security);
		marcus.addResume(marcus_security);
		
		
		//System.out.println(marcus_security.totalYearsofExperience());
		
		System.out.println(marcus.get);
	}

}
