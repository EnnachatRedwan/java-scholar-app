import apr.Apr;
import apr.JavaApr;
import attendance.AttendanceList;
import classroom.Classroom;
import session.OnsiteSession;
import session.Session;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Java students list
        ArrayList<Apr> javaStudents = new ArrayList<>(
                List.of(
                        new JavaApr("Hamid", 2001),
                        new JavaApr("Ayman", 2002),
                        new JavaApr("Redwan", 1995)
                )
        );

        //Dotnet students list
        ArrayList<Apr> dotnetStudents = new ArrayList<>(
                List.of(
                        new JavaApr("Fatima", 2001),
                        new JavaApr("Walid", 2002),
                        new JavaApr("Youssef", 1995)
                )
        );

        //Creating attendance lists
        AttendanceList javaAttendanceList = new AttendanceList(javaStudents);
        AttendanceList dotnetAttendanceList = new AttendanceList(dotnetStudents);

        //Creating session
        Session javaSession = new OnsiteSession("Java EE", "05/02/2024", javaAttendanceList);
        Session dotnetSession = new OnsiteSession("Entity Framework", "16/01/2025", dotnetAttendanceList);

        Classroom amphi4 = new Classroom(4, 5, 20, javaSession);
        Classroom amphi2 = new Classroom(2, 10, 40, dotnetSession);

        ArrayList<Classroom> classrooms = new ArrayList<>(List.of(
                amphi2, amphi4
        ));


        boolean exit = false;
        Scanner s = new Scanner(System.in);

        System.out.println("*******************************************");
        String exitAttendanceList = "";

        System.out.println("Java Students, sign your attendance:");
        while (!exitAttendanceList.toLowerCase().equals("e")) {

            String ref = s.next();
            amphi4.getSession().getAttendanceList().sign(ref);
            System.out.println("Enter 'E' to exit or C to continue");
            exitAttendanceList = s.next();
            System.out.println("Next:");
        }

        System.out.println("*******************************************");
        exitAttendanceList = "";

        System.out.println("Dotnet Students, sign your attendance:");
        while (!exitAttendanceList.toLowerCase().equals("e")) {
            String ref = s.next();
            amphi2.getSession().getAttendanceList().sign(ref);
            System.out.println("Enter 'E' to exit or C to continue");
            exitAttendanceList = s.next();
            System.out.println("Next:");
        }

        classrooms.forEach(c->c.getSession().getAttendanceList().printAttendanceList());


    }
}