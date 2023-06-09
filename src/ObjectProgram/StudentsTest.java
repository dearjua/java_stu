package ObjectProgram;

/*
 * 4. 对象数组题目：定义类Student，包含三个属性：
 * 学号number(int)，年级state(int)，成绩score(int)。
 * 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 提示：  1) 生成随机数：Math.random()，返回值类型double;
 * 		2) 四舍五入取整：Math.round(double d)，返回值类型long。
 *
 */
public class StudentsTest {
    public static void main(String[] args) {
        Student[] stu = new Student[20];

        for (int i = 0; i < 20; i++){
            stu[i] = new Student();
            stu[i].number = i + 1;
            stu[i].state = (int)(Math.random()*6+1);
            stu[i].scode = (int)(Math.random()*100 + 1);
        }
        for(int i = 20; i > 0; i--){
            for (int j = 0; j < i-1; j++){
                if(stu[j].scode < stu[j+1].scode){
                    int tem = stu[j].scode;
                    stu[j].scode = stu[j+1].scode;
                    stu[j+1].scode = tem;
                }
            }
        }

        for (int i = 0; i < 20; i++){
            stu[i].info();
        }
    }
}

class Student{
    public int number;
    public int state;
    public int scode;

    public void info(){
        System.out.println("学号：" + number + " 年级：" + state + " 成绩：" + scode);
    }
}
