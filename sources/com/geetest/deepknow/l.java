package com.geetest.deepknow;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.accessibility.AccessibilityManager;
import androidx.camera.video.AudioStats;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes21.dex */
public class l {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONArray a(Context context) {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<AccessibilityServiceInfo> it = ((AccessibilityManager) context.getSystemService("accessibility")).getEnabledAccessibilityServiceList(-1).iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().getResolveInfo().serviceInfo.packageName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String b(Context context) {
        double dDoubleValue;
        try {
            dDoubleValue = ((Double) Class.forName("com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", new Class[0]).invoke(Class.forName("com.android.internal.os.PowerProfile").getConstructor(Context.class).newInstance(context), new Object[0])).doubleValue();
        } catch (Exception e) {
            e.printStackTrace();
            dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        return dDoubleValue + "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String c(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return MultiTransferSignData.DEFAULT_INTERVAL;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("voltage", -1);
        if (intExtra > 1000) {
            return (intExtra / 1000.0f) + "";
        }
        return intExtra + "";
    }
}
