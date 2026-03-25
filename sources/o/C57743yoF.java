package o;

import com.onesignal.OneSignal;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yoF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57743yoF {
    public static boolean KWHzl(@androidx.annotation.Nullable android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        return KWHzl(intent.getExtras());
    }

    public static boolean KWHzl(@androidx.annotation.Nullable android.os.Bundle bundle) {
        return AEQbTJ(bundle) != null;
    }

    public static java.lang.String AEQbTJ(@androidx.annotation.Nullable android.os.Bundle bundle) {
        if (bundle != null && !bundle.isEmpty()) {
            java.lang.String string = bundle.getString("custom", null);
            if (string != null) {
                return OLrzqt(string);
            }
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "Not a OneSignal formatted Bundle. No 'custom' field in the bundle.");
        }
        return null;
    }

    public static java.lang.String AEQbTJ(@androidx.annotation.Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return OLrzqt(jSONObject.optString("custom", null));
    }

    public static java.lang.String OLrzqt(@androidx.annotation.Nullable java.lang.String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "Not a OneSignal formatted JSON String, error parsing string as JSON.");
        }
        if (jSONObject.has("i")) {
            return jSONObject.optString("i", null);
        }
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "Not a OneSignal formatted JSON string. No 'i' field in custom.");
        return null;
    }
}
