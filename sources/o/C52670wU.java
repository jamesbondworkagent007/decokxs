package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC52697wV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C52670wU implements InterfaceC52697wV {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AhwBna;
    public final C5173Hn EZpvd;
    public final InterfaceC57843yq KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C52670wU copy$default(C52670wU c52670wU, java.lang.String str, java.lang.String str2, java.lang.String str3, C5173Hn c5173Hn, InterfaceC57843yq interfaceC57843yq, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c52670wU.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = c52670wU.AEQbTJ;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = c52670wU.AhwBna;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            c5173Hn = c52670wU.EZpvd;
        }
        C5173Hn c5173Hn2 = c5173Hn;
        if ((i & 16) != 0) {
            interfaceC57843yq = c52670wU.KWHzl;
        }
        return c52670wU.AEQbTJ(str, str4, str5, c5173Hn2, interfaceC57843yq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5047Cr
    public C5173Hn AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C52670wU AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, C5173Hn c5173Hn, @NotNull InterfaceC57843yq interfaceC57843yq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
        return new C52670wU(str, str2, str3, c5173Hn, interfaceC57843yq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC52697wV
    public java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5047Cr
    public InterfaceC57843yq OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC52697wV
    public java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC52697wV
    public java.lang.String djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C52670wU)) {
            return false;
        }
        C52670wU c52670wU = (C52670wU) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c52670wU.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c52670wU.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c52670wU.AhwBna) && Intrinsics.EZpvd(this.EZpvd, c52670wU.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c52670wU.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        java.lang.String str = this.AhwBna;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        C5173Hn c5173Hn = this.EZpvd;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (c5173Hn != null ? c5173Hn.hashCode() : 0)) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CredentialsImpl(accessKeyId=" + this.OLrzqt + ", secretAccessKey=" + this.AEQbTJ + ", sessionToken=" + this.AhwBna + ", expiration=" + this.EZpvd + ", attributes=" + this.KWHzl + ')';
    }

    public C52670wU(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, C5173Hn c5173Hn, @NotNull InterfaceC57843yq interfaceC57843yq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
        this.OLrzqt = str;
        this.AEQbTJ = str2;
        this.AhwBna = str3;
        this.EZpvd = c5173Hn;
        this.KWHzl = interfaceC57843yq;
    }

    @Override // o.InterfaceC52697wV
    public java.lang.String KWHzl() {
        return InterfaceC52697wV.TaskDescription.copydefault(this);
    }
}
