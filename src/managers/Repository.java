/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import java.util.List;

/**
 *Define una interfaz comun para metodos de acceso a datos
 * @author lomik
 * @param <TEntity>
 */
public interface Repository<TEntity> {
    
        public int toSave(TEntity entity);
        
        public List<TEntity> toSelect();

}
