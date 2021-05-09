package quan_li.commons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
//    public static final String PATH="";
//    public static void ghiFile(List<> list, boolean trangThai) {
//        File file = null;
//        FileWriter fileWriter = null;
//        BufferedWriter bufferedWriter = null;
//        try {
//            file = new File(PATH);
//            fileWriter = new FileWriter(file, trangThai);
//            bufferedWriter = new BufferedWriter(fileWriter);
//            for (  : list) {
//                bufferedWriter.write(.toString());
//                bufferedWriter.newLine();
//            }
//            bufferedWriter.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                bufferedWriter.close();
//                fileWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    public static List<> docFilePhuongTien() {
//        File file = null;
//        FileReader fileReader = null;
//        BufferedReader bufferedReader = null;
//        List<> phuongTienGiaoThongList = new ArrayList<>();
//        String line = null;
//        String[] strings = null;
//        try {
//            file = new File(PATH);
//            fileReader = new FileReader(file);
//            bufferedReader = new BufferedReader(fileReader);
//            while ((line = bufferedReader.readLine()) != null) {
//                strings = line.split(",");
//
//
//                if (strings.length == 6) {
//                    PhuongTienGiaoThong oto = new Oto(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5]);
//                    phuongTienGiaoThongList.add(oto);
//                }
//                if (strings[0].contains("C") && strings.length == 5) {
//                    PhuongTienGiaoThong xeTai = new XeTai(strings[0], strings[1], strings[2], strings[3], strings[4]);
//                    phuongTienGiaoThongList.add(xeTai);
//                }else if(strings.length==5) {
//                    PhuongTienGiaoThong xeMay = new XeMay(strings[0], strings[1], strings[2], strings[3], strings[4]);
//                    phuongTienGiaoThongList.add(xeMay);
//                }
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                bufferedReader.close();
//                fileReader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return phuongTienGiaoThongList;
//    }

}
