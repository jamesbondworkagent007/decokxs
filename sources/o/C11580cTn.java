package o;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.cTn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11580cTn {
    public static final C11580cTn EZpvd = new C11580cTn();

    private C11580cTn() {
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "{", false, 2, (java.lang.Object) null)) {
            int length = str.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (str.charAt(i) == '{') {
                    break;
                }
                i++;
            }
            java.lang.String strSubstring = str.substring(i);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            JSONObject jSONObjectOptJSONObject = new JSONObject(strSubstring).optJSONObject(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("errorDetail") : null;
            JSONObject jSONObject = jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.getJSONObject(0) : null;
            str = (jSONObject != null ? jSONObject.optString("errorCode") : null) + " " + (jSONObject != null ? jSONObject.optString("description") : null);
        }
        pUU.copydefault("HuaweiDriveErrorMessageHelper", str);
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatSearchResultReceiver);
    }
}
