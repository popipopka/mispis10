public class ResearchAssociate extends Employee {

	private String fieldOfStudy;

	public String getFieldOfStudy() {
		return this.fieldOfStudy;
	}

	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	/**
	 * 
	 * @param ssn
	 * @param name
	 * @param email
	 * @param fieldOfStudy
	 */
	public ResearchAssociate(int ssn, String name, String email, String fieldOfStudy) {
		super(ssn, name, email);
		this.fieldOfStudy = fieldOfStudy;
	}

}