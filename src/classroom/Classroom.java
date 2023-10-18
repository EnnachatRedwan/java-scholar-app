package classroom;

import session.Session;

public class Classroom implements IClassroom {
    private int CN;
    private int tablesCount;
    private int chairsCount;
    private Session session;


    public Classroom(int CN, int tablesCount, int chairsCount, Session session) {
        this.CN = CN;
        this.tablesCount = tablesCount;
        this.chairsCount = chairsCount;
        this.session = session;
    }

    @Override
    public int getTablesCount() {
        return tablesCount;
    }

    @Override
    public int getChairsCount() {
        return chairsCount;
    }

    public void setTablesCount(int tablesCount) {
        this.tablesCount = tablesCount;
    }

    public void setChairsCount(int chairsCount) {
        this.chairsCount = chairsCount;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public int getCN() {
        return CN;
    }
}
