package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.buy_sell.BuySellOrderDetailContentStateVariant;

/* JADX INFO: renamed from: o.AqW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C3679AqW {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public BuySellOrderDetailContentStateVariant EZpvd;
    public C3682AqZ KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3679AqW copy$default(C3679AqW c3679AqW, BuySellOrderDetailContentStateVariant buySellOrderDetailContentStateVariant, C3682AqZ c3682AqZ, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            buySellOrderDetailContentStateVariant = c3679AqW.EZpvd;
        }
        if ((i & 2) != 0) {
            c3682AqZ = c3679AqW.KWHzl;
        }
        if ((i & 4) != 0) {
            str = c3679AqW.AEQbTJ;
        }
        return c3679AqW.EZpvd(buySellOrderDetailContentStateVariant, c3682AqZ, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3679AqW EZpvd(@NotNull BuySellOrderDetailContentStateVariant buySellOrderDetailContentStateVariant, C3682AqZ c3682AqZ, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(buySellOrderDetailContentStateVariant, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C3679AqW(buySellOrderDetailContentStateVariant, c3682AqZ, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellOrderDetailContentStateVariant EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3682AqZ OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3679AqW)) {
            return false;
        }
        C3679AqW c3679AqW = (C3679AqW) obj;
        return this.EZpvd == c3679AqW.EZpvd && Intrinsics.EZpvd(this.KWHzl, c3679AqW.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c3679AqW.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        C3682AqZ c3682AqZ = this.KWHzl;
        return (((iHashCode * 31) + (c3682AqZ == null ? 0 : c3682AqZ.hashCode())) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BuySellOrderDetailContentState(variant=" + this.EZpvd + ", data=" + this.KWHzl + ", errorMessage=" + this.AEQbTJ + ")";
    }

    public C3679AqW(@NotNull BuySellOrderDetailContentStateVariant buySellOrderDetailContentStateVariant, C3682AqZ c3682AqZ, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(buySellOrderDetailContentStateVariant, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = buySellOrderDetailContentStateVariant;
        this.KWHzl = c3682AqZ;
        this.AEQbTJ = str;
    }
}
