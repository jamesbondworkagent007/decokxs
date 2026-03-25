package o;

import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ltG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C31394ltG {
    public final ConvertCurrencyBean KWHzl;
    public final java.util.List<ConvertCurrencyBean> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ltG */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C31394ltG copy$default(C31394ltG c31394ltG, ConvertCurrencyBean convertCurrencyBean, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            convertCurrencyBean = c31394ltG.KWHzl;
        }
        if ((i & 2) != 0) {
            list = c31394ltG.OLrzqt;
        }
        return c31394ltG.KWHzl(convertCurrencyBean, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ConvertCurrencyBean> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31394ltG KWHzl(@NotNull ConvertCurrencyBean convertCurrencyBean, @NotNull java.util.List<ConvertCurrencyBean> list) {
        Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C31394ltG(convertCurrencyBean, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertCurrencyBean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31394ltG)) {
            return false;
        }
        C31394ltG c31394ltG = (C31394ltG) obj;
        return Intrinsics.EZpvd(this.KWHzl, c31394ltG.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c31394ltG.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TokenResult(token=" + this.KWHzl + ", list=" + this.OLrzqt + ")";
    }

    public C31394ltG(@NotNull ConvertCurrencyBean convertCurrencyBean, @NotNull java.util.List<ConvertCurrencyBean> list) {
        Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = convertCurrencyBean;
        this.OLrzqt = list;
    }
}
