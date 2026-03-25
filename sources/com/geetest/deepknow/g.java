package com.geetest.deepknow;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.geetest.mobinfo.GtMobConfig;
import com.geetest.mobinfo.GtMobHelper;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.p2p.api.OtcExtraKeys;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class g {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] a(Context context, e eVar) {
        boolean z;
        JSONObject jSONObjectB = eVar.b();
        if (jSONObjectB != null && jSONObjectB.has("special_reinforce") && jSONObjectB.optBoolean("special_reinforce")) {
            t.b("special reinforce.");
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("wfsc_ea", "false");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        GtMobConfig.Builder builderAddDeviceOutParam = GtMobConfig.builder().addParam("uuid", h.a(context, w.f408a, "")).addParam("libVer", "1.3.3").addParam("rsl", h.a(context, w.b, "$unknown")).addDeviceOutParam("events", new JSONArray()).addDeviceOutParam("user_config", jSONObject);
        if (z) {
            builderAddDeviceOutParam.addConfigParam("reinforce", Boolean.valueOf(z));
        }
        if (k.a(eVar.a())) {
            return null;
        }
        builderAddDeviceOutParam.addDataOutParam(MTPushConstants.PlatformNode.KEY_PLATFORM, "android").addDataOutParam("pt", "3").addDataOutParam("ts", "" + System.currentTimeMillis()).addDataOutParam(OtcExtraKeys.PARAMS_SESSION_ID, eVar.f()).addDataOutParam("launch_id", eVar.d()).addDataOutParam(HianalyticsBaseData.SDK_VERSION, eVar.h()).addDataOutParam(HiAnalyticsConstant.BI_KEY_APP_ID, eVar.a());
        if (!a(context, eVar.f()) || !TextUtils.isEmpty(eVar.f())) {
            builderAddDeviceOutParam.setGlobalHelper(false);
        }
        return GtMobHelper.getPostParamForDeepknow(builderAddDeviceOutParam.build(), context);
    }

    public static byte[] a(Context context, JSONObject jSONObject, e eVar) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", jSONObject);
            jSONObject2.put("ts", System.currentTimeMillis() + "");
            jSONObject2.put("pt", "3");
            jSONObject2.put(OtcExtraKeys.PARAMS_SESSION_ID, eVar.c());
            jSONObject2.put(HiAnalyticsConstant.BI_KEY_APP_ID, eVar.a());
            jSONObject2.put("launch_id", eVar.d());
            return GtMobHelper.getExtraData(context, jSONObject2.toString());
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static boolean a(Context context, String str) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("geetest", 0);
            String string = sharedPreferences.getString("cache_id", null);
            if (!TextUtils.isEmpty(string) && TextUtils.equals(string, str)) {
                return false;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("cache_id", str);
            editorEdit.apply();
            return true;
        } catch (Exception unused) {
            return true;
        }
    }
}
