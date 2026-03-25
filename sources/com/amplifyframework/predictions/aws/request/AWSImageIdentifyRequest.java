package com.amplifyframework.predictions.aws.request;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class AWSImageIdentifyRequest {
    private static final int COMPRESS_QUALITY_PERCENT = 100;
    private final ByteBuffer imageData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ByteBuffer getImageData() {
        return this.imageData;
    }

    private AWSImageIdentifyRequest(ByteBuffer byteBuffer) {
        this.imageData = byteBuffer;
    }

    public static AWSImageIdentifyRequest fromBitmap(@NonNull Bitmap bitmap) {
        Objects.requireNonNull(bitmap);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return new AWSImageIdentifyRequest(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
    }
}
