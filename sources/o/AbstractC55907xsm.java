package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xsm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC55907xsm implements InterfaceC55914xst {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55914xst
    public java.lang.String OLrzqt() {
        return "";
    }

    @Override // o.InterfaceC55914xst
    public java.lang.String OLrzqt(@NotNull C55887xsS c55887xsS, java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3) {
        C54536xML c54536xMLKWHzl;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (str == null || str.length() == 0) {
            return "--";
        }
        xMS xmsAEQbTJ = C54797xVr.copydefault.AEQbTJ(c55887xsS.gEmmrt(), c55887xsS.djBIcL());
        java.lang.String safeString$default = null;
        if (xmsAEQbTJ != null && (c54536xMLKWHzl = xmsAEQbTJ.KWHzl(str)) != null && (c54536xMLDjBIcL = c54536xMLKWHzl.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null) {
            safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
        }
        return safeString$default == null ? "" : safeString$default;
    }

    @Override // o.InterfaceC55914xst
    public java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        xMS xmsGEmmrt;
        java.lang.String strValueOf;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str)) == null || (xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(str2)) == null || (strValueOf = xmsGEmmrt.valueOf(str3)) == null) ? "" : strValueOf;
    }

    @Override // o.InterfaceC55914xst
    public java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C56044xvQ.KWHzl(str, str2, str3);
    }
}
