package com.okinc.liveness.lca.utils;

import android.view.Display;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class DisplayExtKt {
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
