package com.example.weixin;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by 王伟健 on 2018-03-24.
 */

public class NotFirstView extends View {

    public NotFirstView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_content_is_not_first,null);
    }
}
