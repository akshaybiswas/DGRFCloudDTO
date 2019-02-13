/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dgrf.cloud.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dgrfiv
 */
@XmlRootElement
public class ParamDTO implements Serializable{
    private int packageId;
    private int productId;
    private String paramKey;
    private String paramDescription;
    private String paramValue;

    @XmlElement
    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    @XmlElement
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @XmlElement
    public String getParamKey() {
        return paramKey;
    }

    public void setParamKey(String paramKey) {
        this.paramKey = paramKey;
    }

    @XmlElement
    public String getParamDescription() {
        return paramDescription;
    }

    public void setParamDescription(String paramDescription) {
        this.paramDescription = paramDescription;
    }

    @XmlElement
    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }
    
    
}
