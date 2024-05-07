package studentcsv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class StudentCsvTest {
    public static void main(String[] args) {
           main.java.studentcsv.StudentCsvUtil studentCsvUtil = new main.java.studentcsv.StudentCsvUtil();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = format.parse("2003-10-13");
            studentcsv.Student student1 = new studentcsv.Student("����",date,"5120210001","��"
                    ,"123456","�Ĵ�����","123","147258369","���ϿƼ���ѧ"
                    ,"���2105","106");
           studentCsvUtil.StudentCsvWrite(student1);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        List test = (List) studentCsvUtil.StudentCsvRead();
        String[] stu = test.get(0).toString().split(",");

        System.out.println(test.get(1));
    }
}
