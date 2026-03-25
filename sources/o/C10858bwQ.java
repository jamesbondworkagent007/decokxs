package o;

import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bwQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10858bwQ {
    public static final java.lang.String EZpvd(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt(C33129mqd.AEQbTJ(str), i);
    }

    public static /* synthetic */ java.lang.String limitFmtWithKMB2$default(java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return EZpvd(str, i);
    }

    public static /* synthetic */ java.lang.String limitFmtWithKMB2$default(double d, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return OLrzqt(d, i);
    }

    public static final java.lang.String OLrzqt(double d, int i) {
        if (d >= 1.0E9d) {
            return C54862xYb.KWHzl(d / ((double) 1000000000), i) + "B";
        }
        if (d >= 1000000.0d) {
            return C54862xYb.KWHzl(d / ((double) 1000000), i) + "M";
        }
        if (d >= 10000.0d) {
            return C54862xYb.KWHzl(d / ((double) 1000), i) + "K";
        }
        return pTB.formatLocalizedWithMinPrecision$default(C33129mqd.gEmmrt(java.lang.Double.valueOf(d)), C56548yJl.copydefault(i, 0), null, 2, null);
    }

    public static /* synthetic */ java.lang.String formatBigNumEn$default(double d, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return EZpvd(d, i);
    }

    public static final java.lang.String EZpvd(double d, int i) {
        if (d < 1000000.0d) {
            return pTB.formatLocalizedWithMinPrecision$default(C54862xYb.KWHzl(i, d), i, null, 2, null);
        }
        if (d < 1.0E9d) {
            return pTB.formatLocalizedWithMinPrecision$default(C33129mqd.OLrzqt(java.lang.Double.valueOf(d), 1000000, java.lang.Integer.valueOf(i), java.lang.Boolean.FALSE, RoundingMode.UP), i, null, 2, null) + "M";
        }
        return pTB.formatLocalizedWithMinPrecision$default(C33129mqd.OLrzqt(java.lang.Double.valueOf(d), 1000000000, java.lang.Integer.valueOf(i), java.lang.Boolean.FALSE, RoundingMode.UP), i, null, 2, null) + "B";
    }
}
