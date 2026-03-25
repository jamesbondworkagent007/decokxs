package o;

import androidx.camera.video.AudioStats;
import com.okinc.tradeapi.framework.constant.TradeKey;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.pFu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37925pFu {
    public static final C37925pFu KWHzl = new C37925pFu();

    private C37925pFu() {
    }

    public final kotlin.Pair<java.lang.Double, java.lang.String> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        java.lang.String strOLrzqt = interfaceC46557tYt != null ? interfaceC46557tYt.OLrzqt(str2, str3, str4) : null;
        java.lang.String strSubS$default = C33129mqd.subS$default(str, strOLrzqt, null, null, null, 14, null);
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        double dDivD$default = C33129mqd.divD$default(strSubS$default, strOLrzqt, 4, null, roundingMode, 4, null);
        return C56390yDp.OLrzqt(java.lang.Double.valueOf(dDivD$default), (dDivD$default > AudioStats.AUDIO_AMPLITUDE_NONE ? Marker.ANY_NON_NULL_MARKER : "") + pTB.KWHzl(pTB.OLrzqt(java.lang.Double.valueOf(dDivD$default)), 2, roundingMode));
    }

    public final kotlin.Pair<java.lang.Double, java.lang.String> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        java.lang.String strOLrzqt = interfaceC46557tYt != null ? interfaceC46557tYt.OLrzqt(str2, str3, str4) : null;
        java.lang.String strSubS$default = C33129mqd.subS$default(str, strOLrzqt, null, null, null, 14, null);
        RoundingMode roundingMode = RoundingMode.DOWN;
        double dDivD$default = C33129mqd.divD$default(strSubS$default, strOLrzqt, 4, null, roundingMode, 4, null);
        return C56390yDp.OLrzqt(java.lang.Double.valueOf(dDivD$default), (dDivD$default > AudioStats.AUDIO_AMPLITUDE_NONE ? Marker.ANY_NON_NULL_MARKER : "") + pTB.KWHzl(pTB.OLrzqt(java.lang.Double.valueOf(dDivD$default)), 2, roundingMode));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AEQbTJ(java.lang.String str, java.lang.String str2) {
        java.lang.String strFIwbmz;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
            strFIwbmz = null;
        } else {
            if (str == null) {
                str = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str);
            if (abstractC54531xLwOLrzqt != null) {
                if (str2 == null) {
                    str2 = "";
                }
                strFIwbmz = abstractC54531xLwOLrzqt.fIwbmz(str2);
            }
        }
        if (strFIwbmz == null || strFIwbmz.length() == 0) {
            return 8;
        }
        return C33129mqd.AhwBna(strFIwbmz);
    }

    public final java.lang.String EZpvd(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (str != null && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "--")) {
            try {
                double d = java.lang.Double.parseDouble(C33129mqd.divS$default(str, str3, java.lang.Integer.valueOf(i), null, null, 12, null));
                return C38305pTw.formatCryptoCode$default(java.lang.Double.valueOf(d), str2, null, C38307pTy.Companion.EZpvd(i), null, null, null, 58, null);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public final java.lang.String copydefault(java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (str != null && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "--")) {
            try {
                return C33129mqd.divS$default(str, str2, java.lang.Integer.valueOf(i), null, null, 12, null);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public final java.lang.String KWHzl() {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        java.lang.String strSSMYrx;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        return (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (strSSMYrx = newProxyInstance.sSMYrx()) == null) ? "0" : strSSMYrx;
    }
}
