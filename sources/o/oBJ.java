package o;

import com.google.common.annotations.VisibleForTesting;
import com.okinc.core.util.SPUtils;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.JsonArrayBuilder;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oBJ {
    public static final oBJ EZpvd = new oBJ();

    private oBJ() {
    }

    @VisibleForTesting
    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str))) {
            return null;
        }
        return str + "_scam_banner_dismiss";
    }

    public final void KWHzl(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strEZpvd = EZpvd(str);
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        JsonElementBuildersKt.add(jsonArrayBuilder, "setScamBannerDismissState");
        Unit unit = Unit.INSTANCE;
        jsonObjectBuilder.put("tags", jsonArrayBuilder.build());
        JsonElementBuildersKt.put(jsonObjectBuilder, JwtUtilsKt.DID_METHOD_KEY, strEZpvd);
        JsonElementBuildersKt.put(jsonObjectBuilder, "isDismissed", java.lang.Boolean.valueOf(z));
        pUU.KWHzl("ScamBannerPreference", jsonObjectBuilder.build().toString());
        if (strEZpvd != null) {
            SPUtils.commit(strEZpvd, java.lang.Boolean.valueOf(z));
        }
    }

    public final java.lang.Boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strEZpvd = EZpvd(str);
        java.lang.Boolean boolValueOf = strEZpvd != null ? java.lang.Boolean.valueOf(SPUtils.getBoolean(strEZpvd, false)) : null;
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        JsonElementBuildersKt.add(jsonArrayBuilder, "isScamBannerDismissedBefore");
        JsonElementBuildersKt.add(jsonArrayBuilder, "isScamBannerAvailable");
        Unit unit = Unit.INSTANCE;
        jsonObjectBuilder.put("tags", jsonArrayBuilder.build());
        JsonElementBuildersKt.put(jsonObjectBuilder, JwtUtilsKt.DID_METHOD_KEY, strEZpvd);
        JsonElementBuildersKt.put(jsonObjectBuilder, "isScamBannerDismissedBefore", boolValueOf);
        pUU.KWHzl("ScamBannerPreference", jsonObjectBuilder.build().toString());
        return boolValueOf;
    }
}
