
package cimidentities;

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
@WebService(name = "DatabaseService", targetNamespace = "http://cimidentities/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DatabaseService {


    /**
     * 
     * @param ntaDes
     * @param nName
     * @param ntName
     * @param ntaName
     * @param uuid
     * @param uuidEntered
     * @param ntDes
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "SendToDB")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SendToDB", targetNamespace = "http://cimidentities/", className = "cimidentities.SendToDB")
    @ResponseWrapper(localName = "SendToDBResponse", targetNamespace = "http://cimidentities/", className = "cimidentities.SendToDBResponse")
    @Action(input = "http://cimidentities/DatabaseService/SendToDBRequest", output = "http://cimidentities/DatabaseService/SendToDBResponse")
    public String sendToDB(
        @WebParam(name = "n_name", targetNamespace = "")
        String nName,
        @WebParam(name = "nt_name", targetNamespace = "")
        String ntName,
        @WebParam(name = "nt_des", targetNamespace = "")
        String ntDes,
        @WebParam(name = "nta_name", targetNamespace = "")
        String ntaName,
        @WebParam(name = "nta_des", targetNamespace = "")
        String ntaDes,
        @WebParam(name = "uuid", targetNamespace = "")
        String uuid,
        @WebParam(name = "uuidEntered", targetNamespace = "")
        boolean uuidEntered);

}