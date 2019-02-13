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
 * @author dgrf-vi
 */
@XmlRootElement
public class UserAuthDTO implements Serializable {
    private String userId;
    private String password;
    private int tenantId;
    private int productId;
    private int responseCode;
    private String responseMessage;
    private int roleId;
    private String roleName;
    private String name;
    private String dbAdminUser;
    private String dbAdminPassword;
    private String dbConnUrl;
    @XmlElement  
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    @XmlElement  
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @XmlElement  
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }
    @XmlElement  
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    @XmlElement 
    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }
    @XmlElement 
    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    @XmlElement 
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
    @XmlElement 
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    @XmlElement 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @XmlElement 
    public String getDbAdminUser() {
        return dbAdminUser;
    }

    public void setDbAdminUser(String dbAdminUser) {
        this.dbAdminUser = dbAdminUser;
    }
    @XmlElement 
    public String getDbAdminPassword() {
        return dbAdminPassword;
    }

    public void setDbAdminPassword(String dbAdminPassword) {
        this.dbAdminPassword = dbAdminPassword;
    }
    @XmlElement 
    public String getDbConnUrl() {
        return dbConnUrl;
    }

    public void setDbConnUrl(String dbConnUrl) {
        this.dbConnUrl = dbConnUrl;
    }
    
    
}
