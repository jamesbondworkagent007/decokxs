package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tAx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45913tAx {
    public final int AEQbTJ;
    public final java.lang.String EZpvd;
    public final boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C45913tAx copy$default(C45913tAx c45913tAx, java.lang.String str, java.lang.String str2, int i, boolean z, java.lang.String str3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c45913tAx.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            str2 = c45913tAx.EZpvd;
        }
        java.lang.String str4 = str2;
        if ((i2 & 4) != 0) {
            i = c45913tAx.AEQbTJ;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = c45913tAx.KWHzl;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            str3 = c45913tAx.copydefault;
        }
        return c45913tAx.KWHzl(str, str4, i3, z2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C45913tAx KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @androidx.annotation.RawRes int i, boolean z, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C45913tAx(str, str2, i, z, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45913tAx)) {
            return false;
        }
        C45913tAx c45913tAx = (C45913tAx) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c45913tAx.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c45913tAx.EZpvd) && this.AEQbTJ == c45913tAx.AEQbTJ && this.KWHzl == c45913tAx.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c45913tAx.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OrbitOnboardingPage(title=" + this.OLrzqt + ", description=" + this.EZpvd + ", animationRes=" + this.AEQbTJ + ", showButton=" + this.KWHzl + ", buttonText=" + this.copydefault + ")";
    }

    public C45913tAx(@NotNull java.lang.String str, @NotNull java.lang.String str2, @androidx.annotation.RawRes int i, boolean z, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.OLrzqt = str;
        this.EZpvd = str2;
        this.AEQbTJ = i;
        this.KWHzl = z;
        this.copydefault = str3;
    }
}
