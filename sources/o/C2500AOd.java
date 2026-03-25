package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AOd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C2500AOd {
    public static final int $stable = 8;
    public AbstractC2499AOc AEQbTJ;
    public APL KWHzl;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2500AOd copy$default(C2500AOd c2500AOd, APL apl, java.lang.String str, AbstractC2499AOc abstractC2499AOc, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            apl = c2500AOd.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c2500AOd.OLrzqt;
        }
        if ((i & 4) != 0) {
            abstractC2499AOc = c2500AOd.AEQbTJ;
        }
        return c2500AOd.copydefault(apl, str, abstractC2499AOc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final APL EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC2499AOc OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2500AOd copydefault(@NotNull APL apl, @NotNull java.lang.String str, AbstractC2499AOc abstractC2499AOc) {
        Intrinsics.checkNotNullParameter(apl, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C2500AOd(apl, str, abstractC2499AOc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2500AOd)) {
            return false;
        }
        C2500AOd c2500AOd = (C2500AOd) obj;
        return Intrinsics.EZpvd(this.KWHzl, c2500AOd.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c2500AOd.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c2500AOd.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        AbstractC2499AOc abstractC2499AOc = this.AEQbTJ;
        return (((iHashCode * 31) + iHashCode2) * 31) + (abstractC2499AOc == null ? 0 : abstractC2499AOc.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LinkShareParams(common=" + this.KWHzl + ", linkUrl=" + this.OLrzqt + ", linkIconImageSource=" + this.AEQbTJ + ")";
    }

    public C2500AOd(@NotNull APL apl, @NotNull java.lang.String str, AbstractC2499AOc abstractC2499AOc) {
        Intrinsics.checkNotNullParameter(apl, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = apl;
        this.OLrzqt = str;
        this.AEQbTJ = abstractC2499AOc;
    }
}
