package com.bytedance.bdtracker;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.bytedance.bdtracker.b;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class u implements b.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p4 f265a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public u(p4 p4Var) {
        this.f265a = p4Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.b.f
    public f4 a() {
        JSONObject jSONObjectOptJSONObject = ((p4) this.f265a.m6119clone()).h().optJSONObject(MetricsSQLiteCacheKt.METRICS_PARAMS);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        m4 m4Var = new m4("bav2b_page");
        m4Var.a(0L);
        m4Var.f175o = jSONObjectOptJSONObject;
        return m4Var;
    }
}
