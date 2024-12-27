import java.util.*;

public class Faculty {

    public String name;
    public Employee dean;
    private Collection<Institute> institutes;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getDean() {
        return this.dean;
    }

    public void setDean(Employee dean) {
        this.dean = dean;
    }

    /**
     *
     * @param name
     * @param dean
     */
    public Faculty(String name, Employee dean) {
        this.name = name;
        this.dean = dean;
        this.institutes = new ArrayList<>();
    }

    /**
     *
     * @param institute
     */
    public void addInstitute(Institute institute) {
        this.institutes.add(institute);
    }

    public void displayInstitutes() {
        institutes.forEach(institute -> System.out.println(institute.getName()));
    }

}