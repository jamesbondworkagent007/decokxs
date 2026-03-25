package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.retail_trading.SortBy;
import uniffi.retail_trading.SortOrder;

/* JADX INFO: loaded from: classes25.dex */
public final class BlD {
    public static final int $stable = 8;
    public SortOrder EZpvd;
    public SortBy KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BlD copy$default(BlD blD, SortBy sortBy, SortOrder sortOrder, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            sortBy = blD.KWHzl;
        }
        if ((i & 2) != 0) {
            sortOrder = blD.EZpvd;
        }
        return blD.KWHzl(sortBy, sortOrder);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortBy AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BlD KWHzl(@NotNull SortBy sortBy, @NotNull SortOrder sortOrder) {
        Intrinsics.checkNotNullParameter(sortBy, "");
        Intrinsics.checkNotNullParameter(sortOrder, "");
        return new BlD(sortBy, sortOrder);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortOrder OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlD)) {
            return false;
        }
        BlD blD = (BlD) obj;
        return this.KWHzl == blD.KWHzl && this.EZpvd == blD.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SortConfig(sortBy=" + this.KWHzl + ", sortOrder=" + this.EZpvd + ")";
    }

    public BlD(@NotNull SortBy sortBy, @NotNull SortOrder sortOrder) {
        Intrinsics.checkNotNullParameter(sortBy, "");
        Intrinsics.checkNotNullParameter(sortOrder, "");
        this.KWHzl = sortBy;
        this.EZpvd = sortOrder;
    }
}
