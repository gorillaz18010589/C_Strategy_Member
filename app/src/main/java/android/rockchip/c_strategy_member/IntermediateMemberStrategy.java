package android.rockchip.c_strategy_member;

import android.util.Log;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

public class IntermediateMemberStrategy implements MemberStrategy {
    /**
     * 中級會員0.9折
     *
     * @param booksPrice 圖書的原價
     * @return
     */
    @Override
    public double calcPrice(double booksPrice) {
        Log.v(TAG, "PrimaryMemberStrategy -> 中級會員9折 booksPrice:" + booksPrice * 0.9);
        return booksPrice * 0.9;
    }
}
