package com.amplifyframework.predictions.aws.adapter;

import com.amplifyframework.predictions.models.SentimentType;
import kotlin.jvm.internal.Intrinsics;
import o.UntaggedSocketViolation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class SentimentTypeAdapter {
    public static final SentimentTypeAdapter INSTANCE = new SentimentTypeAdapter();

    private SentimentTypeAdapter() {
    }

    public static final SentimentType fromComprehend(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        UntaggedSocketViolation untaggedSocketViolationAEQbTJ = UntaggedSocketViolation.OLrzqt.AEQbTJ(str);
        return Intrinsics.EZpvd(untaggedSocketViolationAEQbTJ, UntaggedSocketViolation.Activity.KWHzl) ? SentimentType.POSITIVE : Intrinsics.EZpvd(untaggedSocketViolationAEQbTJ, UntaggedSocketViolation.StateListAnimator.copydefault) ? SentimentType.NEGATIVE : Intrinsics.EZpvd(untaggedSocketViolationAEQbTJ, UntaggedSocketViolation.Application.EZpvd) ? SentimentType.NEUTRAL : Intrinsics.EZpvd(untaggedSocketViolationAEQbTJ, UntaggedSocketViolation.TaskDescription.copydefault) ? SentimentType.MIXED : SentimentType.UNKNOWN;
    }
}
