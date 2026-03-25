package com.bytedance.applog.aggregation;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AggregationImpl implements IAggregation, IWorker {
    private final IMetricsCache cache;
    private final Handler handler;
    private final List<IMetricsTracker> trackers;

    public AggregationImpl(@NotNull IMetricsCache iMetricsCache, Looper looper) {
        Intrinsics.EZpvd((Object) iMetricsCache, "");
        this.cache = iMetricsCache;
        this.handler = looper != null ? new Handler(looper) : null;
        this.trackers = new ArrayList();
    }

    @Override // com.bytedance.applog.aggregation.IAggregation
    public IMetricsTracker newMetricsTracker(@NotNull String str, int i, List<String> list, List<? extends Number> list2) {
        Intrinsics.EZpvd((Object) str, "");
        MetricsTrackerImpl metricsTrackerImpl = new MetricsTrackerImpl(str, i, list != null ? CollectionsKt___CollectionsKt.AxsJAYaxsJAY(list) : null, list2, this.cache, this);
        this.trackers.add(metricsTrackerImpl);
        return metricsTrackerImpl;
    }

    @Override // com.bytedance.applog.aggregation.IAggregation
    public void flush(@NotNull final IAggregationFlushCallback iAggregationFlushCallback) {
        Intrinsics.EZpvd((Object) iAggregationFlushCallback, "");
        post(new Function0<Unit>() { // from class: com.bytedance.applog.aggregation.AggregationImpl.flush.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                List<Metrics> all = AggregationImpl.this.cache.getAll();
                AggregationImpl.this.cache.clear();
                iAggregationFlushCallback.onFinish(all);
            }
        });
    }

    @Override // com.bytedance.applog.aggregation.IWorker
    public void post(@NotNull final Function0<Unit> function0) {
        Intrinsics.EZpvd((Object) function0, "");
        Handler handler = this.handler;
        if (handler == null) {
            function0.invoke();
        } else {
            handler.post(new Runnable() { // from class: com.bytedance.applog.aggregation.AggregationImpl.post.1
                @Override // java.lang.Runnable
                public final void run() {
                    function0.invoke();
                }
            });
        }
    }
}
