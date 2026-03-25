package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class BoF {
    public static final int $stable = 8;
    public AXZ EZpvd;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BoF copy$default(BoF boF, AXZ axz, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            axz = boF.EZpvd;
        }
        if ((i & 2) != 0) {
            z = boF.OLrzqt;
        }
        return boF.OLrzqt(axz, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AXZ OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BoF OLrzqt(@NotNull AXZ axz, boolean z) {
        Intrinsics.checkNotNullParameter(axz, "");
        return new BoF(axz, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoF)) {
            return false;
        }
        BoF boF = (BoF) obj;
        return Intrinsics.EZpvd(this.EZpvd, boF.EZpvd) && this.OLrzqt == boF.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SelectableLanguageItem(item=" + this.EZpvd + ", isSelected=" + this.OLrzqt + ")";
    }

    public BoF(@NotNull AXZ axz, boolean z) {
        Intrinsics.checkNotNullParameter(axz, "");
        this.EZpvd = axz;
        this.OLrzqt = z;
    }
}
