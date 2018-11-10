package practice06;
	/*	3.调用成员方法,打印格式如下:
                工号为123基本工资为15000奖金为6000的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
                工号为135基本工资为10000的程序员正在努力的写着代码......*/
public class DemoOne {
    public static void main(String[] args) {
        Manager one=new Manager();
        one.setBonus(6000);
        one.setId(123);
        one.setName("项目经理");
        one.setSalary(15000);
        one.work();
        Coder two=new Coder();
        two.setId(135);
        two.setName("程序员");
        two.setSalary(10000);
        two.work();
    }
}
