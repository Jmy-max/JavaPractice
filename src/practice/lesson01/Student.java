package practice.lesson01;

/*
 * 第 01 题：学生档案（本轮先做这一题）
 * 目标：构造器 + this + 封装 + 实例方法。
 * 只填写下面 3 个 TODO，getter 和 Main 已准备好。
 * 每个 TODO 的 throw 是占位行：把整行替换为你自己的实现。
 */
public class Student {
    private String name;
    private int age;

    // 构造器：参数名和字段名相同。调用时保证 age 在 0～150 内。
    public Student(String name, int age) {
        // TODO 1：用参数初始化当前对象的 name 和 age。
        // C++ 的 this->成员，对应 Java 中的 this.字段。
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int age) {
        // TODO 2：合法范围为 0～150（包含两端）。
        // 合法：修改当前对象的 age，返回 true。
        // 非法：保持原值，返回 false。
        if(age < 0 || age > 150) return false;
        this.age = age;
        return true;
    }

    public void birthday() {
        // TODO 3：age 小于 150 时加 1；已经是 150 时保持不变。
        if(this.age < 150) ++this.age;
    }
}
