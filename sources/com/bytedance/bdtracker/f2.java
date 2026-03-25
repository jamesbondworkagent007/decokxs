package com.bytedance.bdtracker;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class f2 extends q1 {
    public final Context e;
    public final d f;
    public final v1 g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public f2(d dVar, Context context, v1 v1Var) {
        super(false, false);
        this.f = dVar;
        this.e = context;
        this.g = v1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.q1
    public String a() {
        return "Package";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.q1
    public boolean a(JSONObject jSONObject) throws JSONException {
        ApplicationInfo applicationInfo;
        String packageName = this.e.getPackageName();
        if (TextUtils.isEmpty(this.g.c.getZiJieCloudPkg())) {
            jSONObject.put("package", packageName);
        } else {
            this.f.D.debug("has zijie pkg", new Object[0]);
            jSONObject.put("package", this.g.c.getZiJieCloudPkg());
            jSONObject.put("real_package_name", packageName);
        }
        try {
            int iA = j5.a(this.e);
            jSONObject.put("app_version", !TextUtils.isEmpty(this.g.c.getVersion()) ? this.g.c.getVersion() : j5.b(this.e));
            jSONObject.put("app_version_minor", !TextUtils.isEmpty(this.g.c.getVersionMinor()) ? this.g.c.getVersionMinor() : "");
            if (this.g.c.getVersionCode() != 0) {
                jSONObject.put("version_code", this.g.c.getVersionCode());
            } else {
                jSONObject.put("version_code", iA);
            }
            if (this.g.c.getUpdateVersionCode() != 0) {
                jSONObject.put("update_version_code", this.g.c.getUpdateVersionCode());
            } else {
                jSONObject.put("update_version_code", iA);
            }
            if (this.g.c.getManifestVersionCode() != 0) {
                iA = this.g.c.getManifestVersionCode();
            }
            jSONObject.put("manifest_version_code", iA);
            if (!TextUtils.isEmpty(this.g.c.getAppName())) {
                jSONObject.put("app_name", this.g.c.getAppName());
            }
            if (!TextUtils.isEmpty(this.g.c.getTweakedChannel())) {
                jSONObject.put("tweaked_channel", this.g.c.getTweakedChannel());
            }
            PackageInfo packageInfoA = j5.a(this.e, packageName, 0);
            if (packageInfoA == null || (applicationInfo = packageInfoA.applicationInfo) == null) {
                return true;
            }
            int i = applicationInfo.labelRes;
            if (i <= 0) {
                return true;
            }
            try {
                jSONObject.put("display_name", this.e.getString(i));
                return true;
            } catch (Throwable unused) {
                return true;
            }
        } catch (Throwable th) {
            this.f.D.error("Load package info failed.", th, new Object[0]);
            return false;
        }
    }
}
