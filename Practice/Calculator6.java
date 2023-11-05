package Practice;


import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Calculator6 
{
	JFrame fr=new JFrame("Calculator");
	JTextField tb=new JTextField("0");
	JButton[] bt=new JButton[20];
	JPanel pa=new JPanel();
	JLabel info=new JLabel();
	public Calculator6()
	{
		fr.setSize(400,480);
		fr.setResizable(false);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		fr.setLayout(null);
		addLabel();
		addTextBox();
		fr.setVisible(true);
	}
	private void addLabel()
	{
		info.setBounds(20,20,360,40);
		info.setHorizontalAlignment(JLabel.RIGHT);
		info.setFont(new Font("arial",0,20));
		fr.add(info);
	}
	private void addTextBox()
	{
		tb.setBounds(20,50,360,40);
		fr.add(tb);
		tb.setFont(new Font("arial",Font.BOLD,35));
		tb.setHorizontalAlignment(JTextField.RIGHT);
		tb.setEditable(false);
		tb.setBorder(BorderFactory.createLineBorder(Color.black,0));
		addButtons();
	}
	private void addButtons()
	{
		pa.setBounds(20,120,360,300);
		//pa.setBackground(Color.yellow);
		fr.add(pa);
		pa.setLayout(new GridLayout(5,4,5,5));
		Font fo=new Font("arial",Font.PLAIN,20);
		String[] str= {"Back","CE","C","%","7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+",};
		CalListener listener=new CalListener();
		for(int i=0;i<20;i++)
		{
			bt[i]=new JButton(str[i]);
			bt[i].addActionListener(listener);
			bt[i].setFont(fo);
			if(i==3 || i==7 || i==11 || i==15 || i==19)
				bt[i].setForeground(Color.red);
			else
				bt[i].setForeground(Color.blue);
			pa.add(bt[i]);
		}
		bt[17].setFont(new Font("elephant",0,24));
	}
	class CalListener implements ActionListener
	{
		private double num1;
		private double num2;
		//private int flag=0;
		boolean check=false;
		private String op=null;
		private int eq=0;
		private double temp;
		public void actionPerformed(ActionEvent evt) 
		{
			JButton bb=(JButton)evt.getSource();
			//when . button will be clicked
			if(bb==bt[17])
			{
				String str=tb.getText();
				if(str.contains(".")) {
			//	int i=str.indexOf('.');
			//	if(i!=-1)
					return;
				}}
			//when buttons having arithmetic operation symbol will be clicked
			if(bb==bt[7]||bb==bt[11]||bb==bt[15]||bb==bt[19])
			{
				if(op!=null)
					cal();
				num1=Double.parseDouble(tb.getText());
				//flag=1;
				check=true;
				op=bb.getText();
				eq=0;
				info.setText(tb.getText()+op);
			}
			//when buttons having digit will be clicked
			if(bb==bt[4]||bb==bt[5]||bb==bt[6]||bb==bt[8]||bb==bt[9]||bb==bt[10]||bb==bt[12]||bb==bt[13]||bb==bt[14]||bb==bt[16] || bb==bt[17])
			{
				String v1=bb.getText();//getting text from clicked button and assigning into v1
				String v2=tb.getText();//getting text from text box and assigning into v2
				if(v2.equals("0") || check) //replacing value of textbox
				{
					tb.setText(v1);//setting text of button into text box
				//	flag=0;
					check=false;
				}
				else //concatenating value of text box with value of button and setting into textbox
				{
					tb.setText(v2+v1);//setting text of text button and button into text box
				}
			}
			//When = button will be clicked
			if(bb==bt[18])
			{
				if(tb.getText().equals("0"))
					return;
				if(eq==0)
				{
					temp=Double.parseDouble(tb.getText());
					eq=1;
				}
				info.setText(info.getText()+tb.getText()+"=");
				cal();
				num1=temp;
			}
			//When C button clicked
			if(bb==bt[2])
			{
				num1=0;
				//flag=0;
				check=false;
				op=null;
				tb.setText("0");
				eq=0;
				info.setText("");
			}
		}//end of actionPerformed method
		private void cal()
		{
			num2=Double.parseDouble(tb.getText());
			double res=0.0;
			if(op.equals("+"))//+button was clicked
				res=num1+num2;
			else if(op.equals("-"))//-button was clicked
				res=num1-num2;
			else if(op.equals("*"))//*button was clicked
				res=num1*num2;
			else if(op.equals("/"))// /button was clicked
				res=num1/num2;
			setResult(res);
		}//end of cal method
		private void setResult(double res)
		{
			int x=(int)res;
			if(res==x)
				tb.setText(String.valueOf(x));
			else
				tb.setText(String.valueOf(res));
		}//end of setResult method
	}//end of CalListener class
	public static void main(String[] args) 
	{
		new Calculator6();
	}
}

