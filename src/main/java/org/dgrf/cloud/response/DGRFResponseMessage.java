/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dgrf.cloud.response;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bhaduri
 */
public class DGRFResponseMessage {
    protected Map <Integer,String> responseMessageMap;

    public DGRFResponseMessage() {
        responseMessageMap = new HashMap<>();
        responseMessageMap.put(DGRFResponseCode.SUCCESS, "Success");
        responseMessageMap.put(DGRFResponseCode.SERVICE_CONNECTION_FAILURE, "Connection to the web service could not be established. Contact Admin");
        responseMessageMap.put(DGRFResponseCode.JSON_FORMAT_PROBLEM, "JSON Processing problem");
        
        responseMessageMap.put(DGRFResponseCode.TERM_NOT_EXISTS, "Term does not exist.");
        responseMessageMap.put(DGRFResponseCode.TERM_META_NOT_EXISTS, "Term meta definition does not exist.");
        responseMessageMap.put(DGRFResponseCode.TERM_INSTANCE_NOT_EXISTS, "Term instance does not exist.");
        
        responseMessageMap.put(DGRFResponseCode.DB_DUPLICATE, "Duplicate key in DB. Contact admin.");
        responseMessageMap.put(DGRFResponseCode.DB_NON_EXISTING, "Key not in DB. Contact admin.");
        responseMessageMap.put(DGRFResponseCode.DB_ILLEGAL_ORPHAN, "Illegal orphan in DB. Contact admin.");
        responseMessageMap.put(DGRFResponseCode.DB_SEVERE, "Severe error in DB. Contact admin.");
        
        
        responseMessageMap.put(DGRFResponseCode.SUBSCRIPTION_NOT_ACTIVE, "Subscription of the host is not active: Contact Admin.");
        responseMessageMap.put(DGRFResponseCode.USER_EXCEEDED, "Sorry, Number of users exceeded");
        responseMessageMap.put(DGRFResponseCode.NO_RESPONSE, "Server Not Responding: Contact Admin");
        responseMessageMap.put(DGRFResponseCode.NO_USER, "User not registered");
        responseMessageMap.put(DGRFResponseCode.USER_INACTIVE, "User not Active: Contact Admin");
        responseMessageMap.put(DGRFResponseCode.PASSWORD_INCORRECT, "Incorrect Password");
        responseMessageMap.put(DGRFResponseCode.NO_SUBCRIPTION, "No subcription for this product");
        responseMessageMap.put(DGRFResponseCode.SUBSCRITION_AUTH_FAIL, "Subscription not authorised");
        responseMessageMap.put(DGRFResponseCode.DATA_CONN_ERROR, "Database connection cannot be established.");
        responseMessageMap.put(DGRFResponseCode.DB_SIZE_EXCEED, "Database size exceeded.");
        responseMessageMap.put(DGRFResponseCode.WRONG_ATTEMPTS_EXCEED, "You are now an inactive user, contact admin to active.");
        

        
        responseMessageMap.put(DGRFResponseCode.AmazonClientException, "Caught an AmazonClientException, which means the client encountered a serious internal problem while trying to communicate with S3, such as not being able to access the network.");
        responseMessageMap.put(DGRFResponseCode.AmazonServiceException, "AmazonServiceException Amazon S3 request was rejected with an error response for some reason.");
    }
    public String getResponseMessage (Integer responseCode) {
        return responseMessageMap.get(responseCode);
    }
    
}
