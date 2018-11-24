package JSON;
import JaxbUnmarshal.JAXBuilder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.jmx.remote.internal.Unmarshal;
import company.Company;

import javax.xml.stream.XMLStreamException;
import java.io.FileWriter;
import java.io.IOException;

public class Json {

    static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static   void fromJaxbToJson() throws IOException, XMLStreamException {

        Company company = new Company();
        JAXBuilder jaxBuilder = new JAXBuilder();

        FileWriter fileWriter = new FileWriter("src\\file\\company.json");
        company.setCategorys(jaxBuilder.unmarshalFile());

        gson.toJson(company, fileWriter);
        System.out.println(company);

    }
}
