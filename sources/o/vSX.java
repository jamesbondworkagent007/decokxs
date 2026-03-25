package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vSX {
    public java.lang.String AEQbTJ;
    public boolean EZpvd;
    public int KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ vSX copy$default(vSX vsx, java.lang.String str, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = vsx.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            z = vsx.EZpvd;
        }
        if ((i2 & 4) != 0) {
            i = vsx.KWHzl;
        }
        return vsx.copydefault(str, z, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final vSX copydefault(@NotNull java.lang.String str, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new vSX(str, z, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vSX)) {
            return false;
        }
        vSX vsx = (vSX) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) vsx.AEQbTJ) && this.EZpvd == vsx.EZpvd && this.KWHzl == vsx.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RationItemModel(ration=" + this.AEQbTJ + ", isSelected=" + this.EZpvd + ", position=" + this.KWHzl + ")";
    }

    public vSX(@NotNull java.lang.String str, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        this.EZpvd = z;
        this.KWHzl = i;
    }
}
