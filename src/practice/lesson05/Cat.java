package practice.lesson05;

// 已准备好继承声明。对照 C++：class Cat : public Animal。
public class Cat extends Animal {
    public String catchMouse() {
        // TODO 2：通过继承得到的 getName()，返回“名字在抓老鼠”。
        // 不要在这里复制一份 name 字段或 getName/setName/eat。
        return getName() + "在抓老鼠";
    }
}
