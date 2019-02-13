/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dgrf.cms.dto;

import java.util.List;

/**
 *
 * @author bhaduri
 */
public class MenuNode {
   

    private Integer id;
    private String name;
    private String termSlug;
    private String termName;
    private String termUrl;
    private Integer parent;
    List<MenuNode> children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTermSlug() {
        return termSlug;
    }

    public void setTermSlug(String termSlug) {
        this.termSlug = termSlug;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public List<MenuNode> getChildren() {
        return children;
    }

    public void setChildren(List<MenuNode> children) {
        this.children = children;
    }

    public String getTermName() {
        return termName;
    }

    public void setTermName(String termName) {
        this.termName = termName;
    }

    public String getTermUrl() {
        return termUrl;
    }

    public void setTermUrl(String termUrl) {
        this.termUrl = termUrl;
    }

 
}
