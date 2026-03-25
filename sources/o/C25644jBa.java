package o;

import com.okinc.business.market.data.constant.AddressTrackerSortType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jBa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C25644jBa {
    public final boolean AEQbTJ;
    public final AddressTrackerSortType KWHzl;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25644jBa copy$default(C25644jBa c25644jBa, int i, AddressTrackerSortType addressTrackerSortType, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c25644jBa.copydefault;
        }
        if ((i2 & 2) != 0) {
            addressTrackerSortType = c25644jBa.KWHzl;
        }
        if ((i2 & 4) != 0) {
            z = c25644jBa.AEQbTJ;
        }
        return c25644jBa.copydefault(i, addressTrackerSortType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25644jBa copydefault(int i, @NotNull AddressTrackerSortType addressTrackerSortType, boolean z) {
        Intrinsics.checkNotNullParameter(addressTrackerSortType, "");
        return new C25644jBa(i, addressTrackerSortType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25644jBa)) {
            return false;
        }
        C25644jBa c25644jBa = (C25644jBa) obj;
        return this.copydefault == c25644jBa.copydefault && this.KWHzl == c25644jBa.KWHzl && this.AEQbTJ == c25644jBa.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.copydefault) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TrackingAddressListId(page=" + this.copydefault + ", sortType=" + this.KWHzl + ", isAsc=" + this.AEQbTJ + ")";
    }

    public C25644jBa(int i, @NotNull AddressTrackerSortType addressTrackerSortType, boolean z) {
        Intrinsics.checkNotNullParameter(addressTrackerSortType, "");
        this.copydefault = i;
        this.KWHzl = addressTrackerSortType;
        this.AEQbTJ = z;
    }
}
