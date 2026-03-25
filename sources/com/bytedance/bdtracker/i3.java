package com.bytedance.bdtracker;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import o.C56548yJl;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class i3 extends g3 {
    public AtomicInteger e;
    public List<h3> f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(@NotNull d dVar) {
        super(dVar);
        Intrinsics.EZpvd((Object) dVar, "");
        this.e = new AtomicInteger();
        this.f = new ArrayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.g3
    public String a() {
        return "exception";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void a(StringBuilder sb, Throwable th) {
        sb.append(th.toString());
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace == null) {
            stackTrace = new StackTraceElement[0];
        }
        if (stackTrace.length > 3) {
            stackTrace = (StackTraceElement[]) yDV.AEQbTJ(stackTrace, C56548yJl.AhwBna(0, 3));
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("\n\tat ");
            sb.append(stackTraceElement);
        }
    }

    @Override // com.bytedance.bdtracker.g3
    public void a(@NotNull JSONObject jSONObject) {
        Intrinsics.EZpvd((Object) jSONObject, "");
        d dVar = this.d;
        try {
            jSONObject.put(MetricsSQLiteCacheKt.METRICS_START_TIME, this.f178a);
            jSONObject.put(MetricsSQLiteCacheKt.METRICS_END_TIME, this.b);
            jSONObject.put("count", this.e.get());
            jSONObject.put("sampling", r.a((List) this.f));
        } catch (Throwable th) {
            dVar.D.error(7, "Run task failed", th, new Object[0]);
        }
    }

    public final void a(@NotNull Throwable th, @NotNull String str) {
        Intrinsics.EZpvd((Object) th, "");
        Intrinsics.EZpvd((Object) str, "");
        d dVar = this.d;
        try {
            this.c = true;
            this.e.incrementAndGet();
            List<h3> list = this.f;
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            while (th != null) {
                a(sb, th);
                th = th.getCause();
            }
            String string = sb.toString();
            Intrinsics.AEQbTJ(string, "");
            list.add(new h3(jCurrentTimeMillis, string, str));
        } catch (Throwable th2) {
            dVar.D.error(7, "Run task failed", th2, new Object[0]);
        }
    }
}
