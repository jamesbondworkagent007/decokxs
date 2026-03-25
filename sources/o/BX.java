package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BX {
    public final DT AEQbTJ;
    public final InterfaceC5047Cr OLrzqt;
    public final InterfaceC5037Ch copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BX copy$default(BX bx, DT dt, InterfaceC5037Ch interfaceC5037Ch, InterfaceC5047Cr interfaceC5047Cr, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dt = bx.AEQbTJ;
        }
        if ((i & 2) != 0) {
            interfaceC5037Ch = bx.copydefault;
        }
        if ((i & 4) != 0) {
            interfaceC5047Cr = bx.OLrzqt;
        }
        return bx.KWHzl(dt, interfaceC5037Ch, interfaceC5047Cr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BX KWHzl(@NotNull DT dt, @NotNull InterfaceC5037Ch interfaceC5037Ch, @NotNull InterfaceC5047Cr interfaceC5047Cr) {
        Intrinsics.checkNotNullParameter(dt, "");
        Intrinsics.checkNotNullParameter(interfaceC5037Ch, "");
        Intrinsics.checkNotNullParameter(interfaceC5047Cr, "");
        return new BX(dt, interfaceC5037Ch, interfaceC5047Cr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DT OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BX)) {
            return false;
        }
        BX bx = (BX) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, bx.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, bx.copydefault) && Intrinsics.EZpvd(this.OLrzqt, bx.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ResolveEndpointRequest(context=" + this.AEQbTJ + ", httpRequest=" + this.copydefault + ", identity=" + this.OLrzqt + ')';
    }

    public BX(@NotNull DT dt, @NotNull InterfaceC5037Ch interfaceC5037Ch, @NotNull InterfaceC5047Cr interfaceC5047Cr) {
        Intrinsics.checkNotNullParameter(dt, "");
        Intrinsics.checkNotNullParameter(interfaceC5037Ch, "");
        Intrinsics.checkNotNullParameter(interfaceC5047Cr, "");
        this.AEQbTJ = dt;
        this.copydefault = interfaceC5037Ch;
        this.OLrzqt = interfaceC5047Cr;
    }
}
