package o;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.engagelab.privates.push.api.NotificationMessage;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.tgx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C46959tgx {
    public static final C46959tgx AEQbTJ = new C46959tgx();

    private C46959tgx() {
    }

    public final void OLrzqt(NotificationMessage notificationMessage) {
        C46914tgE c46914tgE;
        try {
            xVV.EZpvd(C32979mnm.EZpvd.OLrzqt());
        } catch (java.lang.Throwable th) {
            pUU.KWHzl("PushPublisherForJPush", "increaseBadgeCount failed: " + th.getMessage());
        }
        pUU.KWHzl("PushPublisherForJPush", "dispatchPushMessage : " + notificationMessage);
        C46934tgY c46934tgY = C46934tgY.AEQbTJ;
        com.okinc.okpush.sdk.utils.NotificationChannel notificationChannel = com.okinc.okpush.sdk.utils.NotificationChannel.JPush;
        if (notificationMessage != null) {
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Integer.valueOf(notificationMessage.getNotificationId()));
            java.lang.String title = notificationMessage.getTitle();
            if (title == null) {
                title = "";
            }
            java.lang.String content = notificationMessage.getContent();
            if (content == null) {
                content = "";
            }
            c46914tgE = new C46914tgE(strGEmmrt, title, content, "");
        } else {
            c46914tgE = null;
        }
        c46934tgY.OLrzqt(notificationChannel, c46914tgE);
        C46952tgq c46952tgqEZpvd = EZpvd(notificationMessage);
        if (c46952tgqEZpvd != null) {
            pUU.KWHzl("PushPublisherForJPush", "dispatchPushMessage notification: " + c46952tgqEZpvd);
            java.lang.String strAEQbTJ = c46952tgqEZpvd.AEQbTJ();
            if (strAEQbTJ != null) {
                InterfaceC46949tgn interfaceC46949tgnCopydefault = C46954tgs.OLrzqt.copydefault(strAEQbTJ);
                if (interfaceC46949tgnCopydefault != null) {
                    if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) "im/message") || Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) "im/voice")) {
                        pUU.KWHzl("PushPublisherForJPush", "Cancelling JPush automatic notification for link: " + strAEQbTJ);
                        if (notificationMessage != null) {
                            try {
                                int notificationId = notificationMessage.getNotificationId();
                                java.lang.Object systemService = C32979mnm.EZpvd.OLrzqt().getSystemService(RemoteMessageConst.NOTIFICATION);
                                android.app.NotificationManager notificationManager = systemService instanceof android.app.NotificationManager ? (android.app.NotificationManager) systemService : null;
                                if (notificationManager != null) {
                                    notificationManager.cancel(notificationId);
                                }
                                pUU.KWHzl("PushPublisherForJPush", "Cancelled JPush automatic notification with ID: " + notificationId);
                            } catch (java.lang.Throwable th2) {
                                pUU.AEQbTJ("PushPublisherForJPush", "Failed to cancel JPush notification: " + th2.getMessage(), th2);
                            }
                        }
                    }
                    interfaceC46949tgnCopydefault.copydefault(c46952tgqEZpvd);
                } else {
                    pUU.KWHzl("PushPublisherForJPush", "No listener found for link '" + strAEQbTJ + "', JPush will show default notification");
                }
            }
        }
        C46955tgt c46955tgtCopydefault = copydefault(notificationMessage != null ? notificationMessage.getExtras() : null);
        if (c46955tgtCopydefault != null) {
            pUU.KWHzl("PushPublisherForJPush", "dispatchPushMessage pushIMRefresh: " + c46955tgtCopydefault);
            InterfaceC46947tgl interfaceC46947tglAEQbTJ = C46954tgs.OLrzqt.AEQbTJ();
            if (interfaceC46947tglAEQbTJ != null) {
                interfaceC46947tglAEQbTJ.KWHzl(c46955tgtCopydefault);
            }
        }
    }

    public final C46952tgq EZpvd(NotificationMessage notificationMessage) {
        android.os.Bundle extras;
        if (notificationMessage != null) {
            try {
                extras = notificationMessage.getExtras();
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("PushPublisherForJPush", e);
            }
        } else {
            extras = null;
        }
        if (extras != null) {
            java.lang.String string = extras.getString("link");
            if (android.text.TextUtils.isEmpty(string)) {
                return null;
            }
            java.lang.String strKWHzl = AEQbTJ.KWHzl(extras);
            java.lang.String string2 = extras.getString("routerUrl");
            if (string2 == null) {
                string2 = "";
            }
            return new C46952tgq(string, strKWHzl, notificationMessage.getTitle(), notificationMessage.getContent(), string2, null, 32, null);
        }
        return null;
    }

    public final java.lang.String KWHzl(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        JSONObject jSONObject = new JSONObject();
        java.util.Set<java.lang.String> setKeySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "");
        try {
            for (java.lang.String str : setKeySet) {
                jSONObject.put(str, JSONObject.wrap(bundle.get(str)));
            }
        } catch (JSONException e) {
            pUU.AEQbTJ("PushPublisherForJPush", e);
        }
        return jSONObject.toString();
    }

    public final C46955tgt copydefault(android.os.Bundle bundle) {
        java.lang.String string;
        if (bundle != null) {
            try {
                string = bundle.getString(MetricsSQLiteCacheKt.METRICS_PARAMS);
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("PushPublisherForJPush", e);
            }
        } else {
            string = null;
        }
        if (string != null) {
            JSONObject jSONObject = new JSONObject(string);
            return new C46955tgt(java.lang.Long.valueOf(jSONObject.optLong("pushTime")), jSONObject.optString("type"));
        }
        return null;
    }
}
