package o;

import kotlin.Result;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class xNA {
    public final boolean AEQbTJ;
    public final boolean AYXKKw;
    public final java.lang.Object AhwBna;
    public final boolean EZpvd;
    public final java.lang.Object KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ xNA copy$default(xNA xna, Result result, Result result2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            result = Result.m7376boximpl(xna.AhwBna);
        }
        if ((i & 2) != 0) {
            result2 = Result.m7376boximpl(xna.KWHzl);
        }
        return xna.KWHzl(result.m7386unboximpl(), result2.m7386unboximpl());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xNA KWHzl(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2) {
        return new xNA(obj, obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xNA)) {
            return false;
        }
        xNA xna = (xNA) obj;
        return Result.m7379equalsimpl0(this.AhwBna, xna.AhwBna) && Result.m7379equalsimpl0(this.KWHzl, xna.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Result.m7382hashCodeimpl(this.AhwBna) * 31) + Result.m7382hashCodeimpl(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TradeInitResult(trade=" + Result.m7385toStringimpl(this.AhwBna) + ", dexTrade=" + Result.m7385toStringimpl(this.KWHzl) + ")";
    }

    public xNA(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2) {
        this.AhwBna = obj;
        this.KWHzl = obj2;
        this.copydefault = Result.m7384isSuccessimpl(obj) && Result.m7384isSuccessimpl(obj2);
        this.EZpvd = Result.m7384isSuccessimpl(obj2);
        this.OLrzqt = Result.m7383isFailureimpl(obj) || Result.m7383isFailureimpl(obj2);
        this.AYXKKw = (Result.m7383isFailureimpl(obj) ? null : obj) != null;
        this.AEQbTJ = (Result.m7383isFailureimpl(obj2) ? null : obj2) != null;
    }
}
