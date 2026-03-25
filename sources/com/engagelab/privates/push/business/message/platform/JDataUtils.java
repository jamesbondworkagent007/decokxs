package com.engagelab.privates.push.business.message.platform;

import android.os.Bundle;
import android.text.TextUtils;
import com.engagelab.privates.push.api.CustomMessage;
import com.engagelab.privates.push.api.NotificationMessage;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class JDataUtils {
    private static final Map<String, String> jDataMap = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void addJDataMessageID(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        jDataMap.put(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void addJDataPlatformMessageID(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        jDataMap.put(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void addJDataToBundle(Bundle bundle, String str) {
        if (bundle == null || TextUtils.isEmpty(str)) {
            return;
        }
        bundle.putString("_j_data_", str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getJData(Bundle bundle, NotificationMessage notificationMessage) {
        String jDataFromBundle = getJDataFromBundle(bundle);
        return TextUtils.isEmpty(jDataFromBundle) ? getJDataId(notificationMessage.getPlatformMessageId(), notificationMessage.getMessageId()) : jDataFromBundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getJDataFromBundle(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString("_j_data_");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getJDataFromMessageJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString("_j_data_");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String getJDataId(String str, String str2) {
        return !TextUtils.isEmpty(str) ? getJData(str) : getJData(str2);
    }

    public static String getJData(Bundle bundle, CustomMessage customMessage) {
        String jDataFromBundle = getJDataFromBundle(bundle);
        return TextUtils.isEmpty(jDataFromBundle) ? getJDataId(customMessage.getPlatformMessageId(), customMessage.getMessageId()) : jDataFromBundle;
    }

    private static String getJData(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return jDataMap.get(str);
    }
}
