package com.bytedance.bdtracker;

import com.bytedance.applog.monitor.MonitorSampling;
import com.bytedance.bdtracker.u2;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class y2 implements z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f306a = -1;
    public final long b;
    public final String c;
    public final long d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public y2(long j, String str, long j2) {
        this.b = j;
        this.c = str;
        this.d = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.t2
    public List<String> a() {
        return this.f306a == -1 ? yDY.gEmmrt("metrics_category", "metrics_name", "dims_0", "launch_id", CrashHianalyticsData.PROCESS_ID) : yDY.gEmmrt("metrics_category", "metrics_name", "dims_0", "launch_id", CrashHianalyticsData.PROCESS_ID, "err_code");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.u2
    public void a(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.EZpvd((Object) jSONObject, "");
        jSONObject.put("dims_0", this.b);
        jSONObject.put(CrashHianalyticsData.PROCESS_ID, this.c);
        jSONObject.put("launch_id", MonitorSampling.INSTANCE.getGlobalColdLaunchId$agent_liteGlobalRelease());
        if (this.b == 13) {
            jSONObject.put("err_code", this.f306a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.u2
    public String b() {
        return "event_process";
    }

    @Override // com.bytedance.bdtracker.t2
    public int c() {
        return 7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.u2
    public JSONObject d() {
        return u2.a.a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.u2
    public String e() {
        return "event";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.t2
    public List<Number> f() {
        return r.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bytedance.bdtracker.u2
    public Object g() {
        return Long.valueOf(this.d);
    }
}
