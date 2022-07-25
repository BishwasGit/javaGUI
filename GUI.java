import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.*;


public class GUI implements ActionListener{

    private static JLabel userlabel;
    private static JLabel passwordlabel;
    private static JPasswordField userPass;
    private static JTextField userText;
    private static JButton btn;
    private static JLabel success;

    public static void main(String[] args){
        
        //for the window
        JFrame frame = new JFrame();
       
        //for the layouts
        JPanel panel = new JPanel();

        frame.setSize(420,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
      
        frame.add(panel); //adding layout to the window 

        panel.setLayout(null);

        //the content inside the panel
        userlabel = new JLabel("User"); //"User string will be displayed on the pannel"
        userlabel.setBounds(10,20,80,25);
        panel.add(userlabel);//adding the content inside panel

        passwordlabel = new JLabel("Password");
        passwordlabel.setBounds(10,50,80,25);
        panel.add(passwordlabel);

        userPass = new JPasswordField(20);
        userPass.setBounds(100,50,165,25);
        panel.add(userPass);

        userText = new JTextField(20); //20 is the length of the textfield
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText); //adding the text field to the  panel

        btn = new JButton("submit");
        btn.setBounds(100,80,165,25);
        panel.add(btn);
        btn.addActionListener(new GUI());


        success = new JLabel();
        success.setBounds(10,110,300,25);
        panel.add(success);
        

        frame.setVisible(true);
        
    }
        
            @Override
            public void actionPerformed(ActionEvent e){
            String user = userText.getText();
            String password = userPass.getText();
                
            if(user.equals("Bishwas") && password.equals("123")){
                success.setText("Logged in");
            }
            else{
                success.setText("Error username or password!");
            }

    } 
}
