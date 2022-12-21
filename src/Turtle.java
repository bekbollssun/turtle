public  class Turtle implements Swimable {
private String name;

  public Turtle(String name) {
    this.name = name;
  }
  @Override
  public void swim() {
    System.out.println("плавает медленно");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Turtle{" +
            "name='" + name + '\'' +
            '}';
  }
}