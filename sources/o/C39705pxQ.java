package o;

import com.okinc.kline.ui.unlock.ui.model.UnlockTokenStageDataVo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pxQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39705pxQ {
    public final int OLrzqt;
    public final java.util.List<UnlockTokenStageDataVo> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pxQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C39705pxQ copy$default(C39705pxQ c39705pxQ, int i, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c39705pxQ.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            list = c39705pxQ.copydefault;
        }
        return c39705pxQ.KWHzl(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<UnlockTokenStageDataVo> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39705pxQ KWHzl(int i, @NotNull java.util.List<UnlockTokenStageDataVo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C39705pxQ(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39705pxQ)) {
            return false;
        }
        C39705pxQ c39705pxQ = (C39705pxQ) obj;
        return this.OLrzqt == c39705pxQ.OLrzqt && Intrinsics.EZpvd(this.copydefault, c39705pxQ.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.OLrzqt) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AllUnlockTokenStateDataVo(currentStage=" + this.OLrzqt + ", stages=" + this.copydefault + ")";
    }

    public C39705pxQ(int i, @NotNull java.util.List<UnlockTokenStageDataVo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = i;
        this.copydefault = list;
    }
}
