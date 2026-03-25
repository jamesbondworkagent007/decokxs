package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes25.dex */
public final class BoG {
    public static final int $stable = 8;
    public BmO KWHzl;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BoG copy$default(BoG boG, BmO bmO, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bmO = boG.KWHzl;
        }
        if ((i & 2) != 0) {
            z = boG.copydefault;
        }
        return boG.EZpvd(bmO, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BoG EZpvd(@NotNull BmO bmO, boolean z) {
        Intrinsics.checkNotNullParameter(bmO, "");
        return new BoG(bmO, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BmO copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoG)) {
            return false;
        }
        BoG boG = (BoG) obj;
        return Intrinsics.EZpvd(this.KWHzl, boG.KWHzl) && this.copydefault == boG.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SelectableCurrencyItem(item=" + this.KWHzl + ", isSelected=" + this.copydefault + ")";
    }

    public BoG(@NotNull BmO bmO, boolean z) {
        Intrinsics.checkNotNullParameter(bmO, "");
        this.KWHzl = bmO;
        this.copydefault = z;
    }
}
