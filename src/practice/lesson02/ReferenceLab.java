package practice.lesson02;

/** 第 02 题：区别修改对象内容和修改形参保存的引用。 */
public class ReferenceLab {
    public static void addTen(Score score) {
        // TODO 1：让 score 所引用对象的 value 增加 10。
        score.value += 10;
    }

    public static Score replaceLocal(Score score) {
        // TODO 2：创建一个 value 为 99 的新 Score，赋给形参 score。
        // 返回重新赋值后的 score，供 Main 观察；不要修改原对象的 value。
        Score newScore = new Score(99);
        score = newScore;
        return score;
    }
}
