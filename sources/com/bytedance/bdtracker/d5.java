package com.bytedance.bdtracker;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.applog.InitConfig;
import com.bytedance.applog.store.kv.IKVStore;
import com.bytedance.applog.util.HardwareUtils;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class d5 {
    public static String h;
    public static String i;
    public static volatile String j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f159a;
    public g4 b;
    public final e4 c;
    public final String d;
    public final d e;
    public final v1 f;
    public final List<String> g = Collections.singletonList("DeviceParamsProvider");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d5(d dVar, Context context, v1 v1Var, e4 e4Var) {
        this.e = dVar;
        this.f = v1Var;
        this.d = v1Var.c.getLocalTest() ? "_local" : "";
        Context applicationContext = context.getApplicationContext();
        this.f159a = applicationContext;
        c5 c5Var = new c5();
        this.c = e4Var;
        InitConfig initConfig = v1Var.c;
        r4 r4Var = new r4(initConfig, applicationContext, "snssdk_openudid", initConfig.getSpName());
        this.b = r4Var;
        r4Var.f179a = e4Var;
        if (!v1Var.c.getAnonymous()) {
            new Thread(new b5(c5Var)).start();
        }
        a(v1Var.c.getAccount());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(Account account) {
        e4 e4Var = this.c;
        if (e4Var != null) {
            e4Var.a(account);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(String str) {
        this.b.a(str);
        this.e.D.debug(this.g, "DeviceParamsProvider#clear clearKey=" + str + " sDeviceId=" + j, new Object[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String b() {
        if (!TextUtils.isEmpty(j)) {
            return j;
        }
        j = this.b.c("", "");
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void b(String str) {
        if (!r.a(str) || r.a(str, j)) {
            return;
        }
        j = this.b.c(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String c() {
        String secureAndroidId;
        boolean z;
        if (!TextUtils.isEmpty(h)) {
            return h;
        }
        v1 v1Var = this.f;
        if (!v1Var.c.isAndroidIdEnabled() || v1Var.a("openudid")) {
            secureAndroidId = "";
            z = false;
        } else {
            secureAndroidId = HardwareUtils.getSecureAndroidId(this.f159a);
            z = true;
        }
        String strA = a(secureAndroidId, z);
        if (!TextUtils.isEmpty(strA)) {
            StringBuilder sbA = a.a(strA);
            sbA.append(this.d);
            strA = sbA.toString();
        }
        if (!TextUtils.isEmpty(strA)) {
            h = strA;
        }
        return strA;
    }

    public String a() {
        if (!TextUtils.isEmpty(i)) {
            return i;
        }
        try {
            IKVStore iKVStoreA = x4.a(this.f.c, this.f159a, "snssdk_openudid");
            String string = iKVStoreA.getString("clientudid", null);
            if (r.e(string)) {
                this.c.b(string, null);
            } else {
                string = UUID.randomUUID().toString();
                iKVStoreA.putString("clientudid", string);
            }
            if (!TextUtils.isEmpty(string)) {
                string = string + this.d;
            }
            i = string;
            return string;
        } catch (Throwable th) {
            this.e.D.error(this.g, "getClientUDID failed", th, new Object[0]);
            return "";
        }
    }

    public final String a(String str, boolean z) {
        try {
            if (r.e(str) && !"9774d56d682e549c".equals(str)) {
                return this.b.d(null, str);
            }
            IKVStore iKVStoreA = x4.a(this.f.c, this.f159a, "snssdk_openudid");
            String str2 = "openudid";
            String string = iKVStoreA.getString(z ? "openudid" : "openudid_uuid", null);
            if (r.e(string)) {
                this.c.d(string, null);
                return string;
            }
            String string2 = new BigInteger(80, new SecureRandom()).toString(16);
            if (string2.charAt(0) == '-') {
                string2 = string2.substring(1);
            }
            int length = 13 - string2.length();
            if (length > 0) {
                StringBuilder sb = new StringBuilder();
                while (length > 0) {
                    sb.append('F');
                    length--;
                }
                sb.append(string2);
                string2 = sb.toString();
            }
            if (!z) {
                str2 = "openudid_uuid";
            }
            iKVStoreA.putString(str2, string2);
            return string2;
        } catch (Throwable th) {
            this.e.D.error(this.g, "getOpenUdid failed", th, new Object[0]);
            return str;
        }
    }
}
