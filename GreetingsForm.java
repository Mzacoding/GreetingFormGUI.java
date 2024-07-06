
package aop.tut.greetingsapp;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;


public class GreetingsForm extends JFrame implements ActionListener {
    private JTextArea textarea;
    private JScrollPane  ScrollPane;
    
    private JButton GreetBtn;
    private JButton ClearBtn;
    private JButton ExitBtn;
    
    private JLabel NameLanel;
    private JLabel SuenameLabel;
    private JLabel AppLabel;
    
    private JTextField NameTextFiled;
    private JTextField SurmaneTextFiled;
    
    private JPanel UserInforPanel;
    private JPanel AppLabelPanel;
    private JPanel namePanel;
    private JPanel surnamePanel;
    
    private JPanel TextAreaPanel;
    private JPanel buttonPanel;
    private JPanel UserInfor_TextAreaPanel;
    
     
    
    public GreetingsForm() {
        
    //textarea 
    textarea=new JTextArea (10,40);
   
    textarea.setMargin(new Insets(10,10,10,10));
    textarea.setFont(new Font("Consoles",Font.BOLD,12));
    textarea.setLineWrap(true);
    ScrollPane=new JScrollPane (textarea);
    
    ScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    ScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    
    
    //buttons
    GreetBtn=new JButton("Greet");
    ClearBtn=new JButton("Clear");
    ExitBtn=new JButton("Exit");
    
    //Labels
    NameLanel=new JLabel("Name:");
    
    SuenameLabel=new JLabel("Suraname:");
    AppLabel=new JLabel("Greeting App");
    
    
    //textFiels
    NameTextFiled=new  JTextField();
    
    SurmaneTextFiled=new  JTextField();
    NameTextFiled.setPreferredSize(new Dimension(350,30));
    SurmaneTextFiled.setPreferredSize(new Dimension(350,30));
    
    //panels
      namePanel=new JPanel();
      namePanel.setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
      namePanel.add(NameLanel);
      namePanel.add(NameTextFiled);
       
      surnamePanel=new JPanel();
      surnamePanel.setLayout(new FlowLayout(FlowLayout.LEADING,10,10));
      surnamePanel.add(SuenameLabel);
      surnamePanel.add(SurmaneTextFiled);
      
     UserInforPanel=new JPanel();
     UserInforPanel.setLayout(new GridLayout(2,1));
     UserInforPanel.add(namePanel);
     UserInforPanel.add(surnamePanel);

     
    
     
     AppLabelPanel=new JPanel();
      AppLabelPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
     
     AppLabelPanel.add(AppLabel);
     
     
     TextAreaPanel=new JPanel();
    
     TextAreaPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Greetings",TitledBorder.LEFT,TitledBorder.TOP));
     TextAreaPanel.add(ScrollPane);
     
     
     buttonPanel=new JPanel();
     
     buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
     buttonPanel.add(GreetBtn);
     buttonPanel.add(ClearBtn);
     buttonPanel.add(ExitBtn); 
     
     GreetBtn.addActionListener(this);
     ClearBtn.addActionListener(this);
     ExitBtn.addActionListener(this);
     
      UserInfor_TextAreaPanel=new JPanel();
      UserInfor_TextAreaPanel.setLayout(new GridLayout(2,1));
      UserInfor_TextAreaPanel.add( UserInforPanel);
      UserInfor_TextAreaPanel.add(TextAreaPanel);
      
      
        //frame componets
        this.setLocation(500,200);
        this.setSize(500,550);
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        
        this.setTitle("GreetingApp");
        this.setLayout(new BorderLayout(2,2));
        
  
             this.add(AppLabelPanel,BorderLayout.NORTH);
             this.add(UserInfor_TextAreaPanel,BorderLayout.CENTER);
     
             this.add(buttonPanel,BorderLayout.SOUTH);
        
        this.setVisible(true);
     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String name,surname;
        
       if(e.getSource()==GreetBtn){
           
            surname=SurmaneTextFiled.getText();
            name=NameTextFiled.getText();
           
          textarea.setText("Hello "+name+" "+surname);
            
       }else   if(e.getSource()==ClearBtn){
           clear();
           
       }else   if(e.getSource()==ExitBtn){
           System.exit(0);
       }
       
       
    }
    
    
    
    private void clear(){
             SurmaneTextFiled.setText("");
           NameTextFiled.setText("");
           
          textarea.setText("");
    }
    
}
