public class Dog {

    // the attributes, components of information for each 'dog' created

    private String name;
    private String breed;
    private int age;
    private String gender;
    private String colour;

    // the constructor, how the data is added to each object created

    public Dog(String name, String breed, int age, String gender,String colour) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.colour = colour;
    }

    // accessor methods, how data can be accessed after an object has been created or
    // how data can be modified after the object has been created

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public String getColour() { return colour; }
    public void setColour(String colour) { this.colour = colour; }

    public String noise(){
       return this.name + " goes 'Woof!!'";
    }

    public String rollOver(){
        return this.name + " has rolled over";
    }

    public String sit(){
        String filler;
        if (this.gender.equals("male")) filler = "his";
        else filler = "her";
        return this.name + " is sitting down waiting for " + filler + " food";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                '}';
    }
}
