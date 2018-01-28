package image;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class MyJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyJFrame frame = new MyJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private ArrayList<User> alu;
	private DefaultListModel<User> listModel;
	
	public MyJFrame() throws MalformedURLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(53, 32, 209, 204);
		contentPane.add(scrollPane);
		
		listModel = new DefaultListModel<>();
		init();
		
		JList list = new JList(listModel);
		list.setCellRenderer(new Render());
		scrollPane.setViewportView(list);
		
//		URL url = new URL("http://download.eclipse.org/windowbuilder/WB/integration/4.7/");
	
		
	}
	
	
	private void init() {
		alu = new ArrayList<>();
		alu.add(new User("Jack","IMAGES/emoticon.png"));
		alu.add(new User("Mike","IMAGES/emoticon-cool.png"));
		alu.add(new User("Bob","IMAGES/emoticon-dead.png"));
			
		for(User u :alu) {
			listModel.addElement(u);
		}
	}
}
