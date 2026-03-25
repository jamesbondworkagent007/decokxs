package com.bytedance.bdtracker;

import android.text.TextUtils;
import com.bytedance.applog.log.EventBus;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b4 implements EventBus.DataFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HttpURLConnection f140a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ JSONObject d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ long f;
    public final /* synthetic */ a4 g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public b4(a4 a4Var, HttpURLConnection httpURLConnection, String str, String str2, JSONObject jSONObject, byte b, long j) {
        this.g = a4Var;
        this.f140a = httpURLConnection;
        this.b = str;
        this.c = str2;
        this.d = jSONObject;
        this.e = b;
        this.f = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.log.EventBus.DataFetcher
    public Object fetch() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            Map<String, List<String>> requestProperties = this.f140a.getRequestProperties();
            if (!requestProperties.isEmpty()) {
                for (Map.Entry<String, List<String>> entry : requestProperties.entrySet()) {
                    jSONObject2.put(entry.getKey(), TextUtils.join(",", entry.getValue()));
                }
            }
            jSONObject.put("appId", this.g.b.m);
            jSONObject.put("nid", this.b);
            jSONObject.put("url", this.c);
            jSONObject.put("data", this.d);
            jSONObject.put("header", jSONObject2);
            jSONObject.put(FirebaseAnalytics.Param.METHOD, (int) this.e);
            jSONObject.put(CrashHianalyticsData.TIME, this.f);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
