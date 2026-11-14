package practice.lesson02;

import practice.support.Checks;

public class Main {
    public static void main(String[] args) {
        Score a = new Score(60);
        Score alias = a;
        Score independent = new Score(60);

        ReferenceLab.addTen(alias);
        Checks.equal("通过 alias 修改同一对象", a.value, 70);
        Checks.equal("alias 也观察到新值", alias.value, 70);
        Checks.equal("另一个 new 创建独立对象", independent.value, 60);
        Checks.yes("a 与 alias 引用同一对象", a == alias);
        Checks.yes("independent 引用另一对象", a != independent);

        Score replacement = ReferenceLab.replaceLocal(a);
        Checks.equal("方法中的新对象被返回供观察", replacement.value, 99);
        Checks.yes("方法中创建的是另一个对象", replacement != a);
        Checks.equal("重设形参不改调用者引用", a.value, 70);
        Checks.equal("共享原对象的 alias 不受重设形参影响", alias.value, 70);
        Checks.yes("调用结束后 a 与 alias 仍共享对象", a == alias);

        Score another = a;
        another = new Score(5);
        Checks.equal("重设 another 后它看到新对象", another.value, 5);
        Checks.equal("a 仍然看到原对象", a.value, 70);
        Checks.finish();
    }
}
