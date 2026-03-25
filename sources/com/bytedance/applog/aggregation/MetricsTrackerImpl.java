package com.bytedance.applog.aggregation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C56403yEb;
import o.C56529yIt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes2.dex */
public final class MetricsTrackerImpl implements IMetricsTracker {
    private final IMetricsCache cache;
    private final List<String> dimensions;
    private final List<Number> interval;
    private final String metricsName;
    private final int types;
    private final IWorker worker;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IMetricsCache getCache() {
        return this.cache;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getDimensions() {
        return this.dimensions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Number> getInterval() {
        return this.interval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMetricsName() {
        return this.metricsName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTypes() {
        return this.types;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IWorker getWorker() {
        return this.worker;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends java.lang.Number> */
    /* JADX WARN: Multi-variable type inference failed */
    public MetricsTrackerImpl(@NotNull String str, int i, List<String> list, List<? extends Number> list2, @NotNull IMetricsCache iMetricsCache, @NotNull IWorker iWorker) {
        Intrinsics.EZpvd((Object) str, "");
        Intrinsics.EZpvd((Object) iMetricsCache, "");
        Intrinsics.EZpvd((Object) iWorker, "");
        this.metricsName = str;
        this.types = i;
        this.dimensions = list;
        this.interval = list2;
        this.cache = iMetricsCache;
        this.worker = iWorker;
    }

    @Override // com.bytedance.applog.aggregation.IMetricsTracker
    public void track(final Object obj, final JSONObject jSONObject) {
        this.worker.post(new Function0<Unit>() { // from class: com.bytedance.applog.aggregation.MetricsTrackerImpl.track.1
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
                String strJoinToString$default;
                MetricsTrackerImpl metricsTrackerImpl = MetricsTrackerImpl.this;
                String strCalculateMetricsInterval = metricsTrackerImpl.calculateMetricsInterval(obj, metricsTrackerImpl.getInterval());
                List<String> dimensions = MetricsTrackerImpl.this.getDimensions();
                if (dimensions != null) {
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(dimensions, 10));
                    for (String str : dimensions) {
                        JSONObject jSONObject2 = jSONObject;
                        arrayList.add(jSONObject2 != null ? jSONObject2.opt(str) : null);
                    }
                    strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "-", null, null, 0, null, null, 62, null);
                } else {
                    strJoinToString$default = null;
                }
                String str2 = MetricsTrackerImpl.this.getMetricsName() + '|' + MetricsTrackerImpl.this.getTypes() + '|' + strCalculateMetricsInterval + '|' + strJoinToString$default;
                Metrics metrics = MetricsTrackerImpl.this.getCache().get(str2);
                boolean z = metrics == null;
                if (metrics == null) {
                    String metricsName = MetricsTrackerImpl.this.getMetricsName();
                    int types = MetricsTrackerImpl.this.getTypes();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject3 = jSONObject;
                    metrics = new Metrics(metricsName, str2, types, jCurrentTimeMillis, jSONObject3 != null ? UtilsKt.copy(jSONObject3) : null, strCalculateMetricsInterval);
                }
                metrics.append(obj);
                if (z) {
                    MetricsTrackerImpl.this.getCache().insert(str2, metrics);
                } else {
                    MetricsTrackerImpl.this.getCache().update(str2, metrics);
                }
            }
        });
    }

    private final Metrics getOrCreateMetrics(String str, JSONObject jSONObject, String str2) {
        Metrics metrics = this.cache.get(str);
        if (metrics == null) {
            return new Metrics(this.metricsName, str, this.types, System.currentTimeMillis(), jSONObject != null ? UtilsKt.copy(jSONObject) : null, str2);
        }
        return metrics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String calculateMetricsInterval(Object obj, List<? extends Number> list) {
        String str;
        if ((this.types & 16) <= 0 || list == null || !(!list.isEmpty()) || !(obj instanceof Number)) {
            return null;
        }
        double dDoubleValue = ((Number) obj).doubleValue();
        Iterator<? extends Number> it = list.iterator();
        String str2 = "";
        while (true) {
            if (!it.hasNext()) {
                str = Marker.ANY_NON_NULL_MARKER;
                break;
            }
            double dDoubleValue2 = it.next().doubleValue();
            if (dDoubleValue < dDoubleValue2) {
                C56529yIt c56529yIt = C56529yIt.KWHzl;
                str = String.format("%.0f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue2)}, 1));
                Intrinsics.AEQbTJ(str, "");
                break;
            }
            C56529yIt c56529yIt2 = C56529yIt.KWHzl;
            str2 = String.format("%.0f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue2)}, 1));
            Intrinsics.AEQbTJ(str2, "");
        }
        return '(' + str2 + AbstractJsonLexerKt.COMMA + str + ')';
    }
}
