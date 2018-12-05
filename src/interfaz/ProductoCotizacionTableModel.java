/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import entidades.ProductoCotizacion;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author araceli
 */
public class ProductoCotizacionTableModel extends DefaultTableModel{
    
    private Class[] types;
    private boolean[] canEdit;
    
    public ProductoCotizacionTableModel() {
        super(new Object[][]{
            {null, null, null, null, null}
        },
                new String[]{
                    "Clave", "Nombre", "Cantidad", "Precio", "Precio (USD)", "Importe"
                });
        types = new Class[]{
            java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
        };
        canEdit = new boolean[]{
            false, false, false, false, false
        };
    }
    
    public Class getColumnClass(int columnIndex) {
        return types[columnIndex];
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
    }
    
    public void actualiza(List <ProductoCotizacion> Items) {
        for(ProductoCotizacion i : Items) {
            this.addRow(i.toStringArray());
//            System.out.println(i.toStringArray());
        }
    }
    
}
