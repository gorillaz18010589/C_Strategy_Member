package android.rockchip.c_strategy_member;

public interface MemberStrategy {

    /**
     * 計算圖書的價格
     *
     * @param booksPrice 圖書的原價
     * @return 計算出打折後的價格
     */
    double calcPrice(double booksPrice);
}
