package company;

import com.sun.xml.internal.txw2.annotation.XmlElement;

import java.util.List;

@XmlElement
public class Categorys {

    private String firstName;
    private String secondName;
    private List<Categorys> categorys;


    public Categorys() {
    }

    public Categorys(String firstName, String secondName, List<Categorys> categorys) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.categorys = categorys;
    }
    @XmlElement
    public String getFirstName() {
        return firstName;
    }
    @XmlElement
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @XmlElement
    public String getSecondName() {
        return secondName;
    }
    @XmlElement
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    @XmlElement
    public List<Categorys> getCategorys() {
        return categorys;
    }
    @XmlElement
    public void setCategorys(List<Categorys> categorys) {
        this.categorys = categorys;
    }
    @XmlElement
    @Override
    public String toString() {
        return "Categorys{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", categorys=" + categorys +
                '}';
    }
}

