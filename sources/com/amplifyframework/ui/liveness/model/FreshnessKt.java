package com.amplifyframework.ui.liveness.model;

import androidx.compose.ui.graphics.ColorKt;
import com.amplifyframework.predictions.aws.models.RgbColor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FreshnessKt {
    public static final long toComposeColor(@NotNull RgbColor rgbColor, int i) {
        Intrinsics.checkNotNullParameter(rgbColor, "");
        return ColorKt.Color(rgbColor.getRed(), rgbColor.getGreen(), rgbColor.getBlue(), i);
    }
}
