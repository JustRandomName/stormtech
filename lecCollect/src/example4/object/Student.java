package example4.object;

public class Student {
    private int id;
    private String name;
    private int average;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public Student(int id, String name, int average) {
        this.id = id;
        this.name = name;
        this.average = average;
    }
}
