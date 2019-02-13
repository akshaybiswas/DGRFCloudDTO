/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dgrf.cloud.dto;



/**
 *
 * @author dgrf-vi
 */

public class DataConnDTO {
    private DGRFCloudAuthCredentials cloudAuthCredentials;
    private int responseCode;
    private String responseMessage;
    private String dbAdminUser;
    private String dbAdminPassword;
    private String dbConnUrl;

    public DGRFCloudAuthCredentials getCloudAuthCredentials() {
        return cloudAuthCredentials;
    }

    public void setCloudAuthCredentials(DGRFCloudAuthCredentials cloudAuthCredentials) {
        this.cloudAuthCredentials = cloudAuthCredentials;
    }
     

    
    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }
     
    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

     
    public String getDbAdminUser() {
        return dbAdminUser;
    }

    public void setDbAdminUser(String dbAdminUser) {
        this.dbAdminUser = dbAdminUser;
    }
     
    public String getDbAdminPassword() {
        return dbAdminPassword;
    }

    public void setDbAdminPassword(String dbAdminPassword) {
        this.dbAdminPassword = dbAdminPassword;
    }
     
    public String getDbConnUrl() {
        return dbConnUrl;
    }

    public void setDbConnUrl(String dbConnUrl) {
        this.dbConnUrl = dbConnUrl;
    }

    
}

