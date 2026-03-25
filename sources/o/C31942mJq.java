package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mJq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31942mJq {
    public final java.lang.String AEQbTJ;
    public boolean EZpvd;
    public final android.graphics.drawable.Drawable KWHzl;
    public boolean OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C31942mJq copy$default(C31942mJq c31942mJq, java.lang.String str, java.lang.String str2, android.graphics.drawable.Drawable drawable, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c31942mJq.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = c31942mJq.AEQbTJ;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            drawable = c31942mJq.KWHzl;
        }
        android.graphics.drawable.Drawable drawable2 = drawable;
        if ((i & 8) != 0) {
            z = c31942mJq.OLrzqt;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = c31942mJq.EZpvd;
        }
        return c31942mJq.OLrzqt(str, str3, drawable2, z3, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31942mJq OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, android.graphics.drawable.Drawable drawable, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C31942mJq(str, str2, drawable, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31942mJq)) {
            return false;
        }
        C31942mJq c31942mJq = (C31942mJq) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c31942mJq.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c31942mJq.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c31942mJq.KWHzl) && this.OLrzqt == c31942mJq.OLrzqt && this.EZpvd == c31942mJq.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        android.graphics.drawable.Drawable drawable = this.KWHzl;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (drawable == null ? 0 : drawable.hashCode())) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TradeModeOptionItems(id=" + this.copydefault + ", title=" + this.AEQbTJ + ", drawable=" + this.KWHzl + ", isSelected=" + this.OLrzqt + ", isUnavailable=" + this.EZpvd + ")";
    }

    public C31942mJq(@NotNull java.lang.String str, @NotNull java.lang.String str2, android.graphics.drawable.Drawable drawable, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.AEQbTJ = str2;
        this.KWHzl = drawable;
        this.OLrzqt = z;
        this.EZpvd = z2;
    }
}
