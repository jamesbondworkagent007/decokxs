package o;

import com.okinc.im.imui.glide.model.AspectOrientation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nPB {
    public final AspectOrientation KWHzl;
    public final int OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ nPB copy$default(nPB npb, int i, int i2, AspectOrientation aspectOrientation, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = npb.copydefault;
        }
        if ((i3 & 2) != 0) {
            i2 = npb.OLrzqt;
        }
        if ((i3 & 4) != 0) {
            aspectOrientation = npb.KWHzl;
        }
        return npb.copydefault(i, i2, aspectOrientation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AspectOrientation EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final nPB copydefault(int i, int i2, @NotNull AspectOrientation aspectOrientation) {
        Intrinsics.checkNotNullParameter(aspectOrientation, "");
        return new nPB(i, i2, aspectOrientation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nPB)) {
            return false;
        }
        nPB npb = (nPB) obj;
        return this.copydefault == npb.copydefault && this.OLrzqt == npb.OLrzqt && this.KWHzl == npb.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.copydefault) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FinalDimensions(width=" + this.copydefault + ", height=" + this.OLrzqt + ", orientation=" + this.KWHzl + ")";
    }

    public nPB(int i, int i2, @NotNull AspectOrientation aspectOrientation) {
        Intrinsics.checkNotNullParameter(aspectOrientation, "");
        this.copydefault = i;
        this.OLrzqt = i2;
        this.KWHzl = aspectOrientation;
    }
}
