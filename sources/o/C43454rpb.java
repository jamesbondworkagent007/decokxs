package o;

import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rpb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43454rpb {
    public static final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull android.content.Context context, boolean z) {
        android.content.res.Configuration configuration;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.Integer numValueOf = null;
        if (!C59449zhJ.startsWith$default(str, "images/", false, 2, null) || C59449zhJ.endsWith$default(str, "/", false, 2, null)) {
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
        if (numValueOf != null && numValueOf.intValue() == 16) {
            return C43386roM.EZpvd.EZpvd() + "/cdn/mobile/resources/" + str;
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            return C43386roM.EZpvd.EZpvd() + "/cdn/mobile/resources/" + str;
        }
        return C43386roM.EZpvd.EZpvd() + "/cdn/mobile/resources/" + str;
    }
}
