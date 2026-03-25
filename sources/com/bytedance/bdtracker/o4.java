package com.bytedance.bdtracker;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.applog.event.AutoTrackEventType;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.reown.android.push.notifications.PushMessagingService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class o4 extends f4 {
    public int A;
    public String B;
    public boolean C = false;
    public List<m4> s;
    public List<i4> t;
    public List<p4> u;
    public List<n4> v;
    public List<s4> w;
    public List<t4> x;
    public JSONObject y;
    public byte[] z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public int a(@NonNull Cursor cursor) {
        this.b = cursor.getLong(0);
        this.c = cursor.getLong(1);
        this.z = cursor.getBlob(2);
        this.A = cursor.getInt(3);
        this.l = cursor.getInt(4);
        this.m = cursor.getString(5);
        this.B = cursor.getString(6);
        this.e = "";
        return 7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public f4 a(@NonNull JSONObject jSONObject) {
        d().error(4, this.f174a, "Not allowed", new Object[0]);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSONArray a(Set<String> set) {
        JSONArray jSONArray = new JSONArray();
        if (this.C) {
            d dVarA = b.a(this.m);
            if (dVarA == null || !dVarA.isBavEnabled()) {
                List<p4> list = this.u;
                if (list != null) {
                    for (p4 p4Var : list) {
                        if (p4Var.C) {
                            jSONArray.put(p4Var.h());
                            if (set != null) {
                                set.add(p4Var.p);
                            }
                        }
                    }
                }
            } else if (this.u != null && (dVarA.getInitConfig() == null || AutoTrackEventType.a(dVarA.getInitConfig().getAutoTrackEventType(), 2))) {
                for (p4 p4Var2 : this.u) {
                    jSONArray.put(p4Var2.h());
                    if (set != null) {
                        set.add(p4Var2.p);
                    }
                }
            }
        }
        List<m4> list2 = this.s;
        if (list2 != null && !list2.isEmpty()) {
            for (m4 m4Var : this.s) {
                jSONArray.put(m4Var.h());
                if (set != null) {
                    set.add(m4Var.p);
                }
            }
        }
        List<t4> list3 = this.x;
        if (list3 != null && !list3.isEmpty()) {
            for (t4 t4Var : this.x) {
                jSONArray.put(t4Var.h());
                if (set != null) {
                    set.add(t4Var.p);
                }
            }
        }
        return jSONArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(List<? extends f4> list, u4 u4Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<? extends f4> it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            f4 next = it.next();
            if (u4Var.a(next.h(), z)) {
                d().debug("calcEventList pack, data: {}", next);
            } else {
                it.remove();
                d().debug("calcEventList discard, data: {}", next);
            }
            z = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public List<String> b() {
        return Arrays.asList("_id", "integer primary key autoincrement", "local_time_ms", TypedValues.Custom.S_INT, "_data", PushMessagingService.KEY_BLOB, "_fail", TypedValues.Custom.S_INT, "event_type", TypedValues.Custom.S_INT, "_app_id", "varchar", "e_ids", "varchar");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public void b(@NonNull ContentValues contentValues) {
        contentValues.put("local_time_ms", Long.valueOf(this.c));
        contentValues.put("_data", o());
        contentValues.put("event_type", Integer.valueOf(this.l));
        contentValues.put("_app_id", this.m);
        contentValues.put("e_ids", this.B);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public void b(@NonNull JSONObject jSONObject) {
        d().error(4, this.f174a, "Not allowed", new Object[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public String c() {
        return String.valueOf(this.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public String f() {
        return "packV2";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.f4
    public JSONObject i() throws JSONException {
        int i;
        d dVarA = b.a(this.m);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("magic_tag", "ss_app_log");
        jSONObject.put("header", this.y);
        jSONObject.put("time_sync", a4.d);
        HashSet hashSet = new HashSet();
        List<n4> list = this.v;
        if (list != null && !list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (n4 n4Var : this.v) {
                jSONArray.put(n4Var.h());
                hashSet.add(n4Var.p);
            }
            jSONObject.put("launch", jSONArray);
        }
        List<s4> list2 = this.w;
        if (list2 != null && !list2.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            for (s4 s4Var : this.w) {
                JSONObject jSONObjectH = s4Var.h();
                if (dVarA != null && (i = dVarA.l) > 0) {
                    jSONObjectH.put("launch_from", i);
                    dVarA.l = 0;
                }
                if (this.u != null) {
                    ArrayList arrayList = new ArrayList();
                    for (p4 p4Var : this.u) {
                        if (r.a(p4Var.e, s4Var.e)) {
                            arrayList.add(p4Var);
                        }
                    }
                    if (arrayList.size() != 0) {
                        int size = arrayList.size();
                        long j = 0;
                        for (int i2 = 0; i2 < size; i2++) {
                            p4 p4Var2 = (p4) arrayList.get(i2);
                            long j2 = p4Var2.c;
                            if (j2 > j) {
                                jSONObjectH.put("$page_title", r.a((Object) p4Var2.v));
                                jSONObjectH.put("$page_key", r.a((Object) p4Var2.u));
                                j = j2;
                            }
                        }
                        jSONArray2.put(jSONObjectH);
                        hashSet.add(s4Var.p);
                    }
                }
            }
            jSONObject.put("terminate", jSONArray2);
        }
        JSONArray jSONArrayA = a(hashSet);
        if (jSONArrayA.length() > 0) {
            jSONObject.put("event_v3", jSONArrayA);
        }
        List<i4> list3 = this.t;
        if (list3 != null && !list3.isEmpty()) {
            HashMap map = new HashMap();
            for (i4 i4Var : this.t) {
                JSONArray jSONArray3 = (JSONArray) map.get(i4Var.s);
                if (jSONArray3 == null) {
                    jSONArray3 = new JSONArray();
                    map.put(i4Var.s, jSONArray3);
                }
                jSONArray3.put(i4Var.h());
                hashSet.add(i4Var.p);
            }
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        this.B = TextUtils.join(",", hashSet);
        d().debug(4, this.f174a, "Pack success ts:{}", Long.valueOf(this.c));
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int k() {
        d dVarA;
        List<p4> list;
        List<n4> list2 = this.v;
        int size = list2 != null ? 200 - list2.size() : 200;
        List<s4> list3 = this.w;
        if (list3 != null) {
            size -= list3.size();
        }
        return (!this.C || (dVarA = b.a(this.m)) == null || !dVarA.isBavEnabled() || (list = this.u) == null) ? size : size - list.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Set<String> l() {
        HashSet hashSet = new HashSet();
        if (TextUtils.isEmpty(this.B)) {
            return hashSet;
        }
        hashSet.addAll(Arrays.asList(this.B.split(",")));
        return hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void m() {
        List<p4> list;
        JSONObject jSONObject = this.y;
        if (jSONObject == null) {
            return;
        }
        jSONObject.remove("ssid");
        try {
            List<n4> list2 = this.v;
            if (list2 != null) {
                for (n4 n4Var : list2) {
                    if (r.d(n4Var.i)) {
                        this.y.put("ssid", n4Var.i);
                        return;
                    }
                }
            }
            if (this.C && (list = this.u) != null) {
                for (p4 p4Var : list) {
                    if (r.d(p4Var.i)) {
                        this.y.put("ssid", p4Var.i);
                        return;
                    }
                }
            }
            List<i4> list3 = this.t;
            if (list3 != null) {
                for (i4 i4Var : list3) {
                    if (r.d(i4Var.i)) {
                        this.y.put("ssid", i4Var.i);
                        return;
                    }
                }
            }
            List<m4> list4 = this.s;
            if (list4 != null) {
                for (m4 m4Var : list4) {
                    if (r.d(m4Var.i)) {
                        this.y.put("ssid", m4Var.i);
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            d().error(4, this.f174a, "Reload ssid from event failed", th, new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void n() {
        List<p4> list;
        JSONObject jSONObject = this.y;
        if (jSONObject == null) {
            return;
        }
        jSONObject.remove("user_unique_id_type");
        try {
            List<n4> list2 = this.v;
            if (list2 != null) {
                for (n4 n4Var : list2) {
                    if (r.d(n4Var.h)) {
                        this.y.put("user_unique_id_type", n4Var.h);
                        return;
                    }
                }
            }
            if (this.C && (list = this.u) != null) {
                for (p4 p4Var : list) {
                    if (r.d(p4Var.h)) {
                        this.y.put("user_unique_id_type", p4Var.h);
                        return;
                    }
                }
            }
            List<i4> list3 = this.t;
            if (list3 != null) {
                for (i4 i4Var : list3) {
                    if (r.d(i4Var.h)) {
                        this.y.put("user_unique_id_type", i4Var.h);
                        return;
                    }
                }
            }
            List<m4> list4 = this.s;
            if (list4 != null) {
                for (m4 m4Var : list4) {
                    if (r.d(m4Var.h)) {
                        this.y.put("user_unique_id_type", m4Var.h);
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            d().error(4, this.f174a, "Reload uuid type from event failed", th, new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] o() {
        try {
            return h().toString().getBytes(C.UTF8_NAME);
        } catch (Throwable th) {
            d().error(4, this.f174a, "Convert json to bytes failed", th, new Object[0]);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f4
    public String toString() {
        StringBuilder sb = new StringBuilder("Pack detail:");
        List<m4> list = this.s;
        int size = list != null ? list.size() : 0;
        List<i4> list2 = this.t;
        if (list2 != null) {
            size += list2.size();
        }
        if (size > 0) {
            sb.append("\teventCount=");
            sb.append(size);
        }
        List<p4> list3 = this.u;
        if (list3 != null && !list3.isEmpty()) {
            sb.append("\tpageCount=");
            sb.append(this.u.size());
        }
        List<n4> list4 = this.v;
        if (list4 != null && !list4.isEmpty()) {
            sb.append("\tlaunchCount=");
            sb.append(this.v.size());
        }
        List<s4> list5 = this.w;
        if (list5 != null && !list5.isEmpty()) {
            sb.append("\tterminateCount=");
            sb.append(this.w.size());
        }
        List<t4> list6 = this.x;
        if (list6 != null && !list6.isEmpty()) {
            sb.append("\ttraceCount=");
            sb.append(this.x.size());
        }
        if (this.A > 0) {
            sb.append("\tfailCount=");
            sb.append(this.A);
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void c(JSONObject jSONObject) {
        try {
            u4 u4Var = new u4();
            if (u4Var.c) {
                int iA = u4.a(jSONObject) + CacheDataSink.DEFAULT_BUFFER_SIZE;
                u4Var.b = iA;
                u4Var.f268a = iA;
            }
            a(this.v, u4Var);
            a(this.w, u4Var);
            a(this.s, u4Var);
            a(this.t, u4Var);
            a(this.x, u4Var);
        } catch (Throwable th) {
            d().error("calcPackLength failed", th, new Object[0]);
        }
    }
}
