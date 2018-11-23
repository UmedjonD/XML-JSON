package JaxbUnmarshal;

import company.Company;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBuilder {


    public static void unmarshalFile()  {

            try {
                File file = new File("src\\file\\company.xml");
                JAXBContext context = JAXBContext.newInstance(Company.class);

                Unmarshaller unmarshaller = context.createUnmarshaller();
                Company product = (Company) unmarshaller.unmarshal(file);
                System.out.println(product.getCategorys());

//                System.out.println(product.getColor());
//                System.out.println(product.getPrice());

            } catch (JAXBException e){
                e.printStackTrace();
            }
        }

}

