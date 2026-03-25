package com.bytedance.bdtracker;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class i4 extends f4 {
    public String s;
    public String t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public i4() {
        this.s = null;
        this.t = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i4(@NonNull String str, JSONObject jSONObject) {
        this.t = null;
        this.s = str;
        if (jSONObject != null) {
            this.t = jSONObject.toString();
        }
        this.l = 0;
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
        this.t = jSONObject.optString(MetricsSQLiteCacheKt.METRICS_PARAMS, null);
        this.s = jSONObject.optString("category", null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public List<String> b() {
        List<String> listB = super.b();
        ArrayList arrayList = new ArrayList(listB.size());
        arrayList.addAll(listB);
        arrayList.addAll(Arrays.asList(MetricsSQLiteCacheKt.METRICS_PARAMS, "varchar", "category", "varchar"));
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public void b(@NonNull ContentValues contentValues) {
        super.b(contentValues);
        contentValues.put(MetricsSQLiteCacheKt.METRICS_PARAMS, this.t);
        contentValues.put("category", this.s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public void b(@NonNull JSONObject jSONObject) throws JSONException {
        super.b(jSONObject);
        jSONObject.put(MetricsSQLiteCacheKt.METRICS_PARAMS, this.t);
        jSONObject.put("category", this.s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public String c() {
        StringBuilder sbA = a.a("param:");
        sbA.append(this.t);
        sbA.append(" category:");
        sbA.append(this.s);
        return sbA.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public String f() {
        return MTAnalysisConstants.TYPE_EVENT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
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
        if (r.d(this.t)) {
            try {
                JSONObject jSONObject2 = new JSONObject(this.t);
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject2.get(next);
                    if (jSONObject.opt(next) != null) {
                        d().warn(4, this.f174a, "自定义事件存在重复的key", new Object[0]);
                    }
                    jSONObject.put(next, obj);
                }
            } catch (Exception e) {
                d().warn(4, this.f174a, "解析事件参数失败", e);
            }
        }
        return jSONObject;
    }
}
