package o;

import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.onesignal.OneSignal;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ynT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C57704ynT {
    public static void AEQbTJ(android.content.Context context, android.content.Intent intent) throws JSONException {
        if (EZpvd(intent)) {
            if (context != null) {
                OneSignal.fetchVPNInfo(context.getApplicationContext());
            }
            KWHzl(context, intent);
            EZpvd(context, intent);
        }
    }

    public static boolean EZpvd(android.content.Intent intent) {
        return intent.hasExtra("onesignalData") || intent.hasExtra("summary") || intent.hasExtra("androidNotificationId");
    }

    public static void KWHzl(android.content.Context context, android.content.Intent intent) {
        if (intent.getBooleanExtra("action_button", false)) {
            NotificationManagerCompat.from(context).cancel(intent.getIntExtra("androidNotificationId", 0));
            if (Build.VERSION.SDK_INT < 31) {
                context.sendBroadcast(new android.content.Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
    }

    public static void EZpvd(android.content.Context context, android.content.Intent intent) throws JSONException {
        C57744yoG c57744yoGOLrzqt;
        java.lang.String stringExtra;
        C57830ypn c57830ypnKWHzl = C57830ypn.KWHzl(context);
        java.lang.String stringExtra2 = intent.getStringExtra("summary");
        boolean booleanExtra = intent.getBooleanExtra("dismissed", false);
        if (booleanExtra) {
            c57744yoGOLrzqt = null;
        } else {
            c57744yoGOLrzqt = OLrzqt(context, intent, c57830ypnKWHzl, stringExtra2);
            if (c57744yoGOLrzqt == null) {
                return;
            }
        }
        AEQbTJ(context, intent, c57830ypnKWHzl, booleanExtra);
        if (stringExtra2 == null && (stringExtra = intent.getStringExtra("grp")) != null) {
            C57707ynW.KWHzl(context, c57830ypnKWHzl, stringExtra, booleanExtra);
        }
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.AEQbTJ(log_level, "processIntent from context: " + context + " and intent: " + intent);
        if (intent.getExtras() != null) {
            OneSignal.AEQbTJ(log_level, "processIntent intent extras: " + intent.getExtras().toString());
        }
        if (booleanExtra) {
            return;
        }
        if (!(context instanceof android.app.Activity)) {
            OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.ERROR, "NotificationOpenedProcessor processIntent from an non Activity context: " + context);
            return;
        }
        OneSignal.EZpvd((android.app.Activity) context, c57744yoGOLrzqt.OLrzqt(), C57743yoF.AEQbTJ(c57744yoGOLrzqt.copydefault()));
    }

    public static C57744yoG OLrzqt(android.content.Context context, android.content.Intent intent, C57830ypn c57830ypn, java.lang.String str) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArrayEZpvd = null;
        try {
            jSONObject = new JSONObject(intent.getStringExtra("onesignalData"));
            try {
                if (!(context instanceof android.app.Activity)) {
                    OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.ERROR, "NotificationOpenedProcessor processIntent from an non Activity context: " + context);
                } else if (C57780yoq.copydefault((android.app.Activity) context, jSONObject)) {
                    return null;
                }
                jSONObject.put("androidNotificationId", intent.getIntExtra("androidNotificationId", 0));
                intent.putExtra("onesignalData", jSONObject.toString());
                jSONArrayEZpvd = C57692ynH.EZpvd(new JSONObject(intent.getStringExtra("onesignalData")));
            } catch (JSONException e) {
                e = e;
                e.printStackTrace();
            }
        } catch (JSONException e2) {
            e = e2;
            jSONObject = null;
        }
        if (str != null) {
            EZpvd(jSONArrayEZpvd, str, c57830ypn);
        }
        return new C57744yoG(jSONArrayEZpvd, jSONObject);
    }

    public static void EZpvd(JSONArray jSONArray, java.lang.String str, C57830ypn c57830ypn) {
        android.database.Cursor cursorKWHzl = c57830ypn.KWHzl(RemoteMessageConst.NOTIFICATION, new java.lang.String[]{"full_data"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new java.lang.String[]{str}, null, null, null);
        if (cursorKWHzl.getCount() > 1) {
            cursorKWHzl.moveToFirst();
            do {
                try {
                    jSONArray.put(new JSONObject(cursorKWHzl.getString(cursorKWHzl.getColumnIndex("full_data"))));
                } catch (JSONException unused) {
                    OneSignal.KWHzl(OneSignal.LOG_LEVEL.ERROR, "Could not parse JSON of sub notification in group: " + str);
                }
            } while (cursorKWHzl.moveToNext());
        }
        cursorKWHzl.close();
    }

    public static void AEQbTJ(android.content.Context context, android.content.Intent intent, C57830ypn c57830ypn, boolean z) {
        java.lang.String str;
        java.lang.String stringExtra = intent.getStringExtra("summary");
        java.lang.String[] strArr = null;
        if (stringExtra != null) {
            boolean zEquals = stringExtra.equals(C57836ypt.OLrzqt());
            if (zEquals) {
                str = "group_id IS NULL";
            } else {
                strArr = new java.lang.String[]{stringExtra};
                str = "group_id = ?";
            }
            if (!z && !OneSignal.uzCIH()) {
                java.lang.String strValueOf = java.lang.String.valueOf(C57836ypt.AEQbTJ(c57830ypn, stringExtra, zEquals));
                str = str + " AND android_notification_id = ?";
                strArr = zEquals ? new java.lang.String[]{strValueOf} : new java.lang.String[]{stringExtra, strValueOf};
            }
        } else {
            str = "android_notification_id = " + intent.getIntExtra("androidNotificationId", 0);
        }
        EZpvd(context, c57830ypn, stringExtra);
        c57830ypn.AEQbTJ(RemoteMessageConst.NOTIFICATION, OLrzqt(intent), str, strArr);
        C57719yni.EZpvd(c57830ypn, context);
    }

    public static void EZpvd(android.content.Context context, C57830ypn c57830ypn, java.lang.String str) {
        if (str != null) {
            C57707ynW.EZpvd(context, c57830ypn, str);
        } else if (C57836ypt.AEQbTJ(context).intValue() < 1) {
            C57836ypt.KWHzl(context).cancel(C57836ypt.KWHzl());
        }
    }

    public static android.content.ContentValues OLrzqt(android.content.Intent intent) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (intent.getBooleanExtra("dismissed", false)) {
            contentValues.put("dismissed", (java.lang.Integer) 1);
        } else {
            contentValues.put("opened", (java.lang.Integer) 1);
        }
        return contentValues;
    }
}
