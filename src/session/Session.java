package session;

import attendance.AttendanceList;

public class Session {

    public static int index = 0;
    private String ref;
    private String topic;
    private String date;
    private AttendanceList attendanceList;

    public Session(String topic, String date, AttendanceList attendanceList) {
        this.ref = String.valueOf(++index);
        this.topic = topic;
        this.date = date;
        this.attendanceList = attendanceList;
    }

    public void setTitle(String topic) {
        this.topic = topic;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRef() {
        return ref;
    }

    public String getTopic() {
        return topic;
    }

    public String getDate() {
        return date;
    }

    public AttendanceList getAttendanceList() {
        return attendanceList;
    }

    public void setAttendanceList(AttendanceList attendanceList) {
        this.attendanceList = attendanceList;
    }
}
