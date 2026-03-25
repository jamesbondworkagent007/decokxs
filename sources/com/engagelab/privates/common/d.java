package com.engagelab.privates.common;

import android.content.Context;
import android.os.Bundle;
import com.engagelab.privates.analysis.api.Event;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class d {
    public static volatile d d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, Object> f326a;
    public Map<String, Object> b = new HashMap();
    public Map<String, Object> c = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(Context context, Bundle bundle) {
        a(context, (Event) bundle.getParcelable("event"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, Object> b() {
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONObject b(Context context, Event event) {
        try {
            Map<String, Object> mapC = c(context);
            Map<String, Object> extraAttrMap = event.getExtraAttrMap();
            JSONObject jSONObject = new JSONObject();
            if (mapC != null && !mapC.isEmpty()) {
                for (Map.Entry<String, Object> entry : mapC.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (l.a(key, value)) {
                        jSONObject.put("_" + key, value);
                    }
                }
            }
            if (extraAttrMap != null && !extraAttrMap.isEmpty()) {
                for (Map.Entry<String, Object> entry2 : extraAttrMap.entrySet()) {
                    String key2 = entry2.getKey();
                    Object value2 = entry2.getValue();
                    if (l.a(key2, value2)) {
                        jSONObject.put("_" + key2, value2);
                    }
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(MTAnalysisConstants.EVENT_NAME, event.getName());
            if (jSONObject.length() > 0) {
                jSONObject2.put(MTAnalysisConstants.EVENT_ATTRIBUTES, jSONObject);
            }
            return h.a().a(context, MTAnalysisConstants.TYPE_EVENT, jSONObject2);
        } catch (Exception e) {
            MTCommonLog.w("MTEventBusiness", "packageJson e:" + e.getMessage());
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static d c() {
        if (d == null) {
            synchronized (d.class) {
                d = new d();
            }
        }
        return d;
    }

    public void a(Context context, Event event) {
        JSONObject jSONObjectB = b(context, event);
        if (jSONObjectB == null) {
            return;
        }
        h.a().a(context, jSONObjectB);
    }

    public final void a(Context context, Map<String, Object> map) {
        if (map != null && !map.isEmpty()) {
            this.b = a();
            this.c = b();
            for (String str : map.keySet()) {
                Object objA = l.a(map.get(str));
                if (l.a(str, objA)) {
                    if (this.b.size() < 10) {
                        if (!this.c.isEmpty() && this.c.containsKey(str)) {
                            MTCommonLog.w("MTEventBusiness", "dynamicProperty containsKey " + str + ", will not set in commonProperty");
                        } else {
                            this.b.put(str, objA);
                            MTCommonLog.d("MTEventBusiness", "commonMap put key:" + str + ",value:" + objA);
                        }
                    } else if (this.b.containsKey(str)) {
                        this.b.put(str, objA);
                        MTCommonLog.d("MTEventBusiness", "commonMap override key:" + str + ",value:" + objA);
                    } else {
                        MTCommonLog.w("MTEventBusiness", "config commonProperty size can't be no more than 10");
                    }
                }
            }
            i.a(context, this.b);
            return;
        }
        MTCommonLog.w("MTEventBusiness", "setCommonProperty failed, map is empty");
    }

    public Map<String, Object> c(Context context) {
        Map<String, Object> map = this.f326a;
        if (map == null) {
            this.f326a = new HashMap();
        } else {
            map.clear();
        }
        Map<String, Object> mapA = c().a();
        Map<String, Object> mapB = c().b();
        this.f326a.putAll(mapA);
        this.f326a.putAll(mapB);
        return this.f326a;
    }

    public void c(Context context, Bundle bundle) {
        try {
            HashMap map = new HashMap();
            for (String str : bundle.keySet()) {
                map.put(str, bundle.get(str));
            }
            b(context, map);
        } catch (Throwable th) {
            MTCommonLog.w("MTEventBusiness", "setDynamicProperty failed " + th.getMessage());
        }
    }

    public void b(Context context, Bundle bundle) {
        try {
            HashMap map = new HashMap();
            for (String str : bundle.keySet()) {
                map.put(str, bundle.get(str));
            }
            a(context, map);
        } catch (Throwable th) {
            MTCommonLog.w("MTEventBusiness", "setCommonProperty failed " + th.getMessage());
        }
    }

    public Map<String, Object> a() {
        if (MTGlobal.context == null) {
            return this.b;
        }
        Map<String, Object> map = this.b;
        if (map == null || map.isEmpty()) {
            this.b = i.n(MTGlobal.context);
        }
        return this.b;
    }

    public final void b(Context context, Map<String, Object> map) {
        if (map != null && !map.isEmpty()) {
            this.b = a();
            this.c = b();
            for (String str : map.keySet()) {
                Object objA = l.a(map.get(str));
                if (l.a(str, objA)) {
                    if (this.c.size() < 10) {
                        if (!this.b.isEmpty() && this.b.containsKey(str)) {
                            MTCommonLog.w("MTEventBusiness", "commonProperty containsKey " + str + ", will not set in dynamicProperty");
                        } else {
                            this.c.put(str, objA);
                            MTCommonLog.d("MTEventBusiness", "dynamicMap put key:" + str + ",value:" + objA);
                        }
                    } else if (this.c.containsKey(str)) {
                        this.c.put(str, objA);
                        MTCommonLog.d("MTEventBusiness", "dynamicMap override key:" + str + ",value:" + objA);
                    } else {
                        MTCommonLog.w("MTEventBusiness", "config dynamicProperty size can't be no more than 10");
                    }
                }
            }
            return;
        }
        MTCommonLog.w("MTEventBusiness", "setDynamicProperty failed, map is empty");
    }

    public void a(Context context) {
        this.b.clear();
        i.a(context, (Map<String, Object>) null);
    }

    public void b(Context context) {
        this.c.clear();
    }
}
