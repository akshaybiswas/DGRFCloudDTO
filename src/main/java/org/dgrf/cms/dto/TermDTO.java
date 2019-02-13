/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dgrf.cms.dto;

import java.util.List;
import java.util.Map;

/**
 *
 * @author bhaduri
 */
public class TermDTO extends CMSDTO{

    
    private String termSlug;
    private Map<String,Object> termDetails;
    private List<Map<String,Object>> termList;
    
    
    
    
    
    public String getTermSlug() {
        return termSlug;
    }

    public void setTermSlug(String termSlug) {
        this.termSlug = termSlug;
    }

    public Map<String, Object> getTermDetails() {
        return termDetails;
    }

    public void setTermDetails(Map<String, Object> termDetails) {
        this.termDetails = termDetails;
    }

    public List<Map<String, Object>> getTermList() {
        return termList;
    }

    public void setTermList(List<Map<String, Object>> termList) {
        this.termList = termList;
    }
    
}
