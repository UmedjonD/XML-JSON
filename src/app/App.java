package app;

import JaxbUnmarshal.*;
import company.Category;
import company.Categorys;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) throws JAXBException, FileNotFoundException, XMLStreamException {

        //XMLStAXReader.ReaderFile();
        //JAXBuilder.unmarshalFile();
        System.out.println(JAXBuilder.unmarshalFile().toString());


    }

}
