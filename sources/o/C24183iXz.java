package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iXz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24183iXz {
    public final InterfaceC24182iXy AEQbTJ;
    public final iXD EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C24183iXz copy$default(C24183iXz c24183iXz, iXD ixd, InterfaceC24182iXy interfaceC24182iXy, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            ixd = c24183iXz.EZpvd;
        }
        if ((i & 2) != 0) {
            interfaceC24182iXy = c24183iXz.AEQbTJ;
        }
        return c24183iXz.OLrzqt(ixd, interfaceC24182iXy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iXD KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24183iXz OLrzqt(@NotNull iXD ixd, InterfaceC24182iXy interfaceC24182iXy) {
        Intrinsics.checkNotNullParameter(ixd, "");
        return new C24183iXz(ixd, interfaceC24182iXy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24183iXz)) {
            return false;
        }
        C24183iXz c24183iXz = (C24183iXz) obj;
        return Intrinsics.EZpvd(this.EZpvd, c24183iXz.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c24183iXz.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        InterfaceC24182iXy interfaceC24182iXy = this.AEQbTJ;
        return (iHashCode * 31) + (interfaceC24182iXy == null ? 0 : interfaceC24182iXy.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TransactionOutput(transactionState=" + this.EZpvd + ", screenState=" + this.AEQbTJ + ")";
    }

    public C24183iXz(@NotNull iXD ixd, InterfaceC24182iXy interfaceC24182iXy) {
        Intrinsics.checkNotNullParameter(ixd, "");
        this.EZpvd = ixd;
        this.AEQbTJ = interfaceC24182iXy;
    }
}
