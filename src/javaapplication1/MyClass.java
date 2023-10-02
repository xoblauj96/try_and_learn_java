/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author stl_sdd_sor
 */
import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;

public class MyClass {

    public static void main(String[] args) {

        try {

            String strXML1 = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"
                    + "   <soapenv:Body>\n"
                    + "      <ns:listPackageResponse xmlns:ns=\"http://AirTimeDataWS.airtimedata.itpro.com\" xmlns:ax21=\"http://AirTimeDataWS.airtimedata.itpro.com/xsd\">\n"
                    + "         <ns:return xsi:type=\"ax21:Package\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n"
                    + "            <ax21:idx>1</ax21:idx>\n"
                    + "            <ax21:name>UT1</ax21:name>\n"
                    + "            <ax21:price>1000</ax21:price>\n"
                    + "            <ax21:syntax>AP 1000</ax21:syntax>\n"
                    + "         </ns:return>\n"
                    + "         <ns:return xsi:type=\"ax21:Package\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n"
                    + "            <ax21:idx>2</ax21:idx>\n"
                    + "            <ax21:name>UT2</ax21:name>\n"
                    + "            <ax21:price>2000</ax21:price>\n"
                    + "            <ax21:syntax>AP 2000</ax21:syntax>\n"
                    + "         </ns:return>\n"
                    + "         <ns:return xsi:type=\"ax21:Package\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n"
                    + "            <ax21:idx>3</ax21:idx>\n"
                    + "            <ax21:name>UT3</ax21:name>\n"
                    + "            <ax21:price>3000</ax21:price>\n"
                    + "            <ax21:syntax>AP 3000</ax21:syntax>\n"
                    + "         </ns:return>\n"
                    + "         <ns:return xsi:type=\"ax21:Package\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n"
                    + "            <ax21:idx>4</ax21:idx>\n"
                    + "            <ax21:name>UT4</ax21:name>\n"
                    + "            <ax21:price>4000</ax21:price>\n"
                    + "            <ax21:syntax>AP 4000</ax21:syntax>\n"
                    + "         </ns:return>\n"
                    + "         <ns:return xsi:type=\"ax21:Package\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n"
                    + "            <ax21:idx>5</ax21:idx>\n"
                    + "            <ax21:name>UT5</ax21:name>\n"
                    + "            <ax21:price>5000</ax21:price>\n"
                    + "            <ax21:syntax>AP 5000</ax21:syntax>\n"
                    + "         </ns:return>\n"
                    + "         <ns:return xsi:type=\"ax21:Package\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n"
                    + "            <ax21:idx>6</ax21:idx>\n"
                    + "            <ax21:name>UT10</ax21:name>\n"
                    + "            <ax21:price>10000</ax21:price>\n"
                    + "            <ax21:syntax>AP 10000</ax21:syntax>\n"
                    + "         </ns:return>\n"
                    + "      </ns:listPackageResponse>\n"
                    + "   </soapenv:Body>\n"
                    + "</soapenv:Envelope>";

            File wrtToXML = new File("C:\\Users\\IT\\Documents\\NetBeansProjects\\JavaApplication1\\src\\javaapplication1\\data.xml");
            FileWriter writer;
            try {
                writer = new FileWriter(wrtToXML);
                writer.write(strXML1);
                writer.close();
                System.out.println("=========================Write success");
            } catch (Exception e) {
                e.printStackTrace();
            }

            File strXML = new File("C:\\Users\\IT\\Documents\\NetBeansProjects\\JavaApplication1\\src\\javaapplication1\\data.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbf.newDocumentBuilder();
//			Document doc = dBuilder.parse(strXML);
            Document doc = convertStringToXMLDocument(strXML1);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("ns:return");

            ArrayList<HashMap<String, String>> myArrList = new ArrayList<HashMap<String, String>>();
            HashMap<String, String> map;

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element ele = (Element) nNode;
                    map = new HashMap<String, String>();
                    map.put("ImageID", ele.getElementsByTagName("ax21:idx")
                            .item(0).getTextContent());
                    map.put("ItemID", ele.getElementsByTagName("ax21:name")
                            .item(0).getTextContent());
                    map.put("ImagePath", ele.getElementsByTagName("ax21:price")
                            .item(0).getTextContent());
                    map.put("Link", ele.getElementsByTagName("ax21:syntax").item(0)
                            .getTextContent());
                    myArrList.add(map);
                }
            }

            // * Print Result *//
            for (int i = 0; i < myArrList.size(); i++) {

                String sImageID = myArrList.get(i).get("ImageID").toString();
                String sItemID = myArrList.get(i).get("ItemID").toString();
                String sImagePath = myArrList.get(i).get("ImagePath")
                        .toString();
                String sLink = myArrList.get(i).get("Link").toString();

                System.out.println("ImageID = " + sImageID);
                System.out.println("ItemID = " + sItemID);
                System.out.println("ImagePath = " + sImagePath);
                System.out.println("Link = " + sLink);
                System.out.println("=========================");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static Document convertStringToXMLDocument(String xmlString) {
        //Parser that produces DOM object trees from XML content
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        //API to obtain DOM Document instance
        DocumentBuilder builder = null;
        try {
            //Create DocumentBuilder with default configuration
            builder = factory.newDocumentBuilder();

            //Parse the content to Document object
            Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
            return doc;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
