package practice.lesson03;

import practice.support.Checks;

/** 每次作为独立程序运行，static 计数从 0 开始。 */
public class Main {
    public static void main(String[] args) {
        Checks.equal("没有创建对象时计数为 0", Book.getCreatedCount(), 0);
        Book first = new Book("Java 入门");
        Book second = new Book("数据结构");
        Checks.equal("第一本编号", first.getId(), 1);
        Checks.equal("第二本编号", second.getId(), 2);
        Checks.equal("共享计数", Book.getCreatedCount(), 2);
        Checks.equal("标题独立保存", second.getTitle(), "数据结构");

        Book alias = first;
        Checks.equal("多一个引用不增加对象数", Book.getCreatedCount(), 2);
        Checks.yes("alias 与 first 指向同一本书", alias == first);
        Book third = new Book("算法练习");
        Checks.equal("第三本编号连续", third.getId(), 3);
        Checks.equal("老对象编号没有随计数变化", first.getId(), 1);
        Checks.equal("老对象标题没有被覆盖", first.getTitle(), "Java 入门");
        Checks.equal("最终对象数", Book.getCreatedCount(), 3);
        Checks.equal("类常量", Book.MAX_BORROW_DAYS, 30);
        Checks.finish();
    }
}
