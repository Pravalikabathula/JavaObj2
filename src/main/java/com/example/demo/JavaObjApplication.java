package com.example.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.pojo.StudentsList;

@SpringBootApplication
public class JavaObjApplication {
	
	public static void doXsltTransform( StreamSource sourceXml, StreamSource xslt, StreamResult resultXml ) throws TransformerException {
	    TransformerFactory transformerFactory = TransformerFactory.newInstance();
	    Transformer transformer = transformerFactory.newTransformer( xslt );
	    transformer.setOutputProperty( OutputKeys.ENCODING, "UTF-8" );
	    transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
	    transformer.transform( sourceXml, resultXml );
	}

	public static void main(String[] args) throws Exception  {
		SpringApplication.run(JavaObjApplication.class, args);

		try {
//			TransformerFactory tFactory = TransformerFactory.newInstance();
//
//			Source xslDoc = new StreamSource("src/main/resources/StudentList.xsl");
//			Source xmlDoc = new StreamSource("src/main/resources/StudentsList.xml");
//
//			String outputFileName = "../JavaObj2/src/main/resources/one.html";
//			System.out.println(outputFileName);
//
//			OutputStream htmlFile = new FileOutputStream(outputFileName);
//			Transformer trasform = tFactory.newTransformer(xslDoc);
//			trasform.transform(xmlDoc, new StreamResult(htmlFile));
			
			FileInputStream xml = new FileInputStream("src/main/resources/StudentsList.xml");  
			FileInputStream xsl = new FileInputStream("src/main/resources/StudentList.xsl");
			FileOutputStream out = new FileOutputStream("src/main/resources/one.html");

			Source xmlDoc =  new StreamSource(xml);
			Source xslDoc =  new StreamSource(xsl);
			Result result =  new StreamResult(out);
			
			TransformerFactory factory = TransformerFactory.newInstance();            
			Transformer trans = factory.newTransformer(xslDoc);
			trans.transform(xmlDoc, result);
			
//			InputStream inputStream = new FileInputStream("src/main/resources/StudentsList.xml");
//				    OutputStream out = new FileOutputStream("src/main/resources/one.html"); // where you want to write the XML/HTML
//
//				    StreamSource sourceXml = new StreamSource( inputStream );
//				    StreamSource xslt = new StreamSource( inpStreamOfYourXSLT );
//				    StreamResult resultXml = new StreamResult( out );
//				    doXsltTransform( sourceXml, xslt, resultXml );
			
//			 String xmlFile = "src/main/resources/StudentsList.xml";
//			    Scanner scanner = new Scanner(new File(xmlFile)).useDelimiter("\\Z");
//			    String xmlContent = scanner.next();
//			    xmlContent = xmlContent.trim().replaceAll("<","&lt;").replaceAll(">","&gt;").replaceAll("\n", "<br />").replaceAll(" ", "&nbsp;");
//			    PrintWriter out = new PrintWriter(xmlFile+".html");
//			    out.println("<html><body>" + xmlContent + "</body></html>");
//			    scanner.close();
//			    out.close();
			
			
//			TransformerFactory tFactory = TransformerFactory.newInstance();
//			 
//			   Source xslDoc = new StreamSource("/JavaObj2/src/main/resources/StudentList.xsl");
//			 
//			   Source xmlDoc = new StreamSource("/JavaObj2/src/main/resources/StudentsList.xml");
//			 
//			   String outputFileName = "/JavaObj2/src/main/resources/one.html";
//			   
//			   File myFile = new File("src/main/resources/one.html");
//
//		        Scanner input = new Scanner(myFile);
//		        String in = "one.html";
//		        in = input.nextLine();
//			 
//			   OutputStream htmlFile = new FileOutputStream(in);
//			 
//			   Transformer trasform = tFactory.newTransformer(xslDoc);
//			 
//			   trasform.transform(xmlDoc, new StreamResult(htmlFile));
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
//			catch (TransformerConfigurationException e) {
//			e.printStackTrace();
//		} catch (TransformerFactoryConfigurationError e) {
//			e.printStackTrace();
//		} catch (TransformerException e) {
//			e.printStackTrace();
//		}
	}

}