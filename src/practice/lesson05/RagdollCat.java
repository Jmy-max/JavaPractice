package practice.lesson05;

// 多层继承：布偶猫 -> 猫 -> 动物。一个类直接继承一个父类。
public class RagdollCat extends Cat {
    public String rest() {
        // TODO 3：使用继承来的 getName()，返回“名字在休息”。
        return getName() + "在休息";
    }
}
