package com.bytedance.bdtracker;

import android.app.Application;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.applog.IExtraParams;
import com.bytedance.applog.Level;
import com.bytedance.applog.UriConfig;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.bytedance.applog.util.SensitiveUtils;
import com.huawei.hms.adapter.internal.CommonCode;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class c4 {
    public static final a[] c = {new a("aid", "aid", String.class), new a("google_aid", "google_aid", String.class), new a("carrier", "carrier", String.class), new a("sim_region", "sim_region", String.class), new a("device_id", "device_id", String.class), new a("bd_did", "bd_did", String.class), new a("install_id", "iid", String.class), new a("clientudid", "clientudid", String.class), new a("app_name", "app_name", String.class), new a("app_version", "version_name", String.class), new a("version_code", "version_code", Integer.class), new a("manifest_version_code", "manifest_version_code", Integer.class), new a("update_version_code", "update_version_code", Integer.class), new a("sdk_version_code", "sdk_version_code", Integer.class)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile IExtraParams f145a;
    public final d b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f146a;
        public final String b;
        public final Class c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a(String str, String str2, Class cls) {
            this.f146a = str;
            this.b = str2;
            this.c = cls;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public c4(d dVar) {
        this.b = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String a(JSONObject jSONObject, String str, boolean z, Level level) {
        if (this.b.n == null || TextUtils.isEmpty(str)) {
            return str;
        }
        Uri uri = Uri.parse(str);
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder builderBuildUpon = uri.buildUpon();
        HashMap map = new HashMap();
        a(jSONObject, z, map, level);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!queryParameterNames.contains(key) && !TextUtils.isEmpty(value)) {
                builderBuildUpon.appendQueryParameter(key, entry.getValue());
            }
        }
        return builderBuildUpon.build().toString();
    }

    public void a(JSONObject jSONObject, boolean z, Map<String, String> map, Level level) {
        HashMap<String, String> extraParams;
        Application application = this.b.n;
        if (application == null || map == null || level == null) {
            return;
        }
        map.put("_rticket", String.valueOf(System.currentTimeMillis()));
        map.put("device_platform", "android");
        if (z) {
            map.put("ssmix", IEncryptorType.DEFAULT_ENCRYPTOR);
        }
        if (TextUtils.isEmpty(q5.f248a)) {
            DisplayMetrics displayMetrics = application.getResources().getDisplayMetrics();
            int i = displayMetrics == null ? 0 : displayMetrics.widthPixels;
            DisplayMetrics displayMetrics2 = application.getResources().getDisplayMetrics();
            int i2 = displayMetrics2 == null ? 0 : displayMetrics2.heightPixels;
            if (i > 0 && i2 > 0) {
                q5.f248a = i + "*" + i2;
            }
        }
        String str = q5.f248a;
        if (!TextUtils.isEmpty(str)) {
            map.put(CommonCode.MapKey.HAS_RESOLUTION, str);
        }
        if (q5.b == -1) {
            q5.b = application.getApplicationContext().getResources().getDisplayMetrics().densityDpi;
        }
        int i3 = q5.b;
        if (i3 > 0) {
            map.put("dpi", String.valueOf(i3));
        }
        map.put("device_type", Build.MODEL);
        map.put("device_brand", Build.BRAND);
        map.put("language", application.getResources().getConfiguration().locale.getLanguage());
        map.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
        String strSubstring = Build.VERSION.RELEASE;
        if (strSubstring != null && strSubstring.length() > 10) {
            strSubstring = strSubstring.substring(0, 10);
        }
        map.put("os_version", strSubstring);
        String strA = i5.a(application, false);
        if (!TextUtils.isEmpty(strA)) {
            map.put("ac", strA);
        }
        int i4 = 0;
        while (true) {
            a[] aVarArr = c;
            extraParams = null;
            if (i4 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i4];
            Object objA = a(jSONObject, aVar.f146a, (Object) null, (Class<Object>) aVar.c);
            if (objA != null) {
                map.put(aVar.b, objA.toString());
            }
            i4++;
        }
        String str2 = (String) a(jSONObject, "tweaked_channel", "", (Class<String>) String.class);
        if (TextUtils.isEmpty(str2)) {
            str2 = (String) a(jSONObject, AppsFlyerProperties.CHANNEL, "", (Class<String>) String.class);
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put(AppsFlyerProperties.CHANNEL, str2);
        }
        String str3 = (String) a(jSONObject, "cdid", (Object) null, (Class<Object>) String.class);
        if (!TextUtils.isEmpty(str3)) {
            map.put("cdid", str3);
        }
        l5.a();
        SensitiveUtils.appendSensitiveParams(this, jSONObject, map, true, level);
        if (level == Level.L0) {
            String str4 = (String) a(jSONObject, "openudid", (Object) null, (Class<Object>) String.class);
            if (!TextUtils.isEmpty(str4)) {
                map.put("openudid", str4);
            }
        }
        this.b.getAppContext();
        try {
            if (this.f145a != null) {
                extraParams = this.f145a.getExtraParams(level);
            }
            if (extraParams == null || extraParams.isEmpty()) {
                return;
            }
            for (Map.Entry<String, String> entry : extraParams.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value) && !map.containsKey(key)) {
                        map.put(key, value);
                    }
                }
            }
        } catch (Throwable th) {
            this.b.D.error(11, "Add extra params failed.", th, new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String[] a(f0 f0Var, JSONObject jSONObject, int i) {
        String[] sendUris;
        UriConfig uriConfigE = f0Var.e();
        if (i == 0) {
            sendUris = uriConfigE.getSendUris();
        } else if (i != 1) {
            sendUris = new String[0];
        } else if (!TextUtils.isEmpty(uriConfigE.getBusinessUri())) {
            sendUris = new String[]{uriConfigE.getBusinessUri()};
        }
        int length = sendUris.length;
        String[] strArr = new String[length];
        boolean z = this.b.E;
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = sendUris[i2];
            if (z) {
                strArr[i2] = strArr[i2] + "?tt_data=a";
            }
            String strA = a(jSONObject, strArr[i2], true, Level.L1);
            strArr[i2] = strA;
            strArr[i2] = a4.a(strA, f5.c);
        }
        return strArr;
    }

    public <T> T a(JSONObject jSONObject, String str, T t, Class<T> cls) {
        T tCast;
        if (jSONObject == null) {
            return (T) this.b.getHeaderValue(str, t, cls);
        }
        Object objOpt = jSONObject.opt(str);
        if (objOpt == null || cls == null) {
            tCast = null;
        } else {
            try {
                tCast = cls.cast(objOpt);
            } catch (Throwable th) {
                this.b.D.error(11, "Cast type failed.", th, new Object[0]);
                tCast = null;
            }
        }
        return tCast == null ? t : tCast;
    }
}
