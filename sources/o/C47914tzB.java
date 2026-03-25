package o;

import com.okinc.uilab.stateful.StatefulView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tzB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47914tzB {
    public final java.util.List<java.lang.Object> AEQbTJ;
    public final boolean EZpvd;
    public final java.lang.String KWHzl;
    public final StatefulView.Status copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tzB */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C47914tzB copy$default(C47914tzB c47914tzB, StatefulView.Status status, java.util.List list, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            status = c47914tzB.copydefault;
        }
        if ((i & 2) != 0) {
            list = c47914tzB.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str = c47914tzB.KWHzl;
        }
        if ((i & 8) != 0) {
            z = c47914tzB.EZpvd;
        }
        return c47914tzB.AEQbTJ(status, list, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Object> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47914tzB AEQbTJ(@NotNull StatefulView.Status status, @NotNull java.util.List<? extends java.lang.Object> list, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(status, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C47914tzB(status, list, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatefulView.Status OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47914tzB)) {
            return false;
        }
        C47914tzB c47914tzB = (C47914tzB) obj;
        return this.copydefault == c47914tzB.copydefault && Intrinsics.EZpvd(this.AEQbTJ, c47914tzB.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c47914tzB.KWHzl) && this.EZpvd == c47914tzB.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        java.lang.String str = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MessageListUIState(status=" + this.copydefault + ", list=" + this.AEQbTJ + ", nextCursor=" + this.KWHzl + ", isRefresh=" + this.EZpvd + ")";
    }

    public C47914tzB(@NotNull StatefulView.Status status, @NotNull java.util.List<? extends java.lang.Object> list, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(status, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = status;
        this.AEQbTJ = list;
        this.KWHzl = str;
        this.EZpvd = z;
    }

    public final boolean KWHzl() {
        java.lang.String str = this.KWHzl;
        return !(str == null || str.length() == 0);
    }
}
