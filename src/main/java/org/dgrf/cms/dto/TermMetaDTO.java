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
public class TermMetaDTO extends CMSDTO{

    
    private String termSlug;
    private List<Map<String, Object>> termMetaFields;
    private Map<String, String> termMetaFieldLabels;
    
 
    public String getTermSlug() {
        return termSlug;
    }

    public void setTermSlug(String termSlug) {
        this.termSlug = termSlug;
    }

    public List<Map<String, Object>> getTermMetaFields() {
        return termMetaFields;
    }

    public void setTermMetaFields(List<Map<String, Object>> termMetaFields) {
        this.termMetaFields = termMetaFields;
    }


    public Map<String, String> getTermMetaFieldLabels() {
        return termMetaFieldLabels;
    }

    public void setTermMetaFieldLabels(Map<String, String> termMetaFieldLabels) {
        this.termMetaFieldLabels = termMetaFieldLabels;
    }


}
