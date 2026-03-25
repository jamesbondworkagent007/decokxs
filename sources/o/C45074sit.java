package o;

import com.okinc.okex.center.bean.SuggestedActionBean;
import com.okinc.okex.center.ui.adapter.TroubleshootResultAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sit, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45074sit extends TroubleshootResultAdapter.TaskDescription {
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.util.List<SuggestedActionBean> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.sit */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C45074sit copy$default(C45074sit c45074sit, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c45074sit.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = c45074sit.KWHzl;
        }
        if ((i & 4) != 0) {
            list = c45074sit.OLrzqt;
        }
        return c45074sit.AEQbTJ(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SuggestedActionBean> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C45074sit AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<SuggestedActionBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C45074sit(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
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
        if (!(obj instanceof C45074sit)) {
            return false;
        }
        C45074sit c45074sit = (C45074sit) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c45074sit.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c45074sit.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c45074sit.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TxidNotFoundDisplayModel(pageHeader=" + this.EZpvd + ", pageDescription=" + this.KWHzl + ", suggestedActionList=" + this.OLrzqt + ")";
    }

    public C45074sit(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<SuggestedActionBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = str;
        this.KWHzl = str2;
        this.OLrzqt = list;
    }
}
