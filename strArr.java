import java.util.*;
import java.io.*;

public class strArr {
    public static void main (String[] args) throws Exception{
        File myFile = new File ("./Top_40s_September_22.txt");

        try{
            Scanner myScanner = new Scanner(myFile);
            int c = 0;
            while(myScanner.hasNext()){
                c ++;
                myScanner.nextLine();
            }
            
            String[] arr = new String[c];
            Scanner myScanner2 = new Scanner(myFile);
            int i = 0;
            while(myScanner2.hasNext()){
                arr[i] = myScanner2.nextLine();
                i++;
            }

            for (String s: arr){
                System.out.println(s);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}