package com.amplifyframework.predictions.aws.adapter;

import com.amplifyframework.predictions.models.EmotionType;
import kotlin.jvm.internal.Intrinsics;
import o.SimpleCursorAdapter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class EmotionTypeAdapter {
    public static final EmotionTypeAdapter INSTANCE = new EmotionTypeAdapter();

    private EmotionTypeAdapter() {
    }

    public static final EmotionType fromRekognition(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SimpleCursorAdapter simpleCursorAdapterKWHzl = SimpleCursorAdapter.KWHzl.KWHzl(str);
        return Intrinsics.EZpvd(simpleCursorAdapterKWHzl, SimpleCursorAdapter.PendingIntent.OLrzqt) ? EmotionType.HAPPY : Intrinsics.EZpvd(simpleCursorAdapterKWHzl, SimpleCursorAdapter.Fragment.copydefault) ? EmotionType.SAD : Intrinsics.EZpvd(simpleCursorAdapterKWHzl, SimpleCursorAdapter.ActionBar.OLrzqt) ? EmotionType.ANGRY : Intrinsics.EZpvd(simpleCursorAdapterKWHzl, SimpleCursorAdapter.Application.copydefault) ? EmotionType.CONFUSED : Intrinsics.EZpvd(simpleCursorAdapterKWHzl, SimpleCursorAdapter.StateListAnimator.EZpvd) ? EmotionType.DISGUSTED : Intrinsics.EZpvd(simpleCursorAdapterKWHzl, SimpleCursorAdapter.FragmentManager.EZpvd) ? EmotionType.SURPRISED : Intrinsics.EZpvd(simpleCursorAdapterKWHzl, SimpleCursorAdapter.Activity.OLrzqt) ? EmotionType.CALM : Intrinsics.EZpvd(simpleCursorAdapterKWHzl, SimpleCursorAdapter.Dialog.OLrzqt) ? EmotionType.FEAR : EmotionType.UNKNOWN;
    }
}
