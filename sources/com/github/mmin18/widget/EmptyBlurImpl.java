package com.github.mmin18.widget;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes14.dex */
public class EmptyBlurImpl implements BlurImpl {
    @Override // com.github.mmin18.widget.BlurImpl
    public void blur(Bitmap bitmap, Bitmap bitmap2) {
    }

    @Override // com.github.mmin18.widget.BlurImpl
    public boolean prepare(Context context, Bitmap bitmap, float f) {
        return false;
    }

    @Override // com.github.mmin18.widget.BlurImpl
    public void release() {
    }
}
