package practice.support;

/** 已准备好的检查工具。本轮不需要修改，也不需要先学习它的实现。 */
public final class Checks {
    private static int passed;

    public static void equal(String label, int actual, int expected) {
        if (actual != expected) {
            throw new AssertionError(label + "：期望 " + expected + "，实际 " + actual);
        }
        pass(label);
    }

    public static void equal(String label, String actual, String expected) {
        if (!expected.equals(actual)) {
            throw new AssertionError(label + "：期望 " + expected + "，实际 " + actual);
        }
        pass(label);
    }

    public static void yes(String label, boolean condition) {
        if (!condition) {
            throw new AssertionError("检查失败：" + label);
        }
        pass(label);
    }

    private static void pass(String label) {
        passed++;
        System.out.println("[通过] " + label);
    }

    public static void finish() {
        System.out.println("ALL CHECKS PASSED（" + passed + " 项）");
    }
}
