package o;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ChargeGroupData;
import com.okinc.unify_trade.biz.TrailingConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xvQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56044xvQ {
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.xvN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C56044xvQ.AEQbTJ();
        }
    });

    public static final void KWHzl(TrailingConfig trailingConfig, TrailingConfig trailingConfig2, @NotNull java.util.HashMap<java.lang.String, java.lang.Boolean> map) {
        Intrinsics.checkNotNullParameter(map, "");
        boolean z = true;
        if ((trailingConfig == null || !trailingConfig.getEnabled()) && (trailingConfig2 == null || !trailingConfig2.getEnabled())) {
            z = false;
        }
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        map.put("ticker_info", bool);
        map.put("up_price_info", java.lang.Boolean.valueOf(z));
        map.put("down_price_info", java.lang.Boolean.valueOf(z));
        map.put("price_range", bool);
    }

    public static final void copydefault(java.lang.String str, java.lang.String str2, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, java.lang.String str3, java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map) {
        java.lang.String stopPx;
        java.lang.String stopPx2;
        java.lang.String str6;
        java.lang.String str7 = str3;
        java.lang.String str8 = str4;
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.String str9 = str == null ? "" : str;
        java.lang.String str10 = str2 == null ? "" : str2;
        if (trailingConfig == null || (stopPx = trailingConfig.getStopPx()) == null) {
            stopPx = "";
        }
        java.lang.String botPrice$default = C56033xvF.getBotPrice$default(str9, str10, stopPx, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        java.lang.String str11 = str == null ? "" : str;
        java.lang.String str12 = str2 == null ? "" : str2;
        if (trailingConfig2 == null || (stopPx2 = trailingConfig2.getStopPx()) == null) {
            stopPx2 = "";
        }
        java.lang.String botPrice$default2 = C56033xvF.getBotPrice$default(str11, str12, stopPx2, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        if (C33129mqd.valueOf(str7, 0) || C33129mqd.valueOf(str8, 0)) {
            str6 = "--";
        } else {
            xMR xmr = xMR.copydefault;
            if (str7 == null) {
                str7 = "";
            }
            java.lang.String strCopydefault = xmr.copydefault(str7);
            if (str8 == null) {
                str8 = "";
            }
            str6 = strCopydefault + " - " + xmr.copydefault(str8) + " " + str5;
        }
        map.put("up_price_info", botPrice$default);
        map.put("down_price_info", botPrice$default2);
        map.put("price_range", str6);
    }

    public static final boolean EZpvd(java.lang.String str, java.lang.String str2) {
        if (C33129mqd.valueOf(str, 0) && C33129mqd.valueOf(str2, 0)) {
            return true;
        }
        return C33129mqd.AEQbTJ(str, 0);
    }

    public static final boolean OLrzqt(java.lang.String str, java.lang.String str2) {
        if (C33129mqd.valueOf(str, 0) && C33129mqd.valueOf(str2, 0)) {
            return true;
        }
        return C33129mqd.AEQbTJ(str2, 0);
    }

    public static final java.lang.String KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String strCopydefault = copydefault(str, str2, str3);
        return C33129mqd.OLrzqt((java.lang.Object) strCopydefault, (java.lang.Object) 0) ? "" : strCopydefault;
    }

    public static final java.lang.String copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        BizInstrument suggestedInstrument$default;
        java.lang.String instFamily;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLCopydefault;
        java.lang.String safeString$default;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, str == null ? "" : str, str2, null, null, 12, null);
        } else {
            suggestedInstrument$default = null;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            return "";
        }
        if (str == null) {
            str = "";
        }
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str);
        if (abstractC54531xLwOLrzqt == null) {
            return "";
        }
        if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
            instFamily = "";
        }
        xMS xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily);
        if (xmsGEmmrt == null) {
            return "";
        }
        if (str3 == null) {
            str3 = "";
        }
        C54536xML c54536xMLAYXKKw = xmsGEmmrt.AYXKKw(str3);
        return (c54536xMLAYXKKw == null || (c54536xMLIsConnected = c54536xMLAYXKKw.isConnected()) == null || (c54536xMLCopydefault = c54536xMLIsConnected.copydefault()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) == null) ? "" : safeString$default;
    }

    public static final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        return C56033xvF.getBotPrice$default(str == null ? "" : str, str2 == null ? "" : str2, str3, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
    }

    public static final java.util.ArrayList<java.lang.String> KWHzl() {
        return (java.util.ArrayList) EZpvd.getValue();
    }

    public static final java.util.ArrayList AEQbTJ() {
        C54591xOa c54591xOaAwvSrB;
        java.util.List<ChargeGroupData> listUzCIH;
        java.lang.Object next;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (c54591xOaAwvSrB = interfaceC54581xNrOLrzqt.AwvSrB()) == null || (listUzCIH = c54591xOaAwvSrB.uzCIH()) == null) {
            return null;
        }
        java.util.Iterator<T> it = listUzCIH.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C59449zhJ.gEmmrt(((ChargeGroupData) next).getKey(), "CRYPTO", true)) {
                break;
            }
        }
        ChargeGroupData chargeGroupData = (ChargeGroupData) next;
        if (chargeGroupData != null) {
            return chargeGroupData.getTypes();
        }
        return null;
    }

    public static final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<java.lang.String> arrayListKWHzl = KWHzl();
        if (arrayListKWHzl != null && !arrayListKWHzl.isEmpty()) {
            java.util.Iterator<T> it = arrayListKWHzl.iterator();
            while (it.hasNext()) {
                if (C59449zhJ.gEmmrt((java.lang.String) it.next(), str, true)) {
                    return true;
                }
            }
        }
        return false;
    }
}
