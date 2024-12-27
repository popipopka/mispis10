public abstract class Employee {

	private final int ssn;
	public int ssNo;
	public String name;
	public String email;
	public int counter;

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param ssn
	 * @param name
	 * @param email
	 */
	public Employee(int ssn, String name, String email) {
		this.ssn = ssn;
		this.name = name;
		this.email = email;
	}

}