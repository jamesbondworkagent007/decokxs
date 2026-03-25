package o;

import com.okinc.business.web3pay.lib.core.network.ws.ClaimStatusSubResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lsz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31386lsz {
    public final java.lang.String AEQbTJ;
    public final ClaimStatusSubResponse.OPType EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C31386lsz copy$default(C31386lsz c31386lsz, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, ClaimStatusSubResponse.OPType oPType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c31386lsz.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = c31386lsz.djBIcL;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = c31386lsz.OLrzqt;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = c31386lsz.AEQbTJ;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = c31386lsz.copydefault;
        }
        java.lang.String str9 = str5;
        if ((i & 32) != 0) {
            oPType = c31386lsz.EZpvd;
        }
        return c31386lsz.KWHzl(str, str6, str7, str8, str9, oPType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31386lsz KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, ClaimStatusSubResponse.OPType oPType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new C31386lsz(str, str2, str3, str4, str5, oPType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31386lsz)) {
            return false;
        }
        C31386lsz c31386lsz = (C31386lsz) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c31386lsz.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c31386lsz.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c31386lsz.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c31386lsz.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c31386lsz.copydefault) && this.EZpvd == c31386lsz.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.djBIcL.hashCode();
        int iHashCode3 = this.OLrzqt.hashCode();
        int iHashCode4 = this.AEQbTJ.hashCode();
        int iHashCode5 = this.copydefault.hashCode();
        ClaimStatusSubResponse.OPType oPType = this.EZpvd;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (oPType == null ? 0 : oPType.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ClaimStatus(orderId=" + this.KWHzl + ", usdAmount=" + this.djBIcL + ", tokenAmount=" + this.OLrzqt + ", tokenSymbol=" + this.AEQbTJ + ", from=" + this.copydefault + ", opType=" + this.EZpvd + ")";
    }

    public C31386lsz(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, ClaimStatusSubResponse.OPType oPType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.KWHzl = str;
        this.djBIcL = str2;
        this.OLrzqt = str3;
        this.AEQbTJ = str4;
        this.copydefault = str5;
        this.EZpvd = oPType;
    }
}
