package example4.object;

public class Person implements Comparable<Person>{

    private int id;
    private String name;
    private int age;


    public Person(final int id,
                  final String name,
                  final int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (name.compareTo(o.getName()) == 0) {
            return age - o.getAge();
        } else {
            return name.compareTo(o.getName());
        }
    }
}
