package app;

import JSON.Json;
import JaxbUnmarshal.*;
import company.Category;
import company.Categorys;
import company.Company;
import company.Product;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws JAXBException, IOException, XMLStreamException {

        JAXBuilder jaxBuilder = new JAXBuilder();
        Json json = new Json();
        System.out.println("Перевели из XML в объекта");
        System.out.println(JAXBuilder.unmarshalFile().toString());
        System.out.println("Перевели из Объекта в Json");
        json.fromJaxbToJson();
        System.out.println("Из Json в Object");
        Company company = json.fromJsontoObject("src\\file\\company.json");
        System.out.println("Из Объекта в XML");
        json.fromObjecttoXML(company);


        for (Categorys categorys: jaxBuilder.unmarshalFile()){
            System.out.println("*************************************");
            System.out.println("КАТЕГОРИЯ " + categorys.getName());
            for (Category category : categorys.getCategory()) {
                System.out.println("**********************************");
                System.out.println("Подкатегория " + category.getName());
                for (Product product : category.getProducts()){
                    System.out.println("**********ПРОДУКТЫ***************");
                    System.out.println("имя продукта: " + product.getName());
                    System.out.println("модель: " + product.getModel());
                    System.out.println("дата: " + product.getDate());
                    System.out.println("цвет: " + product.getColor());
                    System.out.println("цена: " + product.getPrice());
                }
            }

        }

    }

}
