package apr;

import java.util.Random;

public class Apr {
    public static int index = 0;
    private String ref;
    private String name;
    private int yearOfBirth;

    public Apr(String name, int yearOfBirth) {

        this.ref = String.valueOf(++index);
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        System.out.println(this);
    }

    public String getRef() {
        return ref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Apr{" +
                "ref='" + ref + '\'' +
                ", name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
