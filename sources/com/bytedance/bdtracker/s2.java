package com.bytedance.bdtracker;

import android.text.TextUtils;
import com.bytedance.bdtracker.u2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class s2 implements f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f255a = 1;
    public String b;
    public long c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public s2(String str, long j) {
        this.b = str;
        this.c = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.t2
    public List<String> a() {
        return TextUtils.isEmpty(this.b) ? r.a() : yDY.gEmmrt("metrics_category", "metrics_name", "api_name");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.u2
    public void a(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.EZpvd((Object) jSONObject, "");
        jSONObject.put("api_name", this.b);
        jSONObject.put("api_time", this.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.u2
    public String b() {
        return "api_usage";
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
        return "sdk_usage";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.t2
    public List<Number> f() {
        return r.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.u2
    public Object g() {
        return Long.valueOf(h());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long h() {
        return this.f255a;
    }
}
