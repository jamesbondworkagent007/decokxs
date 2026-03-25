package o;

import com.okinc.okimcore.model.utility.GroupAnnouncementInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sQo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44458sQo {
    public final java.util.List<GroupAnnouncementInfo> OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.sQo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C44458sQo copy$default(C44458sQo c44458sQo, int i, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c44458sQo.copydefault;
        }
        if ((i2 & 2) != 0) {
            list = c44458sQo.OLrzqt;
        }
        return c44458sQo.KWHzl(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44458sQo KWHzl(int i, @NotNull java.util.List<GroupAnnouncementInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C44458sQo(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<GroupAnnouncementInfo> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44458sQo)) {
            return false;
        }
        C44458sQo c44458sQo = (C44458sQo) obj;
        return this.copydefault == c44458sQo.copydefault && Intrinsics.EZpvd(this.OLrzqt, c44458sQo.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.copydefault) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GroupNoticeListResult(maxLimit=" + this.copydefault + ", noticeList=" + this.OLrzqt + ")";
    }

    public C44458sQo(int i, @NotNull java.util.List<GroupAnnouncementInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = i;
        this.OLrzqt = list;
    }
}
