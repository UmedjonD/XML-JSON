package company;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Categorys {

    @XmlAttribute
    private String name;
    @XmlElement(name = "category")
    private List<Category> category = new ArrayList<>();


    public Categorys() {
    }

    public Categorys(String name, List<Category> category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Categorys{" +
                "name='" + name + '\'' +
                ", category=" + category +
                '}';
    }
}

