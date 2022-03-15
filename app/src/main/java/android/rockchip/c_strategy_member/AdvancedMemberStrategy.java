package android.rockchip.c_strategy_member;

import android.util.Log;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

public class AdvancedMemberStrategy implements MemberStrategy {
    /**
     * 高級會員,8折
     * @param booksPrice 圖書的原價
     * @return
     */
    @Override
    public double calcPrice(double booksPrice) {
        Log.v(TAG, "AdvancedMemberStrategy -> 高級會員8折 booksPrice:" + booksPrice * 0.8);
        return booksPrice * 0.8;
    }
}
