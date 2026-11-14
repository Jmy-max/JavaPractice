package practice.lesson04;

/** 第 04 题：用枚举控制借还状态。 */
public class Loan {
    private LoanState state = LoanState.AVAILABLE;

    public LoanState getState() {
        return state;
    }

    public boolean borrow() {
        // TODO 1：在馆时借出，改状态并返回 true；已经借出时返回 false。
        if(state == LoanState.AVAILABLE)
        {
            state = LoanState.BORROWED;
            return true;
        }
        return false;
    }

    public boolean returnBook() {
        // TODO 2：已借出时归还，改状态并返回 true；本来在馆时返回 false。
        if(state == LoanState.BORROWED)
        {
            state = LoanState.AVAILABLE;
            return true;
        }
        return false;
    }
}
