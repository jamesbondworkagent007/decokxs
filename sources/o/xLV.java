package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xLV extends xKD {
    public final boolean EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm copydefault;

    public xLV(boolean z, @NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = z;
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.xMc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xLV.KWHzl(str, str2);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.xMb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xLV.AEQbTJ(str);
            }
        });
    }

    public final xBP OLrzqt() {
        return (xBP) this.KWHzl.getValue();
    }

    public static final xBP KWHzl(java.lang.String str, java.lang.String str2) {
        xBP xbp = new xBP();
        xbp.OLrzqt(str);
        xbp.AEQbTJ(str2);
        return xbp;
    }

    public final C56164xxe AEQbTJ() {
        return (C56164xxe) this.copydefault.getValue();
    }

    public static final C56164xxe AEQbTJ(java.lang.String str) {
        C56164xxe c56164xxe = new C56164xxe();
        c56164xxe.AEQbTJ(str);
        c56164xxe.fIwbmz();
        return c56164xxe;
    }

    public final java.lang.String KWHzl() {
        return OLrzqt().bB_();
    }

    public final java.lang.String copydefault() {
        return AEQbTJ().bB_();
    }

    @Override // o.xKD
    public java.util.List<xKK> values() {
        return this.EZpvd ? yDY.gEmmrt(OLrzqt(), AEQbTJ()) : C56402yEa.EZpvd(OLrzqt());
    }
}
