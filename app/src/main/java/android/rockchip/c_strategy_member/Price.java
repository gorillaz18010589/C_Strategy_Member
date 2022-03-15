package android.rockchip.c_strategy_member;

public class Price {
    //持有一個具體的策略對象
    private MemberStrategy strategy;
/**
 * 構造函數，傳入一個具體的策略對象
 * @param strategy 具體的策略對象
 */
    /**
     * 通過setPrice設置價格
     * @param strategy
     */

    public void setPrice(MemberStrategy strategy){
        this.strategy = strategy;
    }
    /**
     * 通過創建對象設置價格。
     * @param strategy
     */
    public Price(MemberStrategy strategy){
        this.strategy = strategy;
    }

    /**
     * 計算圖書的價格
     * @param booksPrice 圖書的原價
     * @return 計算出打折後的價格
     */
    public double quote(double booksPrice){
        return this.strategy.calcPrice(booksPrice);
    }
}
