import java.util.List;

public class Company {
    private int id;
    private List<Departments> departments;

    public Company() {
    }

    public Company(int id, List<Departments> departments) {
        this.id = id;
        this.departments = departments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Departments> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Departments> departments) {
        this.departments = departments;
    }
}
