package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zOi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58761zOi {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public zNS EZpvd;
    public zNQ OLrzqt;
    public AbstractC60238zyv copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C58761zOi copy$default(C58761zOi c58761zOi, zNQ znq, zNS zns, boolean z, AbstractC60238zyv abstractC60238zyv, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            znq = c58761zOi.OLrzqt;
        }
        if ((i & 2) != 0) {
            zns = c58761zOi.EZpvd;
        }
        if ((i & 4) != 0) {
            z = c58761zOi.AEQbTJ;
        }
        if ((i & 8) != 0) {
            abstractC60238zyv = c58761zOi.copydefault;
        }
        return c58761zOi.KWHzl(znq, zns, z, abstractC60238zyv);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC60238zyv EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zNQ KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58761zOi KWHzl(@NotNull zNQ znq, @NotNull zNS zns, boolean z, @NotNull AbstractC60238zyv abstractC60238zyv) {
        Intrinsics.checkNotNullParameter(znq, "");
        Intrinsics.checkNotNullParameter(zns, "");
        Intrinsics.checkNotNullParameter(abstractC60238zyv, "");
        return new C58761zOi(znq, zns, z, abstractC60238zyv);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zNS copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58761zOi)) {
            return false;
        }
        C58761zOi c58761zOi = (C58761zOi) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c58761zOi.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c58761zOi.EZpvd) && this.AEQbTJ == c58761zOi.AEQbTJ && Intrinsics.EZpvd(this.copydefault, c58761zOi.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OkxPasskeyCrossDeviceMasterAuthenticateState(deviceInfo=" + this.OLrzqt + ", approveStatus=" + this.EZpvd + ", isApproveEnabled=" + this.AEQbTJ + ", networkState=" + this.copydefault + ")";
    }

    public C58761zOi(@NotNull zNQ znq, @NotNull zNS zns, boolean z, @NotNull AbstractC60238zyv abstractC60238zyv) {
        Intrinsics.checkNotNullParameter(znq, "");
        Intrinsics.checkNotNullParameter(zns, "");
        Intrinsics.checkNotNullParameter(abstractC60238zyv, "");
        this.OLrzqt = znq;
        this.EZpvd = zns;
        this.AEQbTJ = z;
        this.copydefault = abstractC60238zyv;
    }
}
