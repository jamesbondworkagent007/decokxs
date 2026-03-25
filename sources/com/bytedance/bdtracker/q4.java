package com.bytedance.bdtracker;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.bytedance.bdtracker.i5;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.google.android.gms.common.Scopes;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class q4 extends f4 {
    public String s;
    public String t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public q4() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public q4(String str, String str2) {
        this.t = str;
        this.s = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public int a(@NonNull Cursor cursor) {
        super.a(cursor);
        this.t = cursor.getString(14);
        this.s = cursor.getString(15);
        return 16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public f4 a(@NonNull JSONObject jSONObject) {
        super.a(jSONObject);
        this.t = jSONObject.optString("event", null);
        this.s = jSONObject.optString(MetricsSQLiteCacheKt.METRICS_PARAMS, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public List<String> b() {
        List<String> listB = super.b();
        ArrayList arrayList = new ArrayList(listB.size());
        arrayList.addAll(listB);
        arrayList.addAll(Arrays.asList("event", "varchar", MetricsSQLiteCacheKt.METRICS_PARAMS, "varchar"));
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public void b(@NonNull ContentValues contentValues) {
        super.b(contentValues);
        contentValues.put("event", this.t);
        contentValues.put(MetricsSQLiteCacheKt.METRICS_PARAMS, this.s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public void b(@NonNull JSONObject jSONObject) throws JSONException {
        super.b(jSONObject);
        jSONObject.put("event", this.t);
        jSONObject.put(MetricsSQLiteCacheKt.METRICS_PARAMS, this.s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public String c() {
        return this.t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public String e() {
        return this.s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public String f() {
        return Scopes.PROFILE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.f4
    public JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("local_time_ms", this.c);
        jSONObject.put("tea_event_index", this.d);
        jSONObject.put(OtcExtraKeys.PARAMS_SESSION_ID, this.e);
        long j = this.f;
        if (j > 0) {
            jSONObject.put(MTCoreConstants.Register.KEY_USER_ID, j);
        }
        jSONObject.put("user_unique_id", TextUtils.isEmpty(this.g) ? JSONObject.NULL : this.g);
        if (!TextUtils.isEmpty(this.h)) {
            jSONObject.put("$user_unique_id_type", this.h);
        }
        if (!TextUtils.isEmpty(this.i)) {
            jSONObject.put("ssid", this.i);
        }
        jSONObject.put("event", this.t);
        a(jSONObject, this.s);
        int i = this.k;
        if (i != i5.a.UNKNOWN.f193a) {
            jSONObject.put("nt", i);
        }
        jSONObject.put("datetime", this.n);
        if (!TextUtils.isEmpty(this.j)) {
            jSONObject.put("ab_sdk_version", this.j);
        }
        return jSONObject;
    }
}
