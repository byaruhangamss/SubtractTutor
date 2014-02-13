package subtractionPackage;

import javax.swing.JOptionPane;

public class SubtractionClass {

	public static void main(String[] args) {
		
			long startTime = System.currentTimeMillis();

				String answer;
				int correctcount = 0;
				int wrongcount = 0;
		
				int counter = 1;
				int option = 0;
				
				String output = "";
					
				while(option == JOptionPane.showConfirmDialog(null,"Are you ready for the Exercises?","Please confirm",JOptionPane.YES_OPTION)){
				
					while(counter <= 10){
						
						int number1 = (int)(Math.random() * 10);
						int number2 = (int)(Math.random() * 10);
						
							if(number1 < number2){
								int temp = number1;
								number1 = number2;
								number2 = temp;
							}
							
								answer = JOptionPane.showInputDialog(null,"What is "+number1+" - "+number2+" ? ","Question "+
																					counter,JOptionPane.INFORMATION_MESSAGE);
							
								int ans = Integer.parseInt(answer);
							
									if(number1 - number2 == ans){
										correctcount++;
								}
						
									else{
										wrongcount++;
								}
								
						counter++;	
						
					output+= "\n"+number1+" - "+number2+" = "+answer+" "+((number1-number2 == ans) ? "Correct" : "Wrong");
					
					}
										
			long endTime = System.currentTimeMillis();
			long totalTime = (endTime  - startTime) / 1000;
					
			JOptionPane.showMessageDialog(null, "Correct counts = "+correctcount+"\nWrong counts = "+wrongcount+
							"\nTotal Time Taken is "+totalTime+"seconds."+"\n"+output, "Your Results.", JOptionPane.INFORMATION_MESSAGE);	
				
		}
	}
}
