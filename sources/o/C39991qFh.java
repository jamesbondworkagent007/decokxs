package o;

import com.okinc.search.bean.SearchResultContentPo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qFh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39991qFh implements InterfaceC40516qYt {
    public static final int copydefault = SearchResultContentPo.SearchResultContentItemPo.$stable;
    public final java.lang.String AEQbTJ;
    public final SearchResultContentPo.SearchResultContentItemPo AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String djBIcL;
    public final boolean gEmmrt;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39991qFh EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, boolean z2, SearchResultContentPo.SearchResultContentItemPo searchResultContentItemPo) {
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new C39991qFh(str, str2, str3, str4, str5, z, z2, searchResultContentItemPo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39991qFh)) {
            return false;
        }
        C39991qFh c39991qFh = (C39991qFh) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c39991qFh.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c39991qFh.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c39991qFh.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c39991qFh.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c39991qFh.AEQbTJ) && this.valueOf == c39991qFh.valueOf && this.gEmmrt == c39991qFh.gEmmrt && Intrinsics.EZpvd(this.AhwBna, c39991qFh.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.EZpvd;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.djBIcL;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = this.OLrzqt.hashCode();
        int iHashCode5 = this.AEQbTJ.hashCode();
        int iHashCode6 = java.lang.Boolean.hashCode(this.valueOf);
        int iHashCode7 = java.lang.Boolean.hashCode(this.gEmmrt);
        SearchResultContentPo.SearchResultContentItemPo searchResultContentItemPo = this.AhwBna;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (searchResultContentItemPo != null ? searchResultContentItemPo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchResultContentFeedVo(authorName=" + this.KWHzl + ", authorAvatarUrl=" + this.EZpvd + ", formatedPublishTime=" + this.djBIcL + ", contentId=" + this.OLrzqt + ", content=" + this.AEQbTJ + ", showNewsTag=" + this.valueOf + ", isOfficial=" + this.gEmmrt + ", rawPo=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.valueOf;
    }

    public C39991qFh(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, boolean z2, SearchResultContentPo.SearchResultContentItemPo searchResultContentItemPo) {
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.KWHzl = str;
        this.EZpvd = str2;
        this.djBIcL = str3;
        this.OLrzqt = str4;
        this.AEQbTJ = str5;
        this.valueOf = z;
        this.gEmmrt = z2;
        this.AhwBna = searchResultContentItemPo;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C39991qFh) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((C39991qFh) interfaceC40516qYt).OLrzqt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C39991qFh) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }
}
