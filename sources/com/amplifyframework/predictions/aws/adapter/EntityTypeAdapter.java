package com.amplifyframework.predictions.aws.adapter;

import com.amplifyframework.predictions.models.EntityType;
import kotlin.jvm.internal.Intrinsics;
import o.PerformanceCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class EntityTypeAdapter {
    public static final EntityTypeAdapter INSTANCE = new EntityTypeAdapter();

    private EntityTypeAdapter() {
    }

    public static final EntityType fromComprehend(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        PerformanceCollector performanceCollectorKWHzl = PerformanceCollector.copydefault.KWHzl(str);
        return Intrinsics.EZpvd(performanceCollectorKWHzl, PerformanceCollector.Fragment.AEQbTJ) ? EntityType.PERSON : Intrinsics.EZpvd(performanceCollectorKWHzl, PerformanceCollector.Activity.KWHzl) ? EntityType.LOCATION : Intrinsics.EZpvd(performanceCollectorKWHzl, PerformanceCollector.LoaderManager.AEQbTJ) ? EntityType.ORGANIZATION : Intrinsics.EZpvd(performanceCollectorKWHzl, PerformanceCollector.ActionBar.KWHzl) ? EntityType.COMMERCIAL_ITEM : Intrinsics.EZpvd(performanceCollectorKWHzl, PerformanceCollector.Application.KWHzl) ? EntityType.EVENT : Intrinsics.EZpvd(performanceCollectorKWHzl, PerformanceCollector.StateListAnimator.EZpvd) ? EntityType.DATE : Intrinsics.EZpvd(performanceCollectorKWHzl, PerformanceCollector.FragmentManager.AEQbTJ) ? EntityType.QUANTITY : Intrinsics.EZpvd(performanceCollectorKWHzl, PerformanceCollector.SharedElementCallback.KWHzl) ? EntityType.TITLE : Intrinsics.EZpvd(performanceCollectorKWHzl, PerformanceCollector.PendingIntent.KWHzl) ? EntityType.UNKNOWN : EntityType.UNKNOWN;
    }
}
