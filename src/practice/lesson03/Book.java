package practice.lesson03;

/** 第 03 题：共享计数和每个对象自己的 final 字段。 */
public class Book {
    public static final int MAX_BORROW_DAYS = 30;
    private static int createdCount = 0;

    private final int id;
    private final String title;

    public Book(String title) {
        // TODO 1：共享计数加 1，把此时的编号和传入标题保存到本对象。
        // final id/title 都必须在构造器正常结束前完成初始化。
        createdCount++;
        this.id = createdCount;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public static int getCreatedCount() {
        // TODO 2：返回实际创建的图书对象总数。
        return createdCount;
    }
}
