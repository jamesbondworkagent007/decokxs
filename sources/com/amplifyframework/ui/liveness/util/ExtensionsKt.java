package com.amplifyframework.ui.liveness.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.media.MediaCodec;
import android.view.Display;
import androidx.core.content.ContextCompat;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ExtensionsKt {
    public static final boolean isKeyFrame(@NotNull MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(bufferInfo, "");
        return (bufferInfo.flags & 1) != 0;
    }

    public static final boolean hasCameraPermission(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.checkSelfPermission(context, "android.permission.CAMERA") == 0;
    }

    public static final Activity findActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "");
        return findActivity(baseContext);
    }

    public static final int rotationDegrees(@NotNull Display display) {
        Intrinsics.checkNotNullParameter(display, "");
        int rotation = display.getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                return 90;
            }
            if (rotation == 2) {
                return 180;
            }
            if (rotation == 3) {
                return SubsamplingScaleImageView.ORIENTATION_270;
            }
        }
        return 0;
    }
}
