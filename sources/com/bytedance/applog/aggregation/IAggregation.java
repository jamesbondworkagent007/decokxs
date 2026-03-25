package com.bytedance.applog.aggregation;

import android.os.Looper;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface IAggregation {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int TYPE_AVG = 4;
    public static final int TYPE_COUNT = 1;
    public static final int TYPE_INTERVAL = 16;
    public static final int TYPE_MERGE = 8;
    public static final int TYPE_SUM = 2;

    void flush(@NotNull IAggregationFlushCallback iAggregationFlushCallback);

    IMetricsTracker newMetricsTracker(@NotNull String str, int i, List<String> list, List<? extends Number> list2);

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int TYPE_AVG = 4;
        public static final int TYPE_COUNT = 1;
        public static final int TYPE_INTERVAL = 16;
        public static final int TYPE_MERGE = 8;
        public static final int TYPE_SUM = 2;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final IAggregation newInstance(@NotNull IMetricsCache iMetricsCache) {
            return newInstance$default(this, iMetricsCache, null, 2, null);
        }

        private Companion() {
        }

        public static /* synthetic */ IAggregation newInstance$default(Companion companion, IMetricsCache iMetricsCache, Looper looper, int i, Object obj) {
            if ((i & 2) != 0) {
                looper = null;
            }
            return companion.newInstance(iMetricsCache, looper);
        }

        public final IAggregation newInstance(@NotNull IMetricsCache iMetricsCache, Looper looper) {
            Intrinsics.EZpvd((Object) iMetricsCache, "");
            return new AggregationImpl(iMetricsCache, looper);
        }
    }
}
