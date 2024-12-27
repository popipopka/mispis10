public class Main {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		University university = new University();

		Employee dean = new AdministrativeEmployee(546, "Александр Губанович", "guba@example.com");

		Faculty faculty = new Faculty("Факультет бабушкиных программистов", dean);
		university.addFaculty(faculty);

		Institute institute = new Institute("Маленькие программисты", "Московский проспект, д. 60");
		faculty.addInstitute(institute);

		ResearchAssociate researcher = new ResearchAssociate(666, "Губан Александрович", "alex@example.com", "Теория информации");
		institute.setResearchAssociate(researcher);

		university.displayFaculties();
		faculty.displayInstitutes();
	}

}