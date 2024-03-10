import javax.swing.JOptionPane;   

public class credit_score {
    public static void main (String[] args){
        // Credit card checker and filter 
        //Welcome Message
        String name = JOptionPane.showInputDialog("What is your name?");
        if(name == null){
            JOptionPane.showMessageDialog(null,"Sorry to see you go! Quitting...");
            System.exit(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Welcome " + name+"!");
        }
        // Check credit score
        int score = Integer.parseInt (JOptionPane.showInputDialog("What is your credit score " + name+"?"));
        if(name == null){
            JOptionPane.showMessageDialog(null,"Sorry to see you go! Quitting...");
            System.exit(0); 
        }
        else if(score >= 700 && score < 800){
            JOptionPane.showMessageDialog(null, "Your credit score is Very Good " + name+"!");
        }
        else if(score >=600 && score<= 699){
            JOptionPane.showMessageDialog(null, "Your credit score is Okay " + name+"!");
        }        
        else if(score>= 800 && score<= 900){
            JOptionPane.showMessageDialog(null, "Your credit score is Excellent " + name+"!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Your credit score is Poor " + name+"!");
        }

       

    }
}
