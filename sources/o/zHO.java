package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.account.MfaSwitchMethodItem;

/* JADX INFO: loaded from: classes17.dex */
public final class zHO {
    public static final int $stable = 8;
    public boolean EZpvd;
    public java.util.List<? extends MfaSwitchMethodItem> KWHzl;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.zHO */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ zHO copy$default(zHO zho, java.util.List list, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = zho.KWHzl;
        }
        if ((i & 2) != 0) {
            str = zho.copydefault;
        }
        if ((i & 4) != 0) {
            z = zho.EZpvd;
        }
        return zho.OLrzqt(list, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends uniffi.account.MfaSwitchMethodItem>, java.util.List<uniffi.account.MfaSwitchMethodItem> */
    public final java.util.List<MfaSwitchMethodItem> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zHO OLrzqt(@NotNull java.util.List<? extends MfaSwitchMethodItem> list, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        return new zHO(list, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zHO)) {
            return false;
        }
        zHO zho = (zHO) obj;
        return Intrinsics.EZpvd(this.KWHzl, zho.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) zho.copydefault) && this.EZpvd == zho.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        java.lang.String str = this.copydefault;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MfaSwitchMethodState(availableItems=" + this.KWHzl + ", currentAuthType=" + this.copydefault + ", allowResetMfa=" + this.EZpvd + ")";
    }

    public zHO(@NotNull java.util.List<? extends MfaSwitchMethodItem> list, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
        this.copydefault = str;
        this.EZpvd = z;
    }
}
