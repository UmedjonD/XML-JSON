package company;

import com.sun.xml.internal.txw2.annotation.XmlElement;

import java.util.Date;

@XmlElement
public class Category {

    private String categorysName;
    private String Name;
    private String model;
    private Date date;
    private String color;
    private int price;

    public Category() {
    }

    public Category(String categorysName, String name, String model, Date date, String color, int price) {
        this.categorysName = categorysName;
        Name = name;
        this.model = model;
        this.date = date;
        this.color = color;
        this.price = price;
    }
    @XmlElement
    public String getCategorysName() {
        return categorysName;
    }
    @XmlElement
    public void setCategorysName(String categorysName) {
        this.categorysName = categorysName;
    }
    @XmlElement
    public String getName() {
        return Name;
    }
    @XmlElement
    public void setName(String name) {
        Name = name;
    }
    @XmlElement
    public String getModel() {
        return model;
    }
    @XmlElement
    public void setModel(String model) {
        this.model = model;
    }
    @XmlElement
    public Date getDate() {
        return date;
    }
    @XmlElement
    public void setDate(Date date) {
        this.date = date;
    }
    @XmlElement
    public String getColor() {
        return color;
    }
    @XmlElement
    public void setColor(String color) {
        this.color = color;
    }
    @XmlElement
    public int getPrice() {
        return price;
    }
    @XmlElement
    public void setPrice(int price) {
        this.price = price;
    }
    @XmlElement
    @Override
    public String toString() {
        return "Category{" +
                "categorysName='" + categorysName + '\'' +
                ", Name='" + Name + '\'' +
                ", model='" + model + '\'' +
                ", date=" + date +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
