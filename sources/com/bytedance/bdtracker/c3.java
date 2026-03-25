package com.bytedance.bdtracker;

import com.bytedance.bdtracker.u2;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.gms.common.ConnectionResult;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class c3 implements u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f144a;
    public Integer b;
    public String c;
    public String d;
    public long e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.t2
    public List<String> a() {
        return this.b == null ? r.a() : yDY.gEmmrt("metrics_category", "metrics_name", "err_underlying_code");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.u2
    public void a(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.EZpvd((Object) jSONObject, "");
        if (this.c != null) {
            jSONObject.put("err_code", MTCoreConstants.MainWhat.ON_HEARTBEAT);
            jSONObject.put("err_message", this.c);
            jSONObject.put("err_underlying_code", this.b);
        }
        jSONObject.put("dim_success", this.f144a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.u2
    public String b() {
        String strSubstring = this.d;
        if (strSubstring == null) {
            return "";
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) strSubstring, (CharSequence) "?", false, 2, (Object) null)) {
            strSubstring = strSubstring.substring(0, StringsKt__StringsKt.indexOf$default((CharSequence) strSubstring, "?", 0, false, 6, (Object) null));
            Intrinsics.AEQbTJ(strSubstring, "");
        }
        return strSubstring != null ? strSubstring : "";
    }

    @Override // com.bytedance.bdtracker.t2
    public int c() {
        return 23;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.u2
    public JSONObject d() {
        return u2.a.a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.u2
    public String e() {
        return "network_service";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.t2
    public List<Integer> f() {
        return yDY.gEmmrt(0, 500, 1000, Integer.valueOf(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED), 2000, Integer.valueOf(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS), 5000);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.u2
    public Object g() {
        return Long.valueOf(this.e);
    }
}
