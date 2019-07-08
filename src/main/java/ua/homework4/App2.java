package ua.homework4;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pudge.Pudge;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.RootPaneContainer;
import java.awt.Font;

public class App2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App2 frame = new App2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public App2() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 756, 675);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(this.getClass().getResource("/images/pictures/photo_2019-07-08_00-21-01.jpg")));
		lblNewLabel.setBounds(77, 363, 169, 144);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(this.getClass().getResource("/images/ger_pudge.png")));
		lblNewLabel_1.setBounds(77, 174, 169, 133);
		contentPane.add(lblNewLabel_1);
	System.out.println(getClass().getResource(getClass().getSimpleName() + ".class"));
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		StringBuilder sb = new StringBuilder();
		BufferedReader buffer2 = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/text/CRUD.txt")));
	    String line2;
	    while((line2 = buffer2.readLine())!=null) 
	    {
	      System.out.println(line2);
	      sb.append(line2);
	     
	    }
	    buffer2.close();
		
		
		
		
		textArea.setText(sb.toString());
		
	    
		
		textArea.setBounds(400, 174, 230, 138);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 38));
		Pudge p = new Pudge();
		lblNewLabel_2.setText(p.getName());
		lblNewLabel_2.setBounds(91, 73, 180, 48);
		contentPane.add(lblNewLabel_2);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Times New Roman", Font.BOLD, 32));
		textArea_1.setText(new Pudge().getUltimate());
		textArea_1.setEditable(false);
		textArea_1.setBounds(354, 73, 343, 48);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		StringBuilder sb1 = new StringBuilder();
		
		

		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/text/Text1.txt")));
	    String line;
	    while((line = buffer.readLine())!=null) 
	    {
	      System.out.println(line);
	      sb.append(line);
		textArea_2.setText(line);
	    }
	    buffer.close();
	    

		textArea_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textArea_2.setBounds(400, 363, 230, 144);
		contentPane.add(textArea_2);
	}
}

