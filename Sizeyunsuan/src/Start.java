//import java.awt.Graphics;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.color.*;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Start extends JFrame 
{
	
	public static void main(String[] args) 
    {
    	
    	EventQueue.invokeLater(new Runnable()
    	{
    		public void run()
    		{
    			
    	          
    			Start frame = new Start();
    			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    			frame.setVisible(true);
    		
    		}
    	});
    }
	
	protected void setColor(Color pink) {
		// TODO Auto-generated method stub
		
	}

	private static final int DEFAULT_WIDTH=400;
	private static final int DEFAULT_HEIGHT=300;
	
	public Start()
	{
		//JPanel north = new JPanel();
		JPanel south = new JPanel();
		
		JLabel label1 = new JLabel("欢迎同学们,是否要开始测试？",JLabel.CENTER); 
		JButton btn1 = new JButton("确定");
		JButton btn2 = new JButton("取消");
		add(label1);
		south.add(btn1);
		south.add(btn2);
		add(south,BorderLayout.SOUTH);
		Font font=new Font("华文行楷",Font.BOLD,20);
		label1.setFont(font);  
        label1.setForeground(Color.BLUE);//设置字体颜色
        //label1.setBackground(Color.GREEN);
		 
	     btn1.setFont(font);  
	     btn1.setForeground(Color.BLUE); 
	     btn1.setBackground(Color.CYAN);
	     btn1.setBorder(BorderFactory.createRaisedBevelBorder());   
		 btn1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					setVisible(false);
					SimpleFrame0 frame = new SimpleFrame0();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    			frame.setVisible(true);
					
				}
			});
	          
	     btn2.setFont(font);  
	     btn2.setBorder(BorderFactory.createRaisedBevelBorder());  
	     btn2.setForeground(Color.BLUE);
	     btn2.setBackground(Color.CYAN);
		 btn2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					System.exit(0);
				}
			});
		 /*JLabel label;
		 ImageIcon ico;
		 ico =new ImageIcon("str/image/2.jpg");
			label = new JLabel(ico);
			add(label);
			label.setLayout(null);*/
			
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("四则运算系统");
		setLocation(500,200);
		/*Image img = new ImageIcon("str/image/2.jpg").getImage();
	    setIconImage(img);*/
	}
	
}