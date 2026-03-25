package o;

import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xVj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54789xVj {
    public static final C54789xVj EZpvd = new C54789xVj();

    private C54789xVj() {
    }

    public final kotlin.Pair<java.lang.Double, java.lang.String> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        java.lang.String strOLrzqt = interfaceC46557tYt != null ? interfaceC46557tYt.OLrzqt(str2, str3, str4) : null;
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        java.lang.String str5 = strOLrzqt;
        java.lang.String strSubS$default = C33129mqd.subS$default(str, str5, null, null, null, 14, null);
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        double dDivD$default = C33129mqd.divD$default(strSubS$default, str5, 4, null, roundingMode, 4, null);
        xMR xmr = xMR.copydefault;
        return C56390yDp.OLrzqt(java.lang.Double.valueOf(dDivD$default), xMR.formatICUPercent$default(xmr, xmr.OLrzqt(java.lang.Double.valueOf(dDivD$default)), roundingMode, C38307pTy.Companion.KWHzl(2, 2), DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 32, null));
    }
}
