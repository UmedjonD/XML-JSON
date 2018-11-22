package stax;

import org.xml.sax.helpers.XMLReaderFactory;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;


public class XMLStAXReader {
    public static  void ReaderFile(){
        try {

            XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
            XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(new FileInputStream("src\\file\\company.xml"));

            while (xmlStreamReader.hasNext()){
                int eventType = xmlStreamReader.getEventType();

                switch (eventType){

                    case XMLStreamReader.START_ELEMENT:
                        System.out.println("Start Element Name - "
                                + xmlStreamReader.getLocalName());

                        if (xmlStreamReader.getAttributeCount() > 0) {
                            System.out.println("Attributes: " + xmlStreamReader.getAttributeCount());

                            for (int i=0; i<xmlStreamReader.getAttributeCount(); i++)
                                System.out.println(xmlStreamReader.getAttributeLocalName(i)
                                        + " : " + xmlStreamReader.getAttributeValue(i));
                        }
                        break;
                    case XMLStreamReader.END_ELEMENT:
                        System.out.println("End Element Name - "
                                + xmlStreamReader.getLocalName());

                        break;
                    case XMLStreamReader.CHARACTERS:

                        if (!xmlStreamReader.getText().isEmpty())

                            System.out.println("Character Data - "
                                    + xmlStreamReader.getText());

                        break;
                }
                xmlStreamReader.next();
            }
            xmlStreamReader.close();


        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

}
