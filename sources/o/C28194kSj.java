package o;

import com.okinc.business.dex.trade.core.domain.model.ApproveUnsignedData;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kSj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28194kSj {
    public final ApproveUnsignedData AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;
    public final boolean djBIcL;
    public final V6CalldataResponseData valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C28194kSj copy$default(C28194kSj c28194kSj, java.lang.String str, V6CalldataResponseData v6CalldataResponseData, ApproveUnsignedData approveUnsignedData, boolean z, java.lang.String str2, java.lang.String str3, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c28194kSj.copydefault;
        }
        if ((i & 2) != 0) {
            v6CalldataResponseData = c28194kSj.valueOf;
        }
        V6CalldataResponseData v6CalldataResponseData2 = v6CalldataResponseData;
        if ((i & 4) != 0) {
            approveUnsignedData = c28194kSj.AEQbTJ;
        }
        ApproveUnsignedData approveUnsignedData2 = approveUnsignedData;
        if ((i & 8) != 0) {
            z = c28194kSj.OLrzqt;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            str2 = c28194kSj.EZpvd;
        }
        java.lang.String str4 = str2;
        if ((i & 32) != 0) {
            str3 = c28194kSj.KWHzl;
        }
        java.lang.String str5 = str3;
        if ((i & 64) != 0) {
            z2 = c28194kSj.djBIcL;
        }
        return c28194kSj.EZpvd(str, v6CalldataResponseData2, approveUnsignedData2, z3, str4, str5, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6CalldataResponseData AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28194kSj EZpvd(@NotNull java.lang.String str, @NotNull V6CalldataResponseData v6CalldataResponseData, @NotNull ApproveUnsignedData approveUnsignedData, boolean z, java.lang.String str2, java.lang.String str3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(v6CalldataResponseData, "");
        Intrinsics.checkNotNullParameter(approveUnsignedData, "");
        return new C28194kSj(str, v6CalldataResponseData, approveUnsignedData, z, str2, str3, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveUnsignedData OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28194kSj)) {
            return false;
        }
        C28194kSj c28194kSj = (C28194kSj) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c28194kSj.copydefault) && Intrinsics.EZpvd(this.valueOf, c28194kSj.valueOf) && Intrinsics.EZpvd(this.AEQbTJ, c28194kSj.AEQbTJ) && this.OLrzqt == c28194kSj.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c28194kSj.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c28194kSj.KWHzl) && this.djBIcL == c28194kSj.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.valueOf.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        int iHashCode4 = java.lang.Boolean.hashCode(this.OLrzqt);
        java.lang.String str = this.EZpvd;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.KWHzl;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BatchSignBroadcastParams(chainId=" + this.copydefault + ", transactionData=" + this.valueOf + ", approveTxInfo=" + this.AEQbTJ + ", isOpenMev=" + this.OLrzqt + ", fromTokenAddress=" + this.EZpvd + ", fromAmount=" + this.KWHzl + ", silentSignWhenAvailable=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.OLrzqt;
    }

    public C28194kSj(@NotNull java.lang.String str, @NotNull V6CalldataResponseData v6CalldataResponseData, @NotNull ApproveUnsignedData approveUnsignedData, boolean z, java.lang.String str2, java.lang.String str3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(v6CalldataResponseData, "");
        Intrinsics.checkNotNullParameter(approveUnsignedData, "");
        this.copydefault = str;
        this.valueOf = v6CalldataResponseData;
        this.AEQbTJ = approveUnsignedData;
        this.OLrzqt = z;
        this.EZpvd = str2;
        this.KWHzl = str3;
        this.djBIcL = z2;
    }
}
