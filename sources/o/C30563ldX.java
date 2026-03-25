package o;

import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ldX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30563ldX {
    public final java.lang.String AEQbTJ;
    public final boolean EZpvd;
    public final AdvancedPriorityFeeType OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C30563ldX copy$default(C30563ldX c30563ldX, AdvancedPriorityFeeType advancedPriorityFeeType, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            advancedPriorityFeeType = c30563ldX.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = c30563ldX.AEQbTJ;
        }
        if ((i & 4) != 0) {
            z = c30563ldX.EZpvd;
        }
        return c30563ldX.EZpvd(advancedPriorityFeeType, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C30563ldX EZpvd(@NotNull AdvancedPriorityFeeType advancedPriorityFeeType, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(advancedPriorityFeeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C30563ldX(advancedPriorityFeeType, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30563ldX)) {
            return false;
        }
        C30563ldX c30563ldX = (C30563ldX) obj;
        return this.OLrzqt == c30563ldX.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c30563ldX.AEQbTJ) && this.EZpvd == c30563ldX.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AdvancedPriorityFeeSetting(type=" + this.OLrzqt + ", value=" + this.AEQbTJ + ", isValid=" + this.EZpvd + ")";
    }

    public C30563ldX(@NotNull AdvancedPriorityFeeType advancedPriorityFeeType, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(advancedPriorityFeeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = advancedPriorityFeeType;
        this.AEQbTJ = str;
        this.EZpvd = z;
    }
}
