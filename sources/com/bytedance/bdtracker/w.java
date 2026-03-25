package com.bytedance.bdtracker;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.bytedance.applog.log.LoggerImpl;
import com.bytedance.bdtracker.b;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class w implements b.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p4 f280a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public w(p4 p4Var) {
        this.f280a = p4Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.b.f
    public f4 a() {
        p4 p4Var = (p4) this.f280a.m6119clone();
        JSONObject jSONObjectOptJSONObject = p4Var.h().optJSONObject(MetricsSQLiteCacheKt.METRICS_PARAMS);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        try {
            jSONObjectOptJSONObject.put("$page_duration", p4Var.s);
        } catch (Throwable th) {
            LoggerImpl.global().error("[Navigator] JSON handle failed", th, new Object[0]);
        }
        m4 m4Var = new m4("$bav2b_page_leave");
        m4Var.a(0L);
        m4Var.f175o = jSONObjectOptJSONObject;
        return m4Var;
    }
}
