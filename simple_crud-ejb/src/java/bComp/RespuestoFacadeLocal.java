/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bComp;

import bEntity.Respuesto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author j
 */
@Local
public interface RespuestoFacadeLocal {

    void create(Respuesto respuesto);

    void edit(Respuesto respuesto);

    void remove(Respuesto respuesto);

    Respuesto find(Object id);

    List<Respuesto> findAll();

    List<Respuesto> findRange(int[] range);

    int count();
    
}
