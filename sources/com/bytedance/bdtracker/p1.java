package com.bytedance.bdtracker;

import android.text.TextUtils;
import com.bytedance.applog.log.IAppLogLogger;
import com.bytedance.applog.store.kv.IKVStore;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<String> f240a;
    public final Set<String> b;
    public final Set<String> c;
    public final Set<String> d;
    public final IKVStore e;
    public final IAppLogLogger f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public p1(IKVStore iKVStore, IAppLogLogger iAppLogLogger) {
        HashSet hashSet = new HashSet();
        this.f240a = hashSet;
        HashSet hashSet2 = new HashSet();
        this.b = hashSet2;
        HashSet hashSet3 = new HashSet();
        this.c = hashSet3;
        HashSet hashSet4 = new HashSet();
        this.d = hashSet4;
        this.e = iKVStore;
        this.f = iAppLogLogger;
        Set<String> stringSet = iKVStore.getStringSet("block_events_v1", null);
        if (stringSet != null) {
            hashSet.addAll(stringSet);
        }
        Set<String> stringSet2 = iKVStore.getStringSet("block_events_v3", null);
        if (stringSet2 != null) {
            hashSet2.addAll(stringSet2);
        }
        Set<String> stringSet3 = iKVStore.getStringSet("white_events_v1", null);
        if (stringSet3 != null) {
            hashSet3.addAll(stringSet3);
        }
        Set<String> stringSet4 = iKVStore.getStringSet("white_events_v3", null);
        if (stringSet4 != null) {
            hashSet4.addAll(stringSet4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(List<f4> list, f0 f0Var) {
        m2 m2Var;
        if (list != null && list.size() != 0 && (!this.f240a.isEmpty() || !this.b.isEmpty())) {
            Iterator<f4> it = list.iterator();
            while (it.hasNext()) {
                f4 next = it.next();
                if (next instanceof m4) {
                    if (this.b.contains(((m4) next).u)) {
                        it.remove();
                        this.f.debug("[AppLogEventFilterConfig] filterBlock remove v3 -> " + next, new Object[0]);
                        m2Var = f0Var.q;
                        p2.a(m2Var, 2L, f0Var.d(), 1002);
                    }
                } else if (next instanceof i4) {
                    JSONObject jSONObjectH = next.h();
                    StringBuilder sb = new StringBuilder();
                    sb.append(jSONObjectH.optString("tag"));
                    sb.append(!TextUtils.isEmpty(jSONObjectH.optString("label")) ? jSONObjectH.optString("label") : "");
                    if (this.f240a.contains(sb.toString())) {
                        it.remove();
                        this.f.debug("[AppLogEventFilterConfig] filterBlock remove b1 -> " + next, new Object[0]);
                        m2Var = f0Var.q;
                        p2.a(m2Var, 2L, f0Var.d(), 1002);
                    }
                } else if ((next instanceof n4) && this.b.contains("app_launch")) {
                    it.remove();
                    this.f.debug("[AppLogEventFilterConfig] filterBlock remove launch -> " + next, new Object[0]);
                    m2Var = f0Var.q;
                    p2.a(m2Var, 2L, f0Var.d(), 1002);
                }
            }
        }
        if (list == null || list.size() == 0) {
            return;
        }
        if (this.c.isEmpty() && this.d.isEmpty()) {
            return;
        }
        Iterator<f4> it2 = list.iterator();
        while (it2.hasNext()) {
            f4 next2 = it2.next();
            if (next2 instanceof m4) {
                if (!this.d.contains(((m4) next2).u)) {
                    it2.remove();
                    this.f.debug("[AppLogEventFilterConfig] filterWhite remove v3 -> " + next2, new Object[0]);
                }
            } else if (next2 instanceof i4) {
                JSONObject jSONObjectH2 = next2.h();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(jSONObjectH2.optString("tag"));
                sb2.append(!TextUtils.isEmpty(jSONObjectH2.optString("label")) ? jSONObjectH2.optString("label") : "");
                if (!this.c.contains(sb2.toString())) {
                    it2.remove();
                    this.f.debug("[AppLogEventFilterConfig] filterWhite remove b1 -> " + next2, new Object[0]);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(Set<String> set, Set<String> set2, Set<String> set3, Set<String> set4, String str, String str2) {
        set.clear();
        set3.clear();
        if (set2 != null) {
            set.addAll(set2);
        }
        this.e.putStringSet(str, set);
        if (set4 != null) {
            set3.addAll(set4);
        }
        this.e.putStringSet(str2, set3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void a(JSONObject jSONObject, String str) {
        Set<String> set;
        Set<String> set2;
        String str2;
        String str3;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        this.f.debug(a.a("[AppLogEventFilterConfig] parseEventList filedKey -> ", str), new Object[0]);
        if (jSONObjectOptJSONObject == null) {
            if ("blocklist".equals(str)) {
                a(this.f240a, null, this.b, null, "block_events_v1", "block_events_v3");
                return;
            } else {
                if ("whitelist".equals(str)) {
                    a(this.c, null, this.d, null, "white_events_v1", "white_events_v3");
                    return;
                }
                return;
            }
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("v1");
        this.f.debug("[AppLogEventFilterConfig] parseEventList v1 -> " + jSONArrayOptJSONArray, new Object[0]);
        int length = jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.length() : 0;
        HashSet hashSet = new HashSet(length);
        for (int i = 0; i < length; i++) {
            String strOptString = jSONArrayOptJSONArray.optString(i, null);
            if (!TextUtils.isEmpty(strOptString)) {
                hashSet.add(strOptString);
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("v3");
        this.f.debug("[AppLogEventFilterConfig] parseEventList v3 -> " + jSONArrayOptJSONArray2, new Object[0]);
        int length2 = jSONArrayOptJSONArray2 != null ? jSONArrayOptJSONArray2.length() : 0;
        HashSet hashSet2 = new HashSet(length2);
        for (int i2 = 0; i2 < length2; i2++) {
            String strOptString2 = jSONArrayOptJSONArray2.optString(i2, null);
            if (!TextUtils.isEmpty(strOptString2)) {
                hashSet2.add(strOptString2);
            }
        }
        if ("blocklist".equals(str)) {
            set = this.f240a;
            set2 = this.b;
            str2 = "block_events_v1";
            str3 = "block_events_v3";
        } else {
            if (!"whitelist".equals(str)) {
                return;
            }
            set = this.c;
            set2 = this.d;
            str2 = "white_events_v1";
            str3 = "white_events_v3";
        }
        a(set, hashSet, set2, hashSet2, str2, str3);
    }
}
