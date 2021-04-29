package XML_dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

public class TestDom4j {
    @Test
    public void  test1() throws DocumentException {
        SAXReader  saxReader=new SAXReader();
        Document document = saxReader.read("src/main/java/poji/books.XML");
        System.out.println(document);

    }
    @Test
    public void  test2() throws DocumentException {
        //获得SAX解析输入流
        SAXReader  saxReader=new SAXReader();
        //输入流读文件，获得DOM对象
        Document document = saxReader.read("src/main/java/poji/books.XML");
       // System.out.println(document);
        //DOM对象获得根元素
        Element rootElement = document.getRootElement();
      //  System.out.println(rootElement.asXML());

        List<Element> elements = rootElement.elements();

        for(Element book: elements)  {
            String name = book.elementText("name");
            String price = book.elementText("price");
            String author = book.elementText("author");
            String sn = book.attributeValue("sn");

            System.out.println(new Book(sn, name, new BigDecimal(price), author));

        }


    }
}
