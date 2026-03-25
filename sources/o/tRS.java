package o;

import com.okinc.planet.format.TargetUnit;
import com.okinc.planet.serializer.PlanetNumericString;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tRS {
    public static final kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, TargetUnit targetUnit, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return AEQbTJ(C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str)), str2, str3, C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str4)), C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str5)), z, targetUnit, str6);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ(@NotNull java.lang.Number number, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.Number number2, @NotNull java.lang.Number number3, boolean z, TargetUnit targetUnit, java.lang.String str3) {
        java.lang.String strAEQbTJ;
        C54571xNh c54571xNhDjBIcL;
        java.lang.String safeString$default;
        xOW newProxyInstance;
        C54536xML c54536xMLDjBIcL;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument suggestedInstrument$default;
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(number2, "");
        Intrinsics.checkNotNullParameter(number3, "");
        C46392tSq c46392tSq = C46392tSq.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrEZpvd = c46392tSq.EZpvd();
        if (interfaceC54581xNrEZpvd == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrEZpvd, str, str2, null, null, 12, null)) == null || (strAEQbTJ = suggestedInstrument$default.getInstFamily()) == null) {
            strAEQbTJ = xUW.KWHzl.AEQbTJ(str2);
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c46392tSq.AhwBna().OLrzqt();
        java.lang.String strOLrzqt = null;
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str)) == null) {
            c54571xNhDjBIcL = null;
        } else if (targetUnit == null) {
            c54571xNhDjBIcL = abstractC54531xLwOLrzqt.AhwBna(strAEQbTJ, str3 == null ? null : str3);
        } else {
            c54571xNhDjBIcL = abstractC54531xLwOLrzqt.djBIcL(strAEQbTJ, targetUnit.getValue());
        }
        if (c54571xNhDjBIcL != null) {
            c54571xNhDjBIcL.AhwBna(C33129mqd.gEmmrt(number2));
        }
        if (C33129mqd.AhwBna(number3, 0) && c54571xNhDjBIcL != null) {
            c54571xNhDjBIcL.valueOf(C33129mqd.gEmmrt(number3));
        }
        if (c54571xNhDjBIcL == null || (c54536xMLDjBIcL = c54571xNhDjBIcL.djBIcL(C33129mqd.gEmmrt(number))) == null) {
            safeString$default = null;
        } else {
            if (c54536xMLDjBIcL.AhwBna().length() == 0) {
                c54536xMLDjBIcL.EZpvd("8");
            }
            C54536xML c54536xMLDjBIcL2 = c54536xMLDjBIcL.djBIcL();
            if (c54536xMLDjBIcL2 != null) {
                if (z) {
                    c54536xMLDjBIcL2 = c54536xMLDjBIcL2.fetchVPNInfo();
                }
                if (c54536xMLDjBIcL2 != null) {
                    safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL2, false, 1, null);
                }
            }
        }
        if (safeString$default == null) {
            safeString$default = "";
        }
        java.lang.String strOLrzqt2 = c54571xNhDjBIcL != null ? c54571xNhDjBIcL.OLrzqt() : null;
        if (strOLrzqt2 == null) {
            strOLrzqt2 = "";
        }
        if (strOLrzqt2.length() == 0) {
            InterfaceC54581xNr interfaceC54581xNrEZpvd2 = c46392tSq.EZpvd();
            if (interfaceC54581xNrEZpvd2 != null && (newProxyInstance = interfaceC54581xNrEZpvd2.getNewProxyInstance()) != null) {
                strOLrzqt = newProxyInstance.OLrzqt();
            }
            if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "2")) {
                strOLrzqt2 = TaskDescription.AEQbTJ(str2).AEQbTJ().toUpperCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(strOLrzqt2, "");
            } else if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "1")) {
                strOLrzqt2 = C33070mpX.AYXKKw(C55688xof.Application.RgaQzq);
            } else {
                strOLrzqt2 = TaskDescription.AEQbTJ(str2).copydefault().toUpperCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(strOLrzqt2, "");
            }
        }
        return C56390yDp.OLrzqt(safeString$default, strOLrzqt2);
    }
}
