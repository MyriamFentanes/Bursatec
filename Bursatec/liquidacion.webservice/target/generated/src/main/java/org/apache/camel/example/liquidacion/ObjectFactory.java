
package org.apache.camel.example.liquidacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.camel.example.liquidacion package. 
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

    private final static QName _InputReportIncident_QNAME = new QName("http://liquidacion.example.camel.apache.org", "inputReportIncident");
    private final static QName _OutputReportIncident_QNAME = new QName("http://liquidacion.example.camel.apache.org", "outputReportIncident");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.camel.example.liquidacion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OutputReportIncident }
     * 
     */
    public OutputReportIncident createOutputReportIncident() {
        return new OutputReportIncident();
    }

    /**
     * Create an instance of {@link InputReportIncident }
     * 
     */
    public InputReportIncident createInputReportIncident() {
        return new InputReportIncident();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputReportIncident }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liquidacion.example.camel.apache.org", name = "inputReportIncident")
    public JAXBElement<InputReportIncident> createInputReportIncident(InputReportIncident value) {
        return new JAXBElement<InputReportIncident>(_InputReportIncident_QNAME, InputReportIncident.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutputReportIncident }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liquidacion.example.camel.apache.org", name = "outputReportIncident")
    public JAXBElement<OutputReportIncident> createOutputReportIncident(OutputReportIncident value) {
        return new JAXBElement<OutputReportIncident>(_OutputReportIncident_QNAME, OutputReportIncident.class, null, value);
    }

}
