package practice.lesson05;

import practice.support.Checks;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("小动物");
        Checks.equal("父类对象使用自己的方法", animal.eat(), "小动物在吃东西");

        Cat cat = new Cat();
        cat.setName("小黑");
        Checks.equal("猫继承设置与读取名字的方法", cat.getName(), "小黑");
        Checks.equal("猫复用父类的 eat", cat.eat(), "小黑在吃东西");
        Checks.equal("猫也有自己的方法", cat.catchMouse(), "小黑在抓老鼠");

        RagdollCat ragdoll = new RagdollCat();
        ragdoll.setName("布丁");
        Checks.equal("多层继承后仍能使用 Animal 方法", ragdoll.eat(), "布丁在吃东西");
        Checks.equal("多层继承后也能使用 Cat 方法", ragdoll.catchMouse(), "布丁在抓老鼠");
        Checks.equal("布偶猫自己的方法", ragdoll.rest(), "布丁在休息");
        Checks.equal("另一个猫对象的名字没有改变", cat.getName(), "小黑");
        Checks.finish();
    }
}
