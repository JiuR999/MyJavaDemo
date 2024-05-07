package main.java.studentcsv;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class StudentCsvUtil {
    String filename = "D:\\IDEA\\TestFrame\\Student.csv";
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    public List StudentCsvRead(){
        try {
            InputStream in = new FileInputStream(new File(this.filename));
            BufferedReader bf = new BufferedReader(new InputStreamReader(in));
            String value = "";
            List list = new ArrayList();
            while((value = bf.readLine())!= null){
                 list.add(value);
                 value = "";
            }
            return list;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void StudentCsvWrite(studentcsv.Student student){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename,true));
            startWrite(student.getName(),bw);
            startWrite(student.getAddress(),bw);
            startWrite(student.getClassID(),bw);
            startWrite(student.getId(),bw);
            startWrite(student.getGender(),bw);
            startWrite(student.getPhone(),bw);
            startWrite(student.getPostcode(),bw);
            startWrite(student.getRoomID(),bw);
            startWrite(student.getSchool(),bw);
            startWrite(student.getSocietyID(),bw);
            bw.write(format.format(student.getBirthday()));
            bw.write("\n");
            bw.flush();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void startWrite(String name,BufferedWriter bw) {
        try {
            if (name.equals("")) {
                bw.write("");
            } else {
                bw.write(name);
            }
            bw.write(",");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
