package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Asy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3813Asy {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public boolean AhwBna;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public boolean OLrzqt;
    public java.lang.String copydefault;
    public boolean djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3813Asy KWHzl(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z2, @NotNull java.lang.String str4, boolean z3, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new C3813Asy(z, str, str2, str3, z2, str4, z3, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3813Asy)) {
            return false;
        }
        C3813Asy c3813Asy = (C3813Asy) obj;
        return this.OLrzqt == c3813Asy.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c3813Asy.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c3813Asy.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c3813Asy.EZpvd) && this.djBIcL == c3813Asy.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c3813Asy.KWHzl) && this.AhwBna == c3813Asy.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c3813Asy.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((java.lang.Boolean.hashCode(this.OLrzqt) * 31) + this.copydefault.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.djBIcL)) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AhwBna)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanDetailBanner(isVisible=" + this.OLrzqt + ", errorType=" + this.copydefault + ", title=" + this.AYXKKw + ", message=" + this.EZpvd + ", showDepositButton=" + this.djBIcL + ", depositButtonLabel=" + this.KWHzl + ", shouldNavigateToBuyCrypto=" + this.AhwBna + ", cryptoSymbolToBuy=" + this.AEQbTJ + ")";
    }

    public C3813Asy(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z2, @NotNull java.lang.String str4, boolean z3, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.OLrzqt = z;
        this.copydefault = str;
        this.AYXKKw = str2;
        this.EZpvd = str3;
        this.djBIcL = z2;
        this.KWHzl = str4;
        this.AhwBna = z3;
        this.AEQbTJ = str5;
    }
}
