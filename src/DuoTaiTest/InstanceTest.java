package DuoTaiTest;
/**
* 建立InstanceTest 类，在类中定义方法
 * method(Person e);
 * 在method中:
 * (1)根据e的类型调用相应类的getInfo()方法。
 * (2)根据e的类型执行：
 * 如果e为Person类的对象，输出： “a person”;
 * 如果e为Student类的对象，输出：
 * “a student”
 * “a person ”
 * 如果e为Graduate类的对象，输出：
 * “a graduated student”
 * “a student”
 * “a person”
*/
public class InstanceTest {
    public void method(Person e){
        System.out.println(e.getInfo());
        if (e instanceof Graduate){
            System.out.println("a graduated student");
            System.out.println("a student");
            System.out.println("a person");
        }
        else if(e instanceof Student){
            System.out.println("a student");
            System.out.println("a person");
        }else if (e instanceof Person){

            System.out.println("a person");
        }
    }

    public static void main(String[] args) {
        InstanceTest instanceTest = new InstanceTest();
        instanceTest.method(new Graduate());
    }
}
class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "Name: " + name + "\n" + "age: " + age;
    }
}
class Student extends Person {
    protected String school="pku";
    public String getInfo() {
        return "Name: "+ name + "\nage: "+ age + "\nschool: "+ school;
    }
}
class Graduate extends Student{
    public String major="IT";
    public String getInfo() {
        return "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school+"\nmajor:"+major;
    }
}