/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumblancco;

import java.awt.Color;
import java.awt.Component;
import static java.lang.Math.log;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Vince
 */
public class listRenderer implements ListCellRenderer<deviceObject>{

    protected DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();
    
    @Override
    public Component getListCellRendererComponent(JList<? extends deviceObject> jlist, deviceObject device, int index, 
            boolean isSelected, boolean hasFocus) {
        
        JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(jlist,device, index,
        isSelected, hasFocus);
        
        renderer.setText(device.getName());
 
        if(!device.getElementMap().isEmpty()){
            if(device.getMatchBoolean()){
                renderer.setBackground(Color.GREEN);
            }else{
                renderer.setBackground(Color.RED);
            }
        }else{
            renderer.setBackground(Color.YELLOW);
        }
        
        return renderer;
    }
}
