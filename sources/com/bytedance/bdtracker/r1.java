package com.bytedance.bdtracker;

import android.os.Build;
import com.engagelab.privates.push.constants.MTPushConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class r1 extends q1 {
    public final v1 e;
    public final d f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public r1(d dVar, v1 v1Var) {
        super(true, false);
        this.f = dVar;
        this.e = v1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.q1
    public String a() {
        return "Build";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.q1
    public boolean a(JSONObject jSONObject) throws JSONException {
        jSONObject.put(MTPushConstants.PlatformNode.KEY_PLATFORM, "Android");
        jSONObject.put("sdk_lib", "Android");
        jSONObject.put("device_model", Build.MODEL);
        jSONObject.put("device_brand", Build.BRAND);
        jSONObject.put("device_manufacturer", Build.MANUFACTURER);
        if (this.e.c.isCPUAbiEnabled()) {
            jSONObject.put("cpu_abi", Build.CPU_ABI);
        }
        jSONObject.put("sdk_target_version", 29);
        jSONObject.put("git_hash", "7505d18");
        if (!n5.c.b(new Object[0]).booleanValue() || !this.e.c.isHarmonyEnabled()) {
            jSONObject.put("os", "Android");
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            return true;
        }
        jSONObject.put("os", "Harmony");
        try {
            jSONObject.put("os_api", p5.a("hw_sc.build.os.apiversion"));
            jSONObject.put("os_version", p5.a("hw_sc.build.platform.version"));
            return true;
        } catch (Throwable th) {
            this.f.D.error("loadHarmonyInfo failed", th, new Object[0]);
            return true;
        }
    }
}
