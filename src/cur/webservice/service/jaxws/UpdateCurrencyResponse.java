
package cur.webservice.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.18
 * Wed Apr 14 19:17:47 CEST 2021
 * Generated source version: 2.7.18
 */

@XmlRootElement(name = "updateCurrencyResponse", namespace = "http://service.webservice.cur/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateCurrencyResponse", namespace = "http://service.webservice.cur/")

public class UpdateCurrencyResponse {

    @XmlElement(name = "return")
    private java.lang.String _return;

    public java.lang.String getReturn() {
        return this._return;
    }

    public void setReturn(java.lang.String new_return)  {
        this._return = new_return;
    }

}

