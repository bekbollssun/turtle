public class Duck implements Swimable {
    private String name;

    public Duck(String name) {
        this.name = name;
    }
    @Override
    public void swim() {
        System.out.println("плавает над водой");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                '}';
    }
}

