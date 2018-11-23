package app;

import JaxbUnmarshal.*;

import javax.xml.bind.JAXBException;

public class App {
    public static void main(String[] args) throws JAXBException {

        //XMLStAXReader.ReaderFile();
        JAXBuilder.unmarshalFile();
    }

}
