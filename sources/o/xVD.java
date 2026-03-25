package o;

import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class xVD {
    public static final xVD KWHzl = new xVD();

    private xVD() {
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return xMR.copydefault.EZpvd(str, (str2 == null || str2.length() == 0) ? 5 : C33129mqd.AhwBna(str2), 0, RoundingMode.UP);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        int iAhwBna = (str2 == null || str2.length() == 0) ? 5 : C33129mqd.AhwBna(str2);
        return xMR.copydefault.EZpvd(str, iAhwBna, iAhwBna, RoundingMode.UP);
    }

    public final boolean copydefault(java.lang.Long l, java.lang.Long l2) {
        return (l == null || l.longValue() == 0 || l2 == null || l.longValue() > l2.longValue()) ? false : true;
    }

    public final boolean OLrzqt(java.lang.Long l) {
        return (l == null || l.longValue() == 0 || l.longValue() - java.lang.System.currentTimeMillis() >= 3600000) ? false : true;
    }

    public final boolean KWHzl(java.lang.Long l) {
        return (l == null || l.longValue() == 0 || l.longValue() - java.lang.System.currentTimeMillis() >= 1800000) ? false : true;
    }
}
