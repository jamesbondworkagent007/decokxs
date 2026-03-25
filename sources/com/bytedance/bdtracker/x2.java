package com.bytedance.bdtracker;

import android.text.TextUtils;
import com.bytedance.bdtracker.u2;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class x2 implements v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f297a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public x2(@NotNull Throwable th) {
        Intrinsics.EZpvd((Object) th, "");
        this.f297a = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.t2
    public List<String> a() {
        return TextUtils.isEmpty(this.f297a.getMessage()) ? r.a() : yDY.gEmmrt("metrics_category", "metrics_name", "err_underlying_code");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.u2
    public void a(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.EZpvd((Object) jSONObject, "");
        StringWriter stringWriter = new StringWriter();
        this.f297a.printStackTrace(new PrintWriter(stringWriter));
        String message = this.f297a.getMessage();
        if (message == null) {
            message = "unknown";
        }
        jSONObject.put("err_underlying_code", message);
        jSONObject.put("err_message", stringWriter.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.u2
    public String b() {
        return "db_exception";
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
        return "data_statistics";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.t2
    public List<Number> f() {
        return r.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.u2
    public Object g() {
        return 1;
    }
}
