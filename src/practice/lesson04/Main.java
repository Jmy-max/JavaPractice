package practice.lesson04;

import practice.support.Checks;

public class Main {
    public static void main(String[] args) {
        Loan first = new Loan();
        Loan second = new Loan();
        Checks.yes("初始状态在馆", first.getState() == LoanState.AVAILABLE);
        Checks.yes("未借出时不能归还", !first.returnBook());
        Checks.yes("第一次借出成功", first.borrow());
        Checks.yes("借出后的状态", first.getState() == LoanState.BORROWED);
        Checks.yes("不能重复借出", !first.borrow());
        Checks.yes("重复借出没有改错状态", first.getState() == LoanState.BORROWED);
        Checks.yes("另一本书仍在馆", second.getState() == LoanState.AVAILABLE);
        Checks.yes("归还成功", first.returnBook());
        Checks.yes("归还后的状态", first.getState() == LoanState.AVAILABLE);
        Checks.yes("不能重复归还", !first.returnBook());
        Checks.yes("归还后可以再次借出", first.borrow());
        Checks.finish();
    }
}
