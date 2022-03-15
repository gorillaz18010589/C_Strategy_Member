package android.rockchip.c_strategy_member;

import android.util.Log;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;


public class PrimaryMemberStrategy implements MemberStrategy {
    /**
     * 初級會員沒有折扣
     *
     * @param booksPrice 圖書的原價
     * @return
     */
    @Override
    public double calcPrice(double booksPrice) {
        Log.v(TAG, "PrimaryMemberStrategy -> 初級會員沒有折扣 booksPrice:" + booksPrice);
        return booksPrice;
    }
}
