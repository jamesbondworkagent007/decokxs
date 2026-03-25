package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bwN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10855bwN {
    public static final C10855bwN OLrzqt = new C10855bwN();

    private C10855bwN() {
    }

    public static /* synthetic */ java.lang.String formatNftTotalPrice$default(C10855bwN c10855bwN, java.lang.String str, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        return c10855bwN.copydefault(str, z, z2, z3);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bwQ.formatBigNumEn$default(double, int, int, java.lang.Object):java.lang.String */
    public final java.lang.String copydefault(@NotNull java.lang.String str, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        C54864xYd c54864xYd = C54864xYd.AEQbTJ;
        java.lang.String strKWHzl = C54862xYb.KWHzl(C54862xYb.convertToString$default(C54862xYb.OLrzqt(str, java.lang.Double.valueOf(c54864xYd.OLrzqt())), false, null, null, 7, null), 2);
        if (C33129mqd.gEmmrt(strKWHzl, java.lang.Double.valueOf(0.01d))) {
            strKWHzl = "0.00";
        }
        if (z3) {
            strKWHzl = C10858bwQ.formatBigNumEn$default(C33129mqd.AEQbTJ(strKWHzl), 0, 2, null);
        }
        if (z) {
            strKWHzl = c54864xYd.AhwBna() + strKWHzl;
        }
        if (!z2) {
            return strKWHzl;
        }
        return strKWHzl + " " + c54864xYd.gEmmrt();
    }
}
