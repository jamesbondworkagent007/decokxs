package o;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tBG implements InterfaceC46504tWu {
    public final float KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ tBG copy$default(tBG tbg, java.lang.String str, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = tbg.OLrzqt;
        }
        if ((i & 2) != 0) {
            f = tbg.KWHzl;
        }
        return tbg.EZpvd(str, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46504tWu
    public java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final tBG EZpvd(@NotNull java.lang.String str, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        return new tBG(str, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tBG)) {
            return false;
        }
        tBG tbg = (tBG) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) tbg.OLrzqt) && java.lang.Float.compare(this.KWHzl, tbg.KWHzl) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + java.lang.Float.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AssetItem(currencyName=" + this.OLrzqt + ", proportion=" + this.KWHzl + ")";
    }

    public tBG(@NotNull java.lang.String str, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.KWHzl = f;
    }

    @Override // o.InterfaceC46504tWu
    public BigDecimal OLrzqt() {
        return C33129mqd.EZpvd(java.lang.Float.valueOf(this.KWHzl));
    }
}
