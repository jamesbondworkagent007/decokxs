package o;

import com.okinc.im.bean.SearchResultData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qFr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40001qFr {
    public final java.util.List<C40004qFu> KWHzl;
    public final java.util.List<SearchResultData> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qFr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C40001qFr copy$default(C40001qFr c40001qFr, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c40001qFr.copydefault;
        }
        if ((i & 2) != 0) {
            list2 = c40001qFr.KWHzl;
        }
        return c40001qFr.OLrzqt(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C40004qFu> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40001qFr OLrzqt(@NotNull java.util.List<? extends SearchResultData> list, java.util.List<C40004qFu> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C40001qFr(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SearchResultData> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40001qFr)) {
            return false;
        }
        C40001qFr c40001qFr = (C40001qFr) obj;
        return Intrinsics.EZpvd(this.copydefault, c40001qFr.copydefault) && Intrinsics.EZpvd(this.KWHzl, c40001qFr.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        java.util.List<C40004qFu> list = this.KWHzl;
        return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchResultIMChatVo(rawPoList=" + this.copydefault + ", voList=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.im.bean.SearchResultData> */
    /* JADX WARN: Multi-variable type inference failed */
    public C40001qFr(@NotNull java.util.List<? extends SearchResultData> list, java.util.List<C40004qFu> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
        this.KWHzl = list2;
    }

    public final boolean AEQbTJ() {
        return C33129mqd.KWHzl((java.util.Collection) this.KWHzl);
    }
}
