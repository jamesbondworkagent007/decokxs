package o;

import com.okinc.im.imui.glide.model.AspectOrientation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class nPE {
    public final int AEQbTJ;
    public final AspectOrientation EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ nPE copy$default(nPE npe, int i, int i2, int i3, int i4, AspectOrientation aspectOrientation, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = npe.OLrzqt;
        }
        if ((i5 & 2) != 0) {
            i2 = npe.AEQbTJ;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = npe.copydefault;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = npe.KWHzl;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            aspectOrientation = npe.EZpvd;
        }
        return npe.EZpvd(i, i6, i7, i8, aspectOrientation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AspectOrientation EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final nPE EZpvd(int i, int i2, int i3, int i4, @NotNull AspectOrientation aspectOrientation) {
        Intrinsics.checkNotNullParameter(aspectOrientation, "");
        return new nPE(i, i2, i3, i4, aspectOrientation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nPE)) {
            return false;
        }
        nPE npe = (nPE) obj;
        return this.OLrzqt == npe.OLrzqt && this.AEQbTJ == npe.AEQbTJ && this.copydefault == npe.copydefault && this.KWHzl == npe.KWHzl && this.EZpvd == npe.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.OLrzqt) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ResolvedConstraints(minWidth=" + this.OLrzqt + ", maxWidth=" + this.AEQbTJ + ", minHeight=" + this.copydefault + ", maxHeight=" + this.KWHzl + ", orientation=" + this.EZpvd + ")";
    }

    public nPE(int i, int i2, int i3, int i4, @NotNull AspectOrientation aspectOrientation) {
        Intrinsics.checkNotNullParameter(aspectOrientation, "");
        this.OLrzqt = i;
        this.AEQbTJ = i2;
        this.copydefault = i3;
        this.KWHzl = i4;
        this.EZpvd = aspectOrientation;
    }
}
