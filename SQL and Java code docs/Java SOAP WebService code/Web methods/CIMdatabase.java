
package cimdatabase;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CIMdatabase", targetNamespace = "http://CIMdatabase/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CIMdatabase {


    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @param arg6
     */
    @WebMethod
    @RequestWrapper(localName = "sendToDB", targetNamespace = "http://CIMdatabase/", className = "cimdatabase.SendToDB")
    @ResponseWrapper(localName = "sendToDBResponse", targetNamespace = "http://CIMdatabase/", className = "cimdatabase.SendToDBResponse")
    @Action(input = "http://CIMdatabase/CIMdatabase/sendToDBRequest", output = "http://CIMdatabase/CIMdatabase/sendToDBResponse")
    public void sendToDB(
        @WebParam(name = "arg0", targetNamespace = "")
        boolean arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        String arg6);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "showDB", targetNamespace = "http://CIMdatabase/", className = "cimdatabase.ShowDB")
    @ResponseWrapper(localName = "showDBResponse", targetNamespace = "http://CIMdatabase/", className = "cimdatabase.ShowDBResponse")
    @Action(input = "http://CIMdatabase/CIMdatabase/showDBRequest", output = "http://CIMdatabase/CIMdatabase/showDBResponse")
    public List<String> showDB();

}