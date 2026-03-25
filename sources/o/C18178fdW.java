package o;

import com.okinc.business.defi.wallet.home.usdgActivity.data.repository.AddressRegisterStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18178fdW {
    public final long AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final AddressRegisterStatus OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C18178fdW copy$default(C18178fdW c18178fdW, java.lang.String str, long j, java.lang.String str2, AddressRegisterStatus addressRegisterStatus, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c18178fdW.EZpvd;
        }
        if ((i & 2) != 0) {
            j = c18178fdW.AEQbTJ;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = c18178fdW.KWHzl;
        }
        java.lang.String str3 = str2;
        if ((i & 8) != 0) {
            addressRegisterStatus = c18178fdW.OLrzqt;
        }
        return c18178fdW.copydefault(str, j2, str3, addressRegisterStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressRegisterStatus OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18178fdW copydefault(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull AddressRegisterStatus addressRegisterStatus) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(addressRegisterStatus, "");
        return new C18178fdW(str, j, str2, addressRegisterStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18178fdW)) {
            return false;
        }
        C18178fdW c18178fdW = (C18178fdW) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c18178fdW.EZpvd) && this.AEQbTJ == c18178fdW.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c18178fdW.KWHzl) && this.OLrzqt == c18178fdW.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.EZpvd.hashCode() * 31) + java.lang.Long.hashCode(this.AEQbTJ)) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "QueryAddressRegisterStatusData(userAddress=" + this.EZpvd + ", chainIndex=" + this.AEQbTJ + ", tokenAddress=" + this.KWHzl + ", registerStatus=" + this.OLrzqt + ")";
    }

    public C18178fdW(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull AddressRegisterStatus addressRegisterStatus) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(addressRegisterStatus, "");
        this.EZpvd = str;
        this.AEQbTJ = j;
        this.KWHzl = str2;
        this.OLrzqt = addressRegisterStatus;
    }
}
