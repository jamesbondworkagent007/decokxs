package o;

import com.bytedance.applog.encryptor.IEncryptorType;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.just.agentweb.DefaultWebClient;
import com.okinc.productmatrix.biz.bean.ProductMatrixRemoteConfig;
import com.onesignal.OSNotificationWorkManager;
import com.onesignal.OSReceiveReceiptController;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import o.C57788yoy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ynH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57692ynH {

    /* JADX INFO: renamed from: o.ynH$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public static class ActionBar {
        public boolean AEQbTJ;
        public boolean KWHzl;
        public boolean OLrzqt;
        public boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void AEQbTJ(boolean z) {
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void EZpvd(boolean z) {
            this.AEQbTJ = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void OLrzqt(boolean z) {
            this.KWHzl = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean OLrzqt() {
            return !this.copydefault || this.KWHzl || this.AEQbTJ || this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void copydefault(boolean z) {
            this.copydefault = z;
        }
    }

    /* JADX INFO: renamed from: o.ynH$Application */
    /* JADX INFO: loaded from: classes17.dex */
    public interface Application {
        void copydefault(@androidx.annotation.Nullable ActionBar actionBar);
    }

    /* JADX INFO: renamed from: o.ynH$TaskDescription */
    /* JADX INFO: loaded from: classes17.dex */
    public interface TaskDescription {
        void EZpvd(boolean z);
    }

    public static void KWHzl(final android.content.Context context, InterfaceC57718ynh interfaceC57718ynh) {
        OneSignal.fetchVPNInfo(context);
        try {
            final java.lang.String strCopydefault = interfaceC57718ynh.copydefault("json_payload");
            if (strCopydefault == null) {
                OneSignal.KWHzl(OneSignal.LOG_LEVEL.ERROR, "json_payload key is nonexistent from mBundle passed to ProcessFromFCMIntentService: " + interfaceC57718ynh);
                return;
            }
            final JSONObject jSONObject = new JSONObject(strCopydefault);
            final boolean zEZpvd = interfaceC57718ynh.EZpvd("is_restoring", false);
            final long jLongValue = interfaceC57718ynh.KWHzl("timestamp").longValue();
            final int iIntValue = interfaceC57718ynh.EZpvd("android_notif_id") ? interfaceC57718ynh.OLrzqt("android_notif_id").intValue() : 0;
            OneSignal.KWHzl(context, jSONObject, new C57788yoy.Application() { // from class: o.ynH.5
                @Override // o.C57788yoy.Application
                public void EZpvd(boolean z) {
                    if (zEZpvd || !z) {
                        OSNotificationWorkManager.copydefault(context, C57743yoF.AEQbTJ(jSONObject), iIntValue, strCopydefault, jLongValue, zEZpvd, false);
                        if (zEZpvd) {
                            OSUtils.OLrzqt(100);
                        }
                    }
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static int AEQbTJ(C57745yoH c57745yoH, boolean z) {
        return KWHzl(new C57740yoC(c57745yoH, c57745yoH.values(), true), false, z);
    }

    public static int OLrzqt(C57740yoC c57740yoC, boolean z) {
        return KWHzl(c57740yoC, false, z);
    }

    public static int KWHzl(C57740yoC c57740yoC, boolean z, boolean z2) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "Starting processJobForDisplay opened: " + z + " fromBackgroundLogic: " + z2);
        C57745yoH c57745yoHOLrzqt = c57740yoC.OLrzqt();
        EZpvd(c57745yoHOLrzqt);
        int iIntValue = c57745yoHOLrzqt.AEQbTJ().intValue();
        boolean zCopydefault = false;
        if (OLrzqt(c57745yoHOLrzqt)) {
            c57745yoHOLrzqt.KWHzl(true);
            if (z2 && OneSignal.AEQbTJ(c57745yoHOLrzqt)) {
                c57740yoC.AEQbTJ(false);
                OneSignal.OLrzqt(c57740yoC);
                return iIntValue;
            }
            zCopydefault = C57729yns.copydefault(c57745yoHOLrzqt);
        }
        if (!c57745yoHOLrzqt.values()) {
            copydefault(c57745yoHOLrzqt, z, zCopydefault);
            OSNotificationWorkManager.EZpvd(C57743yoF.AEQbTJ(c57740yoC.OLrzqt().OLrzqt()));
            OneSignal.KWHzl(c57745yoHOLrzqt);
        }
        return iIntValue;
    }

    public static boolean OLrzqt(C57745yoH c57745yoH) {
        return c57745yoH.isConnected() || OSUtils.EZpvd(c57745yoH.OLrzqt().optString(ProductMatrixRemoteConfig.ALERT));
    }

    public static void copydefault(C57745yoH c57745yoH, boolean z, boolean z2) {
        KWHzl(c57745yoH, z);
        if (!z2) {
            AEQbTJ(c57745yoH);
            return;
        }
        java.lang.String strEZpvd = c57745yoH.EZpvd();
        OSReceiveReceiptController.OLrzqt().EZpvd(c57745yoH.copydefault(), strEZpvd);
        OneSignal.RJOkX().KWHzl(strEZpvd);
    }

    public static void KWHzl(android.content.Context context, java.lang.String str) {
        OSReceiveReceiptController.OLrzqt().EZpvd(context, str);
        OneSignal.RJOkX().KWHzl(str);
    }

    public static void KWHzl(C57745yoH c57745yoH, boolean z) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.KWHzl(log_level, "Saving Notification job: " + c57745yoH.toString());
        android.content.Context contextCopydefault = c57745yoH.copydefault();
        JSONObject jSONObjectOLrzqt = c57745yoH.OLrzqt();
        try {
            JSONObject jSONObjectOLrzqt2 = OLrzqt(c57745yoH.OLrzqt());
            C57830ypn c57830ypnKWHzl = C57830ypn.KWHzl(c57745yoH.copydefault());
            if (c57745yoH.fetchVPNInfo()) {
                java.lang.String str = "android_notification_id = " + c57745yoH.AEQbTJ();
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("dismissed", (java.lang.Integer) 1);
                c57830ypnKWHzl.AEQbTJ(RemoteMessageConst.NOTIFICATION, contentValues, str, null);
                C57719yni.EZpvd(c57830ypnKWHzl, contextCopydefault);
            }
            android.content.ContentValues contentValues2 = new android.content.ContentValues();
            contentValues2.put(MTPushConstants.Message.KEY_NOTIFICATION_ID, jSONObjectOLrzqt2.optString("i"));
            if (jSONObjectOLrzqt.has("grp")) {
                contentValues2.put("group_id", jSONObjectOLrzqt.optString("grp"));
            }
            if (jSONObjectOLrzqt.has(Constants.MessagePayloadKeys.COLLAPSE_KEY) && !"do_not_collapse".equals(jSONObjectOLrzqt.optString(Constants.MessagePayloadKeys.COLLAPSE_KEY))) {
                contentValues2.put("collapse_id", jSONObjectOLrzqt.optString(Constants.MessagePayloadKeys.COLLAPSE_KEY));
            }
            contentValues2.put("opened", java.lang.Integer.valueOf(z ? 1 : 0));
            if (!z) {
                contentValues2.put("android_notification_id", c57745yoH.AEQbTJ());
            }
            if (c57745yoH.AhwBna() != null) {
                contentValues2.put("title", c57745yoH.AhwBna().toString());
            }
            if (c57745yoH.KWHzl() != null) {
                contentValues2.put("message", c57745yoH.KWHzl().toString());
            }
            contentValues2.put("expire_time", java.lang.Long.valueOf((jSONObjectOLrzqt.optLong(Constants.MessagePayloadKeys.SENT_TIME, OneSignal.aKErDB().KWHzl()) / 1000) + ((long) jSONObjectOLrzqt.optInt(Constants.MessagePayloadKeys.TTL, 259200))));
            contentValues2.put("full_data", jSONObjectOLrzqt.toString());
            c57830ypnKWHzl.AEQbTJ(RemoteMessageConst.NOTIFICATION, (java.lang.String) null, contentValues2);
            OneSignal.KWHzl(log_level, "Notification saved values: " + contentValues2.toString());
            if (z) {
                return;
            }
            C57719yni.EZpvd(c57830ypnKWHzl, contextCopydefault);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void AEQbTJ(C57745yoH c57745yoH) {
        if (c57745yoH.fetchVPNInfo()) {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "Marking restored or disabled notifications as dismissed: " + c57745yoH.toString());
            java.lang.String str = "android_notification_id = " + c57745yoH.AEQbTJ();
            C57830ypn c57830ypnKWHzl = C57830ypn.KWHzl(c57745yoH.copydefault());
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("dismissed", (java.lang.Integer) 1);
            c57830ypnKWHzl.AEQbTJ(RemoteMessageConst.NOTIFICATION, contentValues, str, null);
            C57719yni.EZpvd(c57830ypnKWHzl, c57745yoH.copydefault());
        }
    }

    public static JSONObject KWHzl(android.os.Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (java.lang.String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e) {
                OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "bundleAsJSONObject error for key: " + str, e);
            }
        }
        return jSONObject;
    }

    public static void OLrzqt(android.os.Bundle bundle) {
        JSONObject jSONObject;
        java.lang.String string;
        if (bundle.containsKey("o")) {
            try {
                JSONObject jSONObject2 = new JSONObject(bundle.getString("custom"));
                if (jSONObject2.has(IEncryptorType.DEFAULT_ENCRYPTOR)) {
                    jSONObject = jSONObject2.getJSONObject(IEncryptorType.DEFAULT_ENCRYPTOR);
                } else {
                    jSONObject = new JSONObject();
                }
                JSONArray jSONArray = new JSONArray(bundle.getString("o"));
                bundle.remove("o");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    java.lang.String string2 = jSONObject3.getString("n");
                    jSONObject3.remove("n");
                    if (jSONObject3.has("i")) {
                        string = jSONObject3.getString("i");
                        jSONObject3.remove("i");
                    } else {
                        string = string2;
                    }
                    jSONObject3.put("id", string);
                    jSONObject3.put("text", string2);
                    if (jSONObject3.has(TtmlNode.TAG_P)) {
                        jSONObject3.put(RemoteMessageConst.Notification.ICON, jSONObject3.getString(TtmlNode.TAG_P));
                        jSONObject3.remove(TtmlNode.TAG_P);
                    }
                }
                jSONObject.put("actionButtons", jSONArray);
                jSONObject.put("actionId", "__DEFAULT__");
                if (!jSONObject2.has(IEncryptorType.DEFAULT_ENCRYPTOR)) {
                    jSONObject2.put(IEncryptorType.DEFAULT_ENCRYPTOR, jSONObject);
                }
                bundle.putString("custom", jSONObject2.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public static void EZpvd(C57745yoH c57745yoH) {
        if (c57745yoH.values() || !c57745yoH.OLrzqt().has(Constants.MessagePayloadKeys.COLLAPSE_KEY) || "do_not_collapse".equals(c57745yoH.OLrzqt().optString(Constants.MessagePayloadKeys.COLLAPSE_KEY))) {
            return;
        }
        android.database.Cursor cursorKWHzl = C57830ypn.KWHzl(c57745yoH.copydefault()).KWHzl(RemoteMessageConst.NOTIFICATION, new java.lang.String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new java.lang.String[]{c57745yoH.OLrzqt().optString(Constants.MessagePayloadKeys.COLLAPSE_KEY)}, null, null, null);
        if (cursorKWHzl.moveToFirst()) {
            c57745yoH.valueOf().OLrzqt(cursorKWHzl.getInt(cursorKWHzl.getColumnIndex("android_notification_id")));
        }
        cursorKWHzl.close();
    }

    public static void OLrzqt(android.content.Context context, android.os.Bundle bundle, final Application application) {
        final ActionBar actionBar = new ActionBar();
        if (!C57743yoF.KWHzl(bundle)) {
            application.copydefault(actionBar);
            return;
        }
        actionBar.copydefault(true);
        OLrzqt(bundle);
        if (C57780yoq.AEQbTJ(context, bundle)) {
            actionBar.EZpvd(true);
            application.copydefault(actionBar);
        } else {
            EZpvd(context, bundle, actionBar, new TaskDescription() { // from class: o.ynH.1
                @Override // o.C57692ynH.TaskDescription
                public void EZpvd(boolean z) {
                    if (!z) {
                        actionBar.OLrzqt(true);
                    }
                    application.copydefault(actionBar);
                }
            });
        }
    }

    public static void EZpvd(final android.content.Context context, final android.os.Bundle bundle, final ActionBar actionBar, final TaskDescription taskDescription) {
        final JSONObject jSONObjectKWHzl = KWHzl(bundle);
        final long jKWHzl = OneSignal.aKErDB().KWHzl() / 1000;
        final boolean z = bundle.getBoolean("is_restoring", false);
        final boolean z2 = java.lang.Integer.parseInt(bundle.getString("pri", "0")) > 9;
        OneSignal.KWHzl(context, jSONObjectKWHzl, new C57788yoy.Application() { // from class: o.ynH.4
            @Override // o.C57788yoy.Application
            public void EZpvd(boolean z3) {
                if (!z && z3) {
                    OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "startNotificationProcessing returning, with context: " + context + " and bundle: " + bundle);
                    taskDescription.EZpvd(false);
                    return;
                }
                OSNotificationWorkManager.copydefault(context, C57743yoF.AEQbTJ(jSONObjectKWHzl), bundle.containsKey("android_notif_id") ? bundle.getInt("android_notif_id") : 0, jSONObjectKWHzl.toString(), jKWHzl, z, z2);
                actionBar.AEQbTJ(true);
                taskDescription.EZpvd(true);
            }
        });
    }

    public static JSONArray EZpvd(JSONObject jSONObject) {
        return new JSONArray().put(jSONObject);
    }

    public static JSONObject OLrzqt(JSONObject jSONObject) throws JSONException {
        return new JSONObject(jSONObject.optString("custom"));
    }

    public static boolean AEQbTJ(android.os.Bundle bundle) {
        return OLrzqt(bundle, "licon") || OLrzqt(bundle, "bicon") || bundle.getString("bg_img", null) != null;
    }

    public static boolean OLrzqt(android.os.Bundle bundle, java.lang.String str) {
        java.lang.String strTrim = bundle.getString(str, "").trim();
        return strTrim.startsWith(DefaultWebClient.HTTP_SCHEME) || strTrim.startsWith(DefaultWebClient.HTTPS_SCHEME);
    }
}
