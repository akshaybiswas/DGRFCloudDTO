/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dgrf.cms.dto;

/**
 *
 * @author bhaduri
 */
public class MenuDTO extends CMSDTO{
    
    private MenuNode rootMenuNode;
    
    


    public MenuNode getRootMenuNode() {
        return rootMenuNode;
    }

    public void setRootMenuNode(MenuNode rootMenuNode) {
        this.rootMenuNode = rootMenuNode;
    }



    
}
