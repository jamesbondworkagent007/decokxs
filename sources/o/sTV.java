package o;

import com.okinc.oklive.app.domain.model.PriceChangeDirection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class sTV {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final PriceChangeDirection KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ sTV copy$default(sTV stv, java.lang.String str, java.lang.String str2, PriceChangeDirection priceChangeDirection, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = stv.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = stv.AEQbTJ;
        }
        if ((i & 4) != 0) {
            priceChangeDirection = stv.KWHzl;
        }
        return stv.KWHzl(str, str2, priceChangeDirection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceChangeDirection EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sTV KWHzl(java.lang.String str, java.lang.String str2, @NotNull PriceChangeDirection priceChangeDirection) {
        Intrinsics.checkNotNullParameter(priceChangeDirection, "");
        return new sTV(str, str2, priceChangeDirection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sTV)) {
            return false;
        }
        sTV stv = (sTV) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) stv.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stv.AEQbTJ) && this.KWHzl == stv.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AEQbTJ;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TradingCardRealTime(formattedPrice=" + this.EZpvd + ", formattedChangePercentage=" + this.AEQbTJ + ", changeDirection=" + this.KWHzl + ")";
    }

    public sTV(java.lang.String str, java.lang.String str2, @NotNull PriceChangeDirection priceChangeDirection) {
        Intrinsics.checkNotNullParameter(priceChangeDirection, "");
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.KWHzl = priceChangeDirection;
    }
}
