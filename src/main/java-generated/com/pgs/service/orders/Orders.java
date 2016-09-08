package com.pgs.service.orders;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-09-07T16:25:42.566+02:00
 * Generated source version: 3.1.7
 * 
 */
@WebService(targetNamespace = "http://www.pgs.com/service/Orders/", name = "Orders")
@XmlSeeAlso({com.pgs.schema.order.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Orders {

    @WebMethod(operationName = "ProcessOrderPlacement", action = "http://www.pgs.com/service/Orders/ProcessOrderPlacement")
    @WebResult(name = "orderInquiryResponse", targetNamespace = "http://www.pgs.com/schema/Order", partName = "orderInquiryResponse")
    public com.pgs.schema.order.OrderInquiryResponseType processOrderPlacement(
        @WebParam(partName = "orderInquiry", name = "orderInquiry", targetNamespace = "http://www.pgs.com/schema/Order")
        com.pgs.schema.order.OrderInquiryType orderInquiry
    );
}
