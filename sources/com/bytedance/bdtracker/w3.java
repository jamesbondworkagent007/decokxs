package com.bytedance.bdtracker;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.applog.profile.UserProfileCallback;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.google.android.gms.common.Scopes;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f289a = {"aid", "region", "os", "package", "app_version", HianalyticsBaseData.SDK_VERSION, "os_version", "device_model", CommonCode.MapKey.HAS_RESOLUTION, "language", "timezone", "access", "display_name", AppsFlyerProperties.CHANNEL, "carrier", "app_language", "app_region", "tz_name", "tz_offset", "install_id", "openudid", "rom", "manifest_version_code", "device_manufacturer", "clientudid", "sig_hash", "display_density", "os_api", "update_version_code", "density_dpi", "version_code", "sim_serial_number", "release_build", "udid", "cpu_abi", "google_aid"};
    public static final String[] b = {"setOnce", "synchronize"};
    public static final int[] c = {-1, -1};
    public static final long[] d = {-1, -1};

    public static final class a implements UserProfileCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f290a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ UserProfileCallback c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a(int i, JSONObject jSONObject, UserProfileCallback userProfileCallback) {
            this.f290a = i;
            this.b = jSONObject;
            this.c = userProfileCallback;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.bytedance.applog.profile.UserProfileCallback
        public void onFail(int i) {
            this.c.onFail(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.bytedance.applog.profile.UserProfileCallback
        public void onSuccess() {
            w3.c[this.f290a] = this.b.toString().hashCode();
            w3.d[this.f290a] = System.currentTimeMillis();
            this.c.onSuccess();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b A[Catch: JSONException -> 0x0126, TryCatch #2 {JSONException -> 0x0126, blocks: (B:41:0x00fa, B:43:0x010b, B:44:0x0120, B:38:0x00e8, B:40:0x00f5), top: B:63:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(f0 f0Var, int i, JSONObject jSONObject, UserProfileCallback userProfileCallback, Handler handler, boolean z) {
        Application application;
        JSONObject jSONObject2;
        if (!z) {
            boolean z2 = System.currentTimeMillis() - d[i] > 60000;
            boolean z3 = (jSONObject == null || c[i] == jSONObject.toString().hashCode()) ? false : true;
            f0Var.d.D.error(9, "exec " + i + ", " + z2 + ", " + z3, new Object[0]);
            if (!z2) {
                if (userProfileCallback != null) {
                    userProfileCallback.onFail(4);
                    return;
                }
                return;
            } else if (!z3) {
                if (userProfileCallback != null) {
                    userProfileCallback.onSuccess();
                    return;
                }
                return;
            }
        }
        Application application2 = f0Var.d.n;
        String did = f0Var.d.getDid();
        String str = f0Var.d.m;
        String profileUri = f0Var.e().getProfileUri();
        if (TextUtils.isEmpty(did) || TextUtils.isEmpty(str) || TextUtils.isEmpty(profileUri)) {
            if (userProfileCallback != null) {
                userProfileCallback.onFail(3);
                return;
            }
            return;
        }
        String strA = com.bytedance.bdtracker.a.a(profileUri, String.format("/service/api/v3/userprofile/%s/%s", str, b[i]));
        d dVar = f0Var.d;
        JSONObject header = dVar.getHeader();
        JSONObject jSONObject3 = new JSONObject();
        if (header != null) {
            try {
                application = application2;
            } catch (JSONException e) {
                e = e;
                application = application2;
            }
            try {
                jSONObject2 = new JSONObject(header, f289a);
                jSONObject2.put(HianalyticsBaseData.SDK_VERSION, r.a((Object) header.optString(HianalyticsBaseData.SDK_VERSION)));
                jSONObject2.put("tz_offset", r.a(header.opt("tz_offset")));
            } catch (JSONException e2) {
                e = e2;
                try {
                    dVar.D.error(9, "JSON handle failed", e, new Object[0]);
                    jSONObject2 = new JSONObject();
                } catch (JSONException e3) {
                    dVar.D.error(9, "JSON handle failed", e3, new Object[0]);
                }
            }
            jSONObject3.put("header", jSONObject2);
            jSONObject3.put(Scopes.PROFILE, jSONObject);
            JSONObject jSONObject4 = new JSONObject();
            if (header != null) {
                jSONObject4.put("device_id", header.opt("device_id"));
                jSONObject4.put(MTCoreConstants.Register.KEY_USER_ID, header.opt(MTCoreConstants.Register.KEY_USER_ID));
                jSONObject4.put("ssid", header.opt("ssid"));
            }
            jSONObject3.put("user", jSONObject4);
            z3 z3Var = new z3(f0Var.d, strA, str, jSONObject3, new a(i, jSONObject, userProfileCallback), application);
            if (handler == null) {
                handler.post(z3Var);
                return;
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                f0Var.d.D.error(9, "Not allowed on main looper", new Object[0]);
            }
            z3Var.run();
            return;
        }
        application = application2;
        jSONObject2 = new JSONObject();
        jSONObject3.put("header", jSONObject2);
        jSONObject3.put(Scopes.PROFILE, jSONObject);
        JSONObject jSONObject42 = new JSONObject();
        if (header != null) {
        }
        jSONObject3.put("user", jSONObject42);
        z3 z3Var2 = new z3(f0Var.d, strA, str, jSONObject3, new a(i, jSONObject, userProfileCallback), application);
        if (handler == null) {
        }
    }
}
