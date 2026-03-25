package o;

import com.okinc.search.bean.SearchResultContentPo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qFo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39998qFo {
    public final boolean AEQbTJ;
    public final java.lang.String AYXKKw;
    public final SearchResultContentPo EZpvd;
    public final java.util.List<C39997qFn> KWHzl;
    public final java.util.List<C39991qFh> OLrzqt;
    public final java.util.List<InterfaceC40516qYt> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.qFo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C39998qFo copy$default(C39998qFo c39998qFo, SearchResultContentPo searchResultContentPo, java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            searchResultContentPo = c39998qFo.EZpvd;
        }
        if ((i & 2) != 0) {
            str = c39998qFo.AYXKKw;
        }
        java.lang.String str2 = str;
        if ((i & 4) != 0) {
            list = c39998qFo.OLrzqt;
        }
        java.util.List list4 = list;
        if ((i & 8) != 0) {
            list2 = c39998qFo.KWHzl;
        }
        java.util.List list5 = list2;
        if ((i & 16) != 0) {
            list3 = c39998qFo.copydefault;
        }
        java.util.List list6 = list3;
        if ((i & 32) != 0) {
            z = c39998qFo.AEQbTJ;
        }
        return c39998qFo.AEQbTJ(searchResultContentPo, str2, list4, list5, list6, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C39997qFn> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39998qFo AEQbTJ(@NotNull SearchResultContentPo searchResultContentPo, @NotNull java.lang.String str, java.util.List<C39991qFh> list, java.util.List<C39997qFn> list2, @NotNull java.util.List<? extends InterfaceC40516qYt> list3, boolean z) {
        Intrinsics.checkNotNullParameter(searchResultContentPo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new C39998qFo(searchResultContentPo, str, list, list2, list3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchResultContentPo KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C39991qFh> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC40516qYt> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39998qFo)) {
            return false;
        }
        C39998qFo c39998qFo = (C39998qFo) obj;
        return Intrinsics.EZpvd(this.EZpvd, c39998qFo.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c39998qFo.AYXKKw) && Intrinsics.EZpvd(this.OLrzqt, c39998qFo.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c39998qFo.KWHzl) && Intrinsics.EZpvd(this.copydefault, c39998qFo.copydefault) && this.AEQbTJ == c39998qFo.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.AYXKKw.hashCode();
        java.util.List<C39991qFh> list = this.OLrzqt;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        java.util.List<C39997qFn> list2 = this.KWHzl;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list2 != null ? list2.hashCode() : 0)) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchResultContentVo(rawPo=" + this.EZpvd + ", rawPoJson=" + this.AYXKKw + ", feedVoList=" + this.OLrzqt + ", kolVoList=" + this.KWHzl + ", overviewMixedList=" + this.copydefault + ", hasMoreData=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends o.qYt> */
    /* JADX WARN: Multi-variable type inference failed */
    public C39998qFo(@NotNull SearchResultContentPo searchResultContentPo, @NotNull java.lang.String str, java.util.List<C39991qFh> list, java.util.List<C39997qFn> list2, @NotNull java.util.List<? extends InterfaceC40516qYt> list3, boolean z) {
        Intrinsics.checkNotNullParameter(searchResultContentPo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.EZpvd = searchResultContentPo;
        this.AYXKKw = str;
        this.OLrzqt = list;
        this.KWHzl = list2;
        this.copydefault = list3;
        this.AEQbTJ = z;
    }

    public final boolean AhwBna() {
        if (this.OLrzqt != null && (!r0.isEmpty())) {
            return true;
        }
        java.util.List<C39997qFn> list = this.KWHzl;
        return list != null && (list.isEmpty() ^ true);
    }
}
