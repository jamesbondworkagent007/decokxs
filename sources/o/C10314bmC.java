package o;

import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationContext;
import com.okinc.business.invest_api.bean.InvestUtxoConfirmationItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bmC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10314bmC {
    public final java.lang.Integer AEQbTJ;
    public final long EZpvd;
    public final boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final UtxoConfirmationContext copydefault;
    public final java.util.List<InvestUtxoConfirmationItem> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.bmC */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C10314bmC copy$default(C10314bmC c10314bmC, java.lang.String str, long j, java.util.List list, boolean z, java.lang.Integer num, UtxoConfirmationContext utxoConfirmationContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c10314bmC.OLrzqt;
        }
        if ((i & 2) != 0) {
            j = c10314bmC.EZpvd;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            list = c10314bmC.valueOf;
        }
        java.util.List list2 = list;
        if ((i & 8) != 0) {
            z = c10314bmC.KWHzl;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            num = c10314bmC.AEQbTJ;
        }
        java.lang.Integer num2 = num;
        if ((i & 32) != 0) {
            utxoConfirmationContext = c10314bmC.copydefault;
        }
        return c10314bmC.KWHzl(str, j2, list2, z2, num2, utxoConfirmationContext);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestUtxoConfirmationItem> EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10314bmC KWHzl(@NotNull java.lang.String str, long j, @NotNull java.util.List<InvestUtxoConfirmationItem> list, boolean z, java.lang.Integer num, @NotNull UtxoConfirmationContext utxoConfirmationContext) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(utxoConfirmationContext, "");
        return new C10314bmC(str, j, list, z, num, utxoConfirmationContext);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UtxoConfirmationContext OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10314bmC)) {
            return false;
        }
        C10314bmC c10314bmC = (C10314bmC) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c10314bmC.OLrzqt) && this.EZpvd == c10314bmC.EZpvd && Intrinsics.EZpvd(this.valueOf, c10314bmC.valueOf) && this.KWHzl == c10314bmC.KWHzl && Intrinsics.EZpvd(this.AEQbTJ, c10314bmC.AEQbTJ) && this.copydefault == c10314bmC.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = java.lang.Long.hashCode(this.EZpvd);
        int iHashCode3 = this.valueOf.hashCode();
        int iHashCode4 = java.lang.Boolean.hashCode(this.KWHzl);
        java.lang.Integer num = this.AEQbTJ;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UtxoConfirmationParams(address=" + this.OLrzqt + ", coinId=" + this.EZpvd + ", utxoList=" + this.valueOf + ", isNftListing=" + this.KWHzl + ", txType=" + this.AEQbTJ + ", confirmationContext=" + this.copydefault + ")";
    }

    public C10314bmC(@NotNull java.lang.String str, long j, @NotNull java.util.List<InvestUtxoConfirmationItem> list, boolean z, java.lang.Integer num, @NotNull UtxoConfirmationContext utxoConfirmationContext) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(utxoConfirmationContext, "");
        this.OLrzqt = str;
        this.EZpvd = j;
        this.valueOf = list;
        this.KWHzl = z;
        this.AEQbTJ = num;
        this.copydefault = utxoConfirmationContext;
    }
}
