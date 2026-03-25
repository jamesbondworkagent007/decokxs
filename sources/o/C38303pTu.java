package o;

import com.ibm.icu.text.DecimalFormatSymbols;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pTu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38303pTu {
    public static final boolean KWHzl(@NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        return C59449zhJ.gEmmrt("zh", locale.getLanguage(), true);
    }

    public static final boolean copydefault(@NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        return C59449zhJ.gEmmrt("en", locale.getLanguage(), true);
    }

    public static final boolean OLrzqt(@NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        return C59449zhJ.gEmmrt("zh-CN", locale.getLanguage() + "-" + locale.getCountry(), true);
    }

    public static final java.lang.String EZpvd(@NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        return java.lang.String.valueOf(new DecimalFormatSymbols(locale).getDecimalSeparator());
    }

    public static final java.lang.String AEQbTJ(@NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        return java.lang.String.valueOf(new DecimalFormatSymbols(locale).getGroupingSeparator());
    }

    public static final java.lang.String AYXKKw(@NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        return locale.getLanguage() + "-" + locale.getCountry();
    }
}
