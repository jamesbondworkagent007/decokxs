package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.account.SocialAccountChannel;

/* JADX INFO: renamed from: o.Afp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3115Afp {
    public static final int $stable = 8;
    public C3210Ahe AEQbTJ;
    public SocialAccountChannel EZpvd;
    public boolean KWHzl;
    public AbstractC60238zyv OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3115Afp copy$default(C3115Afp c3115Afp, AbstractC60238zyv abstractC60238zyv, C3210Ahe c3210Ahe, boolean z, java.lang.String str, SocialAccountChannel socialAccountChannel, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            abstractC60238zyv = c3115Afp.OLrzqt;
        }
        if ((i & 2) != 0) {
            c3210Ahe = c3115Afp.AEQbTJ;
        }
        C3210Ahe c3210Ahe2 = c3210Ahe;
        if ((i & 4) != 0) {
            z = c3115Afp.KWHzl;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str = c3115Afp.copydefault;
        }
        java.lang.String str2 = str;
        if ((i & 16) != 0) {
            socialAccountChannel = c3115Afp.EZpvd;
        }
        return c3115Afp.copydefault(abstractC60238zyv, c3210Ahe2, z2, str2, socialAccountChannel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SocialAccountChannel AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC60238zyv KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3210Ahe OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3115Afp copydefault(@NotNull AbstractC60238zyv abstractC60238zyv, C3210Ahe c3210Ahe, boolean z, java.lang.String str, SocialAccountChannel socialAccountChannel) {
        Intrinsics.checkNotNullParameter(abstractC60238zyv, "");
        return new C3115Afp(abstractC60238zyv, c3210Ahe, z, str, socialAccountChannel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3115Afp)) {
            return false;
        }
        C3115Afp c3115Afp = (C3115Afp) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c3115Afp.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c3115Afp.AEQbTJ) && this.KWHzl == c3115Afp.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c3115Afp.copydefault) && this.EZpvd == c3115Afp.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        C3210Ahe c3210Ahe = this.AEQbTJ;
        int iHashCode2 = c3210Ahe == null ? 0 : c3210Ahe.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.KWHzl);
        java.lang.String str = this.copydefault;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        SocialAccountChannel socialAccountChannel = this.EZpvd;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (socialAccountChannel != null ? socialAccountChannel.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SetPasswordState(networkState=" + this.OLrzqt + ", codeRequirement=" + this.AEQbTJ + ", isCompleted=" + this.KWHzl + ", errorMessage=" + this.copydefault + ", socialAccountChannel=" + this.EZpvd + ")";
    }

    public C3115Afp(@NotNull AbstractC60238zyv abstractC60238zyv, C3210Ahe c3210Ahe, boolean z, java.lang.String str, SocialAccountChannel socialAccountChannel) {
        Intrinsics.checkNotNullParameter(abstractC60238zyv, "");
        this.OLrzqt = abstractC60238zyv;
        this.AEQbTJ = c3210Ahe;
        this.KWHzl = z;
        this.copydefault = str;
        this.EZpvd = socialAccountChannel;
    }
}
