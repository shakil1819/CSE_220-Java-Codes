package alignment;

import java.util.Scanner;

public class Alignment {

    public static String leftAlign(String str, int windowSize)
    {
        String lftStr = "";
        String temp="";
        String[] arr;
        arr= str.split(" ");
        int i=0;
        while(i<arr.length)
        {
            if(arr[i].length()+temp.length()+1>windowSize)
            {
                lftStr=lftStr+temp+"\n";
                temp=arr[i];
            }
            else
            {
                if(i==0)
                    temp=temp+arr[i];
                else
                    temp=temp+" "+arr[i];
            }
            i++;
        }

        return lftStr;
    }

    public static String rightAlign(String str, int windowSize)
    {
        String rtStr = "";
        StringBuilder temp= new StringBuilder();
        String[] arr;
        arr= str.split(" ");
        int i=0;
        while(i<arr.length)
        {
            if(arr[i].length()+temp.length()+1>windowSize)
            {
                for(int j = 0; j < windowSize - temp.length(); j++)
                {
                    rtStr=rtStr+" ";
                }
                rtStr=rtStr+temp+"\n";
                temp = new StringBuilder(arr[i]);
            }
            else
                temp.append(" ").append(arr[i]);
            i++;
        }

        return rtStr;
    }


    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        // try with windowSize =  15, 20, 25 etc
        int windowSize = cin.nextInt();

        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, "
                + "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
                + "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris "
                + "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in "
                + "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. "
                + "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia "
                + "deserunt mollit anim id est laborum.";

        String lftStr = leftAlign(str, windowSize);
        String rtStr = rightAlign(str, windowSize);

        System.out.println(lftStr);
        System.out.println(rtStr);
        cin.close();

    }

}