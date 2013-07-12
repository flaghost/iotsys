
package at.ac.tuwien.auto.iotsys.clients.pdp;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "PDPBeanService", targetNamespace = "http://pdp.smartwebgrid.auto.tuwien.ac.at/", wsdlLocation = "http://localhost:8080/SwgPdp?wsdl")
public class PDPBeanService
    extends Service
{

    private final static URL PDPBEANSERVICE_WSDL_LOCATION;
    private final static WebServiceException PDPBEANSERVICE_EXCEPTION;
    private final static QName PDPBEANSERVICE_QNAME = new QName("http://pdp.smartwebgrid.auto.tuwien.ac.at/", "PDPBeanService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SwgPdp?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PDPBEANSERVICE_WSDL_LOCATION = url;
        PDPBEANSERVICE_EXCEPTION = e;
    }

    public PDPBeanService() {
        super(__getWsdlLocation(), PDPBEANSERVICE_QNAME);
    }

    public PDPBeanService(URL wsdlLocation) {
    	super(wsdlLocation, PDPBEANSERVICE_QNAME);
    }
    
    public PDPBeanService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns PDP
     */
    @WebEndpoint(name = "PDPPort")
    public PDP getPDPPort() {
        return super.getPort(new QName("http://pdp.smartwebgrid.auto.tuwien.ac.at/", "PDPPort"), PDP.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PDP
     */
    @WebEndpoint(name = "PDPPort")
    public PDP getPDPPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://pdp.smartwebgrid.auto.tuwien.ac.at/", "PDPPort"), PDP.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PDPBEANSERVICE_EXCEPTION!= null) {
            throw PDPBEANSERVICE_EXCEPTION;
        }
        return PDPBEANSERVICE_WSDL_LOCATION;
    }

}