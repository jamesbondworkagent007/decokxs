package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class zFW {
    public static final int $stable = 8;
    public AbstractC3107Afh OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ zFW copy$default(zFW zfw, AbstractC3107Afh abstractC3107Afh, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            abstractC3107Afh = zfw.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = zfw.copydefault;
        }
        return zfw.EZpvd(abstractC3107Afh, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zFW EZpvd(@NotNull AbstractC3107Afh abstractC3107Afh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(abstractC3107Afh, "");
        return new zFW(abstractC3107Afh, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC3107Afh KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zFW)) {
            return false;
        }
        zFW zfw = (zFW) obj;
        return Intrinsics.EZpvd(this.OLrzqt, zfw.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) zfw.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        java.lang.String str = this.copydefault;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MfaOtpState(sendCodeState=" + this.OLrzqt + ", maskedContact=" + this.copydefault + ")";
    }

    public zFW(@NotNull AbstractC3107Afh abstractC3107Afh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(abstractC3107Afh, "");
        this.OLrzqt = abstractC3107Afh;
        this.copydefault = str;
    }
}
