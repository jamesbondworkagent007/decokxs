package o;

import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jiT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C26762jiT {
    public final long EZpvd;
    public final java.util.List<TransactionConfig> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jiT */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C26762jiT copy$default(C26762jiT c26762jiT, long j, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = c26762jiT.EZpvd;
        }
        if ((i & 2) != 0) {
            list = c26762jiT.OLrzqt;
        }
        return c26762jiT.AEQbTJ(j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26762jiT AEQbTJ(long j, @NotNull java.util.List<TransactionConfig> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C26762jiT(j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TransactionConfig> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26762jiT)) {
            return false;
        }
        C26762jiT c26762jiT = (C26762jiT) obj;
        return this.EZpvd == c26762jiT.EZpvd && Intrinsics.EZpvd(this.OLrzqt, c26762jiT.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Long.hashCode(this.EZpvd) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TransactionActivityContent(investmentId=" + this.EZpvd + ", tabs=" + this.OLrzqt + ")";
    }

    public C26762jiT(long j, @NotNull java.util.List<TransactionConfig> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = j;
        this.OLrzqt = list;
    }
}
