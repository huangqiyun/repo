package practice06;

/*2.程序员类Coder
        属性：
        姓名name
        工号id
        工资salary
        行为：
        工作work()
        工号为135基本工资为10000的程序员正在努力的写着代码......*/
public class Coder {
    private String name;
    private int id;
    private int salary;

    public void work() {
        System.out.println("工号为"+getId()+"基本工资为"+getSalary()+"的"+getName()+"正在努力的写着代码......");
    }

    public Coder() {
    }

    public Coder(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Coder{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
