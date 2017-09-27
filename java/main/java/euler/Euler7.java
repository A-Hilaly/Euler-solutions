package euler;
import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by JAJAJAJJAJAJAJ on 25/03/17.
 */

public class Euler8 {
    ArrayList<String> data = new ArrayList<String>();
    int max;
    public void kappa() throws Exception {

        try {
            // open input stream test.txt for reading purpose.
            BufferedReader br = new BufferedReader(new FileReader("/Users/JAJAJAJJAJAJAJ/Desktop/data_euler7.txt"));
            String thisLine;
            while ((thisLine = br.readLine()) != null) {
                this.data.add(thisLine);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public int search(){
        int i;
        int m;
        int max=0;
        String C;
        for(i=0;i<this.data.size();i++){
            C=this.data.get(i);
            m=12;
            int k=C.length()-m,j;
            for(j=0;j<C.length();j++){
                int p=1;
                if (j>k && i<this.data.size()-1) {
                    p = kar(C, this.data.get(i + 1), j, j % k);
                }else{
                    p=kar(C,C,j,0);
                }
                if (p>max){
                    max=p;
                }
                m++;
            }

        }
        return max;
    }
    public int kar(String a1,String a2,int i,int j){
        int p=1;
        int m=j,n=0;
        while (m<a1.length()){
            p*=Character.getNumericValue(a1.charAt(m));
            m++;
        }
        while (n<j){
            p*=Character.getNumericValue(a2.charAt(n));
            n++;
        }
        return p;
    }

}
