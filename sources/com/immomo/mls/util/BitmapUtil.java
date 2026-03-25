package com.immomo.mls.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import o.C7326ahi;

/* JADX INFO: loaded from: classes14.dex */
public class BitmapUtil {
    public static native void nativeBlurBitmap(Bitmap bitmap, int i);

    public static Bitmap OLrzqt(Bitmap bitmap, int i) {
        if (bitmap != null && i > 1 && C7326ahi.copydefault("lblur")) {
            nativeBlurBitmap(bitmap, i);
        }
        return bitmap;
    }

    public static Bitmap EZpvd(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = i / width;
        float f2 = i2 / height;
        if (f > 1.0f && f2 > 1.0f) {
            return bitmap;
        }
        if (f > f2) {
            f = f2;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static Bitmap copydefault(ViewGroup viewGroup, boolean z) {
        int height = 0;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            height += viewGroup.getChildAt(i).getHeight();
            if (z) {
                viewGroup.getChildAt(i).setBackgroundColor(0);
            } else {
                viewGroup.getChildAt(i).setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(viewGroup.getWidth(), height, Bitmap.Config.ARGB_8888);
        viewGroup.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }
}
