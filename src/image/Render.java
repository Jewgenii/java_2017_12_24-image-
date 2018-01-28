package image;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class Render extends JLabel implements ListCellRenderer<User> {

	/* (non-Javadoc)
	 * @see javax.swing.ListCellRenderer#getListCellRendererComponent(javax.swing.JList, java.lang.Object, int, boolean, boolean)
	 */
	@Override
	public Component getListCellRendererComponent(JList<? extends User> arg0, User arg1, int arg2, boolean arg3,
			boolean arg4) {
		
		setIcon( new ImageIcon(arg1.getPath()) );
		setHorizontalTextPosition(JLabel.RIGHT);
		setText(arg1.getName());
		return this;
	}

}
