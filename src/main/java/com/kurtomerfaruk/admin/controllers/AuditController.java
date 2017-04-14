package com.kurtomerfaruk.admin.controllers;

import com.kurtomerfaruk.admin.audit.AuditEntry;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Omer Faruk KURT 
 * @e-mail kurtomerfaruk@gmail.com
 * @blog http://kurtomerfaruk.com
 */
@ManagedBean
@ViewScoped
public class AuditController extends AbstractController<AuditEntry> implements java.io.Serializable {

    private static final long serialVersionUID = 8548529037103057476L;

    public AuditController() {
        super(AuditEntry.class);
        columnNames();
        columnList();
    }

}
