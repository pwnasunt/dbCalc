package dbCalc.View;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3653157922140956328L;
	JLabel textAttrs, textLeft, textRight, textBoth, textNone;
	JTextField left, right, both, none;
	//JLabel textKeys;
	//JTextArea textArea;
	//JScrollPane scrollArea;
	
	public KeyPanel() {
		this.setLayout(null);
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		//--- Title component
		textAttrs = new JLabel("<html><u>Attribute evaluation</u></html>");
		textAttrs.setBounds(64, 2, 176, 20);
		this.add(textAttrs);
		//--- Left/Right components
		textLeft = new JLabel("Left (primary)");
		textLeft.setBounds(2, 22, 116, 20);
		this.add(textLeft);
		//---
		textRight = new JLabel("Right (secondary)");
		textRight.setBounds(122, 22, 118, 20);
		this.add(textRight);
		//---
		left = new JTextField("");
		left.setBounds(2, 42, 116, 20);
		left.setEnabled(false);
		this.add(left);
		//---
		right = new JTextField("");
		right.setBounds(120, 42, 116, 20);
		right.setEnabled(false);
		this.add(right);
		//--- Both/None components
		textBoth = new JLabel("Both");
		textBoth.setBounds(2, 62, 116, 20);
		this.add(textBoth);
		//---
		textNone = new JLabel("None (primary)");
		textNone.setBounds(122, 62, 118, 20);
		this.add(textNone);
		//---
		both = new JTextField("");
		both.setBounds(2, 82, 116, 20);
		both.setEnabled(false);
		this.add(both);
		//---
		none = new JTextField("");
		none.setBounds(120, 82, 116, 20);
		none.setEnabled(false);
		this.add(none);
		
	}

}

