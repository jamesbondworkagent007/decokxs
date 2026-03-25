package o;

import com.okinc.business.defi.wallet.home.usdgActivity.data.repository.RegisterAddressStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18176fdU {
    public final boolean KWHzl;
    public final RegisterAddressStatus OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C18176fdU copy$default(C18176fdU c18176fdU, RegisterAddressStatus registerAddressStatus, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            registerAddressStatus = c18176fdU.OLrzqt;
        }
        if ((i & 2) != 0) {
            z = c18176fdU.KWHzl;
        }
        return c18176fdU.EZpvd(registerAddressStatus, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18176fdU EZpvd(@NotNull RegisterAddressStatus registerAddressStatus, boolean z) {
        Intrinsics.checkNotNullParameter(registerAddressStatus, "");
        return new C18176fdU(registerAddressStatus, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RegisterAddressStatus copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18176fdU)) {
            return false;
        }
        C18176fdU c18176fdU = (C18176fdU) obj;
        return this.OLrzqt == c18176fdU.OLrzqt && this.KWHzl == c18176fdU.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RegisterAddressStatusData(registerStatus=" + this.OLrzqt + ", supportRetryRegister=" + this.KWHzl + ")";
    }

    public C18176fdU(@NotNull RegisterAddressStatus registerAddressStatus, boolean z) {
        Intrinsics.checkNotNullParameter(registerAddressStatus, "");
        this.OLrzqt = registerAddressStatus;
        this.KWHzl = z;
    }
}
