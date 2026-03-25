package o;

import com.okinc.wallet.api.bean.WalletInfo;
import com.okinc.wallet.api.bean.WalletStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xXb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C54835xXb {
    public final xWZ KWHzl;
    public final WalletInfo OLrzqt;
    public final WalletStatus copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C54835xXb copy$default(C54835xXb c54835xXb, WalletStatus walletStatus, xWZ xwz, WalletInfo walletInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            walletStatus = c54835xXb.copydefault;
        }
        if ((i & 2) != 0) {
            xwz = c54835xXb.KWHzl;
        }
        if ((i & 4) != 0) {
            walletInfo = c54835xXb.OLrzqt;
        }
        return c54835xXb.AEQbTJ(walletStatus, xwz, walletInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54835xXb AEQbTJ(@NotNull WalletStatus walletStatus, @NotNull xWZ xwz, WalletInfo walletInfo) {
        Intrinsics.checkNotNullParameter(walletStatus, "");
        Intrinsics.checkNotNullParameter(xwz, "");
        return new C54835xXb(walletStatus, xwz, walletInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54835xXb)) {
            return false;
        }
        C54835xXb c54835xXb = (C54835xXb) obj;
        return this.copydefault == c54835xXb.copydefault && Intrinsics.EZpvd(this.KWHzl, c54835xXb.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c54835xXb.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        WalletInfo walletInfo = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (walletInfo == null ? 0 : walletInfo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "QueryWalletResult(status=" + this.copydefault + ", queryConfig=" + this.KWHzl + ", walletInfo=" + this.OLrzqt + ")";
    }

    public C54835xXb(@NotNull WalletStatus walletStatus, @NotNull xWZ xwz, WalletInfo walletInfo) {
        Intrinsics.checkNotNullParameter(walletStatus, "");
        Intrinsics.checkNotNullParameter(xwz, "");
        this.copydefault = walletStatus;
        this.KWHzl = xwz;
        this.OLrzqt = walletInfo;
    }
}
