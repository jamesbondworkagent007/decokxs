package o;

import com.okinc.business.market.common.constants.RangeType;
import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jVK implements kMU {
    public final java.lang.String EZpvd;
    public boolean OLrzqt;
    public final RangeType copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ jVK copy$default(jVK jvk, java.lang.String str, RangeType rangeType, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = jvk.EZpvd;
        }
        if ((i & 2) != 0) {
            rangeType = jvk.copydefault;
        }
        if ((i & 4) != 0) {
            z = jvk.OLrzqt;
        }
        return jvk.KWHzl(str, rangeType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RangeType EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jVK KWHzl(@NotNull java.lang.String str, @NotNull RangeType rangeType, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rangeType, "");
        return new jVK(str, rangeType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jVK)) {
            return false;
        }
        jVK jvk = (jVK) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) jvk.EZpvd) && this.copydefault == jvk.copydefault && this.OLrzqt == jvk.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.EZpvd.hashCode() * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RangeSwitchFilterUiModel(title=" + this.EZpvd + ", rangeType=" + this.copydefault + ", check=" + this.OLrzqt + ")";
    }

    public jVK(@NotNull java.lang.String str, @NotNull RangeType rangeType, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rangeType, "");
        this.EZpvd = str;
        this.copydefault = rangeType;
        this.OLrzqt = z;
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        return kMU.TaskDescription.AEQbTJ(this, kmu);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        return kMU.TaskDescription.KWHzl(this, kmu);
    }

    @Override // o.kMU
    public java.lang.Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }
}
