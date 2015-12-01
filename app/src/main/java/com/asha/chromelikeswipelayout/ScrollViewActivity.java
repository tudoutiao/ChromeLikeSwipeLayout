package com.asha.chromelikeswipelayout;

import android.os.Bundle;
import android.widget.Toast;

import com.asha.ChromeLikeSwipeLayout;

import static com.asha.ChromeLikeSwipeLayout.dp2px;

/**
 * Created by hzqiujiadi on 15/12/01.
 * hzqiujiadi ashqalcn@gmail.com
 */
public class ScrollViewActivity extends SubActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollview);

        ChromeLikeSwipeLayout chromeLikeSwipeLayout = (ChromeLikeSwipeLayout) findViewById(R.id.chrome_like_swipe_layout);
        ChromeLikeSwipeLayout.makeConfig()
                .addIcon(R.drawable.selector_icon_add)
                .addIcon(R.drawable.selector_icon_close)
                .backgroundColor(0xFF111111)
                .circleColor(0xFFCC11FF)
                .gap(dp2px(100))
                .radius(dp2px(30))
                .listenItemSelected(new ChromeLikeSwipeLayout.IOnItemSelectedListener() {
                    @Override
                    public void onItemSelected(int index) {
                        Toast.makeText(ScrollViewActivity.this, "onItemSelected:" + index, Toast.LENGTH_SHORT).show();
                    }
                })
                .setTo(chromeLikeSwipeLayout);
    }
}
