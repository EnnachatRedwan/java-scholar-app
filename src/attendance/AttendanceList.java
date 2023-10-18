package attendance;

import apr.Apr;
import logger.ConsoleLogger;

import java.util.ArrayList;

public class AttendanceList {
    private ArrayList<Apr> attandanceList;
    private ArrayList<Apr> attanding;

    public AttendanceList(ArrayList<Apr> attandanceList) {
        this.attandanceList = attandanceList;
        attanding = new ArrayList<>();
    }

    public ArrayList<Apr> getAttandanceList() {
        return attandanceList;
    }

    public void sign(String ref){
        for(Apr apr: attandanceList){
            String id = apr.getRef();
            if(ref.equals(id)){
                attanding.add(apr);
                break;
            }
        }
    }

    public void printAttendanceList(){
        for (Apr a : attandanceList){
            if(attanding.contains(a)){
                ConsoleLogger.getLogger().log(a.getName()+" is attending");
            }else {
                ConsoleLogger.getLogger().log(a.getName()+" is not attending");
            }
        }
    }

}
