package com.amplifyframework.predictions.aws.adapter;

import com.amplifyframework.predictions.models.GenderBinaryType;
import kotlin.jvm.internal.Intrinsics;
import o.TabWidget;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class GenderBinaryTypeAdapter {
    public static final GenderBinaryTypeAdapter INSTANCE = new GenderBinaryTypeAdapter();

    private GenderBinaryTypeAdapter() {
    }

    public static final GenderBinaryType fromRekognition(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TabWidget tabWidgetOLrzqt = TabWidget.copydefault.OLrzqt(str);
        return Intrinsics.EZpvd(tabWidgetOLrzqt, TabWidget.StateListAnimator.OLrzqt) ? GenderBinaryType.MALE : Intrinsics.EZpvd(tabWidgetOLrzqt, TabWidget.Application.OLrzqt) ? GenderBinaryType.FEMALE : GenderBinaryType.UNKNOWN;
    }
}
