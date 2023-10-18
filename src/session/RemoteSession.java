package session;

import attendance.AttendanceList;

public class RemoteSession extends Session{
    public RemoteSession(String title, String date, AttendanceList attendanceList) {
        super(title, date, attendanceList);
    }
}
