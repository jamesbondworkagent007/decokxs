package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class PersistableBundle implements zZ {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final C5173Hn KWHzl;
    public final InterfaceC57843yq OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final C5173Hn valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5047Cr
    public C5173Hn AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5047Cr
    public InterfaceC57843yq OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PersistableBundle copydefault(@NotNull java.lang.String str, @NotNull C5173Hn c5173Hn, java.lang.String str2, java.lang.String str3, java.lang.String str4, C5173Hn c5173Hn2, java.lang.String str5, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c5173Hn, "");
        return new PersistableBundle(str, c5173Hn, str2, str3, str4, c5173Hn2, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersistableBundle)) {
            return false;
        }
        PersistableBundle persistableBundle = (PersistableBundle) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) persistableBundle.AhwBna) && Intrinsics.EZpvd(this.KWHzl, persistableBundle.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) persistableBundle.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) persistableBundle.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) persistableBundle.copydefault) && Intrinsics.EZpvd(this.valueOf, persistableBundle.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) persistableBundle.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) persistableBundle.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AhwBna.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        java.lang.String str = this.AEQbTJ;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.EZpvd;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.copydefault;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        C5173Hn c5173Hn = this.valueOf;
        int iHashCode6 = c5173Hn == null ? 0 : c5173Hn.hashCode();
        java.lang.String str4 = this.AYXKKw;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.djBIcL;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SsoToken(token=" + this.AhwBna + ", expiration=" + this.KWHzl + ", refreshToken=" + this.AEQbTJ + ", clientId=" + this.EZpvd + ", clientSecret=" + this.copydefault + ", registrationExpiresAt=" + this.valueOf + ", region=" + this.AYXKKw + ", startUrl=" + this.djBIcL + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.zZ
    public java.lang.String valueOf() {
        return this.AhwBna;
    }

    public PersistableBundle(@NotNull java.lang.String str, @NotNull C5173Hn c5173Hn, java.lang.String str2, java.lang.String str3, java.lang.String str4, C5173Hn c5173Hn2, java.lang.String str5, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c5173Hn, "");
        this.AhwBna = str;
        this.KWHzl = c5173Hn;
        this.AEQbTJ = str2;
        this.EZpvd = str3;
        this.copydefault = str4;
        this.valueOf = c5173Hn2;
        this.AYXKKw = str5;
        this.djBIcL = str6;
        this.OLrzqt = C58108yv.copydefault();
    }
}
