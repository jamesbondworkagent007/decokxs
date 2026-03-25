package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mEg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31797mEg {
    public final boolean AEQbTJ;
    public final java.util.List<AbstractC31795mEe> EZpvd;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mEg */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C31797mEg copy$default(C31797mEg c31797mEg, java.util.List list, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c31797mEg.EZpvd;
        }
        if ((i & 2) != 0) {
            z = c31797mEg.AEQbTJ;
        }
        if ((i & 4) != 0) {
            z2 = c31797mEg.copydefault;
        }
        return c31797mEg.AEQbTJ(list, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31797mEg AEQbTJ(@NotNull java.util.List<? extends AbstractC31795mEe> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C31797mEg(list, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AbstractC31795mEe> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31797mEg)) {
            return false;
        }
        C31797mEg c31797mEg = (C31797mEg) obj;
        return Intrinsics.EZpvd(this.EZpvd, c31797mEg.EZpvd) && this.AEQbTJ == c31797mEg.AEQbTJ && this.copydefault == c31797mEg.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.EZpvd.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CryptoListState(items=" + this.EZpvd + ", enableItemReordering=" + this.AEQbTJ + ", enableItemSwiping=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.mEe> */
    /* JADX WARN: Multi-variable type inference failed */
    public C31797mEg(@NotNull java.util.List<? extends AbstractC31795mEe> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
        this.AEQbTJ = z;
        this.copydefault = z2;
    }
}
