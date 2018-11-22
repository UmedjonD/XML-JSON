package app;

import company.Category;
import stax.*;
import JaxbUnmarshal.*;

import javax.xml.bind.JAXBException;
import java.util.List;

public class App {
    public static void main(String[] args) throws JAXBException {

        //XMLStAXReader.ReaderFile();
        JAXBuilder.unmarshalFile();
    }

}
