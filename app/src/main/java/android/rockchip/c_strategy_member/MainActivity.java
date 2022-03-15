package android.rockchip.c_strategy_member;
/*
1. 當系統需要動態的選擇策略時。
2. 一個類別定義多種行為，且這些行為在這個類別中有多個條件(if-else)語法形式出現時。
3. 系統演算法獨立，且要求對client隱藏實作細節時。

* 假設現在要設計一個販賣各類書籍的電子商務網站的購物車系統。
* 一個最簡單的情況就是把所有貨品的單價乘上數量，但是實際情況肯定比這要復雜。
* 比如，本網站可能對所有的高級會員提供每本20%的促銷折扣；
* 對中級會員提供每本10%的促銷折扣；對初級會員沒有折扣。

根據描述，折扣是根據以下的幾個算法中的一個進行的：

算法一：對初級會員沒有折扣。

算法二：對中級會員提供10%的促銷折扣。

算法三：對高級會員提供20%的促銷折扣。
* */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public final static String TAG ="hank";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //物件實體化高級會員
        MemberStrategy memberStrategy = new AdvancedMemberStrategy();

        //price建構式設定高級會員
        Price price = new Price(memberStrategy);

        //使用高級會員的折扣
        double advancedMemberCount = price.quote(1000);
        Log.v(TAG ,"advancedMemberCount :" + advancedMemberCount); //800.0

        //改用中級會員折扣
        memberStrategy = new IntermediateMemberStrategy();

        //price設定為中級會員
        price.setPrice(new IntermediateMemberStrategy());

        double intermediateMemberCount = price.quote(1000);
        Log.v(TAG ,"intermediateMemberCount :" + intermediateMemberCount); //900.0
    }
}