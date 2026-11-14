package practice.lesson05;

/** 第 05 题：父类保存公共数据，提供可复用的方法。 */
public class Animal {
    private String name = "未命名";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String eat() {
        // TODO 1：返回“名字在吃东西”，例如“小黑在吃东西”。
        return this.name + "在吃东西";
    }
}
