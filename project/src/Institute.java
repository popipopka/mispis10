public class Institute {

	public String name;
	public String address;
	public ResearchAssociate researchAssociate;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setResearchAssociate(ResearchAssociate researchAssociate) {
		this.researchAssociate = researchAssociate;
	}

	/**
	 * 
	 * @param name
	 * @param address
	 */
	public Institute(String name, String address) {
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Institute{" +
				"name='" + name + '\'' +
				", address='" + address + '\'' +
				'}';
	}

}