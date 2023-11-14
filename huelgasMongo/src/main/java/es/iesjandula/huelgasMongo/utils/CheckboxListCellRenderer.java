package es.iesjandula.huelgasMongo.utils;

import java.awt.Component;

import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class CheckboxListCellRenderer extends JCheckBox implements ListCellRenderer<JCheckBox>
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4415719149735896258L;

	@Override
	public Component getListCellRendererComponent(JList list, JCheckBox value, int index, boolean isSelected,
			boolean cellHasFocus)
	{

		this.setComponentOrientation(list.getComponentOrientation());
		this.setFont(list.getFont());
		this.setBackground(list.getBackground());
		this.setForeground(list.getForeground());

		this.setSelected(isSelected);
		this.setEnabled(list.isEnabled());

		this.setText(value == null ? "" : value.getText());

		return this;
	}

}
