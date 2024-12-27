public class Course {

	public String name;
	public int id;
	public float hours;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getHours() {
		return this.hours;
	}

	public void setHours(float hours) {
		this.hours = hours;
	}

	/**
	 * 
	 * @param name
	 * @param id
	 * @param hours
	 */
	public Course(String name, int id, float hours) {
		this.name = name;
		this.id = id;
		this.hours = hours;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "Course{" +
				"name='" + name + '\'' +
				", id=" + id +
				", hours=" + hours +
				'}';
	}

}