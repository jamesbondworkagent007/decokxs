package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cxB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12974cxB {
    public final java.util.List<C11283cIm> AEQbTJ;
    public final AbstractC12782ctV EZpvd;
    public final boolean KWHzl;
    public final java.util.List<C11283cIm> OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.cxB */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C12974cxB copy$default(C12974cxB c12974cxB, AbstractC12782ctV abstractC12782ctV, boolean z, boolean z2, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            abstractC12782ctV = c12974cxB.EZpvd;
        }
        if ((i & 2) != 0) {
            z = c12974cxB.copydefault;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = c12974cxB.KWHzl;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            list = c12974cxB.AEQbTJ;
        }
        java.util.List list3 = list;
        if ((i & 16) != 0) {
            list2 = c12974cxB.OLrzqt;
        }
        return c12974cxB.KWHzl(abstractC12782ctV, z3, z4, list3, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C11283cIm> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C12974cxB KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, boolean z, boolean z2, @NotNull java.util.List<C11283cIm> list, @NotNull java.util.List<C11283cIm> list2) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new C12974cxB(abstractC12782ctV, z, z2, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C11283cIm> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12974cxB)) {
            return false;
        }
        C12974cxB c12974cxB = (C12974cxB) obj;
        return Intrinsics.EZpvd(this.EZpvd, c12974cxB.EZpvd) && this.copydefault == c12974cxB.copydefault && this.KWHzl == c12974cxB.KWHzl && Intrinsics.EZpvd(this.AEQbTJ, c12974cxB.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c12974cxB.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.EZpvd.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WalletUpdateParams(wallet=" + this.EZpvd + ", updateChainAddress=" + this.copydefault + ", updateSegwitChainAddress=" + this.KWHzl + ", addAddressList=" + this.AEQbTJ + ", updateAddressList=" + this.OLrzqt + ")";
    }

    public C12974cxB(@NotNull AbstractC12782ctV abstractC12782ctV, boolean z, boolean z2, @NotNull java.util.List<C11283cIm> list, @NotNull java.util.List<C11283cIm> list2) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.EZpvd = abstractC12782ctV;
        this.copydefault = z;
        this.KWHzl = z2;
        this.AEQbTJ = list;
        this.OLrzqt = list2;
    }
}
