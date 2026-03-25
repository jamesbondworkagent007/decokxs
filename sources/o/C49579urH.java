package o;

import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.urH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C49579urH {
    public static final C49579urH EZpvd = new C49579urH();

    private C49579urH() {
    }

    public static /* synthetic */ java.lang.String fmtMarkPriceWithSign$default(C49579urH c49579urH, java.lang.String str, BizInstrument bizInstrument, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return c49579urH.KWHzl(str, bizInstrument, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String KWHzl(@NotNull java.lang.String str, BizInstrument bizInstrument, boolean z) {
        C54536xML c54536xMLAEQbTJ;
        java.lang.String safeString$default;
        C54536xML c54536xMLAkhnZx;
        java.lang.String instType;
        java.lang.String instFamily;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLDjBIcL;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return "--";
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            c54536xMLAEQbTJ = null;
        } else {
            if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                if (bizInstrument == null || (instFamily = bizInstrument.getInstFamily()) == null) {
                    instFamily = "";
                }
                xMS xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily);
                if (xmsGEmmrt != null && (c54536xMLAYXKKw = xmsGEmmrt.AYXKKw(str)) != null && (c54536xMLIsConnected = c54536xMLAYXKKw.isConnected()) != null && (c54536xMLDjBIcL = c54536xMLIsConnected.djBIcL()) != null) {
                    c54536xMLAEQbTJ = c54536xMLDjBIcL.AEQbTJ(true);
                }
            }
        }
        java.lang.String instType2 = bizInstrument != null ? bizInstrument.getInstType() : null;
        if (Intrinsics.EZpvd((java.lang.Object) instType2, (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) instType2, (java.lang.Object) "MARGIN")) {
            if (c54536xMLAEQbTJ == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ, false, 1, null)) == null) {
                return "";
            }
        } else if (z) {
            if (c54536xMLAEQbTJ == null || (c54536xMLAkhnZx = c54536xMLAEQbTJ.AkhnZx()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAkhnZx, false, 1, null)) == null) {
                return "";
            }
        } else if (c54536xMLAEQbTJ == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ, false, 1, null)) == null) {
            return "";
        }
        return safeString$default;
    }

    public static /* synthetic */ java.lang.String fmtIndexTickerWithSign$default(C49579urH c49579urH, java.lang.String str, BizInstrument bizInstrument, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return c49579urH.AEQbTJ(str, bizInstrument, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, BizInstrument bizInstrument, boolean z) {
        xMS xmsAYXKKw;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLIsConnected;
        java.lang.String safeString$default;
        C54536xML c54536xMLAYXKKw2;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLIsConnected2;
        java.lang.String safeString$default2;
        C54536xML c54536xMLAYXKKw3;
        C54536xML c54536xMLDjBIcL3;
        C54536xML c54536xMLAkhnZx;
        C54536xML c54536xMLIsConnected3;
        java.lang.String instType;
        java.lang.String instFamily;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return "--";
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null) {
            xmsAYXKKw = null;
        } else {
            if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                if (bizInstrument == null || (instFamily = bizInstrument.getInstFamily()) == null) {
                    instFamily = "";
                }
                xmsAYXKKw = abstractC54531xLwOLrzqt.AYXKKw(instFamily);
            }
        }
        if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null), (java.lang.Object) "SPOT")) {
            if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null), (java.lang.Object) "MARGIN")) {
                if (z) {
                    if (xmsAYXKKw == null || (c54536xMLAYXKKw3 = xmsAYXKKw.AYXKKw(str)) == null || (c54536xMLDjBIcL3 = c54536xMLAYXKKw3.djBIcL()) == null || (c54536xMLAkhnZx = c54536xMLDjBIcL3.AkhnZx()) == null || (c54536xMLIsConnected3 = c54536xMLAkhnZx.isConnected()) == null || (safeString$default2 = C54536xML.toSafeString$default(c54536xMLIsConnected3, false, 1, null)) == null) {
                        return "";
                    }
                } else if (xmsAYXKKw == null || (c54536xMLAYXKKw2 = xmsAYXKKw.AYXKKw(str)) == null || (c54536xMLDjBIcL2 = c54536xMLAYXKKw2.djBIcL()) == null || (c54536xMLIsConnected2 = c54536xMLDjBIcL2.isConnected()) == null || (safeString$default2 = C54536xML.toSafeString$default(c54536xMLIsConnected2, false, 1, null)) == null) {
                    return "";
                }
                return safeString$default2;
            }
        }
        return (xmsAYXKKw == null || (c54536xMLAYXKKw = xmsAYXKKw.AYXKKw(str)) == null || (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) == null || (c54536xMLIsConnected = c54536xMLDjBIcL.isConnected()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLIsConnected, false, 1, null)) == null) ? "" : safeString$default;
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, BizInstrument bizInstrument) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLAkhnZx;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        java.lang.String instType;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return "--";
        }
        if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null), (java.lang.Object) "OPTION")) {
            return "$" + pTB.formatRoundToMax$default(xMR.copydefault.OLrzqt((java.lang.Object) str), 2, null, 2, null);
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
                instType = "";
            }
            abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
        } else {
            abstractC54531xLwOLrzqt = null;
        }
        if (abstractC54531xLwOLrzqt == null) {
            return "";
        }
        if (bizInstrument == null || (instFamily = bizInstrument.getInstFamily()) == null) {
            instFamily = "";
        }
        xMS xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily);
        return (xmsGEmmrt == null || (c54536xMLAYXKKw = xmsGEmmrt.AYXKKw(str)) == null || (c54536xMLIsConnected = c54536xMLAYXKKw.isConnected()) == null || (c54536xMLAkhnZx = c54536xMLIsConnected.AkhnZx()) == null || (c54536xMLDjBIcL = c54536xMLAkhnZx.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) ? "" : safeString$default;
    }
}
