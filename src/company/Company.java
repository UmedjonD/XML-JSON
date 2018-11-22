package company;

import com.sun.xml.internal.txw2.annotation.XmlElement;

import java.util.List;
@XmlElement
public class Company {

    private String name;
    private List<Categorys> categorys;

    public Company() {
    }

    public Company(String name, List<Categorys> categorys) {
        this.name = name;
        this.categorys = categorys;
    }
    @XmlElement
    public String getName() {
        return name;
    }
    @XmlElement
    public void setName(String name) {
        this.name = name;
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
        return "Company{" +
                "name='" + name + '\'' +
                ", categorys=" + categorys +
                '}';
    }
}
