/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dgrf.cms.dto;

import org.dgrf.cloud.dto.DGRFCloudAuthCredentials;

/**
 *
 * @author dgrfi
 */
public class CMSDTO {
    private DGRFCloudAuthCredentials authCredentials;
    private int responseCode;
    private String responseMessage;

    public DGRFCloudAuthCredentials getAuthCredentials() {
        return authCredentials;
    }

    public void setAuthCredentials(DGRFCloudAuthCredentials authCredentials) {
        this.authCredentials = authCredentials;
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

}
