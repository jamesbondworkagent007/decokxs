package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yoE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57742yoE {
    public final android.content.Context EZpvd;
    public final JSONObject copydefault;

    public C57742yoE(@NotNull android.content.Context context, @NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.EZpvd = context;
        this.copydefault = jSONObject;
    }

    public final boolean KWHzl() {
        return C57741yoD.EZpvd.EZpvd(this.EZpvd) && AEQbTJ() == null;
    }

    public final android.net.Uri AEQbTJ() {
        C57741yoD c57741yoD = C57741yoD.EZpvd;
        if (!c57741yoD.EZpvd(this.EZpvd) || c57741yoD.AEQbTJ(this.EZpvd)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(this.copydefault.optString("custom"));
        if (jSONObject.has("u")) {
            java.lang.String strOptString = jSONObject.optString("u");
            if (!Intrinsics.EZpvd((java.lang.Object) strOptString, (java.lang.Object) "")) {
                Intrinsics.checkNotNullExpressionValue(strOptString, "");
                int length = strOptString.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = Intrinsics.copydefault((int) strOptString.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                return android.net.Uri.parse(strOptString.subSequence(i, length + 1).toString());
            }
        }
        return null;
    }
}
