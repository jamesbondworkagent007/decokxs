package com.just.agentweb;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BaseIndicatorView extends FrameLayout implements BaseIndicatorSpec, LayoutParamsOffer {
    @Override // com.just.agentweb.BaseIndicatorSpec
    public void hide() {
    }

    @Override // com.just.agentweb.BaseIndicatorSpec
    public void reset() {
    }

    @Override // com.just.agentweb.BaseIndicatorSpec
    public void setProgress(int i) {
    }

    @Override // com.just.agentweb.BaseIndicatorSpec
    public void show() {
    }

    public BaseIndicatorView(Context context) {
        super(context);
    }

    public BaseIndicatorView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseIndicatorView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
