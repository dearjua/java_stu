package CollectionDemo;


import java.util.Objects;

/**
 * ClassName: Employee <br/>
 * Description: <br/>
 * date: 2022/5/19 10:11<br/>
 *
 * @author li111<br />
 */
public class Employee implements Comparable{
    private String name;
    private int age;
    private MyDate birthday;

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthday);
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee){
            Employee e1 = (Employee) o;
            int compara = this.name.compareTo(e1.name);
            if (compara != 0){
                return compara;
            }else{
                return Integer.compare(this.age,e1.age);
            }
        }else{
            throw new RuntimeException("错误类型");
        }
    }
}
