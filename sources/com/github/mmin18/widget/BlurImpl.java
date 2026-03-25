package com.github.mmin18.widget;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes14.dex */
interface BlurImpl {
    void blur(Bitmap bitmap, Bitmap bitmap2);

    boolean prepare(Context context, Bitmap bitmap, float f);

    void release();
}
