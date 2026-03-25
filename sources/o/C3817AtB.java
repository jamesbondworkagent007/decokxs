package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AtB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C3817AtB {
    public static final int $stable = 8;
    public int AEQbTJ;
    public int AYXKKw;
    public int EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;
    public java.lang.String gEmmrt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3817AtB AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new C3817AtB(str, str2, str3, str4, str5, str6, i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3817AtB)) {
            return false;
        }
        C3817AtB c3817AtB = (C3817AtB) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c3817AtB.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c3817AtB.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c3817AtB.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c3817AtB.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c3817AtB.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c3817AtB.djBIcL) && this.AYXKKw == c3817AtB.AYXKKw && this.EZpvd == c3817AtB.EZpvd && this.AEQbTJ == c3817AtB.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.gEmmrt.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + java.lang.Integer.hashCode(this.AYXKKw)) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanDetailPaymentMethod(name=" + this.gEmmrt + ", iconUrl=" + this.KWHzl + ", iconNightUrl=" + this.OLrzqt + ", baseCurrency=" + this.copydefault + ", quoteCurrency=" + this.valueOf + ", paymentAccountId=" + this.djBIcL + ", paymentMethodCategory=" + this.AYXKKw + ", depositPlatformCode=" + this.EZpvd + ", categoryCode=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.AYXKKw;
    }

    public C3817AtB(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.gEmmrt = str;
        this.KWHzl = str2;
        this.OLrzqt = str3;
        this.copydefault = str4;
        this.valueOf = str5;
        this.djBIcL = str6;
        this.AYXKKw = i;
        this.EZpvd = i2;
        this.AEQbTJ = i3;
    }
}
