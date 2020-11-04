import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class itCounter implements ActionListener {
JLabel leftLabel;
JLabel rightLabel;

int leftCount;
int rightCount;

   
 itCounter() {
	JFrame frame = new JFrame("let's Count");
	frame.setLayout(new FlowLayout());
	frame.setSize(200,110);

JButton left  = new JButton("left");
JButton right = new JButton("right");
left.addActionListener(this);
right.addActionListener(this);

leftCount=0;
rightCount=0;

	frame.add(left);
	frame.add(right);

	leftLabel = new JLabel("Count: " +leftCount);
	rightLabel = new JLabel("Count: "+rightCount);

	frame.add(leftLabel);
  frame.add(rightLabel);
	
  JButton reset  = new JButton("reset");
  reset.addActionListener(this);
  frame.add(reset);

  
  frame.setVisible(true);
  }
  
  public void actionPerformed(ActionEvent ae){
  if(ae.getActionCommand().equals("left")){
    leftCount++;
    leftLabel.setText("Count: " + leftCount );
  }
    else if (ae.getActionCommand().equals("right")){
      rightCount++;
      rightLabel.setText("Count " + rightCount);
  }
    
   else{
      leftCount = 0;
      rightCount = 0;
      leftLabel.setText("Count: " + leftCount );
      rightLabel.setText("Count: " + rightCount);
    }

  }

}


