package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xso, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC55909xso implements InterfaceC55914xst {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55914xst
    public java.lang.String OLrzqt() {
        return "PnL% ";
    }

    @Override // o.InterfaceC55914xst
    public java.lang.String OLrzqt(@NotNull C55887xsS c55887xsS, java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (str != null) {
            java.lang.String str4 = str3 + C56068xvo.fmtPnlPercent$default(C56068xvo.copydefault, str, false, 2, null);
            if (str4 != null) {
                return str4;
            }
        }
        return "--";
    }

    @Override // o.InterfaceC55914xst
    public java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C33129mqd.divS$default(str3, 100, null, null, null, 14, null);
    }

    @Override // o.InterfaceC55914xst
    public java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33129mqd.mulS$default(str3, 100, null, null, null, 14, null);
    }
}
