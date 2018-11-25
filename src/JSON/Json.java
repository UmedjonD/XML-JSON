package JSON;
import JaxbUnmarshal.JAXBuilder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import company.Company;

import javax.xml.stream.XMLStreamException;
import java.io.*;
import java.util.List;

public class Json {

    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    //перевод из объекта в Json
    public static   void fromJaxbToJson() throws IOException  {

        Company company = new Company();
        JAXBuilder jaxBuilder = new JAXBuilder();

        try (FileWriter fileWriter = new FileWriter("src\\file\\company.json")) {
            company.setCategorys(jaxBuilder.unmarshalFile());
            gson.toJson(company, fileWriter);
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
        System.out.println(company);
    }

    //перевод из json в объект
    public static Company fromJsontoObject(String toObject){

        Company company = new Company();
        Gson gson = new Gson();

        try {
            Reader reader = new FileReader(toObject);
            company = gson.fromJson(reader, Company.class);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return company;
    }

    public static Company fromObjecttoXML(Company company){
        
        return  null;
    }

}
