package com.engagelab.privates.push.platform.google.callback;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.push.api.CustomMessage;
import com.engagelab.privates.push.api.MTPushPrivatesApi;
import com.engagelab.privates.push.api.NotificationMessage;
import com.engagelab.privates.push.business.message.platform.JDataUtils;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.engagelab.privates.push.platform.google.business.MTGoogleBusiness;
import com.engagelab.privates.push.utils.NotificationUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class MTGoogleCallback extends FirebaseMessagingService {
    private static final String TAG = "MTGoogleCallback";

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.d(TAG, "onTokenFailed:get token is empty");
            MTGoogleBusiness.getInstance().onNode(getApplicationContext(), 3004, 0, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TOKEN_FAILED, 2);
            return;
        }
        MTCommonLog.d(TAG, "onTokenSuccess:callback token is " + str);
        MTGoogleBusiness.getInstance().onToken(getApplicationContext(), str, 2);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        String str;
        String str2;
        String strOptString;
        String uri;
        try {
            String messageId = remoteMessage.getMessageId();
            Map<String, String> data = remoteMessage.getData();
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : data.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            if (data.containsKey("JMessageExtra")) {
                str2 = data.get("JMessageExtra");
            } else {
                str2 = data.get("MTMessageExtra");
            }
            if (str2 == null) {
                return;
            }
            MTPushPrivatesApi.init(this);
            JSONObject jSONObject = new JSONObject(str2);
            MTCommonLog.d(TAG, "onMessage:" + MTCommonLog.toLogString(jSONObject));
            String messageId2 = NotificationUtil.getMessageId(jSONObject);
            String jDataFromMessageJson = JDataUtils.getJDataFromMessageJson(jSONObject);
            RemoteMessage.Notification notification = remoteMessage.getNotification();
            if (notification == null) {
                MTCommonLog.d(TAG, "is data");
                String strOptString2 = jSONObject.optString("title");
                String strOptString3 = jSONObject.optString("message");
                CustomMessage extras = new CustomMessage().setMessageId(messageId2).setPlatform((byte) 8).setPlatformMessageId(messageId).setTitle(strOptString2).setContent(strOptString3).setContentType(jSONObject.optString(FirebaseAnalytics.Param.CONTENT_TYPE)).setExtras(NotificationUtil.convertJsonToBundle(jSONObject.optJSONObject("extras")));
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("message", extras);
                JDataUtils.addJDataToBundle(bundle2, jDataFromMessageJson);
                MTCommonPrivatesApi.sendMessageToMainProcess(getApplicationContext(), 3001, bundle2);
                return;
            }
            MTCommonLog.d(TAG, "is notification");
            int notificationId = NotificationUtil.getNotificationId(messageId2);
            String title = notification.getTitle();
            String body = notification.getBody();
            Bundle bundleConvertJsonToBundle = NotificationUtil.convertJsonToBundle(jSONObject.optJSONObject("n_extras"));
            int iOptInt = jSONObject.optInt("n_alert_type");
            int priority = NotificationUtil.getPriority(jSONObject);
            int notificationImportance = NotificationUtil.getNotificationImportance(jSONObject);
            String strOptString4 = jSONObject.optString("n_sound");
            str = TAG;
            try {
                String strOptString5 = jSONObject.optString("n_category");
                String strOptString6 = jSONObject.optString("n_channel_id");
                if (MTPushPrivatesApi.SDK_VERSION_NAME.startsWith("3")) {
                    String clickAction = notification.getClickAction();
                    if (TextUtils.isEmpty(clickAction)) {
                        uri = "";
                    } else {
                        Intent intent = new Intent();
                        intent.setAction(clickAction);
                        intent.putExtras(bundle);
                        intent.setPackage(getApplicationContext().getPackageName());
                        uri = intent.toURI();
                    }
                    strOptString = null;
                } else {
                    String strOptString7 = jSONObject.optString("n_intent_uri");
                    strOptString = jSONObject.optString("n_intent_ssl");
                    uri = strOptString7;
                }
                NotificationMessage intentSsl = new NotificationMessage().setMessageId(messageId2).setPlatform((byte) 8).setPlatformMessageId(messageId).setNotificationId(notificationId).setTitle(title).setContent(body).setExtras(bundleConvertJsonToBundle).setDefaults(iOptInt).setPriority(priority).setImportance(notificationImportance).setCategory(strOptString5).setSound(strOptString4).setChannelId(strOptString6).setIntentUri(uri).setIntentSsl(strOptString);
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("message", intentSsl);
                bundle3.putBoolean(MTPushConstants.Message.KEY_MESSAGE_LIMIT, true);
                JDataUtils.addJDataToBundle(bundle3, jDataFromMessageJson);
                MTCommonPrivatesApi.sendMessageToRemoteProcess(getApplicationContext(), MTPushConstants.RemoteWhat.SHOW_NOTIFICATION, bundle3);
                MTCommonPrivatesApi.sendMessageToMainProcess(getApplicationContext(), 3002, bundle3);
            } catch (Throwable th) {
                th = th;
                MTCommonLog.w(str, "onMessage failed " + th.getMessage());
            }
        } catch (Throwable th2) {
            th = th2;
            str = TAG;
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
