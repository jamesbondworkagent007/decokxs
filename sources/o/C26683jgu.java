package o;

import com.okinc.business.invest_biz.data.contants.InvestAction;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jgu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26683jgu {
    public final InvestAction AEQbTJ;
    public final long KWHzl;
    public final java.lang.String OLrzqt;
    public final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C26683jgu copy$default(C26683jgu c26683jgu, long j, long j2, java.lang.String str, InvestAction investAction, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = c26683jgu.copydefault;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = c26683jgu.KWHzl;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = c26683jgu.OLrzqt;
        }
        java.lang.String str2 = str;
        if ((i & 8) != 0) {
            investAction = c26683jgu.AEQbTJ;
        }
        return c26683jgu.EZpvd(j3, j4, str2, investAction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestAction EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26683jgu EZpvd(long j, long j2, @NotNull java.lang.String str, @NotNull InvestAction investAction) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(investAction, "");
        return new C26683jgu(j, j2, str, investAction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.KWHzl;
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
        if (!(obj instanceof C26683jgu)) {
            return false;
        }
        C26683jgu c26683jgu = (C26683jgu) obj;
        return this.copydefault == c26683jgu.copydefault && this.KWHzl == c26683jgu.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c26683jgu.OLrzqt) && this.AEQbTJ == c26683jgu.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.copydefault) * 31) + java.lang.Long.hashCode(this.KWHzl)) * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TransactionParams(investmentId=" + this.copydefault + ", chainId=" + this.KWHzl + ", source=" + this.OLrzqt + ", action=" + this.AEQbTJ + ")";
    }

    public C26683jgu(long j, long j2, @NotNull java.lang.String str, @NotNull InvestAction investAction) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(investAction, "");
        this.copydefault = j;
        this.KWHzl = j2;
        this.OLrzqt = str;
        this.AEQbTJ = investAction;
    }
}
