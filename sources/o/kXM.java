package o;

import kotlin.Result;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kXM {
    public final java.lang.Object AEQbTJ;
    public final java.lang.Object EZpvd;
    public final java.lang.Object KWHzl;
    public final java.lang.Object copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ kXM copy$default(kXM kxm, Result result, Result result2, Result result3, Result result4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            result = Result.m7376boximpl(kxm.AEQbTJ);
        }
        if ((i & 2) != 0) {
            result2 = Result.m7376boximpl(kxm.EZpvd);
        }
        if ((i & 4) != 0) {
            result3 = Result.m7376boximpl(kxm.KWHzl);
        }
        if ((i & 8) != 0) {
            result4 = Result.m7376boximpl(kxm.copydefault);
        }
        return kxm.copydefault(result.m7386unboximpl(), result2.m7386unboximpl(), result3.m7386unboximpl(), result4.m7386unboximpl());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Object AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Object KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Object OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Object copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kXM copydefault(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2, @NotNull java.lang.Object obj3, @NotNull java.lang.Object obj4) {
        return new kXM(obj, obj2, obj3, obj4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kXM)) {
            return false;
        }
        kXM kxm = (kXM) obj;
        return Result.m7379equalsimpl0(this.AEQbTJ, kxm.AEQbTJ) && Result.m7379equalsimpl0(this.EZpvd, kxm.EZpvd) && Result.m7379equalsimpl0(this.KWHzl, kxm.KWHzl) && Result.m7379equalsimpl0(this.copydefault, kxm.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Result.m7382hashCodeimpl(this.AEQbTJ) * 31) + Result.m7382hashCodeimpl(this.EZpvd)) * 31) + Result.m7382hashCodeimpl(this.KWHzl)) * 31) + Result.m7382hashCodeimpl(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ConfigRequestResults(currencyResult=" + Result.m7385toStringimpl(this.AEQbTJ) + ", sellConfigResult=" + Result.m7385toStringimpl(this.EZpvd) + ", chainListResult=" + Result.m7385toStringimpl(this.KWHzl) + ", presetConfigResult=" + Result.m7385toStringimpl(this.copydefault) + ")";
    }

    public kXM(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2, @NotNull java.lang.Object obj3, @NotNull java.lang.Object obj4) {
        this.AEQbTJ = obj;
        this.EZpvd = obj2;
        this.KWHzl = obj3;
        this.copydefault = obj4;
    }
}
