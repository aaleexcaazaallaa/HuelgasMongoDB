package es.iesjandula.huelgasMongo.utils;

import java.awt.Component;

import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class CheckBoxListCellRenderer extends JCheckBox implements ListCellRenderer<JCheckBox> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

	/**
	 * 
	 */




	@Override
    public Component getListCellRendererComponent(JList<? extends JCheckBox> list,
                                                  JCheckBox value,
                                                  int index,
                                                  boolean isSelected,
                                                  boolean cellHasFocus) {
        setEnabled(list.isEnabled());
        setSelected(value.isSelected());
        setFont(list.getFont());
        setBackground(list.getBackground());
        setForeground(list.getForeground());
        setText(value.getText());
        return this;
    }
}
