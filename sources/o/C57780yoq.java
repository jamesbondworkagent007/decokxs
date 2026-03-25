package o;

import com.bytedance.applog.encryptor.IEncryptorType;
import com.onesignal.OneSignal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yoq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57780yoq {
    public static final C57780yoq copydefault = new C57780yoq();

    public final boolean OLrzqt() {
        return true;
    }

    private C57780yoq() {
    }

    public static final boolean AEQbTJ(android.content.Context context, android.os.Bundle bundle) {
        JSONObject jSONObjectKWHzl = C57692ynH.KWHzl(bundle);
        Intrinsics.checkNotNullExpressionValue(jSONObjectKWHzl, "");
        java.lang.String strKWHzl = KWHzl(jSONObjectKWHzl);
        if (strKWHzl == null) {
            return false;
        }
        if (OneSignal.AxsJAYaxsJAY()) {
            OneSignal.sSMYrx().EZpvd(strKWHzl);
            return true;
        }
        if (!copydefault.OLrzqt()) {
            return true;
        }
        C57729yns.KWHzl(new C57745yoH(context, jSONObjectKWHzl));
        return true;
    }

    public static final boolean copydefault(@NotNull android.app.Activity activity, @NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(jSONObject, "");
        java.lang.String strKWHzl = KWHzl(jSONObject);
        if (strKWHzl == null) {
            return false;
        }
        OneSignal.KWHzl(activity, new JSONArray().put(jSONObject));
        OneSignal.sSMYrx().EZpvd(strKWHzl);
        return true;
    }

    public static final java.lang.String KWHzl(@NotNull JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        Intrinsics.checkNotNullParameter(jSONObject, "");
        try {
            JSONObject jSONObjectOLrzqt = C57692ynH.OLrzqt(jSONObject);
            Intrinsics.checkNotNullExpressionValue(jSONObjectOLrzqt, "");
            if (jSONObjectOLrzqt.has(IEncryptorType.DEFAULT_ENCRYPTOR) && (jSONObjectOptJSONObject = jSONObjectOLrzqt.optJSONObject(IEncryptorType.DEFAULT_ENCRYPTOR)) != null && jSONObjectOptJSONObject.has("os_in_app_message_preview_id")) {
                return jSONObjectOptJSONObject.optString("os_in_app_message_preview_id");
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }
}
