package com.engagelab.privates.common;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.component.MTCommonReceiver;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.core.api.MTReporter;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.push.api.CustomMessage;
import com.engagelab.privates.push.business.message.platform.JDataUtils;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.engagelab.privates.push.utils.NotificationUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c0 extends b0 {
    public static volatile c0 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.engagelab.privates.common.b0
    public void a(Context context, Bundle bundle) {
        try {
            String string = bundle.getString("message");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            String strOptString = jSONObject.optString("ad_id");
            if (TextUtils.isEmpty(strOptString)) {
                MTCommonLog.d("MTCustomBusiness", "customMessage's messageId is null, can't callback this custom");
                return;
            }
            String strOptString2 = jSONObject.optString("title");
            String strOptString3 = jSONObject.optString("message");
            if (TextUtils.isEmpty(strOptString3)) {
                MTCommonLog.d("MTCustomBusiness", "customMessage's content is null, can't callback this custom");
                return;
            }
            CustomMessage extras = new CustomMessage().setMessageId(strOptString).setTitle(strOptString2).setContent(strOptString3).setContentType(jSONObject.optString(FirebaseAnalytics.Param.CONTENT_TYPE)).setExtras(NotificationUtil.convertJsonToBundle(jSONObject.optJSONObject("extras")));
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("message", extras);
            MTCommonPrivatesApi.sendMessageToMainProcess(context, 3001, bundle2);
        } catch (Throwable th) {
            MTCommonLog.w("MTCustomBusiness", "onMessage failed " + th.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static c0 b() {
        if (b == null) {
            synchronized (c0.class) {
                b = new c0();
            }
        }
        return b;
    }

    public void b(Context context, int i, Bundle bundle) {
        String str;
        int i2;
        try {
            bundle.setClassLoader(CustomMessage.class.getClassLoader());
            CustomMessage customMessage = (CustomMessage) bundle.getParcelable("message");
            if (customMessage == null) {
                return;
            }
            MTCommonLog.d("MTCustomBusiness", "onCustomMessage");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("msg_id", customMessage.getMessageId());
            if (customMessage.getPlatform() != 0) {
                jSONObject.put(HianalyticsBaseData.SDK_TYPE, (int) customMessage.getPlatform());
                jSONObject.put("tmsg_id", customMessage.getPlatformMessageId());
                str = "third_msg_status";
                i2 = MTPushConstants.MainWhat.REPORT_PLATFORM_MESSAGE_STATE;
            } else {
                str = "msg_status";
                i2 = MTPushConstants.MainWhat.REPORT_MESSAGE_STATE;
            }
            jSONObject.put("result", 1018);
            String jData = JDataUtils.getJData(bundle, customMessage);
            if (!TextUtils.isEmpty(jData)) {
                jSONObject.put("_j_data_", jData);
            }
            MTReporter content = new MTReporter().setType(str).setContent(jSONObject.toString());
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL, content);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.REPORT, bundle2);
            Bundle bundle3 = new Bundle();
            bundle3.putString(MTPushConstants.Analysis.KEY_JSON, jSONObject.toString());
            MTCommonPrivatesApi.sendMessageToMainProcess(context, i2, bundle3);
        } catch (Throwable th) {
            MTCommonLog.w("MTCustomBusiness", "processRemoteMessage failed " + th.getMessage());
        }
    }

    public void a(Context context, int i, Bundle bundle) {
        MTCommonReceiver commonReceiver;
        try {
            bundle.setClassLoader(CustomMessage.class.getClassLoader());
            CustomMessage customMessage = (CustomMessage) bundle.getParcelable("message");
            if (customMessage == null || (commonReceiver = MTGlobal.getCommonReceiver(context)) == null) {
                return;
            }
            commonReceiver.onCustomMessage(context, customMessage);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTPushConstants.RemoteWhat.ON_CUSTOM_ARRIVED, bundle);
        } catch (Throwable th) {
            MTCommonLog.w("MTCustomBusiness", "processMainMessage failed " + th.getMessage());
        }
    }
}
