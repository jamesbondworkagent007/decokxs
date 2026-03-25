package o;

import com.okinc.search.bean.SearchResultContentPo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tHh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46086tHh implements InterfaceC47828txV {
    public static final int KWHzl = SearchResultContentPo.SearchResultContentItemPo.$stable;
    public final java.lang.String AEQbTJ;
    public final SearchResultContentPo.SearchResultContentItemPo AYXKKw;
    public final boolean AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46086tHh copy$default(C46086tHh c46086tHh, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, SearchResultContentPo.SearchResultContentItemPo searchResultContentItemPo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c46086tHh.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = c46086tHh.EZpvd;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = c46086tHh.gEmmrt;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = c46086tHh.copydefault;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = c46086tHh.AEQbTJ;
        }
        java.lang.String str9 = str5;
        if ((i & 32) != 0) {
            z = c46086tHh.AhwBna;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            searchResultContentItemPo = c46086tHh.AYXKKw;
        }
        return c46086tHh.KWHzl(str, str6, str7, str8, str9, z2, searchResultContentItemPo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46086tHh KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, SearchResultContentPo.SearchResultContentItemPo searchResultContentItemPo) {
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new C46086tHh(str, str2, str3, str4, str5, z, searchResultContentItemPo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchResultContentPo.SearchResultContentItemPo djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46086tHh)) {
            return false;
        }
        C46086tHh c46086tHh = (C46086tHh) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c46086tHh.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c46086tHh.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c46086tHh.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c46086tHh.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c46086tHh.AEQbTJ) && this.AhwBna == c46086tHh.AhwBna && Intrinsics.EZpvd(this.AYXKKw, c46086tHh.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.EZpvd;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.gEmmrt;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = this.copydefault.hashCode();
        int iHashCode5 = this.AEQbTJ.hashCode();
        int iHashCode6 = java.lang.Boolean.hashCode(this.AhwBna);
        SearchResultContentPo.SearchResultContentItemPo searchResultContentItemPo = this.AYXKKw;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (searchResultContentItemPo != null ? searchResultContentItemPo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchResultContentFeedVo(authorName=" + this.OLrzqt + ", authorAvatarUrl=" + this.EZpvd + ", formatedPublishTime=" + this.gEmmrt + ", contentId=" + this.copydefault + ", content=" + this.AEQbTJ + ", showNewsTag=" + this.AhwBna + ", rawPo=" + this.AYXKKw + ")";
    }

    public C46086tHh(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, SearchResultContentPo.SearchResultContentItemPo searchResultContentItemPo) {
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.OLrzqt = str;
        this.EZpvd = str2;
        this.gEmmrt = str3;
        this.copydefault = str4;
        this.AEQbTJ = str5;
        this.AhwBna = z;
        this.AYXKKw = searchResultContentItemPo;
    }

    @Override // o.InterfaceC47828txV
    public boolean copydefault(@NotNull InterfaceC47828txV interfaceC47828txV) {
        Intrinsics.checkNotNullParameter(interfaceC47828txV, "");
        return (interfaceC47828txV instanceof C46086tHh) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((C46086tHh) interfaceC47828txV).copydefault);
    }

    @Override // o.InterfaceC47828txV
    public boolean KWHzl(@NotNull InterfaceC47828txV interfaceC47828txV) {
        Intrinsics.checkNotNullParameter(interfaceC47828txV, "");
        return (interfaceC47828txV instanceof C46086tHh) && Intrinsics.EZpvd(this, interfaceC47828txV);
    }
}
