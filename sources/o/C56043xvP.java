package o;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xvP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56043xvP {
    public static final void OLrzqt(@NotNull java.util.HashMap<java.lang.String, java.lang.Boolean> map) {
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        map.put("ticker_info", bool);
        map.put("lowest_price", bool);
    }

    public static final void EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("lowest_price", C56033xvF.getBotPrice$default(str == null ? "" : str, str2 == null ? "" : str2, str3 == null ? "" : str3, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
    }

    public static final boolean KWHzl(java.lang.String str, java.lang.String str2) {
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

    public static final C55851xrj copydefault(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C55851xrj(C33070mpX.AYXKKw(C55688xof.Application.QKVWgx), i, str, null, 8, null);
    }

    public static final C55851xrj AEQbTJ(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C55851xrj(C33070mpX.AYXKKw(C55688xof.Application.gHZMYf), i, str, null, 8, null);
    }

    public static final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String strEZpvd = EZpvd(str, str2, str3);
        return C33129mqd.OLrzqt((java.lang.Object) strEZpvd, (java.lang.Object) 0) ? "" : strEZpvd;
    }

    public static final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String strEZpvd = EZpvd(str, str2, str3);
        return C33129mqd.OLrzqt((java.lang.Object) strEZpvd, (java.lang.Object) 0) ? "" : strEZpvd;
    }

    public static final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
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

    public static final java.lang.String copydefault(java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        return C56033xvF.getBotPrice$default(str == null ? "" : str, str2 == null ? "" : str2, str3, false, false, null, null, 120, null);
    }
}
