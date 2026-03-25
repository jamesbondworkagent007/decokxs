package o;

import com.okinc.unify_trade.biz.FundingRate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wbI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52894wbI {
    public static final int EZpvd;
    public final FundingRate AEQbTJ;
    public final FundingRate AYXKKw;
    public final long KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final boolean djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i = FundingRate.$stable;
        EZpvd = i | i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C52894wbI copy$default(C52894wbI c52894wbI, java.lang.String str, java.lang.String str2, FundingRate fundingRate, FundingRate fundingRate2, boolean z, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c52894wbI.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = c52894wbI.OLrzqt;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            fundingRate = c52894wbI.AEQbTJ;
        }
        FundingRate fundingRate3 = fundingRate;
        if ((i & 8) != 0) {
            fundingRate2 = c52894wbI.AYXKKw;
        }
        FundingRate fundingRate4 = fundingRate2;
        if ((i & 16) != 0) {
            z = c52894wbI.djBIcL;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            j = c52894wbI.KWHzl;
        }
        return c52894wbI.copydefault(str, str3, fundingRate3, fundingRate4, z2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FundingRate OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FundingRate copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C52894wbI copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull FundingRate fundingRate, @NotNull FundingRate fundingRate2, boolean z, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(fundingRate, "");
        Intrinsics.checkNotNullParameter(fundingRate2, "");
        return new C52894wbI(str, str2, fundingRate, fundingRate2, z, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C52894wbI)) {
            return false;
        }
        C52894wbI c52894wbI = (C52894wbI) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c52894wbI.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c52894wbI.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c52894wbI.AEQbTJ) && Intrinsics.EZpvd(this.AYXKKw, c52894wbI.AYXKKw) && this.djBIcL == c52894wbI.djBIcL && this.KWHzl == c52894wbI.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + java.lang.Boolean.hashCode(this.djBIcL)) * 31) + java.lang.Long.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FundingRateUiModel(ccy=" + this.copydefault + ", instId=" + this.OLrzqt + ", filteredFundingRate=" + this.AEQbTJ + ", nextFundingRate=" + this.AYXKKw + ", matchedQuery=" + this.djBIcL + ", futureMillis=" + this.KWHzl + ")";
    }

    public C52894wbI(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull FundingRate fundingRate, @NotNull FundingRate fundingRate2, boolean z, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(fundingRate, "");
        Intrinsics.checkNotNullParameter(fundingRate2, "");
        this.copydefault = str;
        this.OLrzqt = str2;
        this.AEQbTJ = fundingRate;
        this.AYXKKw = fundingRate2;
        this.djBIcL = z;
        this.KWHzl = j;
    }
}
