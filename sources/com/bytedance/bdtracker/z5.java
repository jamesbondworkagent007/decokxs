package com.bytedance.bdtracker;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f314a;
    public final String b;
    public final Boolean c;
    public final Long d;
    public final Long e;
    public final Integer f;
    public final Long g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public z5(String str, String str2, Boolean bool, Long l, Long l2, Integer num, Long l3) {
        this.f314a = str;
        this.b = str2;
        this.c = bool;
        this.d = l;
        this.e = l2;
        this.f = num;
        this.g = l3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, String> a() {
        HashMap map = new HashMap();
        y5.a(map, "id", this.f314a);
        y5.a(map, "req_id", this.b);
        y5.a(map, "is_track_limited", String.valueOf(this.c));
        y5.a(map, "take_ms", String.valueOf(this.d));
        y5.a(map, CrashHianalyticsData.TIME, String.valueOf(this.e));
        y5.a(map, "query_times", String.valueOf(this.f));
        y5.a(map, "hw_id_version_code", String.valueOf(this.g));
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        y5.a(jSONObject, "id", this.f314a);
        y5.a(jSONObject, "req_id", this.b);
        y5.a(jSONObject, "is_track_limited", this.c);
        y5.a(jSONObject, "take_ms", this.d);
        y5.a(jSONObject, CrashHianalyticsData.TIME, this.e);
        y5.a(jSONObject, "query_times", this.f);
        y5.a(jSONObject, "hw_id_version_code", this.g);
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return b().toString();
    }
}
