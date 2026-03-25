package com.bytedance.bdtracker;

import android.content.Context;
import android.os.Looper;
import com.bytedance.applog.aggregation.IAggregation;
import com.bytedance.applog.aggregation.IAggregationFlushCallback;
import com.bytedance.applog.aggregation.IMetricsTracker;
import com.bytedance.applog.aggregation.Metrics;
import com.bytedance.applog.aggregation.MetricsSQLiteCache;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.yJA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class n2 {
    public static final /* synthetic */ yJA[] c = {C56524yIo.copydefault(new PropertyReference1Impl(C56524yIo.AEQbTJ(n2.class), "aggregation", "getAggregation()Lcom/bytedance/applog/aggregation/IAggregation;")), C56524yIo.copydefault(new PropertyReference1Impl(C56524yIo.AEQbTJ(n2.class), "trackMap", "getTrackMap()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC56387yDm f228a;
    public final InterfaceC56387yDm b;

    public static final class a extends Lambda implements Function0<IAggregation> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f229a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ Looper c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Context context, Looper looper) {
            super(0);
            this.f229a = str;
            this.b = context;
            this.c = looper;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public IAggregation invoke() {
            StringBuilder sbA = com.bytedance.bdtracker.a.a("applog-aggregation-");
            sbA.append(this.f229a);
            return IAggregation.Companion.newInstance(new MetricsSQLiteCache(this.b, sbA.toString()), this.c);
        }
    }

    public static final class b implements IAggregationFlushCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f230a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public b(Function1 function1) {
            this.f230a = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.bytedance.applog.aggregation.IAggregationFlushCallback
        public void onFinish(@NotNull List<Metrics> list) {
            Intrinsics.EZpvd((Object) list, "");
            this.f230a.invoke(list);
        }
    }

    public static final class c extends Lambda implements Function0<Map<String, IMetricsTracker>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f231a = new c();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public c() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public Map<String, IMetricsTracker> invoke() {
            return new LinkedHashMap();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public n2(@NotNull Looper looper, @NotNull String str, @NotNull Context context) {
        Intrinsics.EZpvd((Object) looper, "");
        Intrinsics.EZpvd((Object) str, "");
        Intrinsics.EZpvd((Object) context, "");
        this.f228a = C56392yDr.copydefault(new a(str, context, looper));
        this.b = C56392yDr.copydefault(c.f231a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(@NotNull Function1<? super List<Metrics>, Unit> function1) {
        Intrinsics.EZpvd((Object) function1, "");
        InterfaceC56387yDm interfaceC56387yDm = this.f228a;
        yJA yja = c[0];
        ((IAggregation) interfaceC56387yDm.getValue()).flush(new b(function1));
    }

    public final IMetricsTracker a(@NotNull u2 u2Var) {
        Intrinsics.EZpvd((Object) u2Var, "");
        InterfaceC56387yDm interfaceC56387yDm = this.b;
        yJA[] yjaArr = c;
        yJA yja = yjaArr[1];
        IMetricsTracker iMetricsTracker = (IMetricsTracker) ((Map) interfaceC56387yDm.getValue()).get(Intrinsics.KWHzl(C56524yIo.AEQbTJ(u2Var.getClass()).valueOf(), u2Var.a()));
        if (iMetricsTracker != null) {
            return iMetricsTracker;
        }
        InterfaceC56387yDm interfaceC56387yDm2 = this.f228a;
        yJA yja2 = yjaArr[0];
        IAggregation iAggregation = (IAggregation) interfaceC56387yDm2.getValue();
        String simpleName = u2Var.getClass().getSimpleName();
        Intrinsics.AEQbTJ(simpleName, "");
        IMetricsTracker iMetricsTrackerNewMetricsTracker = iAggregation.newMetricsTracker(simpleName, u2Var.c(), u2Var.a(), u2Var.f());
        InterfaceC56387yDm interfaceC56387yDm3 = this.b;
        yJA yja3 = yjaArr[1];
        ((Map) interfaceC56387yDm3.getValue()).put(Intrinsics.KWHzl(C56524yIo.AEQbTJ(u2Var.getClass()).valueOf(), u2Var.a()), iMetricsTrackerNewMetricsTracker);
        return iMetricsTrackerNewMetricsTracker;
    }
}
