package o;

import com.onesignal.FCMBroadcastReceiver;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import o.C57692ynH;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ynV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C57706ynV {
    public static void copydefault(@androidx.annotation.NonNull android.app.Activity activity, @androidx.annotation.Nullable android.content.Intent intent) {
        JSONObject jSONObjectOLrzqt;
        OneSignal.fetchVPNInfo(activity.getApplicationContext());
        if (intent == null || (jSONObjectOLrzqt = OLrzqt(intent)) == null) {
            return;
        }
        KWHzl(activity, jSONObjectOLrzqt);
    }

    public static JSONObject OLrzqt(@androidx.annotation.Nullable android.content.Intent intent) {
        if (!C57743yoF.KWHzl(intent)) {
            return null;
        }
        JSONObject jSONObjectKWHzl = C57692ynH.KWHzl(intent.getExtras());
        KWHzl(jSONObjectKWHzl);
        return jSONObjectKWHzl;
    }

    public static void KWHzl(@androidx.annotation.NonNull JSONObject jSONObject) {
        try {
            java.lang.String str = (java.lang.String) C57692ynH.OLrzqt(jSONObject).remove("actionId");
            if (str == null) {
                return;
            }
            jSONObject.put("actionId", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void KWHzl(@androidx.annotation.NonNull android.app.Activity activity, @androidx.annotation.NonNull JSONObject jSONObject) {
        if (C57780yoq.copydefault(activity, jSONObject)) {
            return;
        }
        OneSignal.EZpvd(activity, new JSONArray().put(jSONObject), C57743yoF.AEQbTJ(jSONObject));
    }

    public static void EZpvd(@androidx.annotation.NonNull final android.content.Context context, @androidx.annotation.Nullable java.lang.String str) {
        final android.os.Bundle bundleAEQbTJ;
        OneSignal.fetchVPNInfo(context);
        if (str == null || (bundleAEQbTJ = OSUtils.AEQbTJ(str)) == null) {
            return;
        }
        C57692ynH.OLrzqt(context, bundleAEQbTJ, new C57692ynH.Application() { // from class: o.ynV.1
            @Override // o.C57692ynH.Application
            public void copydefault(@androidx.annotation.Nullable C57692ynH.ActionBar actionBar) {
                if (actionBar == null || !actionBar.OLrzqt()) {
                    FCMBroadcastReceiver.copydefault(context, bundleAEQbTJ);
                }
            }
        });
    }
}
