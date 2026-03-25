package o;

import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xWW implements RxBus.Application {
    public final AbstractC54840xXg EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ xWW copy$default(xWW xww, AbstractC54840xXg abstractC54840xXg, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            abstractC54840xXg = xww.EZpvd;
        }
        return xww.KWHzl(abstractC54840xXg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC54840xXg EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xWW KWHzl(@NotNull AbstractC54840xXg abstractC54840xXg) {
        Intrinsics.checkNotNullParameter(abstractC54840xXg, "");
        return new xWW(abstractC54840xXg);
    }

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(java.lang.String str) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xWW) && Intrinsics.EZpvd(this.EZpvd, ((xWW) obj).EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BindResultEvent(result=" + this.EZpvd + ")";
    }

    public xWW(@NotNull AbstractC54840xXg abstractC54840xXg) {
        Intrinsics.checkNotNullParameter(abstractC54840xXg, "");
        this.EZpvd = abstractC54840xXg;
    }
}
