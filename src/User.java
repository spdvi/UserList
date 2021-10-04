import java.time.LocalDate;
import java.lang.StringBuilder;
import java.time.LocalDateTime;

/**
 *
 * @author DevMike
 */
public class User {
    private String Id;
    private String FirstName;
    private String LastName;
    private LocalDate BirthDate;
    private boolean Gender;

    public User(String Id, String FirstName, String LastName, LocalDate BirthDate, boolean Gender) {
        this.Id = Id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.BirthDate = BirthDate;
        this.Gender = Gender;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(LocalDate BirthDate) {
        this.BirthDate = BirthDate;
    }

    public boolean isGender() {
        return Gender;
    }

    public void setGender(boolean Gender) {
        this.Gender = Gender;
    }
    
    public String toString(){
        StringBuilder strUser = new StringBuilder();
        strUser.append(this.Id + ": " + this.LastName + ", " + this.FirstName + " - ");
        int age = LocalDateTime.now().getYear() - this.BirthDate.getYear();
        strUser.append(age);
        return strUser.toString();
    }
    
}
