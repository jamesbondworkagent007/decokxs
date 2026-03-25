package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Abu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2908Abu {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public java.util.List<C58391zAq> EZpvd;
    public java.lang.String KWHzl;
    public C58395zAu OLrzqt;
    public boolean copydefault;
    public java.lang.String djBIcL;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C58391zAq> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2908Abu KWHzl(java.lang.String str, java.lang.String str2, boolean z, C58395zAu c58395zAu, @NotNull java.util.List<C58391zAq> list, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C2908Abu(str, str2, z, c58395zAu, list, z2, z3, z4, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58395zAu OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2908Abu)) {
            return false;
        }
        C2908Abu c2908Abu = (C2908Abu) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c2908Abu.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c2908Abu.djBIcL) && this.copydefault == c2908Abu.copydefault && Intrinsics.EZpvd(this.OLrzqt, c2908Abu.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c2908Abu.EZpvd) && this.AhwBna == c2908Abu.AhwBna && this.valueOf == c2908Abu.valueOf && this.AYXKKw == c2908Abu.AYXKKw && this.AEQbTJ == c2908Abu.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.djBIcL;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.copydefault);
        C58395zAu c58395zAu = this.OLrzqt;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (c58395zAu != null ? c58395zAu.hashCode() : 0)) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AhwBna)) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + java.lang.Boolean.hashCode(this.AYXKKw)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RegisterCorState(selectedCountry=" + this.KWHzl + ", selectedProvince=" + this.djBIcL + ", isForbidRegister=" + this.copydefault + ", consentInfo=" + this.OLrzqt + ", consentList=" + this.EZpvd + ", showProvince=" + this.AhwBna + ", showPromotion=" + this.valueOf + ", showConsentList=" + this.AYXKKw + ", isNextButtonEnabled=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.AEQbTJ;
    }

    public C2908Abu(java.lang.String str, java.lang.String str2, boolean z, C58395zAu c58395zAu, @NotNull java.util.List<C58391zAq> list, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = str;
        this.djBIcL = str2;
        this.copydefault = z;
        this.OLrzqt = c58395zAu;
        this.EZpvd = list;
        this.AhwBna = z2;
        this.valueOf = z3;
        this.AYXKKw = z4;
        this.AEQbTJ = z5;
    }
}
