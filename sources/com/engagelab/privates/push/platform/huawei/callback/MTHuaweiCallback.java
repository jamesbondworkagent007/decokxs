package com.engagelab.privates.push.platform.huawei.callback;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.push.api.CustomMessage;
import com.engagelab.privates.push.api.MTPushPrivatesApi;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.engagelab.privates.push.platform.huawei.business.MTHuaweiBusiness;
import com.engagelab.privates.push.utils.NotificationUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class MTHuaweiCallback extends HmsMessageService {
    private static final String TAG = "MTHuaweiCallback";

    @Override // com.huawei.hms.push.HmsMessageService
    public void onNewToken(String str) {
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.d(TAG, "onTokenFailed:onNewToken token is empty");
            MTHuaweiBusiness.getInstance().onNode(getApplicationContext(), 3004, 0, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TOKEN_FAILED, 2);
            return;
        }
        MTCommonLog.d(TAG, "onTokenSuccess:onNewToken token is " + str);
        MTHuaweiBusiness.getInstance().onToken(getApplicationContext(), str, 2);
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onNewToken(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.d(TAG, "onTokenFailed:onNewToken token is empty");
            MTHuaweiBusiness.getInstance().onNode(getApplicationContext(), 3004, 0, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TOKEN_FAILED, 2);
            return;
        }
        MTCommonLog.d(TAG, "onTokenSuccess:onNewToken token is " + str);
        MTHuaweiBusiness.getInstance().onToken(getApplicationContext(), str, 2);
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        String string;
        try {
            MTCommonLog.d(TAG, "onMessageReceived - " + remoteMessage);
            String messageId = remoteMessage.getMessageId();
            String data = remoteMessage.getData();
            if (data == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject(data);
            if (jSONObject.has("JMessageExtra")) {
                string = jSONObject.getString("JMessageExtra");
            } else {
                string = jSONObject.getString("MTMessageExtra");
            }
            if (string == null) {
                return;
            }
            MTPushPrivatesApi.init(this);
            JSONObject jSONObject2 = new JSONObject(string);
            MTCommonLog.d(TAG, "onMessage:" + MTCommonLog.toLogString(jSONObject2));
            String messageId2 = NotificationUtil.getMessageId(jSONObject2);
            String strOptString = jSONObject2.optString("title");
            String strOptString2 = jSONObject2.optString("message");
            CustomMessage extras = new CustomMessage().setMessageId(messageId2).setPlatform((byte) 2).setPlatformMessageId(messageId).setTitle(strOptString).setContent(strOptString2).setContentType(jSONObject2.optString(FirebaseAnalytics.Param.CONTENT_TYPE)).setExtras(NotificationUtil.convertJsonToBundle(jSONObject2.optJSONObject("extras")));
            Bundle bundle = new Bundle();
            bundle.putParcelable("message", extras);
            MTCommonPrivatesApi.sendMessageToMainProcess(getApplicationContext(), 3001, bundle);
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "onMessage failed " + th.getMessage());
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // com.huawei.hms.push.HmsMessageService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
