package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.dex.CoinRiskLevel;

/* JADX INFO: renamed from: o.AGh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C2296AGh {
    public static final int $stable = 8;
    public CoinRiskLevel EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2296AGh copy$default(C2296AGh c2296AGh, java.lang.String str, java.lang.String str2, CoinRiskLevel coinRiskLevel, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c2296AGh.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = c2296AGh.KWHzl;
        }
        if ((i & 4) != 0) {
            coinRiskLevel = c2296AGh.EZpvd;
        }
        if ((i & 8) != 0) {
            str3 = c2296AGh.copydefault;
        }
        return c2296AGh.OLrzqt(str, str2, coinRiskLevel, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2296AGh OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull CoinRiskLevel coinRiskLevel, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(coinRiskLevel, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C2296AGh(str, str2, coinRiskLevel, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinRiskLevel OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2296AGh)) {
            return false;
        }
        C2296AGh c2296AGh = (C2296AGh) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c2296AGh.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c2296AGh.KWHzl) && this.EZpvd == c2296AGh.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c2296AGh.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RiskDetail(riskName=" + this.OLrzqt + ", riskDesc=" + this.KWHzl + ", riskLevel=" + this.EZpvd + ", eventTrackingRiskName=" + this.copydefault + ")";
    }

    public C2296AGh(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull CoinRiskLevel coinRiskLevel, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(coinRiskLevel, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.OLrzqt = str;
        this.KWHzl = str2;
        this.EZpvd = coinRiskLevel;
        this.copydefault = str3;
    }
}
