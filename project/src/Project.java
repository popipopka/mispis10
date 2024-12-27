public class Project {

	public String name;
	public java.util.Date start;
	public java.util.Date end;
	public int hours;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.util.Date getStart() {
		return this.start;
	}

	public void setStart(java.util.Date start) {
		this.start = start;
	}

	public java.util.Date getEnd() {
		return this.end;
	}

	public void setEnd(java.util.Date end) {
		this.end = end;
	}

	public int getHours() {
		return this.hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "Project{" +
				"name='" + name + '\'' +
				", start=" + start +
				", end=" + end +
				", hours=" + hours +
				'}';
	}

	/**
	 * 
	 * @param name
	 * @param start
	 * @param end
	 * @param hours
	 */
	public Project(String name, java.util.Date start, java.util.Date end, int hours) {
		this.name = name;
		this.start = start;
		this.end = end;
		this.hours = hours;
	}

}