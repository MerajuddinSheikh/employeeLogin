package employeeRecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

public class CompanyEmployee {
    public static void main(String[] args) throws Exception {
        ArrayList<String> words = new ArrayList<String>();


        int count = 0;
        String lines = " ";
        FileReader fr = new FileReader("A:\\test.txt");
        BufferedReader br = new BufferedReader(fr);
        String Line = br.readLine();
String lines1=" ";
        while ((Line != null)) {
            // words.add(Line);
            lines1 += Line + "/n";

            StringTokenizer Tokan1 = new StringTokenizer(Line, " ,");

            while (Tokan1.hasMoreElements()) {
                EmployeeRecords company = new EmployeeRecords();

                String id = company.empId(Tokan1.nextToken());
                String name = company.empName(Tokan1.nextToken());
                String department = company.empDepartment(Tokan1.nextToken());
                String day = company.day(Tokan1.nextToken());
                String workedhours = company.workedHours(Tokan1.nextToken());
                String sethours = company.setHours(Tokan1.nextToken());
                String emplogin = company.empLogin(Tokan1.nextToken());
                String emplogout = company.empLogout(Tokan1.nextToken());
                DateFormat sdf = new SimpleDateFormat("hh:mm");
                Date setHours = sdf.parse(sethours);
                long actualHours = setHours.getTime() / (60 * 60 * 1000) % 24;
                Date presentHours = sdf.parse(workedhours);
                long emphours = presentHours.getTime() / (60 * 60 * 1000) % 24;


                if (emphours >= actualHours) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }

                Date empIn = sdf.parse(emplogin);
                long empEntry = empIn.getTime() / (60 * 60 * 1000) % 24;
                Date empOut = sdf.parse(emplogout);
                long empExit = empOut.getTime() / (60 * 60 * 1000) % 24;
                long serviceHour = empExit - empEntry;
                System.out.println("employee worked only " + serviceHour + "hours");


                Line = br.readLine();

                System.out.println(id + " " + name + " " + department + " " + day + " " + workedhours + " " + sethours + "  " + emplogin + "  " + emplogout + " " + emphours);

                br.close();
                fr.close();
                System.out.println(lines);
                System.out.println(Line);

            }
        }


    }
}
