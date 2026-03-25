package o;

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
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.tgM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C46922tgM implements InterfaceC46918tgI {
    public final android.content.Context AEQbTJ;

    public C46922tgM(android.content.Context context) {
        this.AEQbTJ = context;
    }

    @Override // o.InterfaceC46918tgI
    public void KWHzl(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            MTCommonLog.d("MTGoogleCallback", "onTokenFailed:get token is empty");
            MTGoogleBusiness.getInstance().onNode(this.AEQbTJ.getApplicationContext(), 3004, 0, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TOKEN_FAILED, 2);
            return;
        }
        MTCommonLog.d("MTGoogleCallback", "onTokenSuccess:callback token is " + str);
        MTGoogleBusiness.getInstance().onToken(this.AEQbTJ.getApplicationContext(), str, 2);
    }

    @Override // o.InterfaceC46918tgI
    public void EZpvd(RemoteMessage remoteMessage) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String strOptString;
        java.lang.String strOptString2;
        try {
            java.lang.String messageId = remoteMessage.getMessageId();
            java.util.Map<java.lang.String, java.lang.String> data = remoteMessage.getData();
            android.os.Bundle bundle = new android.os.Bundle();
            for (Map.Entry<java.lang.String, java.lang.String> entry : data.entrySet()) {
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
            MTPushPrivatesApi.init(this.AEQbTJ);
            JSONObject jSONObject = new JSONObject(str2);
            MTCommonLog.d("MTGoogleCallback", "onMessage:" + MTCommonLog.toLogString(jSONObject));
            java.lang.String messageId2 = NotificationUtil.getMessageId(jSONObject);
            java.lang.String jDataFromMessageJson = JDataUtils.getJDataFromMessageJson(jSONObject);
            RemoteMessage.Notification notification = remoteMessage.getNotification();
            if (notification == null) {
                MTCommonLog.d("MTGoogleCallback", "is data");
                java.lang.String strOptString3 = jSONObject.optString("title");
                java.lang.String strOptString4 = jSONObject.optString("message");
                CustomMessage extras = new CustomMessage().setMessageId(messageId2).setPlatform((byte) 8).setPlatformMessageId(messageId).setTitle(strOptString3).setContent(strOptString4).setContentType(jSONObject.optString(FirebaseAnalytics.Param.CONTENT_TYPE)).setExtras(NotificationUtil.convertJsonToBundle(jSONObject.optJSONObject("extras")));
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putParcelable("message", extras);
                JDataUtils.addJDataToBundle(bundle2, jDataFromMessageJson);
                MTCommonPrivatesApi.sendMessageToMainProcess(this.AEQbTJ.getApplicationContext(), 3001, bundle2);
                return;
            }
            MTCommonLog.d("MTGoogleCallback", "is notification");
            int notificationId = NotificationUtil.getNotificationId(messageId2);
            java.lang.String title = notification.getTitle();
            java.lang.String body = notification.getBody();
            android.os.Bundle bundleConvertJsonToBundle = NotificationUtil.convertJsonToBundle(jSONObject.optJSONObject("n_extras"));
            int iOptInt = jSONObject.optInt("n_alert_type");
            int priority = NotificationUtil.getPriority(jSONObject);
            int notificationImportance = NotificationUtil.getNotificationImportance(jSONObject);
            str = "MTGoogleCallback";
            try {
                java.lang.String strOptString5 = jSONObject.optString("n_sound");
                java.lang.String strOptString6 = jSONObject.optString("n_category");
                java.lang.String strOptString7 = jSONObject.optString("n_channel_id");
                if (MTPushPrivatesApi.SDK_VERSION_NAME.startsWith("3")) {
                    java.lang.String clickAction = notification.getClickAction();
                    if (android.text.TextUtils.isEmpty(clickAction)) {
                        strOptString = "";
                    } else {
                        android.content.Intent intent = new android.content.Intent();
                        intent.setAction(clickAction);
                        intent.putExtras(bundle);
                        intent.setPackage(this.AEQbTJ.getApplicationContext().getPackageName());
                        strOptString = intent.toURI();
                    }
                    strOptString2 = null;
                } else {
                    strOptString = jSONObject.optString("n_intent_uri");
                    strOptString2 = jSONObject.optString("n_intent_ssl");
                }
                NotificationMessage intentSsl = new NotificationMessage().setMessageId(messageId2).setPlatform((byte) 8).setPlatformMessageId(messageId).setNotificationId(notificationId).setTitle(title).setContent(body).setExtras(bundleConvertJsonToBundle).setDefaults(iOptInt).setPriority(priority).setImportance(notificationImportance).setCategory(strOptString6).setSound(strOptString5).setChannelId(strOptString7).setIntentUri(strOptString).setIntentSsl(strOptString2);
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putParcelable("message", intentSsl);
                bundle3.putBoolean(MTPushConstants.Message.KEY_MESSAGE_LIMIT, true);
                JDataUtils.addJDataToBundle(bundle3, jDataFromMessageJson);
                MTCommonPrivatesApi.sendMessageToRemoteProcess(this.AEQbTJ.getApplicationContext(), MTPushConstants.RemoteWhat.SHOW_NOTIFICATION, bundle3);
                MTCommonPrivatesApi.sendMessageToMainProcess(this.AEQbTJ.getApplicationContext(), 3002, bundle3);
            } catch (java.lang.Throwable th) {
                th = th;
                MTCommonLog.w(str, "onMessage failed " + th.getMessage());
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            str = "MTGoogleCallback";
        }
    }
}
