package JaxbUnmarshal;

import company.Category;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBuilder {

        public static void unmarshalFile() throws JAXBException {
            File file = new File("src\\file\\company.xml");
            JAXBContext context = JAXBContext.newInstance(Category.class);

            Unmarshaller unmarshaller = context.createUnmarshaller();
            Category product = (Category) unmarshaller.unmarshal(file);

            System.out.println(product.getCategorysName());
            System.out.println(product.getName());
            System.out.println(product.getModel());
            System.out.println(product.getDate());
            System.out.println(product.getColor());
            System.out.println(product.getPrice());
        }

}

