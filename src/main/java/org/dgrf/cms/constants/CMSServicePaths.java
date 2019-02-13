/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dgrf.cms.constants;

/**
 *
 * @author bhaduri
 */
public class CMSServicePaths {
    public static final String DGRFCMS_BASE_URL = "http://localhost:8080/DGRFCMSCoreService/rest";
    public static final String TERM_BASE = "term";
    public static final String GET_TERM_DETAILS = "termdetails";
    public static final String GET_ROOT_TERM_LIST = "roottermlist";
    public static final String GET_CHILD_TERM_LIST = "childtermlist";
    
    public static final String TERM_META_BASE = "termmeta";
    public static final String GET_TERM_META_LIST = "termmetalist";
    public static final String GET_CHILD_TERM_META_LIST = "childtermmetalist";
    
    public static final String MENU_BASE = "menu";
    public static final String GET_MENU_TREE = "menulist";

    public static final String TERM_INSTANCE_BASE = "terminstance";
    public static final String GET_TERM_INSTANCE = "getinstance";
    public static final String IS_TERM_INSTANCE_EXISTS = "instanceslugexists";
    public static final String GET_TERM_INSTANCE_LIST = "terminstancelist";
    public static final String GET_CHILD_TERM_INSTANCE_LIST = "childterminstancelist";
    public static final String SAVE_TERM_INSTANCE = "saveterminstance";
    public static final String DELETE_TERM_INSTANCE = "deleteterminstance";
    public static final String INIT_MEDIA_TERM_INSTANCE = "createmediaterminstance";
    
    public static final String MEDIA_BASE = "cmsmedia";
    public static final String UPLOAD_MEDIA = "addmedia";
    public static final String DELETE_MEDIA = "deletemedia";
}
