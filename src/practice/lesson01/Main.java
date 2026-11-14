package practice.lesson01;

import practice.support.Checks;

/** 第 01 题检查入口：Student 完成后，点 main 左边的绿色三角运行。 */
public class Main {
    public static void main(String[] args) {
        Student first = new Student("小林", 18);
        Student second = new Student("小周", 20);

        Checks.equal("构造器保存姓名", first.getName(), "小林");
        Checks.equal("构造器保存年龄", first.getAge(), 18);
        Checks.equal("第二个学生独立初始化", second.getAge(), 20);

        first.birthday();
        Checks.equal("生日使年龄增加 1", first.getAge(), 19);
        Checks.equal("另一个对象不受影响", second.getAge(), 20);

        Checks.yes("合法修改返回 true", first.setAge(23));
        Checks.equal("合法修改保存新值", first.getAge(), 23);
        Checks.yes("负数年龄返回 false", !first.setAge(-1));
        Checks.equal("拒绝负数后原值不变", first.getAge(), 23);
        Checks.yes("超过上限返回 false", !first.setAge(151));
        Checks.equal("拒绝过大年龄后原值不变", first.getAge(), 23);
        Checks.yes("年龄下边界 0 合法", first.setAge(0));
        Checks.equal("下边界写入成功", first.getAge(), 0);
        Checks.yes("年龄上边界 150 合法", first.setAge(150));
        first.birthday();
        Checks.equal("生日不超过上限", first.getAge(), 150);
        Checks.equal("姓名没有被年龄操作改动", first.getName(), "小林");
        Checks.finish();
    }
}
