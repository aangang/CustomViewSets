package com.zyyoona7.customviewsets;

import android.os.Bundle;
import android.widget.Button;

import com.zyyoona7.customviewsets.basic_operation.BasicOperationActivity;
import com.zyyoona7.customviewsets.custom_layout_manager.CardActivity;
import com.zyyoona7.customviewsets.heart.HeartActivity;
import com.zyyoona7.customviewsets.pagination_rv.LayoutManagerActivity;
import com.zyyoona7.customviewsets.zoom_hover.ZoomHoverActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {
    @BindView(R.id.btn_basic_operation)
    Button mBtnBasicOp;

    @BindView(R.id.btn_overlay_card)
    Button mBtnOverlayCard;

    @BindView(R.id.btn_card_layout_manager)
    Button mBtnCardLayoutManager;
    @BindView(R.id.btn_paging)
    Button mBtnPaging;
    @BindView(R.id.btn_heart)
    Button mBtnHeart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getContentViewID() {
        return R.layout.activity_main;
    }

    @OnClick(R.id.btn_basic_operation)
    void basicOpClick() {
        goTo(BasicOperationActivity.class);
    }

    @OnClick(R.id.btn_overlay_card)
    void overlayCardClick() {
        goTo(ZoomHoverActivity.class);
    }

    @OnClick(R.id.btn_card_layout_manager)
    void cardLayoutManagerBtnClick() {
        goTo(CardActivity.class);
    }

    @OnClick(R.id.btn_paging)
    void pagingBtnClick() {
        goTo(LayoutManagerActivity.class);
    }

    @OnClick(R.id.btn_heart)
    void heartBtnClick() {
        goTo(HeartActivity.class);
    }

}
