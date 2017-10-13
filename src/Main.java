
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
	
	/**
	 * this still needs to decrypt
	 * to decrypt:
	 * still call find rows and columns method
	 * still initialize array
	 * but display in column order instead of row order
	 * @param args
	 */
	
	public static JFrame frame = new JFrame();
	public static JPanel panel = new JPanel(new GridLayout(2,1));
	public static JPanel panel2 = new JPanel();
	public static JPanel panel3 = new JPanel();
	
	public static JTextField encrypt = new JTextField(10);
	public static JLabel encryptLabel = new JLabel("Enter with no spaces, a message you wish to encrypt.");
	public static JButton submit = new JButton("Encrypt!");
	public static JLabel result = new JLabel();
	public static JLabel trans = new JLabel("Transposition Type");
	public static JTextField transpositionType = new JTextField(5);
	
	
	
	
	
	public static JTextField Decrypt = new JTextField(10);
	public static JLabel DecryptLabel = new JLabel("Enter with no spaces, a message you wish to decrypt.");
	public static JButton submit2 = new JButton("Decrypt!");
	public static JLabel result2 = new JLabel();
	public static JLabel dTrans = new JLabel("Trasposition Type");
	public static JTextField dTranspositionType = new JTextField(5);
	
	
	
	public static void main(String[]args){
		
		/**this
		 * is 
		 * a
		 * basic
		 * example
		 */
		/*char [][] fiveColumn = {{'g','o','o','d','m'},
								{'o','r','n','i','n'},
								{'g','c','l','a','s'},
								{'s','x','x','x','x'}};
		
		
		for(int i = 0; i < 5;i++){
			
			for(int j =0; j<fiveColumn.length;j++){
				
				System.out.print(fiveColumn[j][i]);
				if(j==3){
					System.out.println("");
				}
				
			}
		}
		*/
		
		
		
		
		
		
	
		/**This is to the console
		 * 
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the 5 Column Transposition Ecrypter!");
		System.out.println("Please enter a message you wish to encrypt with no spaces.");
		String message = in.next();
		*/
		
		
		
		
		
		
		
		
		
		submit.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent evt) {
				
		
		String message = encrypt.getText();
		String type= transpositionType.getText();
		
		MessageToArray mine = new MessageToArray(message, Integer.parseInt(type));
		mine.findRowsAndColumns("Encrypting");
		mine.initializeArray();
		//mine.fillArray();
		mine.displayEcryption();
		result.setText("Your message encrypted: " + mine.getEncryptedMessage());
		
		
			 }
		});
		
		
		
		submit2.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent evt) {
				
		
		String message = Decrypt.getText();
		String type= dTranspositionType.getText();
		
		MessageToArray mine = new MessageToArray(message, Integer.parseInt(type));
		mine.findRowsAndColumns("Decrypting");
		mine.initializeArray();
		//mine.fillArray();
		mine.displayDecryption();
		result2.setText("Your message Decrypted: " + mine.getDecryptedMessage());
		
		
			 }
		});
		
		
		
		
		
		
		
		
		
		frame.add(panel);
		panel.add(panel2);
		panel.add(panel3);
		
		panel2.add(encryptLabel);
		panel2.add(encrypt);
		panel2.add(trans);
		panel2.add(transpositionType);
		panel2.add(submit);
		panel2.add(result);
		
		panel3.add(DecryptLabel);
		panel3.add(Decrypt);
		panel3.add(dTrans);
		panel3.add(dTranspositionType);
		panel3.add(submit2);
		panel3.add(result2);
		
		
		
		frame.setTitle("Column Transposition");
		
		frame.setSize(450,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	    
		
		
		
		
	}

}
