package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.swh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45762swh {
    public final C45759swe AEQbTJ;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C45762swh copy$default(C45762swh c45762swh, boolean z, C45759swe c45759swe, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c45762swh.OLrzqt;
        }
        if ((i & 2) != 0) {
            c45759swe = c45762swh.AEQbTJ;
        }
        return c45762swh.KWHzl(z, c45759swe);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C45759swe AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C45762swh KWHzl(boolean z, @NotNull C45759swe c45759swe) {
        Intrinsics.checkNotNullParameter(c45759swe, "");
        return new C45762swh(z, c45759swe);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45762swh)) {
            return false;
        }
        C45762swh c45762swh = (C45762swh) obj;
        return this.OLrzqt == c45762swh.OLrzqt && Intrinsics.EZpvd(this.AEQbTJ, c45762swh.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.OLrzqt) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RiskBannerRequest(isOnResume=" + this.OLrzqt + ", contentInfo=" + this.AEQbTJ + ")";
    }

    public C45762swh(boolean z, @NotNull C45759swe c45759swe) {
        Intrinsics.checkNotNullParameter(c45759swe, "");
        this.OLrzqt = z;
        this.AEQbTJ = c45759swe;
    }
}
