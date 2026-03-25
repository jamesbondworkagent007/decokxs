package o;

import com.okinc.network.okg.unifieddomain.DomainType;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.arF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7827arF {
    public static final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull android.content.Context context, boolean z) {
        android.content.res.Configuration configuration;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.Integer numValueOf = null;
        if (C59449zhJ.endsWith$default(str, "/", false, 2, null)) {
            pUU.copydefault("CDN URL Error", "Invalid Url: " + str);
            return str;
        }
        if (!z) {
            return C43386roM.EZpvd.EZpvd() + "/cdn/mobile/resources/" + str;
        }
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (java.lang.Object) null);
        android.content.res.Resources resources = context.getResources();
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            numValueOf = java.lang.Integer.valueOf(configuration.uiMode & 48);
        }
        if (numValueOf != null && numValueOf.intValue() == 32) {
            return C43386roM.EZpvd.EZpvd() + "/cdn/mobile/resources/" + listSplit$default.get(0) + "_dark." + listSplit$default.get(1);
        }
        return C43386roM.EZpvd.EZpvd() + "/cdn/mobile/resources/" + str;
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(str, "");
        HttpUrl httpUrl = HttpUrl.Companion.parse(str);
        HttpUrl httpUrlCopydefault = httpUrl != null ? C43385roL.Companion.EZpvd().copydefault(DomainType.CDN, httpUrl) : null;
        return (httpUrlCopydefault == null || (string = httpUrlCopydefault.toString()) == null) ? str : string;
    }
}
