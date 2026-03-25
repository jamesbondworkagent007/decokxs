package o;

import com.okinc.unify_trade.bot.mapper.CoinMarginedCcyDisplay;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xuS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55993xuS {
    public final CoinMarginedCcyDisplay AEQbTJ;
    public final java.lang.String OLrzqt;
    public final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C55993xuS copy$default(C55993xuS c55993xuS, java.lang.String str, CoinMarginedCcyDisplay coinMarginedCcyDisplay, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c55993xuS.OLrzqt;
        }
        if ((i & 2) != 0) {
            coinMarginedCcyDisplay = c55993xuS.AEQbTJ;
        }
        if ((i & 4) != 0) {
            j = c55993xuS.copydefault;
        }
        return c55993xuS.AEQbTJ(str, coinMarginedCcyDisplay, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinMarginedCcyDisplay AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55993xuS AEQbTJ(@NotNull java.lang.String str, @NotNull CoinMarginedCcyDisplay coinMarginedCcyDisplay, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(coinMarginedCcyDisplay, "");
        return new C55993xuS(str, coinMarginedCcyDisplay, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55993xuS)) {
            return false;
        }
        C55993xuS c55993xuS = (C55993xuS) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c55993xuS.OLrzqt) && this.AEQbTJ == c55993xuS.AEQbTJ && this.copydefault == c55993xuS.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Long.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CoinMarginedContractProfitDisplayEntity(algoId=" + this.OLrzqt + ", selectedDisplay=" + this.AEQbTJ + ", lastUpdated=" + this.copydefault + ")";
    }

    public C55993xuS(@NotNull java.lang.String str, @NotNull CoinMarginedCcyDisplay coinMarginedCcyDisplay, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(coinMarginedCcyDisplay, "");
        this.OLrzqt = str;
        this.AEQbTJ = coinMarginedCcyDisplay;
        this.copydefault = j;
    }
}
