package com.bytedance.bdtracker;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.bytedance.applog.log.AbstractAppLogLogger;
import com.bytedance.applog.log.IAppLogLogger;
import com.bytedance.applog.log.LoggerImpl;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.google.android.gms.common.Scopes;
import com.okinc.p2p.api.OtcExtraKeys;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f4 implements Cloneable {
    public static final SimpleDateFormat q = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    public static final z4<HashMap<String, f4>> r = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<String> f174a;
    public long b;
    public long c;
    public long d;
    public String e;
    public long f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public int l;
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public JSONObject f175o;
    public String p;

    public static final class a extends z4<HashMap<String, f4>> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.bdtracker.z4
        public HashMap<String, f4> a(Object[] objArr) {
            return f4.j();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public f4() {
        a(0L);
        this.f174a = Collections.singletonList(f());
        this.p = r.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static f4 a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return r.b(new Object[0]).get(jSONObject.optString("k_cls", "")).m6119clone().a(jSONObject);
        } catch (Throwable th) {
            LoggerImpl.global().error(4, "JSON handle failed", th, new Object[0]);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(f4 f4Var, String str) {
        try {
            JSONObject jSONObject = f4Var.f175o;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("$app_version", str);
            f4Var.f175o = jSONObject;
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String b(long j) {
        return q.format(new Date(j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static HashMap<String, f4> j() {
        HashMap<String, f4> map = new HashMap<>();
        map.put("page", new p4());
        map.put("launch", new n4());
        map.put("terminate", new s4());
        map.put("packV2", new o4());
        map.put("eventv3", new m4());
        map.put(MTAnalysisConstants.TYPE_EVENT, new i4());
        map.put(Scopes.PROFILE, new q4(null, null));
        map.put("trace", new t4());
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int a(@NonNull Cursor cursor) {
        this.b = cursor.getLong(0);
        this.c = cursor.getLong(1);
        this.d = cursor.getLong(2);
        this.k = cursor.getInt(3);
        this.f = cursor.getLong(4);
        this.e = cursor.getString(5);
        this.g = cursor.getString(6);
        this.h = cursor.getString(7);
        this.i = cursor.getString(8);
        this.j = cursor.getString(9);
        this.l = cursor.getInt(10);
        this.m = cursor.getString(11);
        String string = cursor.getString(12);
        this.p = cursor.getString(13);
        this.f175o = new JSONObject();
        if (TextUtils.isEmpty(string)) {
            return 14;
        }
        try {
            this.f175o = new JSONObject(string);
            return 14;
        } catch (Exception unused) {
            return 14;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContentValues a(@Nullable ContentValues contentValues) {
        if (contentValues == null) {
            contentValues = new ContentValues();
        } else {
            contentValues.clear();
        }
        b(contentValues);
        return contentValues;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public f4 a(@NonNull JSONObject jSONObject) {
        this.c = jSONObject.optLong("local_time_ms", 0L);
        this.b = 0L;
        this.d = 0L;
        this.k = 0;
        this.f = 0L;
        this.e = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.m = jSONObject.optString("_app_id");
        this.f175o = jSONObject.optJSONObject("properties");
        this.p = jSONObject.optString("local_event_id", r.c());
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String a() {
        List<String> listB = b();
        if (listB == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("create table if not exists ");
        sb.append(f());
        sb.append("(");
        for (int i = 0; i < listB.size(); i += 2) {
            sb.append(listB.get(i));
            sb.append(" ");
            sb.append(listB.get(i + 1));
            sb.append(",");
        }
        sb.delete(sb.length() - 1, sb.length());
        sb.append(")");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(long j) {
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        this.c = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            a(jSONObject, new JSONObject());
            return;
        }
        try {
            a(jSONObject, new JSONObject(str));
        } catch (Throwable th) {
            d().error(4, this.f174a, "Merge params failed", th, new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject2 != null && jSONObject2.length() > 0) {
            r.c(jSONObject2, jSONObject3);
        }
        JSONObject jSONObject4 = this.f175o;
        if (jSONObject4 != null && jSONObject4.length() > 0) {
            r.c(this.f175o, jSONObject3);
        }
        try {
            jSONObject.put(MetricsSQLiteCacheKt.METRICS_PARAMS, jSONObject3);
        } catch (Throwable th) {
            d().error(4, this.f174a, "Merge params failed", th, new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<String> b() {
        return Arrays.asList("_id", "integer primary key autoincrement", "local_time_ms", TypedValues.Custom.S_INT, "tea_event_index", TypedValues.Custom.S_INT, "nt", TypedValues.Custom.S_INT, MTCoreConstants.Register.KEY_USER_ID, TypedValues.Custom.S_INT, OtcExtraKeys.PARAMS_SESSION_ID, "varchar", "user_unique_id", "varchar", "user_unique_id_type", "varchar", "ssid", "varchar", "ab_sdk_version", "varchar", "event_type", TypedValues.Custom.S_INT, "_app_id", "varchar", "properties", "varchar", "local_event_id", "varchar");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void b(@NonNull ContentValues contentValues) {
        contentValues.put("local_time_ms", Long.valueOf(this.c));
        contentValues.put("tea_event_index", Long.valueOf(this.d));
        contentValues.put("nt", Integer.valueOf(this.k));
        contentValues.put(MTCoreConstants.Register.KEY_USER_ID, Long.valueOf(this.f));
        contentValues.put(OtcExtraKeys.PARAMS_SESSION_ID, this.e);
        contentValues.put("user_unique_id", r.a((Object) this.g));
        contentValues.put("user_unique_id_type", this.h);
        contentValues.put("ssid", this.i);
        contentValues.put("ab_sdk_version", this.j);
        contentValues.put("event_type", Integer.valueOf(this.l));
        contentValues.put("_app_id", this.m);
        JSONObject jSONObject = this.f175o;
        contentValues.put("properties", jSONObject != null ? jSONObject.toString() : "");
        contentValues.put("local_event_id", this.p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void b(@NonNull JSONObject jSONObject) throws JSONException {
        jSONObject.put("local_time_ms", this.c);
        jSONObject.put("_app_id", this.m);
        jSONObject.put("properties", this.f175o);
        jSONObject.put("local_event_id", this.p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String c() {
        StringBuilder sbA = com.bytedance.bdtracker.a.a("sid:");
        sbA.append(this.e);
        return sbA.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public f4 m6119clone() {
        try {
            f4 f4Var = (f4) super.clone();
            f4Var.p = r.c();
            return f4Var;
        } catch (CloneNotSupportedException e) {
            d().error(4, this.f174a, "Clone data failed", e, new Object[0]);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IAppLogLogger d() {
        IAppLogLogger logger = AbstractAppLogLogger.getLogger(this.m);
        return logger != null ? logger : LoggerImpl.global();
    }

    public String e() {
        return null;
    }

    public abstract String f();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("k_cls", f());
            b(jSONObject);
        } catch (JSONException e) {
            d().error(4, this.f174a, "JSON handle failed", e, new Object[0]);
        }
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSONObject h() {
        JSONObject jSONObject = new JSONObject();
        try {
            this.n = b(this.c);
            return i();
        } catch (JSONException e) {
            d().error(4, this.f174a, "JSON handle failed", e, new Object[0]);
            return jSONObject;
        }
    }

    public abstract JSONObject i();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        String strF = f();
        if (!getClass().getSimpleName().equalsIgnoreCase(strF)) {
            strF = strF + ", " + getClass().getSimpleName();
        }
        String strSubstring = this.e;
        if (strSubstring != null) {
            int iIndexOf = strSubstring.indexOf("-");
            if (iIndexOf >= 0) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
        } else {
            strSubstring = "-";
        }
        return "{" + strF + ", " + c() + ", " + strSubstring + ", " + this.c + ", " + this.d + ", " + this.e + "}";
    }
}
