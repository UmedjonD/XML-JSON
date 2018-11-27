package JaxbUnmarshal;

import company.Categorys;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;
import java.util.ArrayList;
import java.util.List;

public class JAXBuilder {

    public static List<Categorys> unmarshalFile() throws  XMLStreamException {

        List<Categorys> categorysList = new ArrayList<>();

        XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
        StreamSource streamSource = new StreamSource("src\\file\\company.xml");
        XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(streamSource);
        xmlStreamReader.nextTag();

        while (!xmlStreamReader.isEndElement()){
            xmlStreamReader.nextTag();

            if (xmlStreamReader.getLocalName().equals("categorys")) {
                try {
                    JAXBContext context = JAXBContext.newInstance(Categorys.class);
                    Unmarshaller unmarshaller = context.createUnmarshaller();
                    JAXBElement <Categorys> jaxcom = unmarshaller.unmarshal(xmlStreamReader, Categorys.class);

                    Categorys categorys = jaxcom.getValue();
                    categorysList.add(categorys);

                } catch (JAXBException e) {
                    e.printStackTrace();
                }
            }
        }
        return categorysList;
    }


}

