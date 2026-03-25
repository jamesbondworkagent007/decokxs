package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.account.SocialType;

/* JADX INFO: renamed from: o.Aad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C2838Aad {
    public static final int $stable = 8;
    public java.util.List<? extends SocialType> AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.Aad */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2838Aad copy$default(C2838Aad c2838Aad, java.lang.String str, java.util.List list, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c2838Aad.EZpvd;
        }
        if ((i & 2) != 0) {
            list = c2838Aad.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str2 = c2838Aad.KWHzl;
        }
        return c2838Aad.KWHzl(str, list, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends uniffi.account.SocialType>, java.util.List<uniffi.account.SocialType> */
    public final java.util.List<SocialType> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2838Aad KWHzl(java.lang.String str, @NotNull java.util.List<? extends SocialType> list, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C2838Aad(str, list, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2838Aad)) {
            return false;
        }
        C2838Aad c2838Aad = (C2838Aad) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c2838Aad.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c2838Aad.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c2838Aad.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        java.lang.String str2 = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PreCondition(userSiteChipTitle=" + this.EZpvd + ", availableSocialTypes=" + this.AEQbTJ + ", flow=" + this.KWHzl + ")";
    }

    public C2838Aad(java.lang.String str, @NotNull java.util.List<? extends SocialType> list, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = str;
        this.AEQbTJ = list;
        this.KWHzl = str2;
    }
}
