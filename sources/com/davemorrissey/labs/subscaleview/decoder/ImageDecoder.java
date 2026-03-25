package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes17.dex */
public interface ImageDecoder {
    Bitmap decode(Context context, @NonNull Uri uri) throws Exception;
}
