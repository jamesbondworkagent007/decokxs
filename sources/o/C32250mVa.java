package o;

import com.okinc.dexkline.domain.model.market.detail.CoinRiskLevel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mVa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32250mVa {
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final CoinRiskLevel OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C32250mVa copy$default(C32250mVa c32250mVa, java.lang.String str, java.lang.String str2, CoinRiskLevel coinRiskLevel, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c32250mVa.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = c32250mVa.KWHzl;
        }
        if ((i & 4) != 0) {
            coinRiskLevel = c32250mVa.OLrzqt;
        }
        return c32250mVa.copydefault(str, str2, coinRiskLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinRiskLevel OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32250mVa copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull CoinRiskLevel coinRiskLevel) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(coinRiskLevel, "");
        return new C32250mVa(str, str2, coinRiskLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32250mVa)) {
            return false;
        }
        C32250mVa c32250mVa = (C32250mVa) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c32250mVa.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c32250mVa.KWHzl) && this.OLrzqt == c32250mVa.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RiskDetail(title=" + this.EZpvd + ", description=" + this.KWHzl + ", riskLevel=" + this.OLrzqt + ")";
    }

    public C32250mVa(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull CoinRiskLevel coinRiskLevel) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(coinRiskLevel, "");
        this.EZpvd = str;
        this.KWHzl = str2;
        this.OLrzqt = coinRiskLevel;
    }
}
