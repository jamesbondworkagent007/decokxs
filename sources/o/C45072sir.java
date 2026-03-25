package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sir, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45072sir {
    public static final int EZpvd = C55167xeo.copydefault;
    public final boolean AEQbTJ;
    public final java.lang.String KWHzl;
    public final C55167xeo OLrzqt;
    public final boolean copydefault;
    public final int gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C45072sir copy$default(C45072sir c45072sir, int i, C55167xeo c55167xeo, boolean z, java.lang.String str, boolean z2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c45072sir.gEmmrt;
        }
        if ((i2 & 2) != 0) {
            c55167xeo = c45072sir.OLrzqt;
        }
        C55167xeo c55167xeo2 = c55167xeo;
        if ((i2 & 4) != 0) {
            z = c45072sir.copydefault;
        }
        boolean z3 = z;
        if ((i2 & 8) != 0) {
            str = c45072sir.KWHzl;
        }
        java.lang.String str2 = str;
        if ((i2 & 16) != 0) {
            z2 = c45072sir.AEQbTJ;
        }
        return c45072sir.OLrzqt(i, c55167xeo2, z3, str2, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55167xeo EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C45072sir OLrzqt(int i, @NotNull C55167xeo c55167xeo, boolean z, @NotNull java.lang.String str, boolean z2) {
        Intrinsics.checkNotNullParameter(c55167xeo, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C45072sir(i, c55167xeo, z, str, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45072sir)) {
            return false;
        }
        C45072sir c45072sir = (C45072sir) obj;
        return this.gEmmrt == c45072sir.gEmmrt && Intrinsics.EZpvd(this.OLrzqt, c45072sir.OLrzqt) && this.copydefault == c45072sir.copydefault && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c45072sir.KWHzl) && this.AEQbTJ == c45072sir.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.gEmmrt) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TokenDisplayModel(tokenId=" + this.gEmmrt + ", outLineCardData=" + this.OLrzqt + ", selected=" + this.copydefault + ", iconDrawable=" + this.KWHzl + ", isIconVisible=" + this.AEQbTJ + ")";
    }

    public C45072sir(int i, @NotNull C55167xeo c55167xeo, boolean z, @NotNull java.lang.String str, boolean z2) {
        Intrinsics.checkNotNullParameter(c55167xeo, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = i;
        this.OLrzqt = c55167xeo;
        this.copydefault = z;
        this.KWHzl = str;
        this.AEQbTJ = z2;
    }
}
