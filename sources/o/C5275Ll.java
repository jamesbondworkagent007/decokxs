package o;

import com.amplitude.core.utilities.http.HttpStatus;
import com.google.firebase.messaging.Constants;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Ll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5275Ll implements InterfaceC5268Le {
    public java.util.Set<java.lang.String> AEQbTJ;
    public java.util.Set<java.lang.String> AYXKKw;
    public final java.lang.String EZpvd;
    public final HttpStatus KWHzl;
    public java.util.Set<java.lang.String> OLrzqt;
    public java.util.Set<java.lang.String> copydefault;
    public java.util.Set<java.lang.Integer> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HttpStatus KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Set<java.lang.Integer> copydefault() {
        return this.gEmmrt;
    }

    public C5275Ll(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.KWHzl = HttpStatus.TOO_MANY_REQUESTS;
        this.EZpvd = KX.copydefault(jSONObject, Constants.IPC_BUNDLE_KEY_SEND_ERROR, "");
        this.copydefault = yEE.copydefault();
        this.OLrzqt = yEE.copydefault();
        this.gEmmrt = yEE.copydefault();
        this.AEQbTJ = yEE.copydefault();
        this.AYXKKw = yEE.copydefault();
        if (jSONObject.has("exceeded_daily_quota_users")) {
            java.util.Set<java.lang.String> setKeySet = jSONObject.getJSONObject("exceeded_daily_quota_users").keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "");
            this.copydefault = setKeySet;
        }
        if (jSONObject.has("exceeded_daily_quota_devices")) {
            java.util.Set<java.lang.String> setKeySet2 = jSONObject.getJSONObject("exceeded_daily_quota_devices").keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet2, "");
            this.OLrzqt = setKeySet2;
        }
        if (jSONObject.has("throttled_events")) {
            JSONArray jSONArray = jSONObject.getJSONArray("throttled_events");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "");
            this.gEmmrt = yDV.AxsJAY(KX.EZpvd(jSONArray));
        }
        if (jSONObject.has("throttled_users")) {
            java.util.Set<java.lang.String> setKeySet3 = jSONObject.getJSONObject("throttled_users").keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet3, "");
            this.AYXKKw = setKeySet3;
        }
        if (jSONObject.has("throttled_devices")) {
            java.util.Set<java.lang.String> setKeySet4 = jSONObject.getJSONObject("throttled_devices").keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet4, "");
            this.AEQbTJ = setKeySet4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean copydefault(@NotNull C5242Ke c5242Ke) {
        Intrinsics.checkNotNullParameter(c5242Ke, "");
        if (c5242Ke.RcXXUw() != null) {
            if (!CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) this.copydefault), c5242Ke.RcXXUw())) {
                if (c5242Ke.ejfBZ() != null) {
                    if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) this.OLrzqt), c5242Ke.ejfBZ())) {
                    }
                }
                return false;
            }
        }
        return true;
    }
}
