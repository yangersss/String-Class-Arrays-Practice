import java.util.*;
import java.io.*;

public class strArr {
    public static void main (String[] args) throws Exception{
        File myFile = new File ("./Top_40s_September_22.txt");
        String [] arr = new String[0];

        try{
            Scanner myScanner = new Scanner(myFile);
            int c = 0;
            while(myScanner.hasNext()){
                c ++;
                myScanner.nextLine();
            }
            
            arr = new String[c];
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

        // time to sort the songs and artists into a separate array
        String[] songs = new String[arr.length / 2];
        String[] artists = new String[arr.length / 2];

        for (int i = 0; i < arr.length; i++){
            if (i % 2 == 0){
                songs[i / 2] = arr[i];
            }
            else{
                artists[i / 2] = arr[i];
            }
        }

        System.out.println("\n\n\n\n\n");

        for (String s : songs){
            System.out.println(s);
        }
        System.out.println("\n\n\n");
        for (String s : artists){
            System.out.println(s);
        }


        // time to sort the arrays yayyy kappa
        int current_lowest;

        for (int i = 0; i < songs.length; i++){
            current_lowest = i;
            for (int j = i + 1; j < songs.length; j++){
                if (songs[current_lowest].compareTo(songs[j]) >= 1){
                    current_lowest = j;
                }
            }
            String temp = songs[i];
            songs[i] = songs[current_lowest];
            songs[current_lowest] = temp;
        }

        System.out.println("\n\n\n SORTED ARRAY TIME YAYY \n\n\n");
        for (String s : songs){
            System.out.println(s);
        }
    }
}