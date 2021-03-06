/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onemore.entity.sessionbean;

import com.onemore.entity.UserType;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Brian
 */
@Stateless
public class UserTypeFacade extends AbstractFacade<UserType> {
    @PersistenceContext(unitName = "com.onemore_onemore-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserTypeFacade() {
        super(UserType.class);
    }
    
}
