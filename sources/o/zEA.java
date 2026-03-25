package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes25.dex */
public final class zEA {
    public static final int $stable = 8;
    public C3063Aeq AEQbTJ;
    public java.lang.String EZpvd;
    public C3254AiV KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ zEA copy$default(zEA zea, C3063Aeq c3063Aeq, C3254AiV c3254AiV, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c3063Aeq = zea.AEQbTJ;
        }
        if ((i & 2) != 0) {
            c3254AiV = zea.KWHzl;
        }
        C3254AiV c3254AiV2 = c3254AiV;
        if ((i & 4) != 0) {
            str = zea.EZpvd;
        }
        java.lang.String str4 = str;
        if ((i & 8) != 0) {
            str2 = zea.OLrzqt;
        }
        java.lang.String str5 = str2;
        if ((i & 16) != 0) {
            str3 = zea.copydefault;
        }
        return zea.OLrzqt(c3063Aeq, c3254AiV2, str4, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3063Aeq EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3254AiV OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zEA OLrzqt(@NotNull C3063Aeq c3063Aeq, @NotNull C3254AiV c3254AiV, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(c3063Aeq, "");
        Intrinsics.checkNotNullParameter(c3254AiV, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new zEA(c3063Aeq, c3254AiV, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zEA)) {
            return false;
        }
        zEA zea = (zEA) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, zea.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, zea.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) zea.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) zea.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) zea.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        int iHashCode3 = this.EZpvd.hashCode();
        int iHashCode4 = this.OLrzqt.hashCode();
        java.lang.String str = this.copydefault;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LoginWithPasskeyFinishRequest(responseJson=" + this.AEQbTJ + ", venus=" + this.KWHzl + ", tmx=" + this.EZpvd + ", dvToken=" + this.OLrzqt + ", channelId=" + this.copydefault + ")";
    }

    public zEA(@NotNull C3063Aeq c3063Aeq, @NotNull C3254AiV c3254AiV, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(c3063Aeq, "");
        Intrinsics.checkNotNullParameter(c3254AiV, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = c3063Aeq;
        this.KWHzl = c3254AiV;
        this.EZpvd = str;
        this.OLrzqt = str2;
        this.copydefault = str3;
    }
}
