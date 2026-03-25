package com.bytedance.bdtracker;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.applog.InitConfig;
import com.bytedance.applog.log.EventBus;
import com.bytedance.applog.log.IAppLogLogger;
import com.bytedance.applog.log.LogUtils;
import com.bytedance.applog.store.kv.IKVStore;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class x1 {
    public static final String[] m = {AppsFlyerProperties.CHANNEL, "package", "app_version"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f294a;
    public final Context b;
    public final v1 c;
    public boolean e;
    public final IKVStore g;
    public final d5 h;
    public final d i;
    public volatile JSONObject d = new JSONObject();
    public final Set<q1> f = new LinkedHashSet(32);
    public int j = 0;
    public final Set<String> k = new HashSet(4);
    public final Set<String> l = new HashSet();

    public class a implements EventBus.DataFetcher {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.bytedance.applog.log.EventBus.DataFetcher
        public Object fetch() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("appId", x1.this.i.m);
                jSONObject.put(JwtUtilsKt.DID_PREFIX, x1.this.d.optString("device_id", ""));
                jSONObject.put("bdDid", x1.this.d());
                jSONObject.put("ssid", x1.this.j());
                jSONObject.put("installId", x1.this.g());
                jSONObject.put("uuid", x1.this.l());
                jSONObject.put("uuidType", x1.this.m());
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    public class b implements EventBus.DataFetcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f296a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public b(JSONObject jSONObject) {
            this.f296a = jSONObject;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.bytedance.applog.log.EventBus.DataFetcher
        public Object fetch() {
            JSONObject jSONObject = new JSONObject();
            r.c(this.f296a, jSONObject);
            try {
                jSONObject.put("appId", x1.this.i.m);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x1(d dVar, Context context, v1 v1Var) {
        this.i = dVar;
        this.b = context;
        this.c = v1Var;
        this.g = v1Var.f;
        this.h = dVar.d.a(dVar, context, v1Var);
        boolean z = v1Var.f.getBoolean("is_first_app_launch", true);
        String userUniqueId = v1Var.c.getUserUniqueId();
        String userUniqueIdType = v1Var.c.getUserUniqueIdType();
        if (r.d(userUniqueId) && z) {
            i(userUniqueId);
        }
        if (r.d(userUniqueIdType) && z) {
            j(userUniqueIdType);
        }
        if (z) {
            v1Var.f.putBoolean("is_first_app_launch", false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void a(JSONObject jSONObject, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean e(JSONObject jSONObject) {
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("device_id", "");
            String strOptString2 = jSONObject.optString("install_id", "");
            String strOptString3 = jSONObject.optString("bd_did", "");
            String strOptString4 = jSONObject.optString("ssid", "");
            if ((r.a(strOptString) || r.a(strOptString3)) && r.a(strOptString2) && r.a(strOptString4)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String a(Set<String> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(String str) {
        d5 d5Var = this.h;
        if (d5Var instanceof d5) {
            d5Var.e.D.debug(d5Var.g, "DeviceParamsProvider#clearDidAndIid clearKey=" + str + " sDeviceId=" + d5.j, new Object[0]);
            if (!TextUtils.isEmpty(str)) {
                d5.j = null;
                String strA = com.bytedance.bdtracker.a.a("clear_key_prefix", str);
                InitConfig initConfig = d5Var.f.c;
                IKVStore iKVStoreA = x4.a(initConfig, d5Var.f159a, initConfig.getSpName());
                if (iKVStoreA.getBoolean(strA, false)) {
                    d5Var.e.D.debug(d5Var.g, "clearKey:{} is already cleared", str);
                } else {
                    iKVStoreA.putBoolean(strA, true);
                    if (iKVStoreA.contains("device_id")) {
                        iKVStoreA.remove("device_id");
                    }
                    if (iKVStoreA.contains("install_id")) {
                        iKVStoreA.remove("install_id");
                    }
                    d5Var.b.a("device_id");
                    d5Var.e.D.debug(d5Var.g, "clearKey:{} installId and deviceId finish", str);
                }
            }
        }
        this.c.f.remove(RemoteMessageConst.DEVICE_TOKEN);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void b(JSONObject jSONObject) {
        this.d = jSONObject;
        if (LogUtils.isDisabled()) {
            return;
        }
        LogUtils.sendJsonFetcher("set_header", new b(jSONObject));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String c() {
        return this.c.c.getAid();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<String> c(String str) {
        String[] strArrSplit;
        HashSet hashSet = new HashSet();
        if (!TextUtils.isEmpty(str) && (strArrSplit = str.split(",")) != null && strArrSplit.length > 0) {
            for (String str2 : strArrSplit) {
                if (!TextUtils.isEmpty(str2)) {
                    hashSet.add(str2);
                }
            }
        }
        return hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void d(String str) {
        JSONObject jSONObjectE;
        if (TextUtils.isEmpty(str) || (jSONObjectE = e()) == null || !jSONObjectE.has(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        r.a(jSONObject, jSONObjectE);
        jSONObject.remove(str);
        c(jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JSONObject f() {
        if (this.f294a) {
            return this.d;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean h(String str) {
        if (!a("ssid", (Object) str)) {
            return false;
        }
        this.g.putString(this.c.e(), str);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean q() {
        return this.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void a(String str) {
        synchronized (this) {
            String strOptString = this.d.optString("ab_sdk_version");
            if (!TextUtils.isEmpty(strOptString)) {
                for (String str2 : strOptString.split(",")) {
                    if (!TextUtils.isEmpty(str2) && str2.equals(str)) {
                        this.i.D.debug(Collections.singletonList("DeviceManager"), com.bytedance.bdtracker.a.a("addExposedVid ready added: ", strOptString), new Object[0]);
                        return;
                    }
                }
                str = strOptString + "," + str;
            }
            f(str);
            a(str, this.c.c());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void c(JSONObject jSONObject) {
        if (a("custom", jSONObject)) {
            this.c.d.putString("header_custom_info", jSONObject != null ? jSONObject.toString() : "");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public String d() {
        return this.d.optString("bd_did", "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final JSONObject e() {
        if (this.f294a) {
            return this.d.optJSONObject("custom");
        }
        v1 v1Var = this.c;
        if (v1Var != null) {
            try {
                return new JSONObject(v1Var.d.getString("header_custom_info", null));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void f(String str) {
        if (a("ab_sdk_version", (Object) str)) {
            this.c.d.putString("ab_sdk_version", str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public String g() {
        return this.d.optString("install_id", "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public String h() {
        return this.d.optString("openudid", "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public int i() {
        if (e(this.d)) {
            return this.g.getInt("version_code", 0) == this.d.optInt("version_code", -1) ? 1 : 2;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public String j() {
        if (this.f294a) {
            return this.d.optString("ssid", "");
        }
        v1 v1Var = this.c;
        return v1Var != null ? v1Var.f.getString(v1Var.e(), "") : "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public String k() {
        return this.d.optString("udid", "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public String l() {
        if (this.f294a) {
            return this.d.optString("user_unique_id", "");
        }
        v1 v1Var = this.c;
        return v1Var != null ? v1Var.f() : "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public String m() {
        return this.d.optString("user_unique_id_type", this.c.g());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public int n() {
        int iOptInt = this.f294a ? this.d.optInt("version_code", -1) : j5.a(this.b);
        for (int i = 0; i < 3 && iOptInt == -1; i++) {
            iOptInt = this.f294a ? this.d.optInt("version_code", -1) : j5.a(this.b);
        }
        return iOptInt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public String o() {
        String strOptString = this.f294a ? this.d.optString("app_version") : j5.b(this.b);
        for (int i = 0; i < 3 && TextUtils.isEmpty(strOptString); i++) {
            strOptString = this.f294a ? this.d.optString("app_version") : j5.b(this.b);
        }
        return strOptString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public boolean p() {
        return this.f294a && e(this.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public boolean r() {
        i1 i1Var;
        this.f.add(new r1(this.i, this.c));
        this.f.add(new u1(this.i, this.b, this.c));
        this.f.add(new a2(this.i, this.b));
        this.f.add(new c2(this.b));
        Set<q1> set = this.f;
        if (this.i.getInitConfig() != null) {
            this.i.getInitConfig().getSensitiveInfoProvider();
        }
        set.add(new h2());
        this.f.add(new d2(this.b));
        this.f.add(new f2(this.i, this.b, this.c));
        this.f.add(new g2());
        this.f.add(new i2(this.b, this.c, this));
        this.f.add(new j2(this.i, this.b));
        this.f.add(new k2(this.c, this.b));
        this.f.add(new y1(this.b, this.c, this));
        this.f.add(new t1(this.c));
        this.f.add(new n1(this.b));
        this.f.add(new s1(this.i));
        this.f.add(new b2(this.b, this.c));
        this.f.add(new e2(this.b, this.c));
        JSONObject jSONObject = this.d;
        JSONObject jSONObject2 = new JSONObject();
        r.a(jSONObject2, jSONObject);
        int i = 0;
        int i2 = 0;
        boolean z = true;
        for (q1 q1Var : this.f) {
            if (this.c.c.getLoaderFilters().contains(q1Var.a())) {
                IAppLogLogger iAppLogLogger = this.i.D;
                StringBuilder sbA = com.bytedance.bdtracker.a.a("Filter ");
                sbA.append(q1Var.a());
                sbA.append(" Loader");
                iAppLogLogger.debug(sbA.toString(), new Object[0]);
            } else {
                if (!q1Var.f245a || q1Var.c || (!this.c.j() && q1Var.d)) {
                    try {
                        q1Var.f245a = q1Var.a(jSONObject2);
                    } catch (SecurityException e) {
                        if (!q1Var.b) {
                            i++;
                            IAppLogLogger iAppLogLogger2 = this.i.D;
                            List<String> listSingletonList = Collections.singletonList("DeviceManager");
                            StringBuilder sbA2 = com.bytedance.bdtracker.a.a("loadHeader mCountPermission: ");
                            sbA2.append(this.j);
                            iAppLogLogger2.warn(listSingletonList, sbA2.toString(), e);
                            if (!q1Var.f245a && this.j > 10) {
                                q1Var.f245a = true;
                            }
                        }
                        this.i.b().a(e, "load SecurityException");
                    } catch (JSONException e2) {
                        this.i.D.error("loader load error", e2, new Object[0]);
                        this.i.b().a(e2, "load JSONException");
                    } catch (Throwable th) {
                        this.i.b().a(th, "load");
                    }
                    if (!q1Var.f245a && !q1Var.b) {
                        i2++;
                    }
                }
                this.i.D.debug(Collections.singletonList("DeviceManager"), "Loader:{} is ready:{}", q1Var.a(), Boolean.valueOf(q1Var.f245a));
                z &= q1Var.f245a || q1Var.b;
            }
        }
        if (z) {
            for (String str : m) {
                boolean zIsEmpty = TextUtils.isEmpty(jSONObject2.optString(str));
                z &= !zIsEmpty;
                if (zIsEmpty) {
                    this.i.D.warn(Collections.singletonList("DeviceManager"), "Key " + str + " is empty!", new Object[0]);
                }
            }
        }
        synchronized (this) {
            JSONObject jSONObject3 = this.d;
            for (String str2 : this.k) {
                this.i.D.debug("Loader newHeader remove " + str2, new Object[0]);
                jSONObject2.remove(str2);
            }
            b(jSONObject2);
            Iterator<String> itKeys = jSONObject3.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                a(next, jSONObject3.opt(next));
            }
            this.f294a = z;
        }
        this.i.D.debug(Collections.singletonList("DeviceManager"), "Loader header ready:{}, permission count:{}, header:{}", Boolean.valueOf(this.f294a), Integer.valueOf(this.j), this.d);
        if (i > 0 && i == i2) {
            this.j++;
            if (i() != 0) {
                this.j += 10;
            }
        }
        if (this.f294a && (i1Var = this.i.y) != null) {
            i1Var.onIdLoaded(d(), g(), j());
        }
        if (!LogUtils.isDisabled() && r.d(j())) {
            LogUtils.sendJsonFetcher("local_did_load", new a());
        }
        return this.f294a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d A[Catch: all -> 0x0085, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x000f, B:8:0x001d, B:10:0x0028, B:11:0x002c, B:13:0x0032, B:15:0x003a, B:17:0x0042, B:20:0x0051, B:21:0x0063, B:23:0x0080), top: B:29:0x0004, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(JSONObject jSONObject) {
        String strOptString;
        synchronized (this) {
            if (jSONObject == null) {
                this.i.D.warn("null abconfig", new Object[0]);
                strOptString = this.d.optString("ab_sdk_version");
                if (!TextUtils.isEmpty(strOptString)) {
                    Set<String> setC = c(strOptString);
                    HashSet hashSet = new HashSet();
                    if (jSONObject != null) {
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            if (next instanceof String) {
                                String str = next;
                                if (!TextUtils.isEmpty(str)) {
                                    try {
                                        hashSet.add(jSONObject.getJSONObject(str).optString("vid"));
                                    } catch (JSONException e) {
                                        this.i.D.error(Collections.singletonList("DeviceManager"), "JSON handle failed", e, new Object[0]);
                                    }
                                }
                            }
                        }
                    }
                    String strC = this.c.c();
                    hashSet.addAll(c(strC));
                    setC.retainAll(hashSet);
                    String strA = a(setC);
                    f(strA);
                    if (!TextUtils.equals(strOptString, strA)) {
                        a(strA, strC);
                    }
                }
            } else {
                strOptString = this.d.optString("ab_sdk_version");
                if (!TextUtils.isEmpty(strOptString)) {
                }
            }
        }
    }

    public void g(String str) {
        synchronized (this) {
            Set<String> setC = c(this.c.c());
            String strC = this.c.c();
            Set<String> setC2 = c(this.d.optString("ab_sdk_version"));
            setC2.removeAll(setC);
            setC2.addAll(c(str));
            v1 v1Var = this.c;
            v1Var.b.D.debug(Collections.singletonList("ConfigManager"), "setExternalAbVersion:{}", str);
            v1Var.d.putString("external_ab_version", str);
            v1Var.h = null;
            f(a(setC2));
            if (!r.a(strC, this.c.c())) {
                a(b(), this.c.c());
            }
        }
    }

    public void a() {
        f(null);
        g("");
        a((JSONObject) null);
        this.l.clear();
    }

    public final void e(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ab_sdk_version", str);
            this.i.onEventV3("abtest_exposure", jSONObject, 0);
        } catch (Throwable th) {
            this.i.D.error(Collections.singletonList("DeviceManager"), "JSON handle failed", th, new Object[0]);
            this.i.b().a(th, "sendAbTestExposureEvent");
        }
    }

    public void j(String str) {
        if (a("user_unique_id_type", (Object) str)) {
            this.c.d.putString("user_unique_id_type", str);
        }
    }

    public <T> T a(String str, T t, Class<T> cls) {
        return (T) this.i.j.a(this.d, str, t, cls);
    }

    public boolean i(String str) {
        if (!a("user_unique_id", (Object) str)) {
            return false;
        }
        this.c.d.putString("user_unique_id", r.a((Object) str));
        return true;
    }

    public final void a(String str, String str2) {
        if (this.c.h() && this.c.c.isAbEnable()) {
            Set<String> setC = c(str);
            setC.removeAll(c(str2));
            i1 i1Var = this.i.y;
            if (i1Var != null) {
                i1Var.onAbVidsChange(a(setC), str2);
            }
        }
    }

    public boolean a(JSONObject jSONObject, String str, String str2, String str3, String str4, String str5, String str6) {
        boolean z;
        synchronized (this) {
            this.i.D.debug(Collections.singletonList("DeviceManager"), "saveRegisterInfo -> uuid:" + str + ", did:" + str2 + ", iid:" + str3 + ", ssid:" + str4 + ", did:" + str5 + ", cd:" + str6 + ", response:{}", jSONObject);
            if (!r.a(l(), str)) {
                this.i.D.debug(1, "saveRegisterInfo interrupted for uuid is changed", new Object[0]);
                return true;
            }
            this.e = jSONObject.optInt("new_user", 0) > 0;
            String strOptString = jSONObject.optString(RemoteMessageConst.DEVICE_TOKEN, "");
            boolean zA = r.a(str2);
            boolean zA2 = r.a(str3);
            boolean zA3 = r.a(str5);
            boolean zA4 = r.a(str6);
            boolean zA5 = r.a(str4);
            try {
                int i = this.g.getInt("version_code", 0);
                int iOptInt = this.d.optInt("version_code", 0);
                if (i != iOptInt) {
                    this.g.putInt("version_code", iOptInt);
                }
                String string = this.g.getString(AppsFlyerProperties.CHANNEL, "");
                String strOptString2 = this.d.optString(AppsFlyerProperties.CHANNEL, "");
                if (!TextUtils.equals(string, strOptString2)) {
                    this.g.putString(AppsFlyerProperties.CHANNEL, strOptString2);
                }
                this.g.putString(RemoteMessageConst.DEVICE_TOKEN, strOptString);
                if ((zA || (zA3 && zA4)) && zA2) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.g.putLong("register_time", jCurrentTimeMillis);
                    a("register_time", Long.valueOf(jCurrentTimeMillis));
                } else if (!zA && (!zA3 || !zA4)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("response", jSONObject);
                    this.i.onEventV3("tt_fetch_did_error", jSONObject2, 0);
                }
                String strB = this.h.b();
                String string2 = this.g.getString("bd_did", null);
                this.i.D.debug(Collections.singletonList("DeviceManager"), "device: od=" + strB + " nd=" + str2 + " ck=" + zA, new Object[0]);
                if (zA) {
                    if (str2.equals(this.d.optString("device_id"))) {
                        z = false;
                    } else {
                        JSONObject jSONObject3 = this.d;
                        JSONObject jSONObject4 = new JSONObject();
                        r.a(jSONObject4, jSONObject3);
                        jSONObject4.put("device_id", str2);
                        b(jSONObject4);
                        this.h.b(str2);
                        z = true;
                    }
                    if (!str2.equals(strB)) {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (zA3 && a("bd_did", (Object) str5)) {
                    this.g.putString("bd_did", str5);
                    z = true;
                }
                String strOptString3 = this.d.optString("install_id", "");
                if (zA2 && a("install_id", (Object) str3)) {
                    this.g.putString("install_id", str3);
                    z = true;
                }
                String strOptString4 = this.d.optString("ssid", "");
                boolean z2 = (zA5 && h(str4)) ? true : z;
                i1 i1Var = this.i.y;
                if (i1Var != null) {
                    i1Var.onRemoteIdGet(z2, string2, str5, strOptString3, str3, strOptString4, zA5 ? str4 : "");
                }
                if (!zA5 || (!zA3 && !zA)) {
                    this.i.b().a(new Throwable("device register failed, ssid:" + str4 + ", bdDid: " + str5), "saveRegisterInfo");
                }
            } catch (Throwable th) {
                this.i.D.error(Collections.singletonList("DeviceManager"), "JSON handle failed", th, new Object[0]);
                this.i.b().a(th, "saveRegisterInfo");
            }
            return (zA || (zA3 && zA4)) && zA2 && zA5;
        }
    }

    public String b() {
        if (this.f294a) {
            return this.d.optString("ab_sdk_version", "");
        }
        v1 v1Var = this.c;
        return v1Var != null ? v1Var.d.getString("ab_sdk_version", "") : "";
    }

    public void a(JSONObject jSONObject) {
        v1 v1Var = this.c;
        v1Var.b.D.debug(Collections.singletonList("ConfigManager"), "setAbConfig:{}", jSONObject);
        v1Var.d.putString("ab_configure", jSONObject == null ? "" : jSONObject.toString());
        v1Var.g = null;
        if (!LogUtils.isDisabled()) {
            LogUtils.sendJsonFetcher("set_abconfig", new w1(v1Var, jSONObject));
        }
        d(jSONObject);
    }

    public void a(HashMap<String, Object> map) {
        JSONObject jSONObject;
        if (map == null || map.isEmpty()) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            JSONObject jSONObjectE = e();
            if (jSONObjectE != null) {
                r.a(jSONObject, jSONObjectE);
            }
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey())) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
            } catch (Throwable th) {
                this.i.D.error(Collections.singletonList("DeviceManager"), "Set custom header failed", th, new Object[0]);
            }
        }
        c(jSONObject);
    }

    public final boolean a(String str, Object obj) {
        Object objOpt = this.d.opt(str);
        if (obj != objOpt && (obj == null || !obj.equals(objOpt))) {
            synchronized (this) {
                try {
                    JSONObject jSONObject = this.d;
                    JSONObject jSONObject2 = new JSONObject();
                    r.a(jSONObject2, jSONObject);
                    jSONObject2.put(str, obj);
                    if (!this.f294a && obj == null) {
                        this.k.add(str);
                    }
                    b(jSONObject2);
                } catch (JSONException e) {
                    this.i.D.error(Collections.singletonList("DeviceManager"), "Update header:{} to value:{} failed", e, str, obj);
                    this.i.b().a(e, "updateHeader");
                }
            }
            this.i.D.debug(Collections.singletonList("DeviceManager"), "Update header:{} from old:{} to new value:{}", str, objOpt, obj);
        } else {
            if (this.f294a || obj != null || objOpt != null) {
                return false;
            }
            this.i.D.debug(com.bytedance.bdtracker.a.a("未初始化时都为 null 无法做到赋值的: ", str), new Object[0]);
        }
        return true;
    }
}
