package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3126Ag {
    public final InterfaceC5047Cr AEQbTJ;
    public final InterfaceC57843yq KWHzl;
    public final C5036Cg OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3126Ag copy$default(C3126Ag c3126Ag, C5036Cg c5036Cg, InterfaceC5047Cr interfaceC5047Cr, InterfaceC57843yq interfaceC57843yq, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c5036Cg = c3126Ag.OLrzqt;
        }
        if ((i & 2) != 0) {
            interfaceC5047Cr = c3126Ag.AEQbTJ;
        }
        if ((i & 4) != 0) {
            interfaceC57843yq = c3126Ag.KWHzl;
        }
        return c3126Ag.OLrzqt(c5036Cg, interfaceC5047Cr, interfaceC57843yq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5036Cg AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57843yq KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3126Ag OLrzqt(@NotNull C5036Cg c5036Cg, @NotNull InterfaceC5047Cr interfaceC5047Cr, @NotNull InterfaceC57843yq interfaceC57843yq) {
        Intrinsics.checkNotNullParameter(c5036Cg, "");
        Intrinsics.checkNotNullParameter(interfaceC5047Cr, "");
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
        return new C3126Ag(c5036Cg, interfaceC5047Cr, interfaceC57843yq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC5047Cr copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3126Ag)) {
            return false;
        }
        C3126Ag c3126Ag = (C3126Ag) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c3126Ag.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c3126Ag.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c3126Ag.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SignHttpRequest(httpRequest=" + this.OLrzqt + ", identity=" + this.AEQbTJ + ", signingAttributes=" + this.KWHzl + ')';
    }

    public C3126Ag(@NotNull C5036Cg c5036Cg, @NotNull InterfaceC5047Cr interfaceC5047Cr, @NotNull InterfaceC57843yq interfaceC57843yq) {
        Intrinsics.checkNotNullParameter(c5036Cg, "");
        Intrinsics.checkNotNullParameter(interfaceC5047Cr, "");
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
        this.OLrzqt = c5036Cg;
        this.AEQbTJ = interfaceC5047Cr;
        this.KWHzl = interfaceC57843yq;
    }
}
