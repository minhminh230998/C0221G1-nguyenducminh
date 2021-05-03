package quan_li_phuong_tien.ham;

import quan_li_phuong_tien.itf.Regex;
import quan_li_phuong_tien.object.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocFileXeTai implements Regex {
    public static void docFile(){
        List<XeTai> xeTaiList=new ArrayList<>();
        try {
            FileReader fr=new FileReader(XE_MAY_CSV);
            BufferedReader br=new BufferedReader(fr);
            String line=null;
            String[] a=null;
            while ((line=br.readLine())!=null){
                a=line.split(",");
                xeTaiList.add(new XeTai(a[0],a[1],a[2],a[3],a[4]));
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
