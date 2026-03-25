package o;

import com.okinc.wallet.hardware.api.onekey.OneKeyConnectedDevice;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eIu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15450eIu {
    public static final int AEQbTJ = OneKeyConnectedDevice.$stable;
    public final java.lang.String KWHzl;
    public final OneKeyConnectedDevice OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C15450eIu copy$default(C15450eIu c15450eIu, OneKeyConnectedDevice oneKeyConnectedDevice, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            oneKeyConnectedDevice = c15450eIu.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = c15450eIu.KWHzl;
        }
        return c15450eIu.AEQbTJ(oneKeyConnectedDevice, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C15450eIu AEQbTJ(@NotNull OneKeyConnectedDevice oneKeyConnectedDevice, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(oneKeyConnectedDevice, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C15450eIu(oneKeyConnectedDevice, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OneKeyConnectedDevice copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15450eIu)) {
            return false;
        }
        C15450eIu c15450eIu = (C15450eIu) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c15450eIu.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c15450eIu.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OneKeyDeviceWithEvmAddress(device=" + this.OLrzqt + ", evmAddress=" + this.KWHzl + ")";
    }

    public C15450eIu(@NotNull OneKeyConnectedDevice oneKeyConnectedDevice, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(oneKeyConnectedDevice, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = oneKeyConnectedDevice;
        this.KWHzl = str;
    }
}
