package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.zzy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C60294zzy {
    public static final int $stable = 8;
    public C2830AaV EZpvd;
    public C3088AfO KWHzl;
    public C58403zBb copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C60294zzy copy$default(C60294zzy c60294zzy, C58403zBb c58403zBb, C3088AfO c3088AfO, C2830AaV c2830AaV, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c58403zBb = c60294zzy.copydefault;
        }
        if ((i & 2) != 0) {
            c3088AfO = c60294zzy.KWHzl;
        }
        if ((i & 4) != 0) {
            c2830AaV = c60294zzy.EZpvd;
        }
        return c60294zzy.KWHzl(c58403zBb, c3088AfO, c2830AaV);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3088AfO AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58403zBb KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60294zzy KWHzl(C58403zBb c58403zBb, C3088AfO c3088AfO, C2830AaV c2830AaV) {
        return new C60294zzy(c58403zBb, c3088AfO, c2830AaV);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2830AaV OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60294zzy)) {
            return false;
        }
        C60294zzy c60294zzy = (C60294zzy) obj;
        return Intrinsics.EZpvd(this.copydefault, c60294zzy.copydefault) && Intrinsics.EZpvd(this.KWHzl, c60294zzy.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c60294zzy.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        C58403zBb c58403zBb = this.copydefault;
        int iHashCode = c58403zBb == null ? 0 : c58403zBb.hashCode();
        C3088AfO c3088AfO = this.KWHzl;
        int iHashCode2 = c3088AfO == null ? 0 : c3088AfO.hashCode();
        C2830AaV c2830AaV = this.EZpvd;
        return (((iHashCode * 31) + iHashCode2) * 31) + (c2830AaV != null ? c2830AaV.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CaptchaForm(geetestForm=" + this.copydefault + ", tencentForm=" + this.KWHzl + ", recaptchaForm=" + this.EZpvd + ")";
    }

    public C60294zzy(C58403zBb c58403zBb, C3088AfO c3088AfO, C2830AaV c2830AaV) {
        this.copydefault = c58403zBb;
        this.KWHzl = c3088AfO;
        this.EZpvd = c2830AaV;
    }
}
