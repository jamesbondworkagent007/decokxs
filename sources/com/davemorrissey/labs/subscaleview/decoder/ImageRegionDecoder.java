package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes17.dex */
public interface ImageRegionDecoder {
    Bitmap decodeRegion(@NonNull Rect rect, int i);

    Point init(Context context, @NonNull Uri uri) throws Exception;

    boolean isReady();

    void recycle();
}
