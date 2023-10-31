
package prjbubblesort;

import javax.swing.JOptionPane;

public class PrjBubbleSort 
{
    public static void main(String[] args) 
    {
        int [] intNum = {300,800,700};
        int intTemp = 0;
        String strMessage = "Numbers BEFORE bubble " + "sort \n\n";
        
        display_numbers(intNum,strMessage);
        
        int count = intNum.length; //returns the length of the array
        for (int y = 0; y < count; y++)
        {
            //loops to compare each array item 
            for (int x = 0; x < intNum.length -1; x++)
            {
                  if (intNum[x] > intNum[x+1])
                  {
                     intTemp = intNum[x];//800
                     intNum[x] = intNum[x+1];//700
                     intNum[x+1] = intTemp;//800
                  }
            }
            count--;
                
        }
         
           strMessage = "Numbers AFTER bubble " + "sort \n\n";
           display_numbers(intNum,strMessage);
    }
    
    private static void display_numbers(int [] intNum,String strMessage)
    {
         for (int x = 0; x < intNum.length; x++)
         {
           strMessage+= intNum[x] + "\n";
         }
         JOptionPane.showMessageDialog(null,strMessage);
    }
}
