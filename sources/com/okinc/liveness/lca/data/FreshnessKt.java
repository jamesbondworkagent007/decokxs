package com.okinc.liveness.lca.data;

import android.graphics.Color;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class FreshnessKt {
    public static final int toColor(@NotNull RgbColor rgbColor) {
        Intrinsics.checkNotNullParameter(rgbColor, "");
        return Color.argb(rgbColor.getAlpha(), rgbColor.getRed(), rgbColor.getGreen(), rgbColor.getBlue());
    }
}
