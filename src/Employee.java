import java.util.Date;

public class Employee {

    long id;
    String firstName;
    String lasttName;

    public enum PositionEnum{
        QA,
        BE,
        FE,
        HR
    }

    Date dareOfBirth;

    public Employee(long id, String firstName, String lasttName, Date dareOfBirth, PositionEnum position) {
        this.id = id;
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.dareOfBirth = dareOfBirth;
        this.position = position;
    }

    public String getLasttName() {
        return lasttName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }

    public Employee(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getDareOfBirth() {
        return dareOfBirth;
    }

    public void setDareOfBirth(Date dareOfBirth) {
        this.dareOfBirth = dareOfBirth;
    }

    private PositionEnum position;

    public PositionEnum getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lasttName='" + lasttName + '\'' +
                ", dareOfBirth=" + dareOfBirth +
                ", position=" + position +
                '}';
    }
}
