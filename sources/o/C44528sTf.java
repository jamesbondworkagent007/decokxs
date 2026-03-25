package o;

import androidx.core.util.PatternsCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sTf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44528sTf {
    public static final C44528sTf KWHzl = new C44528sTf();

    private C44528sTf() {
    }

    public final boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        try {
            if (PatternsCompat.AUTOLINK_WEB_URL.matcher(lowerCase).find()) {
                return true;
            }
        } catch (java.lang.Exception unused) {
        }
        try {
            return PatternsCompat.AUTOLINK_WEB_URL.matcher(C59449zhJ.replace$default(C59449zhJ.replace$default(lowerCase, "\n", "", false, 4, (java.lang.Object) null), " ", "", false, 4, (java.lang.Object) null)).find();
        } catch (java.lang.Exception unused2) {
            return false;
        }
    }
}
