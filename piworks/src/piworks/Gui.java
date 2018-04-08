package piworks;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gui {
	
	private JFrame jf;
	private JPanel jp;
	private JLabel jlResult;
	
	public Gui() {
		init();
	}
	
	public void init() {
		
		jf=new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(false);
		jf.setVisible(true);
		jf.setSize(300, 300);
		
		jp=new JPanel();
		jp.setSize(300, 300);
		jp.setBackground(Color.BLACK);
		
		jlResult=new JLabel("Result");
		jlResult.setSize(300,300);
		jlResult.setForeground(Color.white);
		
		
		jf.add(jp);
		jp.add(jlResult);
		
	}

	public JLabel getJlResult() {
		return jlResult;
	}

	public void setJlResult(String string) {
		jlResult.setText(string);
	}
	
	

}
