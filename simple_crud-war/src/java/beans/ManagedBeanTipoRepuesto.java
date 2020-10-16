/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import bComp.TipoRespuestoFacadeLocal;
import bEntity.TipoRespuesto;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author j
 */
@ManagedBean
@SessionScoped
public class ManagedBeanTipoRepuesto implements Serializable{

    @EJB
    private TipoRespuestoFacadeLocal tipoRespuestoFacade;    

    private TipoRespuesto objeto;

    private int tipo_accion = 1; // 1: create, 2:update, 3:delete

    public int getTipo_accion() {
        return tipo_accion;
    }

    public void setTipo_accion(int tipo_accion) {
        this.tipo_accion = tipo_accion;
    }
    
    public ManagedBeanTipoRepuesto () {
        objeto = new TipoRespuesto();        
        
    }

    public TipoRespuesto getObjeto() {
        return objeto;
    }

    public void setObjeto(TipoRespuesto objeto) {
        this.objeto = objeto;
    }
    public List<TipoRespuesto> getLista() {
        return tipoRespuestoFacade.findAll();
    }
    public void reinstanciar() { //resetearlo
        objeto = new TipoRespuesto();
    }
    public void procesar() {
        switch (tipo_accion) {
            case 1:
                //create
                objeto.setFechaRegistro(new Date());
                tipoRespuestoFacade.create(objeto);
                break;
            case 2:
                //update
                tipoRespuestoFacade.edit(objeto);
                break;
            case 3: 
                //delete
                tipoRespuestoFacade.remove(objeto);
                break;
                
        }
    }
    public void seleccionar_item(TipoRespuesto item, int tipo_acc) {
        objeto = item;
        tipo_accion = tipo_acc;
    }
    
}
