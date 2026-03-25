package com.bytedance.bdtracker;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f178a;
    public long b;
    public volatile boolean c;
    public final d d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public g3(@NotNull d dVar) {
        Intrinsics.EZpvd((Object) dVar, "");
        this.d = dVar;
    }

    public abstract String a();

    public abstract void a(@NotNull JSONObject jSONObject);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void b() {
        this.b = System.currentTimeMillis();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        if (this.c) {
            d dVar = this.d;
            try {
                jSONObject.put("event", "$finder_sdk_monitor");
                jSONObject.put("local_time_ms", System.currentTimeMillis());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", a());
                jSONObject2.put(OtcExtraKeys.PARAMS_SESSION_ID, this.d.getSessionId());
                a(jSONObject2);
                jSONObject.put(MetricsSQLiteCacheKt.METRICS_PARAMS, jSONObject2);
            } catch (Throwable th) {
                dVar.D.error(7, "Run task failed", th, new Object[0]);
            }
        }
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void d() {
        this.f178a = System.currentTimeMillis();
    }
}
