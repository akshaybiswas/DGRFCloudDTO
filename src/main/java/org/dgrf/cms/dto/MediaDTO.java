/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dgrf.cms.dto;

import java.util.Map;


/**
 *
 * @author dgrfiv
 */
public class MediaDTO extends CMSDTO{
    
    private Map<String, Object> mediaTermInstance;
    
    private String mediaFilePath;

    


    public Map<String, Object> getMediaTermInstance() {
        return mediaTermInstance;
    }

    public void setMediaTermInstance(Map<String, Object> mediaTermInstance) {
        this.mediaTermInstance = mediaTermInstance;
    }

    public String getMediaFilePath() {
        return mediaFilePath;
    }

    public void setMediaFilePath(String mediaFilePath) {
        this.mediaFilePath = mediaFilePath;
    }
    
}
