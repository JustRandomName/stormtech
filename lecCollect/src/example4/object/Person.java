package example4.object;

public class Person implements Comparable<Person>{

    private int id;
    private String name;


    public Person(final int id,
                  final String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.getName());
    }
}
