package o;

import com.amplitude.core.utilities.http.HttpStatus;
import com.google.firebase.messaging.Constants;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Ld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5267Ld implements InterfaceC5268Le {
    public final java.lang.String AEQbTJ;
    public final HttpStatus AhwBna;
    public java.util.Set<java.lang.Integer> EZpvd;
    public java.util.Set<java.lang.Integer> KWHzl;
    public java.util.Set<java.lang.Integer> OLrzqt;
    public java.util.Set<java.lang.String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HttpStatus OLrzqt() {
        return this.AhwBna;
    }

    public C5267Ld(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.AhwBna = HttpStatus.BAD_REQUEST;
        this.AEQbTJ = KX.copydefault(jSONObject, Constants.IPC_BUNDLE_KEY_SEND_ERROR, "");
        this.EZpvd = yEE.copydefault();
        this.OLrzqt = yEE.copydefault();
        this.KWHzl = yEE.copydefault();
        this.copydefault = yEE.copydefault();
        if (jSONObject.has("events_with_invalid_fields")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("events_with_invalid_fields");
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
            this.EZpvd = KX.OLrzqt(jSONObject2);
        }
        if (jSONObject.has("events_with_missing_fields")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("events_with_missing_fields");
            Intrinsics.checkNotNullExpressionValue(jSONObject3, "");
            this.OLrzqt = KX.OLrzqt(jSONObject3);
        }
        if (jSONObject.has("silenced_devices")) {
            java.lang.Object jSONArray = jSONObject.getJSONArray("silenced_devices");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "");
            java.util.Set<java.lang.String> setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa((java.lang.Iterable) jSONArray);
            Intrinsics.copydefault(setOqFWZa, "");
            this.copydefault = setOqFWZa;
        }
        if (jSONObject.has("silenced_events")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("silenced_events");
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "");
            this.KWHzl = yDV.AxsJAY(KX.EZpvd(jSONArray2));
        }
    }

    public final java.util.Set<java.lang.Integer> KWHzl() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.EZpvd);
        linkedHashSet.addAll(this.OLrzqt);
        linkedHashSet.addAll(this.KWHzl);
        return linkedHashSet;
    }

    public final boolean KWHzl(@NotNull C5242Ke c5242Ke) {
        Intrinsics.checkNotNullParameter(c5242Ke, "");
        java.lang.String strEjfBZ = c5242Ke.ejfBZ();
        if (strEjfBZ != null) {
            return this.copydefault.contains(strEjfBZ);
        }
        return false;
    }

    public final boolean AEQbTJ() {
        java.lang.String lowerCase = this.AEQbTJ.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase, (java.lang.CharSequence) "invalid api key", false, 2, (java.lang.Object) null);
    }
}
