package za.co.wethinkcode.Swingy.Views.Gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultButtonModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import za.co.wethinkcode.Swingy.Views.SquareMap;

public class Window extends JFrame {
	static String pos;
	static JPanel panelA = new JPanel();
	static JPanel panelB = new JPanel();
	
	String []  heroes = {"Warrior", "Reptile", "Snake"}; 
	
	JComboBox<String> classes = new JComboBox<String>(heroes);
	
	static JLabel label = new JLabel();
//	static JLabel select = new JLabel("Please Select Hero Class");
	static JButton btnCreate = new JButton("Create");
//	static JButton button1 = new JButton();
	static JTextArea areaPlayers = new JTextArea();
	static JTextArea area2 = new JTextArea();
	static JButton choicebutton1 = new JButton("button1");
//	static JButton choicebutton2 = new JButton("button2");
//	static JButton choicebutton3 = new JButton("button3");
//	static JButton choicebutton4 = new JButton("button4");
	static JTextField fldName = new JTextField();
//	ScreenHandler handler = new ScreenHandler();
//	Handler hand =  new Handler();
	//static Details details = new Details();

	Window() {
		
		this.setTitle("SWINGY");
		this.setSize(500, 400);

		// Field 1
		
		fldName.setText("Enter Name");
		fldName.setBounds(50,50, 120,30);
	
		// Saved Players
	
			DefaultListModel model = new DefaultListModel();
		
		// Button Create Player
		
		btnCreate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String input = fldName.getText();
				areaPlayers.append(input);
				
				System.out.print(input);
				System.out.println(classes.getSelectedItem().toString());
				
		//area2 PlayerDetails
				
			}
			class TileGrid{
				
				public TileGrid[][] map;
				
				public TileGrid() {
					map = new TileGrid[7][5];
					for (int i = 0; i < map.length; i++) {
						for (int j = 0; j < map[i].length; j++) {
							//map[i][j] = new TileGrid(i * 7, j * 7, 7, SquareMap.drawMap());
						} 
					}
				}
			}
		});
		
		// Panel B
		panelB.add(fldName);
		panelB.add(classes);
		panelB.add(btnCreate);
		
		// Panel A
		panelA.setLayout(new BorderLayout());
		
		panelA.add(panelB, BorderLayout.NORTH);
		panelA.add(areaPlayers, BorderLayout.WEST);
		panelA.add(choicebutton1, BorderLayout.SOUTH);
		panelA.add(area2,BorderLayout.EAST);
		choicebutton1.setText("CONTINUE");

		this.add(panelA);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	/*public void Select() {
		
		panelA.setVisible(true);
		button.setVisible(false);
		button1.setVisible(false);
		label.setVisible(false);
		
		//GameLost();
		//GameWon();
		
		JButton btn2 = new JButton();
		JButton btn3 = new JButton();
		JButton btn4 = new JButton();
		JButton btn5 = new JButton();
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(400, 200);
		setLocationRelativeTo(null);
		setResizable(true);
		
		btn2.setText("NORTH");
		getContentPane().add(panelB, BorderLayout.NORTH);
		
		btn3.setText("SOUTH");
		getContentPane().add(choicebutton1, BorderLayout.PAGE_END);
		choicebutton1.setText("CONTINUE");
		
		btn4.setText("WEST");
		getContentPane().add(area1, BorderLayout.LINE_START);
		
		btn5.setText("EAST");
		getContentPane().add(area2, BorderLayout.LINE_END);
		pack();
		
		JLabel select = new JLabel("Please Select Hero Class");
		String []  heroes = {"Warrior", "Reptile", "Snake"}; 
		
		JComboBox<String> classes = new JComboBox<String>(heroes);
		
		classes.setBounds(250,50, 120,30);  
		JTextField field1 = new JTextField();
		field1.setText("Enter Name");
		field1.setBounds(50,50, 120,30);
		JButton button1 = new JButton();
	
		area1.setText("Testing");
		area2.getText();
		
		panelB.add(field1);
		panelB.add(classes);
		panelB.add(button1);
		button1.setText("Save");
		
	}
	public static void PlayerDetails() {
		pos = "PlayerDetails";
		choicebutton1.setText("OK"); 
		choicebutton2.setText("BACK");
		choicebutton3.setText("");
		choicebutton4.setText("");
	}
	public void OK() { 
		pos = "OK";
	
		choicebutton1.setText("CONTINUE"); 
		choicebutton2.setText("");
		choicebutton3.setText("");
		choicebutton4.setText("");
	}
	
	public static void GamePlay() {
		int playerhp = 15;
		String weapon = "KNIFE";
		
		JLabel HPplayer = new JLabel();
		JLabel playerweapon = new JLabel();
		playerweapon.setText(weapon);
		HPplayer.setText("" + playerhp);
		
		GuiMap();
		
	}
	public static void GuiMap() {
		
		
		
	}
	public static void GameWon() {
		
		JOptionPane.showMessageDialog(null, "YOU WON \n CONGRATULATION", "SWINGY", JOptionPane.INFORMATION_MESSAGE);
	}
	public static void GameLost() {
		
		JOptionPane.showMessageDialog(null, "YOU LOST \n GAME OVER", "SWINGY", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public class ScreenHandler implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			Select();
		}
	}
	public  class Handler implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			String choice = e.getActionCommand();
			
			switch(pos) {
			case "Select":
				switch(choice) {
				case "button1": OK(); break;
				}
				break;
			case "OK": 
				switch(choice) {
				case "button1": GuiMap(); break;
				}
			}
		}
	}*/
}