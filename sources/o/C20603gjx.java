package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gjx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20603gjx {
    public final java.util.List<C20598gjs> AEQbTJ;
    public final boolean KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gjx */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C20603gjx copy$default(C20603gjx c20603gjx, java.util.List list, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c20603gjx.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z = c20603gjx.copydefault;
        }
        if ((i & 4) != 0) {
            z2 = c20603gjx.KWHzl;
        }
        return c20603gjx.copydefault(list, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C20598gjs> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C20603gjx copydefault(@NotNull java.util.List<C20598gjs> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C20603gjx(list, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20603gjx)) {
            return false;
        }
        C20603gjx c20603gjx = (C20603gjx) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c20603gjx.AEQbTJ) && this.copydefault == c20603gjx.copydefault && this.KWHzl == c20603gjx.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TransferCoinDataSource(list=" + this.AEQbTJ + ", isFromSearch=" + this.copydefault + ", showRecommendXLayerBanner=" + this.KWHzl + ")";
    }

    public C20603gjx(@NotNull java.util.List<C20598gjs> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
        this.copydefault = z;
        this.KWHzl = z2;
    }
}
