package o;

import com.okinc.business.defi.wallet.home.usdgActivity.data.repository.ActivityStatus;
import com.okinc.business.defi.wallet.home.usdgActivity.data.repository.AddressRegisterStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18177fdV {
    public final AddressRegisterStatus AEQbTJ;
    public final ActivityStatus EZpvd;
    public final java.lang.String KWHzl;
    public final long OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C18177fdV copy$default(C18177fdV c18177fdV, java.lang.String str, long j, java.lang.String str2, AddressRegisterStatus addressRegisterStatus, ActivityStatus activityStatus, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c18177fdV.copydefault;
        }
        if ((i & 2) != 0) {
            j = c18177fdV.OLrzqt;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = c18177fdV.KWHzl;
        }
        java.lang.String str3 = str2;
        if ((i & 8) != 0) {
            addressRegisterStatus = c18177fdV.AEQbTJ;
        }
        AddressRegisterStatus addressRegisterStatus2 = addressRegisterStatus;
        if ((i & 16) != 0) {
            activityStatus = c18177fdV.EZpvd;
        }
        return c18177fdV.AEQbTJ(str, j2, str3, addressRegisterStatus2, activityStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityStatus AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18177fdV AEQbTJ(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull AddressRegisterStatus addressRegisterStatus, @NotNull ActivityStatus activityStatus) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(addressRegisterStatus, "");
        Intrinsics.checkNotNullParameter(activityStatus, "");
        return new C18177fdV(str, j, str2, addressRegisterStatus, activityStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressRegisterStatus EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18177fdV)) {
            return false;
        }
        C18177fdV c18177fdV = (C18177fdV) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c18177fdV.copydefault) && this.OLrzqt == c18177fdV.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c18177fdV.KWHzl) && this.AEQbTJ == c18177fdV.AEQbTJ && this.EZpvd == c18177fdV.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.copydefault.hashCode() * 31) + java.lang.Long.hashCode(this.OLrzqt)) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HotActivityRegisterStatusData(userAddress=" + this.copydefault + ", chainIndex=" + this.OLrzqt + ", tokenAddress=" + this.KWHzl + ", registerStatus=" + this.AEQbTJ + ", activityStatus=" + this.EZpvd + ")";
    }

    public C18177fdV(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull AddressRegisterStatus addressRegisterStatus, @NotNull ActivityStatus activityStatus) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(addressRegisterStatus, "");
        Intrinsics.checkNotNullParameter(activityStatus, "");
        this.copydefault = str;
        this.OLrzqt = j;
        this.KWHzl = str2;
        this.AEQbTJ = addressRegisterStatus;
        this.EZpvd = activityStatus;
    }
}
