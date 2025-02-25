import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

class Student {
    String name;
    int score;
    public Student(String name,int score){
        this.name=name;
        this.score=score;
    }
}


public class Lab1 {
    public static void main(String[] args) {
        int totalscore=0;
        try{
        File file=new File("./grade.txt");
        Scanner scanner=new Scanner(file);//找到文件并读取；

        List<Student>students=new ArrayList<>();//创建一个学生数组

        while (scanner.hasNextLine()){//读取文档，将学生加入数组中，并计算总分数
            String line=scanner.nextLine();
            String[] parts=line.split(" ");
            String name=parts[0];
            int score=Integer.parseInt(parts[1]);
            Student student=new Student(name, score);
            students.add(student);

            totalscore+=student.score;
        }

        int averagescore=totalscore/students.size();
        System.out.println("平均成绩："+averagescore);//输出平均分数

        students.sort((s1, s2) -> s2.score - s1.score);
            for(Student student: students){
                System.out.println(student.name);
            }//计算并输出排名

        }catch (FileNotFoundException e){
            System.out.println("相应的文件未找到，请检查。");//检查
        }
    }
}
