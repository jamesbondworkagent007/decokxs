package com.bytedance.bdtracker;

import com.bytedance.applog.log.EventBus;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class w1 implements EventBus.DataFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f287a;
    public final /* synthetic */ v1 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public w1(v1 v1Var, JSONObject jSONObject) {
        this.b = v1Var;
        this.f287a = jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.log.EventBus.DataFetcher
    public Object fetch() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        r.c(this.f287a, jSONObject2);
        try {
            jSONObject.put("appId", this.b.b.m);
            jSONObject.put("config", jSONObject2);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
