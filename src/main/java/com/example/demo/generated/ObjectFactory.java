//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.17 at 09:55:55 AM IST 
//


package com.example.demo.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.demo.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _StudentsList_QNAME = new QName("", "studentsList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.demo.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StudentsList }
     * 
     */
    public StudentsList createStudentsList() {
        return new StudentsList();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link Educationdeatils }
     * 
     */
    public Educationdeatils createEducationdeatils() {
        return new Educationdeatils();
    }

    /**
     * Create an instance of {@link Scores }
     * 
     */
    public Scores createScores() {
        return new Scores();
    }

    /**
     * Create an instance of {@link Deatils }
     * 
     */
    public Deatils createDeatils() {
        return new Deatils();
    }

    /**
     * Create an instance of {@link JavaObjApplicationTests }
     * 
     */
    public JavaObjApplicationTests createJavaObjApplicationTests() {
        return new JavaObjApplicationTests();
    }

    /**
     * Create an instance of {@link JavaObjApplication }
     * 
     */
    public JavaObjApplication createJavaObjApplication() {
        return new JavaObjApplication();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentsList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StudentsList }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "studentsList")
    public JAXBElement<StudentsList> createStudentsList(StudentsList value) {
        return new JAXBElement<StudentsList>(_StudentsList_QNAME, StudentsList.class, null, value);
    }

}
