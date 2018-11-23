package company;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Company {
    @XmlElement(name = "categorys")
    private List<Categorys> categorys = new ArrayList<>();

    public Company() {
    }

    public Company(List<Categorys> categorys) {
        this.categorys = categorys;
    }

    public List<Categorys> getCategorys() {
        return categorys;
    }

    public void setCategorys(List<Categorys> categorys) {
        this.categorys = categorys;
    }

    @Override
    public String toString() {
        return "Company{" +
                "categorys=" + categorys +
                '}';
    }
}
