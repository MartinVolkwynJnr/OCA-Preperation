package Chapter_4;

public class DataEncapsulation {

    /*
        JAVABEANS NAMING CONVENTIONS:

        Rule                                            Example
        Properties are private.                         private int numEggs;

        Getter methods begin with is if the             public boolean isHappy() {
        property is a boolean.                              return happy;
                                                        }

        Getter methods begin with get if the            public int getNumEggs() {
        property is not a boolean.                          return numEggs;
                                                        }

        Setter methods begin with set.                  public void setHappy(boolean happy) {
                                                            this.happy = happy;
                                                        }

        The method name must have a prefix              public void setNumEggs(int num) {
        of set/get/is, followed by the first                numEggs = num;
        letter of the property in uppercase,            }
        followed by the rest of the property name.


     */

    //Creating Immutable Classes

    //Making a class immutable is making a class read only basically having no setters but only getters

    // Data Encapsulation is all class variables are private and only accessible through getters and setters modifiers
    //example:
    private String name;
    private int age;

    public DataEncapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
