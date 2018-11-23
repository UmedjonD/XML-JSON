//package stax;
//
//import app.App;
//import company.Product;
//
//import javax.xml.namespace.QName;
//import javax.xml.stream.XMLEventReader;
//import javax.xml.stream.XMLInputFactory;
//import javax.xml.stream.events.Attribute;
//import javax.xml.stream.events.StartElement;
//import javax.xml.stream.events.XMLEvent;
//import java.io.FileInputStream;
//import java.util.ArrayList;
//import java.util.List;
//
//public class XMLStaxReaderParcer {
//    App app = new App();
//
//    private static List<Product> parseXML(String fileName) {
//
//        List<Product> categoryList = new ArrayList<>();
//        Product category = null;
//        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
//
//        try{
//            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new
//                    FileInputStream(fileName));
//            while (xmlEventReader.hasNext()){
//                XMLEvent xmlEvent = xmlEventReader.nextEvent();
//                if (xmlEvent.isStartElement()){
//                    StartElement startElement = xmlEvent.asStartElement();
//                    if(startElement.getName().getLocalPart().equals("Product")){
//                        category = new Product();
//
//                        Attribute attribute = startElement.getAttributeByName(new QName("categorysName"));
//
//                        if(attribute != null){
//                            category.setCategorysName(String.);
//                        }
//                    }
//                }
//            }
//        }
//
//    }
//
//}
