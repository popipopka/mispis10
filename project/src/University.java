import java.util.*;

public class University {

    private Collection<Faculty> faculties;

    public University() {
        this.faculties = new ArrayList<>();
    }

    /**
     * @param faculty
     */
    public void addFaculty(Faculty faculty) {
        this.faculties.add(faculty);
    }

    public void displayFaculties() {
        faculties.forEach(faculty -> System.out.println(faculty.getName()));
    }

}