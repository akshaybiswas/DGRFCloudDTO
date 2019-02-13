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
public class TermInstanceDTO extends CMSDTO{

   
    private String parentTermSlug;
    private String parentTermInstanceSlug;
    private String termSlug;
    private String childTermMetaKey;
    private String termInstanceSlug;
    private Map<String, Object> termInstance;
    private String termInstanceFirstField;
    private List<Map<String, Object>> termInstanceList;
    

    
    
    public List<Map<String, Object>> getTermInstanceList() {
        return termInstanceList;
    }

    public void setTermInstanceList(List<Map<String, Object>> termInstanceList) {
        this.termInstanceList = termInstanceList;
    }



    public String getTermSlug() {
        return termSlug;
    }

    public void setTermSlug(String termSlug) {
        this.termSlug = termSlug;
    }

    public String getTermInstanceSlug() {
        return termInstanceSlug;
    }

    public void setTermInstanceSlug(String termInstanceSlug) {
        this.termInstanceSlug = termInstanceSlug;
    }

    public Map<String, Object> getTermInstance() {
        return termInstance;
    }

    public void setTermInstance(Map<String, Object> termInstance) {
        this.termInstance = termInstance;
    }



    public String getParentTermSlug() {
        return parentTermSlug;
    }

    public void setParentTermSlug(String parentTermSlug) {
        this.parentTermSlug = parentTermSlug;
    }

    public String getParentTermInstanceSlug() {
        return parentTermInstanceSlug;
    }

    public void setParentTermInstanceSlug(String parentTermInstanceSlug) {
        this.parentTermInstanceSlug = parentTermInstanceSlug;
    }

    public String getChildTermMetaKey() {
        return childTermMetaKey;
    }

    public void setChildTermMetaKey(String childTermMetaKey) {
        this.childTermMetaKey = childTermMetaKey;
    }

    public String getTermInstanceFirstField() {
        return termInstanceFirstField;
    }

    public void setTermInstanceFirstField(String termInstanceFirstField) {
        this.termInstanceFirstField = termInstanceFirstField;
    }

}
