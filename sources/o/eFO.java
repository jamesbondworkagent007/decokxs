package o;

import com.okinc.wallet.hardware.api.onekey.OneKeyDevice;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eFO {
    public static final int AEQbTJ = OneKeyDevice.$stable;
    public final OneKeyDevice EZpvd;
    public final boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ eFO copy$default(eFO efo, OneKeyDevice oneKeyDevice, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            oneKeyDevice = efo.EZpvd;
        }
        if ((i & 2) != 0) {
            z = efo.KWHzl;
        }
        return efo.OLrzqt(oneKeyDevice, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OneKeyDevice AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final eFO OLrzqt(@NotNull OneKeyDevice oneKeyDevice, boolean z) {
        Intrinsics.checkNotNullParameter(oneKeyDevice, "");
        return new eFO(oneKeyDevice, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eFO)) {
            return false;
        }
        eFO efo = (eFO) obj;
        return Intrinsics.EZpvd(this.EZpvd, efo.EZpvd) && this.KWHzl == efo.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OneKeyDeviceWithState(device=" + this.EZpvd + ", connected=" + this.KWHzl + ")";
    }

    public eFO(@NotNull OneKeyDevice oneKeyDevice, boolean z) {
        Intrinsics.checkNotNullParameter(oneKeyDevice, "");
        this.EZpvd = oneKeyDevice;
        this.KWHzl = z;
    }
}
