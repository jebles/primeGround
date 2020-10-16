/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bComp;

import bEntity.TipoRespuesto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author j
 */
@Local
public interface TipoRespuestoFacadeLocal {

    void create(TipoRespuesto tipoRespuesto);

    void edit(TipoRespuesto tipoRespuesto);

    void remove(TipoRespuesto tipoRespuesto);

    TipoRespuesto find(Object id);

    List<TipoRespuesto> findAll();

    List<TipoRespuesto> findRange(int[] range);

    int count();
    
}
