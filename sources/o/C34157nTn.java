package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nTn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34157nTn {
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public final int OLrzqt;
    public final java.util.List<AbstractC34158nTo> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.nTn */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C34157nTn copy$default(C34157nTn c34157nTn, int i, java.util.List list, boolean z, boolean z2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c34157nTn.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            list = c34157nTn.copydefault;
        }
        if ((i2 & 4) != 0) {
            z = c34157nTn.EZpvd;
        }
        if ((i2 & 8) != 0) {
            z2 = c34157nTn.AEQbTJ;
        }
        return c34157nTn.copydefault(i, list, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AbstractC34158nTo> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34157nTn copydefault(int i, @NotNull java.util.List<? extends AbstractC34158nTo> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C34157nTn(i, list, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34157nTn)) {
            return false;
        }
        C34157nTn c34157nTn = (C34157nTn) obj;
        return this.OLrzqt == c34157nTn.OLrzqt && Intrinsics.EZpvd(this.copydefault, c34157nTn.copydefault) && this.EZpvd == c34157nTn.EZpvd && this.AEQbTJ == c34157nTn.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.OLrzqt) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GroupProfileTopMemberSectionDisplayModel(memberCount=" + this.OLrzqt + ", topMemberList=" + this.copydefault + ", isOwnerOrAdmin=" + this.EZpvd + ", isVipChat=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends o.nTo> */
    /* JADX WARN: Multi-variable type inference failed */
    public C34157nTn(int i, @NotNull java.util.List<? extends AbstractC34158nTo> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = i;
        this.copydefault = list;
        this.EZpvd = z;
        this.AEQbTJ = z2;
    }
}
