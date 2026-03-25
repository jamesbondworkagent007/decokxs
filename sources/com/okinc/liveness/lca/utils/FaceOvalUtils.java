package com.okinc.liveness.lca.utils;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes19.dex */
public final class FaceOvalUtils {
    public static final int $stable = 0;
    public static final FaceOvalUtils INSTANCE = new FaceOvalUtils();

    private FaceOvalUtils() {
    }

    public final RectF createBoundingRect(int i, int i2, float f, float f2) {
        float f3 = i;
        float f4 = f * f3;
        float f5 = f2 * f4;
        float f6 = 2;
        float f7 = (f3 - f4) / f6;
        float f8 = (i2 - f5) / f6;
        return new RectF(f7, f8, f4 + f7, f5 + f8);
    }
}
